/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUITools.Tweakers;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JTextField;

/**
 *
 * @author Raiisa
 */
public class TweakedTextBox {
   private JTextField TextBox=new JTextField();
   private String Name;
   
   public TweakedTextBox(JTextField TextBox,String Name){
       this.TextBox=TextBox;
       this.Name=Name;
       
       initListner();
   }

    private void initListner() {
        TextBox.setText(Name);
        TextBox.addFocusListener(new FocusAdapter() {
            
            @Override
            public void focusGained(FocusEvent Fevent){
                if(TextBox.getText().equals(Name))
                    TextBox.setText("");
               
            }
            
            @Override
            public void focusLost(FocusEvent Fevent){
                if(TextBox.getText().equals(""))
                    TextBox.setText(Name);
            }
        });
    }
}
