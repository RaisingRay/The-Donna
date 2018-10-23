/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package States;

import DataAccessLayer.DataBaseConection;
import States.Run.RunDisplay;
import States.Setup.SetupDisplay;
import States.Setup.SetupTools;

/**
 *
 * @author Raiisa
 */
public class StateManager {
    
    private SetupTools ST=new SetupTools();
  
    public StateManager(){
    /*first thank you for sticking to our comment and welcome again, as you may see it's realy simple condition to diract to which
        class we go, and the Condition is basicly to know if you have already done the setup or not.*/
    
    
    /*we use a method called isSet() from SetupTools to know if the programme already done the Setup state or not,you might be asking what's SetupTools and what it does,
    to make this simple, we created alote of tools class to help us to do kind of complicated task to make them just in one line code,
    and that makes our programme well constructed , able to be developed in the futur and to edit the code with ease.
    feel free to read what those Tools class are doing.
    but i well tell you every time what the method of our every tool class does.
    so you would undestand it without reading what it contains
    */
    
    /*first let's go throught what's going to happend if the isSet() method return us false values which is what
     supposed to happen if this programme has been executed for the first time*/
        if(!ST.isSet()){
            //and as you may see it takes us to the SetupDisplay , this class is the Graphique interface to the Setup State,so how about we go check it's contructor
            new SetupDisplay();
        }
        else
        {
            //if you are reading this you should be knowing how all the Setup State is going
            //for now let's see what's going to happens if we have our files ready 
            
            
            //first we read our Access Data Base file and give those informations to DataBaseConnection which it's all about connecting to the 
            //database and operation of Querys, you are free to go  and have a look or just go with the comment
            //So let's explain fast what this Constractor does cause we have 2 in this class
            //this allocate in the memory those database information staticly that means
            //that every object going to be able to access thos attributes later on
            new DataBaseConection(ST.ReadAccessDBModel());
            
            //and after we are set with that, the programme is ready to launche you to the Run (main) State,
            //but not for you the Code is kinda of complicated since it use allote of the tools we made,
            //like using a lable to make it a button or a list of lable to make them as a menu ...
            new RunDisplay();
            //so where you should be going is to why we created this application in the first Place and that's the the SecuredObject
            //inside BuissnessLogiqueLayer Package
            
        }
    }   
}
