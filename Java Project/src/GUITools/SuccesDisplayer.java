package GUITools;

import GUITools.Tweakers.TweakedButton;
import GUITools.Tweakers.TweakedFrame;
import GUITools.Tweakers.TweakedHeader;


public class SuccesDisplayer extends javax.swing.JFrame {

    private String Succ;
    public SuccesDisplayer(String str) {
        Succ=str;
        initComponents();
        myInit();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SuccesPanel = new javax.swing.JPanel();
        ErrorHeaderPannel1 = new javax.swing.JPanel();
        Close = new javax.swing.JLabel();
        Success = new javax.swing.JLabel();
        SuccesStringShowerLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        SuccesPanel.setBackground(new java.awt.Color(255, 255, 255));

        ErrorHeaderPannel1.setBackground(new java.awt.Color(0, 153, 0));

        Close.setBackground(new java.awt.Color(0, 153, 0));
        Close.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Close.setForeground(new java.awt.Color(255, 255, 255));
        Close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUITools/Icons/Close.png"))); // NOI18N
        Close.setOpaque(true);

        Success.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Success.setForeground(new java.awt.Color(255, 255, 255));
        Success.setText("Sucess YEAH!!");

        javax.swing.GroupLayout ErrorHeaderPannel1Layout = new javax.swing.GroupLayout(ErrorHeaderPannel1);
        ErrorHeaderPannel1.setLayout(ErrorHeaderPannel1Layout);
        ErrorHeaderPannel1Layout.setHorizontalGroup(
            ErrorHeaderPannel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ErrorHeaderPannel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Success, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ErrorHeaderPannel1Layout.setVerticalGroup(
            ErrorHeaderPannel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ErrorHeaderPannel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Success)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SuccesStringShowerLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SuccesStringShowerLabel.setForeground(new java.awt.Color(14, 67, 117));
        SuccesStringShowerLabel.setText(Succ);

        javax.swing.GroupLayout SuccesPanelLayout = new javax.swing.GroupLayout(SuccesPanel);
        SuccesPanel.setLayout(SuccesPanelLayout);
        SuccesPanelLayout.setHorizontalGroup(
            SuccesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ErrorHeaderPannel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(SuccesPanelLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(SuccesStringShowerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        SuccesPanelLayout.setVerticalGroup(
            SuccesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SuccesPanelLayout.createSequentialGroup()
                .addComponent(ErrorHeaderPannel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SuccesStringShowerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SuccesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SuccesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void myInit() {
        new TweakedFrame(this);
        new TweakedHeader(SuccesPanel, this);
        new TweakedButton(Close, true) {
            @Override
            public void action() {
                setVisible(false);
            }
        };
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Close;
    private javax.swing.JLabel Closer;
    private javax.swing.JPanel ErrorHeaderPannel;
    private javax.swing.JPanel ErrorHeaderPannel1;
    private javax.swing.JPanel SuccesPanel;
    private javax.swing.JLabel SuccesStringShowerLabel;
    private javax.swing.JLabel Success;
    private javax.swing.JLabel Warning;
    // End of variables declaration//GEN-END:variables
}
