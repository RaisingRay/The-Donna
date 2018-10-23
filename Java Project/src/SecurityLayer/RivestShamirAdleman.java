/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SecurityLayer;

import GUITools.ErrorDisplayer;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author Raiisa
 */
public class RivestShamirAdleman{
   //Welcome to Rivest Shamir Adleman Class
      
    /*
    *As you may see we have alote of what we call tools Classes so that they would make our job alote easier
    *this class we use it to encrypt and decrypt data with RSA algorithme so we can transport our data Safely
    */
    
    
    /*
    *ok we begin with our Basic Attributes they are pretty easy to know what for
    */
    private PublicKey pub;
    private PrivateKey priv;
    private Cipher coder;
    private int size;
    private KeyPair kp;
    
    
    
    /*public RivestShamirAdleman(){
    }
    
    
    
    /*
    *our class give and make alote of operations easier and this is one of many
    *this Method Initiate a Key generation by taking its size with bits
    *we gonna use this only to initiate the generation of both public and private key
    */
    public void initKeyPair(int size){
        try{
            //the first line is just to tell our KeyPairGenerator class to give us a RSA keys this class is responsible of generating pair keys
            KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
            //After calling that static method we are assured that all the object gonna be RSA algorithm now we gonna just give it the Size of the both Keys
            kpg.initialize(size);
            //and here we are generating the keys inside our KeyPair class that it should have now Both Private and Public key
            kp = kpg.generateKeyPair();
        }catch(Exception e){
           new ErrorDisplayer("RSA init key par Error");
        }
    }
    
    
    /*
    *We could just initiate our Cipher with the get method of KeyPair Class but just to make things Obvious to read
    *for you in use to our Class we made these both method to take you throught the process
    */
    public void generatePublicKey(){
        pub = kp.getPublic();
    }
    public void generatePrivateKey(){
        priv=kp.getPrivate();
    }
    
    
    /*
    *ok Befor we Explain Line by Line that we are expecting you not to Read it all so no fear for that let's explain those 4 method below fast.
    *since we need to store our public and private key in it's own diractory ,that you can make them public or private as you want but we do recommend
    *initialising  each folder with he's name it's simple
    *  both rettrieve methods  extract the key from they're folder
    * and both store methods store the keys into their folder
    */
    
    
    public void retriavePrivKey(File file){
        try{
            //so our first step is to get the path of the file that we gonna retrieve from the key
            Path path = Paths.get(file.getAbsolutePath());
            //and we read the data in byte table  with static method of Files class and we give it the path as parameter
            byte[] data = Files.readAllBytes(path);
            //So since this is a private key it comes with a form calledd PKC#8 and that's why we gonna need this class to form our data
            PKCS8EncodedKeySpec ks=new PKCS8EncodedKeySpec(data);
            //KeyFactory is going to give us the key so we need to tell him what algorithm is this key for and that's it, the data already have the
            //form of private key with the help of PKCS8EncodedKeySpec class and it's a RSA algorithm Key all we need to do is
            KeyFactory kf = KeyFactory.getInstance("RSA");
            //initiate our private key
            priv = kf.generatePrivate(ks);
        }catch(Exception e){
            new ErrorDisplayer("Retriving private key Error");
        }
    }
    
    public void retrievePubKey(File file){
        try{
            //it's all the same as private key only one tiny diffrence that make a huge impact and that's
            Path path = Paths.get(file.getAbsolutePath());
            byte[] data = Files.readAllBytes(path);
            //our Data form, so the private key have it's PKC#8 form and for the public it takes a form that we call  X.509 
            //and we can do that with our X509encodedKeySpec all the rest is the same as retrieving a private key
            X509EncodedKeySpec ks = new X509EncodedKeySpec(data);
            KeyFactory kf = KeyFactory.getInstance("RSA");
            pub = kf.generatePublic(ks);
        }catch(Exception e){
            new ErrorDisplayer("Retriving public Key Error");
            e.printStackTrace();
        }
    }
    
    public void storePubKey(File Key){
        try{
            //Storing a Key is the same for both Keys so we gonna just explain it in one method of them and it's this one
            
            //so first we initiate our FileOutputStream Class with the File that we have as parameter of this Method 
            FileOutputStream out=new FileOutputStream(Key);
            //we simply get the key as a byte table form and write it to the File
            out.write(pub.getEncoded());
            //we send it to the file
            out.flush();
            //and finally never forget to close the door
            out.close();
        }catch(Exception e){
            new ErrorDisplayer("storingPublic Key Error");
            e.printStackTrace();
        }
    }
    
    public void storePrivKey(File Key){
        try{
            FileOutputStream out=new FileOutputStream(Key);
            out.write(priv.getEncoded());
            out.flush();
            out.close();
        }catch(Exception e){
            new ErrorDisplayer("Storing private Key Error");
            e.printStackTrace();
        }
    }
    
    
    //These two methods bellow us are just to initiate our cipher in a decryption or a Encryption mode
    private void encryptMode(){
        try{
            //as alwayse this is a RSA algorithm so we give our cipher that information to know what it's doing
            coder=Cipher.getInstance("RSA/ECB/PKCS1Padding");
            //we initiate it with number that is a Encryption_Mode and the private key
            coder.init(Cipher.ENCRYPT_MODE,priv);
        }catch(Exception e){
            new ErrorDisplayer("Encryption mode error");
        }
    }
    //same as encrypt Mode but just one diffrence
    private void decryptMode(){
        try{
            coder=Cipher.getInstance("RSA/ECB/PKCS1Padding");
            //we initiate it with the Decrypt_Mode number and the public key
            coder.init(Cipher.DECRYPT_MODE,pub);
        }catch(Exception e){
            new ErrorDisplayer("Decryption mode error");
        }
    }
    
    
    // these two methods are all what about this Class the actual decryption and decryption of the files
    

    public FileOutputStream EncryptFile(File plainFile,String name){
        //first we begin with making our cipher encryptmode
        encryptMode();
        //and then we use our class actualy we made it to encrypt and decrypt depending on the cipher we send it doesn't matter the algorithm or the
        //key it just do what it suppose to do
        FileCipher fileEnc=new FileCipher(coder);
        //and it return us a encrypted file to know more about our class just read it u well find alwayse planty of comments as long it's security related
        return fileEnc.fileCiphering(plainFile,name);
    }
    
    //and this is the same as encrypt mode only
    public FileOutputStream DecryptFile(File EncodedFile,String name){
        //it's decryptmode XD
        decryptMode();
        FileCipher fileEnc=new FileCipher(coder);
        return fileEnc.fileCiphering(EncodedFile,name);
    }
    
}
