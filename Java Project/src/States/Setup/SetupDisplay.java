
package States.Setup;

import DataAccessLayer.DataBaseConection;
import Entity.AccessDBModel;
import GUITools.SuccesDisplayer;
import GUITools.Tweakers.*;
import States.SpecialState.SpecialWelcome;

public class SetupDisplay extends javax.swing.JFrame {


    
    TweakedButton FinishSetupManagemnt;
    public SetupDisplay() {
        //this class contains mostly a generated code, and the only code that we did write is contained in myInit() method so let's read what it does
        initComponents();
        myInit();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SetupPanel = new javax.swing.JPanel();
        SetupHeaderPanel = new javax.swing.JPanel();
        Close = new javax.swing.JLabel();
        Setup = new javax.swing.JLabel();
        SetupNexts = new javax.swing.JPanel();
        SetupEntry = new javax.swing.JPanel();
        FooterSetupEntry = new javax.swing.JPanel();
        NextSetupEntry = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        EntrySpeach = new javax.swing.JTextArea();
        SetupManagement = new javax.swing.JPanel();
        FooterSetupManagement = new javax.swing.JPanel();
        NextSetupManagement = new javax.swing.JLabel();
        SetupManagementBody = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        DbNameTextBox = new javax.swing.JTextField();
        UserTextBox = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        PasswordTextBox = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        SubmitSetupManager = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        SetupPanel.setBackground(new java.awt.Color(255, 255, 255));

        SetupHeaderPanel.setBackground(new java.awt.Color(239, 130, 63));

        Close.setBackground(new java.awt.Color(239, 130, 63));
        Close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUITools/Icons/Close.png"))); // NOI18N
        Close.setOpaque(true);

        Setup.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Setup.setForeground(new java.awt.Color(255, 255, 255));
        Setup.setText("The Donna Setup");

        javax.swing.GroupLayout SetupHeaderPanelLayout = new javax.swing.GroupLayout(SetupHeaderPanel);
        SetupHeaderPanel.setLayout(SetupHeaderPanelLayout);
        SetupHeaderPanelLayout.setHorizontalGroup(
            SetupHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SetupHeaderPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(SetupHeaderPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(Setup)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        SetupHeaderPanelLayout.setVerticalGroup(
            SetupHeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SetupHeaderPanelLayout.createSequentialGroup()
                .addComponent(Close)
                .addGap(4, 4, 4)
                .addComponent(Setup)
                .addGap(0, 111, Short.MAX_VALUE))
        );

        SetupNexts.setLayout(new java.awt.CardLayout());

        SetupEntry.setBackground(new java.awt.Color(255, 255, 255));

        FooterSetupEntry.setBackground(new java.awt.Color(245, 200, 81));

        NextSetupEntry.setBackground(new java.awt.Color(239, 130, 63));
        NextSetupEntry.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NextSetupEntry.setForeground(new java.awt.Color(255, 255, 255));
        NextSetupEntry.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NextSetupEntry.setText("Next");
        NextSetupEntry.setOpaque(true);

        javax.swing.GroupLayout FooterSetupEntryLayout = new javax.swing.GroupLayout(FooterSetupEntry);
        FooterSetupEntry.setLayout(FooterSetupEntryLayout);
        FooterSetupEntryLayout.setHorizontalGroup(
            FooterSetupEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FooterSetupEntryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NextSetupEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        FooterSetupEntryLayout.setVerticalGroup(
            FooterSetupEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FooterSetupEntryLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(NextSetupEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        EntrySpeach.setEditable(false);
        EntrySpeach.setColumns(20);
        EntrySpeach.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        EntrySpeach.setForeground(new java.awt.Color(14, 67, 117));
        EntrySpeach.setRows(5);
        EntrySpeach.setText("\tGreeting Mr Houssem Abdellaoui ,\n This is an app made for the management of a lawyer's office .\n This setup will be shown only one time for configuring the installation\n of the app on your computer, you will just enter the database's name ,\n the username and the password .\n  The next time you run this application, it will directly go to the main \n page skipping this setup because it is already set.\n  The Port of the DataBase set as default 3306 So if you're using WAMP or\n Anything like that you might want to go change the Port value\n in the Attribute BaseTrajectory you'ill find it inside DataBaseConnection\n Class that belongs to DataAccessLayer Package, if you still having a problem please\n don't hesitate to contact us\n\n\n\n");
        EntrySpeach.setBorder(null);
        jScrollPane1.setViewportView(EntrySpeach);

        javax.swing.GroupLayout SetupEntryLayout = new javax.swing.GroupLayout(SetupEntry);
        SetupEntry.setLayout(SetupEntryLayout);
        SetupEntryLayout.setHorizontalGroup(
            SetupEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FooterSetupEntry, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(SetupEntryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1056, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        SetupEntryLayout.setVerticalGroup(
            SetupEntryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SetupEntryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(FooterSetupEntry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        SetupNexts.add(SetupEntry, "card2");

        SetupManagement.setBackground(new java.awt.Color(255, 255, 255));

        FooterSetupManagement.setBackground(new java.awt.Color(245, 200, 81));

        NextSetupManagement.setBackground(new java.awt.Color(239, 130, 63));
        NextSetupManagement.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NextSetupManagement.setForeground(new java.awt.Color(255, 255, 255));
        NextSetupManagement.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NextSetupManagement.setText("Finish");
        NextSetupManagement.setOpaque(true);

        javax.swing.GroupLayout FooterSetupManagementLayout = new javax.swing.GroupLayout(FooterSetupManagement);
        FooterSetupManagement.setLayout(FooterSetupManagementLayout);
        FooterSetupManagementLayout.setHorizontalGroup(
            FooterSetupManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FooterSetupManagementLayout.createSequentialGroup()
                .addContainerGap(1003, Short.MAX_VALUE)
                .addComponent(NextSetupManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        FooterSetupManagementLayout.setVerticalGroup(
            FooterSetupManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FooterSetupManagementLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(NextSetupManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        SetupManagementBody.setBackground(new java.awt.Color(255, 255, 255));

        DbNameTextBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DbNameTextBox.setForeground(new java.awt.Color(14, 67, 117));
        DbNameTextBox.setBorder(null);

        UserTextBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UserTextBox.setForeground(new java.awt.Color(14, 67, 117));
        UserTextBox.setBorder(null);

        PasswordTextBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PasswordTextBox.setForeground(new java.awt.Color(14, 67, 117));
        PasswordTextBox.setBorder(null);

        SubmitSetupManager.setBackground(new java.awt.Color(14, 67, 117));
        SubmitSetupManager.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SubmitSetupManager.setForeground(new java.awt.Color(255, 255, 255));
        SubmitSetupManager.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SubmitSetupManager.setText("Submit");
        SubmitSetupManager.setOpaque(true);

        javax.swing.GroupLayout SetupManagementBodyLayout = new javax.swing.GroupLayout(SetupManagementBody);
        SetupManagementBody.setLayout(SetupManagementBodyLayout);
        SetupManagementBodyLayout.setHorizontalGroup(
            SetupManagementBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SetupManagementBodyLayout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addGroup(SetupManagementBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SetupManagementBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator3)
                        .addComponent(PasswordTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SetupManagementBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(SetupManagementBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator2)
                            .addComponent(UserTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(SetupManagementBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1)
                            .addComponent(DbNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(SetupManagementBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(SetupManagementBodyLayout.createSequentialGroup()
                    .addGap(313, 313, 313)
                    .addComponent(SubmitSetupManager, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(686, Short.MAX_VALUE)))
        );
        SetupManagementBodyLayout.setVerticalGroup(
            SetupManagementBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SetupManagementBodyLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(DbNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UserTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
            .addGroup(SetupManagementBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SetupManagementBodyLayout.createSequentialGroup()
                    .addContainerGap(213, Short.MAX_VALUE)
                    .addComponent(SubmitSetupManager, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(97, 97, 97)))
        );

        javax.swing.GroupLayout SetupManagementLayout = new javax.swing.GroupLayout(SetupManagement);
        SetupManagement.setLayout(SetupManagementLayout);
        SetupManagementLayout.setHorizontalGroup(
            SetupManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FooterSetupManagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SetupManagementBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        SetupManagementLayout.setVerticalGroup(
            SetupManagementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SetupManagementLayout.createSequentialGroup()
                .addComponent(SetupManagementBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FooterSetupManagement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        SetupNexts.add(SetupManagement, "card3");

        javax.swing.GroupLayout SetupPanelLayout = new javax.swing.GroupLayout(SetupPanel);
        SetupPanel.setLayout(SetupPanelLayout);
        SetupPanelLayout.setHorizontalGroup(
            SetupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SetupNexts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SetupHeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        SetupPanelLayout.setVerticalGroup(
            SetupPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SetupPanelLayout.createSequentialGroup()
                .addComponent(SetupHeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SetupNexts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SetupPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SetupPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void myInit() {
        
        /*all of those Tweaked tools are just for making our GUI look as it looks now,  what we are intrested in is our creatingAccessDataBaseFile() method 
        which it should be in line number 325 so how about we have a look there*/
        new TweakedFrame(this);
        new TweakedHeader(SetupHeaderPanel, this);
        new TweakedButton(Close,true) {
            @Override
            public void action() {
               System.exit(0);
            }
        };
        new TweakedButton(NextSetupEntry, false) {
            @Override
            public void action() {
               SetupEntry.setVisible(false);
               SetupManagement.setVisible(true);
            }
        };

        FinishSetupManagemnt= new TweakedButton(NextSetupManagement, false) {
            @Override
            public void action() {
                setVisible(false);
                new SpecialWelcome();
            }
        };
       FinishSetupManagemnt.disable();
        new TweakedButton(SubmitSetupManager, false) {
            @Override
            public void action() {
                creatingAccessDataBaseFile();
            }
        };
        new TweakedTextBox(DbNameTextBox,"DataBaseName");
        new TweakedTextBox(UserTextBox,"UserName");
        new TweakedTextBox(PasswordTextBox, "Password");
    }
//this method is called with a mouseListner Button so let's see what happens when you click the Submit Button
private void creatingAccessDataBaseFile()
    {
        /*all you need to know is that we call SetupManagement, this class is all about making the first Setup , RSA private key and public key .
        and the constructor give him the information of the mysql data base name, root and password to be able to make the file that help for the connection everytime to our
        database, so let's goo what this constructor does. please go to the SetupManager Class inside*/
        SetupManagement SM=new SetupManagement(new AccessDBModel(DbNameTextBox.getText(), UserTextBox.getText(), PasswordTextBox.getText()));
        DataBaseConection dbc=new DataBaseConection();
        if(dbc.isConnected()){
            new SuccesDisplayer("You Are Connected");
            FinishSetupManagemnt.enable();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Close;
    private javax.swing.JTextField DbNameTextBox;
    private javax.swing.JTextArea EntrySpeach;
    private javax.swing.JPanel FooterSetupEntry;
    private javax.swing.JPanel FooterSetupManagement;
    private javax.swing.JLabel NextSetupEntry;
    private javax.swing.JLabel NextSetupManagement;
    private javax.swing.JTextField PasswordTextBox;
    private javax.swing.JLabel Setup;
    private javax.swing.JPanel SetupEntry;
    private javax.swing.JPanel SetupHeaderPanel;
    private javax.swing.JPanel SetupManagement;
    private javax.swing.JPanel SetupManagementBody;
    private javax.swing.JPanel SetupNexts;
    private javax.swing.JPanel SetupPanel;
    private javax.swing.JLabel SubmitSetupManager;
    private javax.swing.JTextField UserTextBox;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
