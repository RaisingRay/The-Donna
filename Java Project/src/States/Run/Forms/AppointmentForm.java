package States.Run.Forms;

import BuisnessLogiqueLayer.BuisnesObjects;
import BuisnessLogiqueLayer.SecuredObjects;
import Entity.Appointment;
import Entity.Client;
import GUITools.SuccesDisplayer;
import GUITools.Tweakers.*;
import States.Run.Refrechers.RefrechAppointmentTable;
import States.Run.Tables.ClientTableModel;
import java.sql.Date;
import javax.swing.JTable;



public class AppointmentForm extends javax.swing.JFrame {
    TweakedButton tb;
    JTable table;
    SecuredObjects so;
    BuisnesObjects bo;
    Client client;
    public AppointmentForm(TweakedButton tb,JTable table) {
        this.tb=tb;
        so=new SecuredObjects();
        bo=new BuisnesObjects();
        this.table=table;
        initComponents();
        myInit();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        AppointmentFormPannel = new javax.swing.JPanel();
        AppointmentFormHeader = new javax.swing.JPanel();
        Close = new javax.swing.JLabel();
        Title1 = new javax.swing.JLabel();
        AppointmentLayout = new javax.swing.JPanel();
        ClientPicker = new javax.swing.JPanel();
        GotoAppoitFrom = new javax.swing.JLabel();
        ClientScroll2 = new javax.swing.JScrollPane();
        ClientTable2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        AppointmentForm = new javax.swing.JPanel();
        Submit = new javax.swing.JLabel();
        Year = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        Month = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        Day = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        Min = new javax.swing.JTextField();
        Hour = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        MinD = new javax.swing.JTextField();
        HourD = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        HearingDateLabel = new javax.swing.JLabel();
        HearingDateLabel1 = new javax.swing.JLabel();
        HearingDateLabel2 = new javax.swing.JLabel();

        Title.setBackground(new java.awt.Color(14, 67, 117));
        Title.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        AppointmentFormPannel.setBackground(new java.awt.Color(255, 255, 255));

        AppointmentFormHeader.setBackground(new java.awt.Color(14, 67, 117));

        Close.setBackground(new java.awt.Color(14, 67, 117));
        Close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUITools/Icons/Close.png"))); // NOI18N
        Close.setOpaque(true);

        Title1.setBackground(new java.awt.Color(14, 67, 117));
        Title1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Title1.setForeground(new java.awt.Color(255, 255, 255));
        Title1.setText("Appointment");

        javax.swing.GroupLayout AppointmentFormHeaderLayout = new javax.swing.GroupLayout(AppointmentFormHeader);
        AppointmentFormHeader.setLayout(AppointmentFormHeaderLayout);
        AppointmentFormHeaderLayout.setHorizontalGroup(
            AppointmentFormHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AppointmentFormHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        AppointmentFormHeaderLayout.setVerticalGroup(
            AppointmentFormHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AppointmentFormHeaderLayout.createSequentialGroup()
                .addGroup(AppointmentFormHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AppointmentFormHeaderLayout.createSequentialGroup()
                        .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AppointmentFormHeaderLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Title1, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)))
                .addContainerGap())
        );

        AppointmentLayout.setBackground(new java.awt.Color(255, 255, 255));
        AppointmentLayout.setLayout(new java.awt.CardLayout());

        ClientPicker.setBackground(new java.awt.Color(255, 255, 255));

        GotoAppoitFrom.setBackground(new java.awt.Color(14, 67, 117));
        GotoAppoitFrom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        GotoAppoitFrom.setForeground(new java.awt.Color(255, 255, 255));
        GotoAppoitFrom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GotoAppoitFrom.setText("Next");
        GotoAppoitFrom.setOpaque(true);

        ClientScroll2.setBackground(new java.awt.Color(255, 255, 255));
        ClientScroll2.setBorder(null);

        ClientTable2.setModel(new ClientTableModel(so.getAllClient()));
        ClientScroll2.setViewportView(ClientTable2);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(14, 67, 117));
        jLabel3.setText("Pick the Client whom this Appointment belong to:");

        javax.swing.GroupLayout ClientPickerLayout = new javax.swing.GroupLayout(ClientPicker);
        ClientPicker.setLayout(ClientPickerLayout);
        ClientPickerLayout.setHorizontalGroup(
            ClientPickerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClientPickerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(GotoAppoitFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(ClientScroll2, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
            .addGroup(ClientPickerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ClientPickerLayout.setVerticalGroup(
            ClientPickerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ClientPickerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(ClientScroll2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GotoAppoitFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        AppointmentLayout.add(ClientPicker, "card2");

        AppointmentForm.setBackground(new java.awt.Color(255, 255, 255));

        Submit.setBackground(new java.awt.Color(14, 67, 117));
        Submit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Submit.setForeground(new java.awt.Color(255, 255, 255));
        Submit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Submit.setText("Submit");
        Submit.setOpaque(true);

        Year.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Year.setForeground(new java.awt.Color(14, 67, 117));
        Year.setBorder(null);

        Month.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Month.setForeground(new java.awt.Color(14, 67, 117));
        Month.setBorder(null);

        Day.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Day.setForeground(new java.awt.Color(14, 67, 117));
        Day.setBorder(null);

        Min.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Min.setForeground(new java.awt.Color(14, 67, 117));
        Min.setBorder(null);

        Hour.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Hour.setForeground(new java.awt.Color(14, 67, 117));
        Hour.setBorder(null);

        MinD.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        MinD.setForeground(new java.awt.Color(14, 67, 117));
        MinD.setBorder(null);

        HourD.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        HourD.setForeground(new java.awt.Color(14, 67, 117));
        HourD.setBorder(null);

        HearingDateLabel.setBackground(new java.awt.Color(255, 255, 255));
        HearingDateLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        HearingDateLabel.setForeground(new java.awt.Color(14, 67, 117));
        HearingDateLabel.setText("Appointment Date:");

        HearingDateLabel1.setBackground(new java.awt.Color(255, 255, 255));
        HearingDateLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        HearingDateLabel1.setForeground(new java.awt.Color(14, 67, 117));
        HearingDateLabel1.setText("Appointment Duration:");

        HearingDateLabel2.setBackground(new java.awt.Color(255, 255, 255));
        HearingDateLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        HearingDateLabel2.setForeground(new java.awt.Color(14, 67, 117));
        HearingDateLabel2.setText("Appointment Time:");

        javax.swing.GroupLayout AppointmentFormLayout = new javax.swing.GroupLayout(AppointmentForm);
        AppointmentForm.setLayout(AppointmentFormLayout);
        AppointmentFormLayout.setHorizontalGroup(
            AppointmentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AppointmentFormLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(AppointmentFormLayout.createSequentialGroup()
                .addGroup(AppointmentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AppointmentFormLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(AppointmentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(HearingDateLabel)
                            .addComponent(HearingDateLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AppointmentFormLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(HearingDateLabel1)
                        .addGap(18, 18, 18)))
                .addGroup(AppointmentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AppointmentFormLayout.createSequentialGroup()
                        .addGroup(AppointmentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator10, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HourD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(AppointmentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MinD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(AppointmentFormLayout.createSequentialGroup()
                        .addGroup(AppointmentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Hour, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(AppointmentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Min, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(AppointmentFormLayout.createSequentialGroup()
                        .addGroup(AppointmentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Day, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(AppointmentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Month, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(AppointmentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Year, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(315, Short.MAX_VALUE))
        );
        AppointmentFormLayout.setVerticalGroup(
            AppointmentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AppointmentFormLayout.createSequentialGroup()
                .addGroup(AppointmentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AppointmentFormLayout.createSequentialGroup()
                        .addGroup(AppointmentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AppointmentFormLayout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addGroup(AppointmentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(AppointmentFormLayout.createSequentialGroup()
                                        .addComponent(Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(AppointmentFormLayout.createSequentialGroup()
                                        .addComponent(Month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(AppointmentFormLayout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(8, 8, 8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AppointmentFormLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(HearingDateLabel)
                                .addGap(15, 15, 15)))
                        .addGroup(AppointmentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AppointmentFormLayout.createSequentialGroup()
                                .addComponent(Hour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AppointmentFormLayout.createSequentialGroup()
                                .addComponent(Min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AppointmentFormLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(HearingDateLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AppointmentFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AppointmentFormLayout.createSequentialGroup()
                                .addComponent(HourD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AppointmentFormLayout.createSequentialGroup()
                                .addComponent(MinD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AppointmentFormLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(HearingDateLabel1)
                        .addGap(86, 86, 86)))
                .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        AppointmentLayout.add(AppointmentForm, "card3");

        javax.swing.GroupLayout AppointmentFormPannelLayout = new javax.swing.GroupLayout(AppointmentFormPannel);
        AppointmentFormPannel.setLayout(AppointmentFormPannelLayout);
        AppointmentFormPannelLayout.setHorizontalGroup(
            AppointmentFormPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AppointmentFormHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(AppointmentLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        AppointmentFormPannelLayout.setVerticalGroup(
            AppointmentFormPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AppointmentFormPannelLayout.createSequentialGroup()
                .addComponent(AppointmentFormHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AppointmentLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AppointmentFormPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AppointmentFormPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AppointmentForm;
    private javax.swing.JPanel AppointmentFormHeader;
    private javax.swing.JPanel AppointmentFormPannel;
    private javax.swing.JPanel AppointmentLayout;
    private javax.swing.JPanel AppointmentPick;
    private javax.swing.JPanel AppointmentPick1;
    private javax.swing.JPanel ClientPicker;
    private javax.swing.JScrollPane ClientScroll;
    private javax.swing.JScrollPane ClientScroll1;
    private javax.swing.JScrollPane ClientScroll2;
    private javax.swing.JTable ClientTable;
    private javax.swing.JTable ClientTable1;
    private javax.swing.JTable ClientTable2;
    private javax.swing.JLabel Close;
    private javax.swing.JTextField Day;
    private javax.swing.JLabel GotoAppointmentFrom;
    private javax.swing.JLabel GotoAppointmentFrom1;
    private javax.swing.JLabel GotoAppoitFrom;
    private javax.swing.JLabel HearingDateLabel;
    private javax.swing.JLabel HearingDateLabel1;
    private javax.swing.JLabel HearingDateLabel2;
    private javax.swing.JTextField Hour;
    private javax.swing.JTextField HourD;
    private javax.swing.JTextField Min;
    private javax.swing.JTextField MinD;
    private javax.swing.JTextField Month;
    private javax.swing.JLabel Submit;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Title1;
    private javax.swing.JTextField Year;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
        
        //prepare Frames
        new TweakedFrame(this);
        new TweakedHeader(AppointmentFormHeader, this);
        new TweakedButton(Close, true) {
            @Override
            public void action() {
                setVisible(false);
            }
        };
        new TweakedTable(ClientTable2);
        ClientScroll2.setBorder(null);
        //picke Client
        new TweakedButton(GotoAppoitFrom, false) {
            @Override
            public void action() {
                ClientTableModel ctm=(ClientTableModel)ClientTable2.getModel();
                client=so.getClientById(new Client((int)ctm.getValueAt(ClientTable2.getSelectedRow(),ClientTableModel.IDCLIENT)));
                
                //client picked navigation now
                ClientPicker.setVisible(false);
                AppointmentForm.setVisible(true);
                
            }
        };
        
        
        
        //prepare Appointment
            new TweakedTextBox(Month, "MM");
            new TweakedTextBox(Year, "YYYY");
            new TweakedTextBox(Day, "DD");
            new TweakedTextBox(Hour, "HH");
            new TweakedTextBox(Min, "MM");
            new TweakedTextBox(HourD, "HH");
            new TweakedTextBox(MinD, "MM");
        //insert Appoinment
        new TweakedButton(Submit, false) {
            @Override
            public void action() {
                insertAppointment(takeAppointment());
                new SuccesDisplayer("Appointment Added");
                new RefrechAppointmentTable(table);
                setVisible(false);
            }
        };
      
    }
    
    private void insertAppointment(Appointment app){
        bo.inputAppointment(app);
    }
    private Appointment takeAppointment(){
        java.util.Date date;
        java.util.Date duration;
        int Day=Integer.parseInt(this.Day.getText());
        int Month=Integer.parseInt(this.Month.getText());
        int Year=Integer.parseInt(this.Year.getText());
        int hour=Integer.parseInt(Hour.getText());
        int minute=Integer.parseInt(Min.getText());
        int dhour=Integer.parseInt(HourD.getText());
        int dminute=Integer.parseInt(MinD.getText());
        date=new java.util.Date(Year, Month, Day, hour, minute);
        duration=new java.util.Date(Year, Month, Day, dhour, dminute);
        return new Appointment(0,new java.sql.Date(date.getTime()), new java.sql.Time(duration.getTime()), false, false, false, client);
    }
}
