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
/**
 *
 * @author Raiisa
 */
public abstract class TweakedButton {
    private JLabel Button=new JLabel();
    private boolean entered=false;
    private boolean press=false;
    private boolean danger=false;
    private int Green;
    private int Blue;
    private int Red;
    private boolean Work=true;
    public abstract void action();
    
    
    public TweakedButton(JLabel label,boolean danger){
        Button=label;
        this.danger=danger;
        Green=Button.getBackground().getGreen();
        Blue=Button.getBackground().getBlue();
        Red=Button.getBackground().getRed();
        initListner();
    }
    
    private void initListner() {
        Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent mevent) {
                if(Work){
                entered=true;
                if(!press)
                    darker();}
                
            }
            @Override
            public void mouseExited(MouseEvent mevent) {
                if(Work){
                entered=false;
                if(!press)
                    reset();}
            }
            @Override
            public void mousePressed(MouseEvent mevent) {
                if(Work){
                press=true;
                lighter();}
            }
            @Override
            public void mouseReleased(MouseEvent mevent) {
                if(Work){
                press=false;
                reset();
                if(entered)
                  action();}
            }
        });
    }
    
    private void darker(){
        if(danger)
            Button.setBackground(Color.RED);
        else
            Button.setBackground(new Color(colorBrightChanger(Red),colorBrightChanger(Green), colorBrightChanger(Blue)));
    
    }
    private void lighter(){
        if(danger)
            Button.setBackground(Color.PINK);
        else 
            Button.setBackground(new Color(colorDarkChanger(Red), colorDarkChanger(Green),colorDarkChanger(Blue)));
    }
    
    
    
     private int colorDarkChanger(int color){
        if(color-40<=0)
            return 0;
        else
            return color-40;
    }
    private int colorBrightChanger(int color){
         if(color+40>=255)
             return 255;
         else
             return color+40;
         
    }
     
     
     
     
     
    private void reset(){
        Button.setBackground(new Color(Red, Green, Blue));
    }
    
    private void Grey(){
        Button.setBackground(Color.GRAY);
    }

    public void disable(){
        Work=false;
        Grey();
    }
    
    public void enable(){
        Work=true;
        reset();
    }

    public JLabel getButton() {
        return Button;
    }

    public boolean isEntered() {
        return entered;
    }
}
