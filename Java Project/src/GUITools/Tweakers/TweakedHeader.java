/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUITools.Tweakers;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Raiisa
 */
public class TweakedHeader {
    private JPanel Header= new JPanel();
    private JFrame frame=new JFrame();
    int posX=0,posY=0;
    
    public TweakedHeader(JPanel panel,JFrame frame){
        Header=panel;
        this.frame=frame;
        initListner();
    }

    private void initListner() {
        Header.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent mevent){
                posX=mevent.getX();
                posY=mevent.getY();
           }
        });
        
        Header.addMouseMotionListener(new MouseAdapter(){
            @Override
            public void mouseDragged(MouseEvent evt){			
		frame.setLocation (evt.getXOnScreen()-posX,evt.getYOnScreen()-posY);
            }
        });
    }
}
