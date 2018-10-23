/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package States.Run.Forms;

import BuisnessLogiqueLayer.SecuredObjects;
import Entity.Client;
import GUITools.Tweakers.*;
import GUITools.*;
import States.Run.Tables.ClientTableModel;
import javax.swing.JTable;
/**
 *
 * @author Raiisa
 */
public class ClientForm extends javax.swing.JFrame {

    /**
     * Creates new form ClientForm
     */
    SecuredObjects so;
    TweakedButton tb;
    JTable table;
    boolean update;
    Client ct;
    public ClientForm(TweakedButton tb,boolean update,JTable table) {
        so=new SecuredObjects();
        this.tb=tb;
        this.table=table;
        this.update=update;
        initComponents();
        myInit();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ClientFormPannel = new javax.swing.JPanel();
        ClientFormHeader = new javax.swing.JPanel();
        Close = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        Submit = new javax.swing.JLabel();
        FirstName = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        LastName = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        PhoneNumber = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        Address = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        ClientFormPannel.setBackground(new java.awt.Color(255, 255, 255));

        ClientFormHeader.setBackground(new java.awt.Color(14, 67, 117));

        Close.setBackground(new java.awt.Color(14, 67, 117));
        Close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUITools/Icons/Close.png"))); // NOI18N
        Close.setOpaque(true);

        Title.setBackground(new java.awt.Color(14, 67, 117));
        Title.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("Client");

        javax.swing.GroupLayout ClientFormHeaderLayout = new javax.swing.GroupLayout(ClientFormHeader);
        ClientFormHeader.setLayout(ClientFormHeaderLayout);
        ClientFormHeaderLayout.setHorizontalGroup(
            ClientFormHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClientFormHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ClientFormHeaderLayout.setVerticalGroup(
            ClientFormHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClientFormHeaderLayout.createSequentialGroup()
                .addGroup(ClientFormHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ClientFormHeaderLayout.createSequentialGroup()
                        .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(ClientFormHeaderLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)))
                .addContainerGap())
        );

        Submit.setBackground(new java.awt.Color(14, 67, 117));
        Submit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Submit.setForeground(new java.awt.Color(255, 255, 255));
        Submit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Submit.setText("Submit");
        Submit.setOpaque(true);

        FirstName.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        FirstName.setForeground(new java.awt.Color(14, 67, 117));
        FirstName.setBorder(null);

        LastName.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        LastName.setForeground(new java.awt.Color(14, 67, 117));
        LastName.setBorder(null);

        PhoneNumber.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        PhoneNumber.setForeground(new java.awt.Color(14, 67, 117));
        PhoneNumber.setBorder(null);

        Address.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Address.setForeground(new java.awt.Color(14, 67, 117));
        Address.setBorder(null);

        javax.swing.GroupLayout ClientFormPannelLayout = new javax.swing.GroupLayout(ClientFormPannel);
        ClientFormPannel.setLayout(ClientFormPannelLayout);
        ClientFormPannelLayout.setHorizontalGroup(
            ClientFormPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ClientFormHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ClientFormPannelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(ClientFormPannelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(ClientFormPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ClientFormPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Address)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ClientFormPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(PhoneNumber)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ClientFormPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(LastName)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ClientFormPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(FirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                        .addComponent(jSeparator1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ClientFormPannelLayout.setVerticalGroup(
            ClientFormPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClientFormPannelLayout.createSequentialGroup()
                .addComponent(ClientFormHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ClientFormPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ClientFormPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address;
    private javax.swing.JPanel ClientFormHeader;
    private javax.swing.JPanel ClientFormPannel;
    private javax.swing.JLabel Close;
    private javax.swing.JTextField FirstName;
    private javax.swing.JTextField LastName;
    private javax.swing.JTextField PhoneNumber;
    private javax.swing.JLabel Submit;
    private javax.swing.JLabel Title;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
       new TweakedFrame(this);
       new TweakedHeader(ClientFormHeader, this);
       new TweakedButton(Close, true) {
           @Override
           public void action() {
               tb.enable();
               setVisible(false);
           }
       };
       if(update){
            ClientTableModel ctm=(ClientTableModel)table.getModel();
            ct=so.getClientById(new Client((int)ctm.getValueAt(table.getSelectedRow(),ClientTableModel.IDCLIENT)));
            new TweakedTextBox(FirstName, ct.getFirstName());
            new TweakedTextBox(LastName, ct.getLastName());
            new TweakedTextBox(PhoneNumber, ct.getPhoneNumber()+"");
            new TweakedTextBox(Address,ct.getAdress());
            
             new TweakedButton(Submit,false) {
            @Override
            public void action() {
               tb.enable();
               UpdateClient();
               setVisible(false);
                }
             };
       }else{
            new TweakedTextBox(FirstName, "First Name");
            new TweakedTextBox(LastName, "Last Name");
            new TweakedTextBox(PhoneNumber, "Phone Number");
            new TweakedTextBox(Address,"Address");
            new TweakedButton(Submit,false) {
            @Override
            public void action() {
               tb.enable();
               if(InsertClient(InputClientTake()))
               setVisible(false);
           }
       };
       }
       
    }
    
    private boolean InsertClient(Client client){
        if(!so.inputeClient(client)){
            new SuccesDisplayer("Client Added");
            table.setModel(new ClientTableModel(so.getAllClient()));
            new TweakedTable(table);
            return true;}
        else{
            new ErrorDisplayer("Client Didn't Add");
            return false;}
    }
    private void UpdateClient(){
            so.updateClient(TakeClient());
            table.setModel(new ClientTableModel(so.getAllClient()));
            new TweakedTable(table);
    }
    private Client TakeClient(){
        try{
           Client cts=new Client(0, FirstName.getText(), LastName.getText(), Integer.parseInt(PhoneNumber.getText()), Address.getText());
           ct.setFirstName(cts.getFirstName());
           ct.setLastName(cts.getLastName());
           ct.setPhoneNumber(cts.getPhoneNumber());
           ct.setAdress(cts.getAdress());
           return ct;
        }catch(Exception e){
            new ErrorDisplayer("Please Check your Attribute Types");
            return null;
        }
    }
    
    private Client InputClientTake(){
    try{
          return new Client(0, FirstName.getText(), LastName.getText(), Integer.parseInt(PhoneNumber.getText()), Address.getText());
         
        }catch(Exception e){
            new ErrorDisplayer("Please Check your Attribute Types");
            return null;
        }
    
    }

}
