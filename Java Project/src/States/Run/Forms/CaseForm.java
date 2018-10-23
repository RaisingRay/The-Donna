/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package States.Run.Forms;

import BuisnessLogiqueLayer.BuisnesObjects;
import BuisnessLogiqueLayer.SecuredObjects;
import Entity.Bill;
import Entity.Case;
import Entity.Client;
import GUITools.SuccesDisplayer;
import GUITools.Tweakers.TweakedButton;
import GUITools.Tweakers.TweakedFrame;
import GUITools.Tweakers.TweakedHeader;
import GUITools.Tweakers.TweakedTable;
import GUITools.Tweakers.TweakedTextBox;
import States.Run.Refrechers.RefrechBillTable;
import States.Run.Refrechers.RefrechCaseTable;
import States.Run.Tables.CaseTableModel;
import States.Run.Tables.ClientTableModel;
import javax.swing.JFileChooser;
import javax.swing.JTable;

/**
 *
 * @author Raiisa
 */
public class CaseForm extends javax.swing.JFrame {
    SecuredObjects so;
    TweakedButton tb;
    JTable table;
    boolean update;
    Case Case;
    Client client;
    JTable bill;
    public CaseForm(TweakedButton tb,boolean update,JTable table,JTable t) {
        so=new SecuredObjects();
        this.tb=tb;
        bill=t;
        this.table=table;
        this.update=update;
        initComponents();
        myInit();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CaseFormPannel = new javax.swing.JPanel();
        CaseFormHeader = new javax.swing.JPanel();
        Close = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        CaseLayout = new javax.swing.JPanel();
        ClientPick = new javax.swing.JPanel();
        GotoCaseFrom = new javax.swing.JLabel();
        ClientScroll = new javax.swing.JScrollPane();
        ClientTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        CaseForm = new javax.swing.JPanel();
        CaseSubmit = new javax.swing.JLabel();
        IdCase = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        CaseName = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        HearingAddress = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        Day = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        Month = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        Year = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        HearingDateLabel = new javax.swing.JLabel();
        HearingDateLabel1 = new javax.swing.JLabel();
        ChooseFile = new javax.swing.JLabel();
        BillForm = new javax.swing.JPanel();
        BillSubmit = new javax.swing.JLabel();
        RetainerFee = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        DepositFeee = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        Year1 = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        Month1 = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        Day1 = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        HearingDateLabel2 = new javax.swing.JLabel();
        HearingDateLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(333, 406));
        setUndecorated(true);

        CaseFormPannel.setBackground(new java.awt.Color(255, 255, 255));

        CaseFormHeader.setBackground(new java.awt.Color(14, 67, 117));

        Close.setBackground(new java.awt.Color(14, 67, 117));
        Close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUITools/Icons/Close.png"))); // NOI18N
        Close.setOpaque(true);

        Title.setBackground(new java.awt.Color(14, 67, 117));
        Title.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("Case");

        javax.swing.GroupLayout CaseFormHeaderLayout = new javax.swing.GroupLayout(CaseFormHeader);
        CaseFormHeader.setLayout(CaseFormHeaderLayout);
        CaseFormHeaderLayout.setHorizontalGroup(
            CaseFormHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CaseFormHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        CaseFormHeaderLayout.setVerticalGroup(
            CaseFormHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CaseFormHeaderLayout.createSequentialGroup()
                .addGroup(CaseFormHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CaseFormHeaderLayout.createSequentialGroup()
                        .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CaseFormHeaderLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)))
                .addContainerGap())
        );

        CaseLayout.setBackground(new java.awt.Color(255, 255, 255));
        CaseLayout.setLayout(new java.awt.CardLayout());

        ClientPick.setBackground(new java.awt.Color(255, 255, 255));

        GotoCaseFrom.setBackground(new java.awt.Color(14, 67, 117));
        GotoCaseFrom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        GotoCaseFrom.setForeground(new java.awt.Color(255, 255, 255));
        GotoCaseFrom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GotoCaseFrom.setText("Next");
        GotoCaseFrom.setOpaque(true);

        ClientScroll.setBackground(new java.awt.Color(255, 255, 255));
        ClientScroll.setBorder(null);

        ClientTable.setModel(new ClientTableModel(so.getAllClient()));
        ClientScroll.setViewportView(ClientTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(14, 67, 117));
        jLabel1.setText("Pick the Client whom this case belong to:");

        javax.swing.GroupLayout ClientPickLayout = new javax.swing.GroupLayout(ClientPick);
        ClientPick.setLayout(ClientPickLayout);
        ClientPickLayout.setHorizontalGroup(
            ClientPickLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClientPickLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(GotoCaseFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(ClientScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
            .addGroup(ClientPickLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ClientPickLayout.setVerticalGroup(
            ClientPickLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ClientPickLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(ClientScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GotoCaseFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        CaseLayout.add(ClientPick, "card2");

        CaseForm.setBackground(new java.awt.Color(255, 255, 255));

        CaseSubmit.setBackground(new java.awt.Color(14, 67, 117));
        CaseSubmit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CaseSubmit.setForeground(new java.awt.Color(255, 255, 255));
        CaseSubmit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CaseSubmit.setText("Submit");
        CaseSubmit.setOpaque(true);

        IdCase.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        IdCase.setForeground(new java.awt.Color(14, 67, 117));
        IdCase.setBorder(null);

        CaseName.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        CaseName.setForeground(new java.awt.Color(14, 67, 117));
        CaseName.setBorder(null);

        HearingAddress.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        HearingAddress.setForeground(new java.awt.Color(14, 67, 117));
        HearingAddress.setBorder(null);

        Day.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Day.setForeground(new java.awt.Color(14, 67, 117));
        Day.setBorder(null);

        Month.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Month.setForeground(new java.awt.Color(14, 67, 117));
        Month.setBorder(null);

        Year.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Year.setForeground(new java.awt.Color(14, 67, 117));
        Year.setBorder(null);

        HearingDateLabel.setBackground(new java.awt.Color(255, 255, 255));
        HearingDateLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        HearingDateLabel.setForeground(new java.awt.Color(14, 67, 117));
        HearingDateLabel.setText("Hearing Date:");

        HearingDateLabel1.setBackground(new java.awt.Color(255, 255, 255));
        HearingDateLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        HearingDateLabel1.setForeground(new java.awt.Color(14, 67, 117));
        HearingDateLabel1.setText("Legal Documents:");

        ChooseFile.setBackground(new java.awt.Color(14, 67, 117));
        ChooseFile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ChooseFile.setForeground(new java.awt.Color(255, 255, 255));
        ChooseFile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ChooseFile.setText("Choose File");
        ChooseFile.setOpaque(true);

        javax.swing.GroupLayout CaseFormLayout = new javax.swing.GroupLayout(CaseForm);
        CaseForm.setLayout(CaseFormLayout);
        CaseFormLayout.setHorizontalGroup(
            CaseFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CaseFormLayout.createSequentialGroup()
                .addGroup(CaseFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CaseFormLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CaseSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CaseFormLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(CaseFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(HearingDateLabel1)
                            .addComponent(HearingDateLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CaseFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CaseFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(HearingAddress)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CaseFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(CaseName)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CaseFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(IdCase)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CaseFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ChooseFile, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CaseFormLayout.createSequentialGroup()
                                    .addGroup(CaseFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Day, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(CaseFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Month, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(13, 13, 13)
                                    .addGroup(CaseFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Year, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 343, Short.MAX_VALUE)))
                .addContainerGap())
        );
        CaseFormLayout.setVerticalGroup(
            CaseFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CaseFormLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(IdCase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CaseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HearingAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CaseFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CaseFormLayout.createSequentialGroup()
                        .addComponent(Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CaseFormLayout.createSequentialGroup()
                        .addComponent(Month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CaseFormLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(HearingDateLabel))
                    .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CaseFormLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(CaseFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HearingDateLabel1)
                    .addComponent(ChooseFile, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(CaseSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        CaseLayout.add(CaseForm, "card3");

        BillForm.setBackground(new java.awt.Color(255, 255, 255));

        BillSubmit.setBackground(new java.awt.Color(14, 67, 117));
        BillSubmit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BillSubmit.setForeground(new java.awt.Color(255, 255, 255));
        BillSubmit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BillSubmit.setText("Submit");
        BillSubmit.setOpaque(true);

        RetainerFee.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        RetainerFee.setForeground(new java.awt.Color(14, 67, 117));
        RetainerFee.setBorder(null);

        DepositFeee.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        DepositFeee.setForeground(new java.awt.Color(14, 67, 117));
        DepositFeee.setBorder(null);

        Year1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Year1.setForeground(new java.awt.Color(14, 67, 117));
        Year1.setBorder(null);

        Month1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Month1.setForeground(new java.awt.Color(14, 67, 117));
        Month1.setBorder(null);

        Day1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Day1.setForeground(new java.awt.Color(14, 67, 117));
        Day1.setBorder(null);

        HearingDateLabel2.setBackground(new java.awt.Color(255, 255, 255));
        HearingDateLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        HearingDateLabel2.setForeground(new java.awt.Color(14, 67, 117));
        HearingDateLabel2.setText("Case Bill");

        HearingDateLabel3.setBackground(new java.awt.Color(255, 255, 255));
        HearingDateLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        HearingDateLabel3.setForeground(new java.awt.Color(14, 67, 117));
        HearingDateLabel3.setText("DeadLine Date :");

        javax.swing.GroupLayout BillFormLayout = new javax.swing.GroupLayout(BillForm);
        BillForm.setLayout(BillFormLayout);
        BillFormLayout.setHorizontalGroup(
            BillFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BillFormLayout.createSequentialGroup()
                .addGroup(BillFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BillFormLayout.createSequentialGroup()
                        .addContainerGap(552, Short.MAX_VALUE)
                        .addComponent(BillSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BillFormLayout.createSequentialGroup()
                        .addGroup(BillFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BillFormLayout.createSequentialGroup()
                                .addGap(199, 199, 199)
                                .addGroup(BillFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(BillFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(DepositFeee)
                                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(BillFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(RetainerFee)
                                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(BillFormLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(HearingDateLabel2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BillFormLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(HearingDateLabel3)
                                .addGap(18, 18, 18)
                                .addGroup(BillFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparator11, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Day1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(BillFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparator10, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Month1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)
                                .addGroup(BillFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparator9, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Year1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        BillFormLayout.setVerticalGroup(
            BillFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BillFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HearingDateLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(RetainerFee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DepositFeee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BillFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BillFormLayout.createSequentialGroup()
                        .addComponent(Day1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BillFormLayout.createSequentialGroup()
                        .addComponent(Month1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Year1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BillFormLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BillFormLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(HearingDateLabel3)))
                .addGap(83, 83, 83)
                .addComponent(BillSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        CaseLayout.add(BillForm, "card4");

        javax.swing.GroupLayout CaseFormPannelLayout = new javax.swing.GroupLayout(CaseFormPannel);
        CaseFormPannel.setLayout(CaseFormPannelLayout);
        CaseFormPannelLayout.setHorizontalGroup(
            CaseFormPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CaseFormHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CaseLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        CaseFormPannelLayout.setVerticalGroup(
            CaseFormPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CaseFormPannelLayout.createSequentialGroup()
                .addComponent(CaseFormHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CaseLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CaseFormPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CaseFormPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BillForm;
    private javax.swing.JLabel BillSubmit;
    private javax.swing.JPanel CaseForm;
    private javax.swing.JPanel CaseFormHeader;
    private javax.swing.JPanel CaseFormPannel;
    private javax.swing.JPanel CaseLayout;
    private javax.swing.JTextField CaseName;
    private javax.swing.JLabel CaseSubmit;
    private javax.swing.JLabel ChooseFile;
    private javax.swing.JPanel ClientPick;
    private javax.swing.JScrollPane ClientScroll;
    private javax.swing.JTable ClientTable;
    private javax.swing.JLabel Close;
    private javax.swing.JTextField Day;
    private javax.swing.JTextField Day1;
    private javax.swing.JTextField DepositFeee;
    private javax.swing.JLabel GotoCaseFrom;
    private javax.swing.JTextField HearingAddress;
    private javax.swing.JLabel HearingDateLabel;
    private javax.swing.JLabel HearingDateLabel1;
    private javax.swing.JLabel HearingDateLabel2;
    private javax.swing.JLabel HearingDateLabel3;
    private javax.swing.JTextField IdCase;
    private javax.swing.JTextField Month;
    private javax.swing.JTextField Month1;
    private javax.swing.JTextField RetainerFee;
    private javax.swing.JLabel Title;
    private javax.swing.JTextField Year;
    private javax.swing.JTextField Year1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    // End of variables declaration//GEN-END:variables

    private void myInit() {
       new TweakedFrame(this);
       new TweakedHeader(CaseFormHeader, this);
       new TweakedButton(Close, true) {
           @Override
           public void action() {
               tb.enable();
               setVisible(false);
           }
       };
        CaseForm.setVisible(false);
        BillForm.setVisible(false);
        ClientPick.setVisible(true);
        ClientScroll.setBorder(null);
        new TweakedTable(ClientTable);
        if(update){
            ClientPick.setVisible(false);
            CaseForm.setVisible(true);
            CaseTableModel ctm=(CaseTableModel)table.getModel();
            Case=so.getCaseById(new Case((int)ctm.getValueAt(table.getSelectedRow(),CaseTableModel.IDCASE)));
            CaseSubmit.setText("Submit");
            new TweakedTextBox(IdCase, Case.getIdCase()+"");
            new TweakedTextBox(CaseName, Case.getCaseName());
            new TweakedTextBox(HearingAddress, Case.getAddress());
            new TweakedButton(ChooseFile, false) {
            @Override
            public void action() {
                fd=new JFileChooser();
                fd.showOpenDialog(null);
            }
        };  
            new TweakedButton(CaseSubmit, false) {
                @Override
                public void action() {
                    so.updateCase(takeCase());
                    new SuccesDisplayer("Updated");
                    setVisible(false);
                    new RefrechCaseTable(table);
                }
            };
        
        }else{
            //Picking Client
            new TweakedButton(GotoCaseFrom, false) {
                @Override
                public void action() {
                    ClientPick.setVisible(false);
                    ClientTableModel ctm=(ClientTableModel)ClientTable.getModel();
                    client=so.getClientById(new Client((int)ctm.getValueAt(ClientTable.getSelectedRow(),ClientTableModel.IDCLIENT)));
                    CaseForm.setVisible(true);
                }
            };
            //preparing for Case action
            prepareCase();
            //insert Case
            new TweakedButton(CaseSubmit, false) {
                @Override
                public void action() {
                    insertCase(takeCase());
                    CaseForm.setVisible(false);
                    BillForm.setVisible(true);
                   
                }
            };
            //prepare fore Bill
            prepareBill();
            new TweakedButton(BillSubmit, false) {
                @Override
                public void action() {
                    insertBill(takeBill());
                    new SuccesDisplayer("Case Added with Bill");
                    new RefrechCaseTable(table);
                    new RefrechBillTable(bill);
                    setVisible(false);
                    tb.enable();
                }
            };
            
        }
    }
    JFileChooser fd;
    private void prepareCase() {
        new TweakedTextBox(IdCase, "Case Identity");
        new TweakedTextBox(CaseName, "Case, Name");
        new TweakedTextBox(HearingAddress, "Hearing Address");
        new TweakedTextBox(Day, "DD");
        new TweakedTextBox(Month, "MM");
        new TweakedTextBox(Year, "YYYY");
        new TweakedButton(ChooseFile, false) {
            @Override
            public void action() {
                fd=new JFileChooser();
                fd.showOpenDialog(null);
            }
        };
    }
    
    private void prepareBill(){
        new TweakedTextBox(RetainerFee, "Retainer Fee");
        new TweakedTextBox(DepositFeee, "Deposit Fee");
        new TweakedTextBox(Month1, "MM");
        new TweakedTextBox(Year1, "YYYY");
        new TweakedTextBox(Day1, "DD");
    }

    private void insertCase(Case Case) {
        so.inputeCase(Case);
    }
    
    private void insertBill(Bill bill){
        BuisnesObjects bo=new BuisnesObjects();
        bo.inputBill(bill);
    }
    
    private Case takeCase(){
        Case Case=new Case();
        Case.setIdCase(Integer.parseInt(IdCase.getText()));
        Case.setCaseName(CaseName.getText());
        Case.setAddress(HearingAddress.getText());
        Case.setCaseHearing(new java.sql.Date(Integer.parseInt(Year.getText()), Integer.parseInt(Month.getText()), Integer.parseInt(Day.getText())));
        Case.setClient(client);
        Case.setDone(false);
        Case.setLegalDocument(fd.getSelectedFile());
       return Case;
    }
    
    private Bill takeBill(){
        return new Bill(WIDTH, Double.parseDouble(RetainerFee.getText()), new java.sql.Date(Integer.parseInt(Year1.getText()), Integer.parseInt(Month1.getText()), Integer.parseInt(Day1.getText())), Double.parseDouble(DepositFeee.getText()), false, takeCase());
    }
}
