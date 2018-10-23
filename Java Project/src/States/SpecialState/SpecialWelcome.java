package States.SpecialState;

import GUITools.Tweakers.TweakedButton;
import GUITools.Tweakers.TweakedFrame;
import GUITools.Tweakers.TweakedHeader;
import States.Run.RunDisplay;



public class SpecialWelcome extends javax.swing.JFrame {

    public SpecialWelcome() {
        initComponents();
        myInit();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SpecialWelcomePannel = new javax.swing.JPanel();
        SpecialWelcomeHeaderPannel = new javax.swing.JPanel();
        Close = new javax.swing.JLabel();
        SpecialWelcomeLogo = new javax.swing.JLabel();
        SpecialWelcomeBodyPannel = new javax.swing.JPanel();
        DonnaImage = new javax.swing.JLabel();
        ScrollOurSpeach = new javax.swing.JScrollPane();
        OurSpeach = new javax.swing.JTextArea();
        SpecialWelcomeFooter = new javax.swing.JPanel();
        ApplicationLink = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        SpecialWelcomePannel.setBackground(new java.awt.Color(255, 255, 255));

        SpecialWelcomeHeaderPannel.setBackground(new java.awt.Color(239, 130, 63));

        Close.setBackground(new java.awt.Color(239, 130, 63));
        Close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUITools/Icons/Close.png"))); // NOI18N
        Close.setOpaque(true);

        SpecialWelcomeLogo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        SpecialWelcomeLogo.setForeground(new java.awt.Color(255, 255, 255));
        SpecialWelcomeLogo.setText("Welcome to the Donna");

        javax.swing.GroupLayout SpecialWelcomeHeaderPannelLayout = new javax.swing.GroupLayout(SpecialWelcomeHeaderPannel);
        SpecialWelcomeHeaderPannel.setLayout(SpecialWelcomeHeaderPannelLayout);
        SpecialWelcomeHeaderPannelLayout.setHorizontalGroup(
            SpecialWelcomeHeaderPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SpecialWelcomeHeaderPannelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(SpecialWelcomeLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        SpecialWelcomeHeaderPannelLayout.setVerticalGroup(
            SpecialWelcomeHeaderPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SpecialWelcomeHeaderPannelLayout.createSequentialGroup()
                .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(SpecialWelcomeHeaderPannelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(SpecialWelcomeLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                .addContainerGap())
        );

        SpecialWelcomeBodyPannel.setBackground(new java.awt.Color(255, 255, 255));

        DonnaImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUITools/Icons/suits_cast_donna.jpg"))); // NOI18N

        OurSpeach.setEditable(false);
        OurSpeach.setColumns(20);
        OurSpeach.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        OurSpeach.setForeground(new java.awt.Color(14, 67, 117));
        OurSpeach.setRows(5);
        OurSpeach.setText("Welcome to the Donna\nthis application\nis actually called\nafter one of our\nfavorit character\nin a tv show called\nSuits.\nit's a tv show about\nlawyers and we\nlearnd from it that\nthey need to protect\ntheir documents.\nSo we made an App\nthat Does that,\nWe Hope you like it\n");
        OurSpeach.setBorder(null);
        ScrollOurSpeach.setViewportView(OurSpeach);

        javax.swing.GroupLayout SpecialWelcomeBodyPannelLayout = new javax.swing.GroupLayout(SpecialWelcomeBodyPannel);
        SpecialWelcomeBodyPannel.setLayout(SpecialWelcomeBodyPannelLayout);
        SpecialWelcomeBodyPannelLayout.setHorizontalGroup(
            SpecialWelcomeBodyPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SpecialWelcomeBodyPannelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollOurSpeach, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addGap(36, 36, 36)
                .addComponent(DonnaImage)
                .addGap(104, 104, 104))
        );
        SpecialWelcomeBodyPannelLayout.setVerticalGroup(
            SpecialWelcomeBodyPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SpecialWelcomeBodyPannelLayout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addComponent(DonnaImage))
            .addComponent(ScrollOurSpeach)
        );

        SpecialWelcomeFooter.setBackground(new java.awt.Color(245, 200, 81));

        ApplicationLink.setBackground(new java.awt.Color(239, 130, 63));
        ApplicationLink.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ApplicationLink.setForeground(new java.awt.Color(255, 255, 255));
        ApplicationLink.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ApplicationLink.setText("Go to Application");
        ApplicationLink.setOpaque(true);

        javax.swing.GroupLayout SpecialWelcomeFooterLayout = new javax.swing.GroupLayout(SpecialWelcomeFooter);
        SpecialWelcomeFooter.setLayout(SpecialWelcomeFooterLayout);
        SpecialWelcomeFooterLayout.setHorizontalGroup(
            SpecialWelcomeFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SpecialWelcomeFooterLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ApplicationLink, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        SpecialWelcomeFooterLayout.setVerticalGroup(
            SpecialWelcomeFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SpecialWelcomeFooterLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(ApplicationLink, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout SpecialWelcomePannelLayout = new javax.swing.GroupLayout(SpecialWelcomePannel);
        SpecialWelcomePannel.setLayout(SpecialWelcomePannelLayout);
        SpecialWelcomePannelLayout.setHorizontalGroup(
            SpecialWelcomePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SpecialWelcomeHeaderPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SpecialWelcomeBodyPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SpecialWelcomeFooter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        SpecialWelcomePannelLayout.setVerticalGroup(
            SpecialWelcomePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SpecialWelcomePannelLayout.createSequentialGroup()
                .addComponent(SpecialWelcomeHeaderPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SpecialWelcomeBodyPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SpecialWelcomeFooter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SpecialWelcomePannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SpecialWelcomePannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void myInit() {
        new TweakedFrame(this);
        new TweakedHeader(SpecialWelcomeHeaderPannel, this);
        new TweakedButton(Close, true) {
            @Override
            public void action() {
                System.exit(0);
            }
           
        };
        new TweakedButton(ApplicationLink, false) {
            @Override
            public void action() {
                setVisible(true);
                new RunDisplay();
            }
        };
        ScrollOurSpeach.setBorder(null);
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ApplicationLink;
    private javax.swing.JLabel Close;
    private javax.swing.JLabel DonnaImage;
    private javax.swing.JTextArea OurSpeach;
    private javax.swing.JScrollPane ScrollOurSpeach;
    private javax.swing.JPanel SpecialWelcomeBodyPannel;
    private javax.swing.JPanel SpecialWelcomeFooter;
    private javax.swing.JPanel SpecialWelcomeHeaderPannel;
    private javax.swing.JLabel SpecialWelcomeLogo;
    private javax.swing.JPanel SpecialWelcomePannel;
    // End of variables declaration//GEN-END:variables
}
