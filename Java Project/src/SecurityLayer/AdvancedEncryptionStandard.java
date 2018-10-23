/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SecurityLayer;

import GUITools.ErrorDisplayer;
import Workshop.Workshop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author Raiisa
 */
public class AdvancedEncryptionStandard {
     //Weclome to AdvancedEncryptionStandard
  
    private byte[] keySize;
    private IvParameterSpec ivInitilaser;
    private SecretKey SKey;
    private Cipher coder;

    
    public AdvancedEncryptionStandard(){
    };
    
    
    //our first method is unique we use it only if we gonna use a new Key and it take the size of the IvParameter as parameter
    
    public void initVector(int size){
        SecureRandom sr = new SecureRandom();
        //After declairing a SecuredRandom Object we make a table of the byte with the size we have
        keySize=new byte[size];
        //we initiate the size of the next size
        sr.nextBytes(keySize);
        //and last but not least we make our Ivparameter with the size we have
        ivInitilaser=new IvParameterSpec(keySize);
    }
    
    
    //this simple method generate for us a AES key
    public void generateKey(){
        try{
            //first we tell our KeyGenerator what Key it's gonna generate for us which is AES in this case
            KeyGenerator kGen=KeyGenerator.getInstance("AES");
            //and here we have our SecuredKey
            SKey=kGen.generateKey();
        }catch(Exception e){
            new ErrorDisplayer("Generation AES key Error");
        }
    }
    
    /*
    *both Store Iv ,Store Key,Retrieve Keyand Retrieve Iv work the same as RSA store and retrieve method  
    */
    public void storeIv(File iv){ try{
        FileOutputStream Generatediv=new FileOutputStream(iv);
        Generatediv.write(ivInitilaser.getIV());
        }catch(Exception e){
           new ErrorDisplayer("Storing Iv Error");
        }
        
    }
    public void retrieveIv(File iv){
        try{
            byte[] keyBuff=new byte[(int)iv.length()];
            FileInputStream filekey=new FileInputStream(iv);
            filekey.read(keyBuff);
            filekey.close();
            ivInitilaser=new IvParameterSpec(keyBuff);
        }catch(Exception e){
        }
        
    }
    
    public void retrieveKey(File Key){
        try{
            byte[] keyBuff=new byte[(int)Key.length()];
            FileInputStream filekey=new FileInputStream(Key);
            filekey.read(keyBuff);
            filekey.close();
            SKey=new SecretKeySpec(keyBuff,"AES");
        }catch(IOException e){
            new ErrorDisplayer("Retrieving AES key Error");
            e.printStackTrace();
        }
    }
    
    public void storeKey(File Key){
        try{
        FileOutputStream GeneratedKey=new FileOutputStream(Key);
        GeneratedKey.write(SKey.getEncoded());
        }catch(Exception e){
           new ErrorDisplayer("Storing AES key Error");
        }
    }
    
    
    
    //these two method set the mode of the cipher we have with the right padding
    private void encryptMode(){
        try{
            //setting the cipher with the right algorithm which is AES and the Padding
            coder=Cipher.getInstance("AES/CBC/PKCS5Padding");
            //initiating the cipher with encryption mode
            coder.init(Cipher.ENCRYPT_MODE,SKey,ivInitilaser);
        }catch(Exception e){
            new ErrorDisplayer("Encrypt AES Mode Error");
        }
    }
    

    private void decryptMode(){
        try{
            //setting the cipher with the right algorithm which is AES and the Padding
            coder=Cipher.getInstance("AES/CBC/PKCS5Padding");
            //initiating the cipher with decryption mode
            coder.init(Cipher.DECRYPT_MODE,SKey,ivInitilaser);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    /*$
    *since AES suppose to do crypto for our attribute of our entity so we made a special methods for 
    *encryption and decryption String both takes a String as parameter and return one
    */
    
    
    public String EncryptString(String PlainText){
        try {
            //since this is a Encryption method we set our encryption mode for our cipher
            encryptMode();
            
            /*
            *now this might be kind of Complexe but let's explain it step by step
            *first we had problem with Base64 for String and that's we fixed it with using the org library
            *Step--1--:to crypt anything we need it as Byte table form and that's what we did at first used getBytes method for ourString parameter and with UTF-8 code
            *Step--2--:we take those bytes to encrypt them with doFinal methode of our cipher
            *Step--3--:since our doFinal method return table of byte and our  EncryptString method return String we need to change those bytes to string form
            *and that we can do with the Base64 Class and calling encodeBase64String method
            */
            return Base64.encodeBase64String(coder.doFinal(PlainText.getBytes("UTF-8")));
        } catch (Exception e) {
            new ErrorDisplayer("AES encryption String Error");
           return null;
        }
    }
    
    
    /*
    *decrypt String is basicly same as Encrypt method but it call our Decrpytmode() method
    */
    
    public String DecryptString(String CodedText){
        try{
            decryptMode();
            return new String(coder.doFinal(Base64.decodeBase64(CodedText)));
        }catch(Exception e){
            new ErrorDisplayer("A Decryption String Error");
            return null;
        }
    }
    
    
    //both two of those method work just like RSA only they have AES cipher
    public FileOutputStream EncryptFile(File plainFile,String name){
        encryptMode();
        FileCipher fileEnc=new FileCipher(coder);
        return fileEnc.fileCiphering(plainFile,name);
    }
    
    public FileOutputStream DecryptFile(File EncodedFile,String name){
        decryptMode();
        FileCipher fileEnc=new FileCipher(coder);
        return fileEnc.fileCiphering(EncodedFile,name);
    }
}
