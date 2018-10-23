/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUITools.Tweakers;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Raiisa
 */
public class TweakedLink {
    private JLabel Button;
    private JPanel Page;
    private boolean enter=false;
    private boolean active=false;
    private int Green;
    private int Blue;
    private int Red;
    
    public TweakedLink(JLabel Button,JPanel Page){
        this.Button=Button;
        this.Page=Page;
        Green=Button.getBackground().getGreen();
        Blue=Button.getBackground().getBlue();
        Red=Button.getBackground().getRed();
        initListner();
    }

    private void initListner() {
       Button.addMouseListener(new MouseAdapter(){
           @Override
           public void mouseEntered(MouseEvent mevent){
               if(!active)
               {
                    enter=true;
                    bright();
               }
           }
           
           @Override
           public void mouseExited(MouseEvent mevent){
               if(!active)
               {
                    enter=false;
                    reset();
               }
           }
       });
    }
    
    public void reset(){
        Button.setBackground(new Color(Red, Green, Blue));
        Button.setForeground(new Color(255, 255, 255));
    }
    public void bright(){
       Button.setBackground(new Color(colorBrightChanger(Red),colorBrightChanger(Green),colorBrightChanger(Blue)));
       Button.setForeground(new Color(255, 255, 255));
   }
    private int colorBrightChanger(int color){
       if(color-40<=0)
            return 0;
        else
            return color-40;
    }
    public JLabel getButton() {
        return Button;
    }
    public JPanel getPage() {
        return Page;
    }
    public boolean isEnter() {
        return enter;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    
    public void activateButton(){
        Button.setBackground(new Color(255, 255, 255));
        Button.setForeground(new Color(14, 67, 117));
    }
    
}