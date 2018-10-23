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
import javax.crypto.Cipher;

/**
 *
 * @author Raiisa
 */
public class FileCipher {
    /*Welcome To File Cipher Class
    *This Class Is just for encrypting and decrypting file with a Ready Cipher Since
    *Both Our AES class and RSA class use this Method the smart way to use it is to create class for it
    *let's get Going Shell we?
    */
    
    //this Object of Cipher Class is the one we gonna get from our Upper Classes
    private Cipher coder;
    
    public FileCipher(Cipher coder){
        //as you may see our Constructer takes a Cipher Object to initialise it with our own Cipher So we can encrypt 
        //and decrypt no matter what are the setting of our Cipher
        this.coder=coder;
    }
    
    
    //ok here's our Bread and Butter of our Class the File Ciphering it takes two Parameter while it returns a FileOutputStream
    //it takes the file to incrypt and the name of our output file for some nice flexibility of our File
    public FileOutputStream fileCiphering(File file,String name){
        try{
                //we begin with initialising our input file and output file that we gonna work with
                FileInputStream iFile=new FileInputStream(file);
                FileOutputStream oFile=new FileOutputStream(name);
                
                //this is our inpute Buffer that mean we gonna read by line of byte for every single line of our input file
                byte[] inputBuff=new byte[1024];
                //this integer is going to have the length of the line to use it in update method of Cipher class
                int len;
                //i think the condition is basic and easy to know
                while((len=iFile.read(inputBuff))>0){
                    /*ok this is kinda powerfull thing to do since our Cipher object wich is named coder in this case
                    *is a Cipher object that already good to go to work with it, that means it's already have it's instractions to 
                    *encrypt or decrypt wich we get it from our constractor we just use our update method to encrypt or decrypt the
                    *input buffer wich is our line of file and all of this depending of our first class of our FileCipher class
                    *and put the work inside output buffer
                    *i hope you get it :)
                    */
                    byte[] outputBuff=coder.update(inputBuff,0, len);
                    /*
                    *we check if our output buffer to write it in our output file
                    */
                    if(outputBuff!=null)
                        oFile.write(outputBuff);
                }
                // same work but last line
                byte[] outputBuff=coder.doFinal();
                    if(outputBuff!=null)
                        oFile.write(outputBuff);
                    oFile.close();
                    iFile.close();
                    //we return our output file as we said that is encrypted or decrypted depending on the cipher that we recieved
                return oFile;
        }catch(Exception e){
            return null;
        }
    }
}
