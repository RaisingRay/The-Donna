/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package States.Setup;

import Entity.AccessDBModel;
import SecurityLayer.SecuredFlow;
import Workshop.Workshop;

/**
 *
 * @author Raiisa
 */
public class SetupManagement {
    
    
    //this might look little codes but they are made of tools so consider every ligne does alote of work
    private AccessDBModel ADBM;
    private SetupTools ST;
    //we have 2 constructors in this class but for now we are intrested in our second one
    public SetupManagement(){
    }
    
    public SetupManagement(AccessDBModel abdm){
        //this constructor get those access data base information as a entity class
        ADBM=new AccessDBModel(abdm);
        //and it goes to Createpath() method
        CreaterPath();
    }


    private void CreaterPath() {
        //we call our SetupTools again and give it the database information
        ST=new SetupTools(ADBM);
        //and we call our workshop, this class it simply orginise our work in a specifique diractory (appdata) if you are in windows,you are free to have a look what it contains
        Workshop wk=new Workshop();
        //this create our The donna diractory that it contains three diffrent diractory Public,Private and Operation 
        //we are considering that public diractory is actualy public and gives data to other since it well cotains public key,
        //while private is actualy private since it well contains private key
        //and operation is just a diractry that we going to use for our operation so it should be private
        wk.SetupWorkshop();
        
        //after setting up our diractory it's time to create our files,
        
        //first we call our Class SecuredFlow it's a powerfull class that takes care of all the dataflow to get it encrypted and dycrepted as we work with our 
        //data base and before you jump there we RECOMMEND you continue reading and following our comments
        SecuredFlow sf=new SecuredFlow();
        
        //so our SecuredFlow have many method and one of them is mkRSAKey(), this method it create RSA private and public key and it store them in theire diractorys
        sf.mkRSAkey();
        
        //then we Create our Database Access file
        ST.Create();
        //write on it the information of the database
        ST.Write();
        
        //and that's it for Setup i know that this might be Miss leading, you are waiting for the going to the Main State
        //but this what well happens if you press Submit button NOT FINISH BUTTON
        
        // So let's go back to StateManager Class and Take Back where we left of
    }
}
