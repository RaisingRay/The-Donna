/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUITools.Tweakers;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.JFrame;

/**
 *
 * @author Raiisa
 */
public class TweakedFrame {
    private JFrame frame=new JFrame();
    
    public TweakedFrame(JFrame frame){
    this.frame=frame;
    initChanges();
    }

    private void initChanges() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setVisible(true);
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
        frame.getRootPane().setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2,new Color(164, 164, 164)));
    }
}
