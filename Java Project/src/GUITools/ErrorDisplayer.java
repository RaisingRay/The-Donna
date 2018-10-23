/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUITools;

import GUITools.Tweakers.TweakedButton;
import GUITools.Tweakers.TweakedFrame;
import GUITools.Tweakers.TweakedHeader;
import java.awt.Toolkit;

/**
 *
 * @author Raiisa
 */
public class ErrorDisplayer extends javax.swing.JFrame {


    private String Error;
    public ErrorDisplayer(String Error) {
        this.Error=Error;
        initComponents();
        myInit();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ErrorHeaderPannel = new javax.swing.JPanel();
        Closer = new javax.swing.JLabel();
        Warning = new javax.swing.JLabel();
        ErrorBodyPanel = new javax.swing.JPanel();
        ErrorStringShowerLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        ErrorHeaderPannel.setBackground(new java.awt.Color(239, 130, 63));

        Closer.setBackground(new java.awt.Color(239, 130, 63));
        Closer.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Closer.setForeground(new java.awt.Color(255, 255, 255));
        Closer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Closer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUITools/Icons/Close.png"))); // NOI18N
        Closer.setOpaque(true);

        Warning.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Warning.setForeground(new java.awt.Color(255, 255, 255));
        Warning.setText("Error Oups!!!");

        javax.swing.GroupLayout ErrorHeaderPannelLayout = new javax.swing.GroupLayout(ErrorHeaderPannel);
        ErrorHeaderPannel.setLayout(ErrorHeaderPannelLayout);
        ErrorHeaderPannelLayout.setHorizontalGroup(
            ErrorHeaderPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ErrorHeaderPannelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Warning, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 195, Short.MAX_VALUE)
                .addComponent(Closer, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ErrorHeaderPannelLayout.setVerticalGroup(
            ErrorHeaderPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Closer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ErrorHeaderPannelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Warning)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ErrorBodyPanel.setBackground(new java.awt.Color(255, 255, 255));

        ErrorStringShowerLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ErrorStringShowerLabel.setForeground(new java.awt.Color(14, 67, 117));

        javax.swing.GroupLayout ErrorBodyPanelLayout = new javax.swing.GroupLayout(ErrorBodyPanel);
        ErrorBodyPanel.setLayout(ErrorBodyPanelLayout);
        ErrorBodyPanelLayout.setHorizontalGroup(
            ErrorBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ErrorBodyPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ErrorStringShowerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        ErrorBodyPanelLayout.setVerticalGroup(
            ErrorBodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ErrorBodyPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(ErrorStringShowerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ErrorHeaderPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ErrorBodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ErrorHeaderPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ErrorBodyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void myInit() {
        Toolkit.getDefaultToolkit().beep();
        new TweakedFrame(this);
        ErrorStringShowerLabel.setText(Error);
        new TweakedButton(Closer,true){
            @Override
            public void action() {
                setVisible(false);
            }
        };
        
        new TweakedHeader(ErrorHeaderPannel, this);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Closer;
    private javax.swing.JPanel ErrorBodyPanel;
    private javax.swing.JPanel ErrorHeaderPannel;
    private javax.swing.JLabel ErrorStringShowerLabel;
    private javax.swing.JLabel Warning;
    // End of variables declaration//GEN-END:variables
}
