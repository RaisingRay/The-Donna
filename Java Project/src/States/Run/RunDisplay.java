/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package States.Run;

import BuisnessLogiqueLayer.BuisnesObjects;
import BuisnessLogiqueLayer.SecuredObjects;
import Entity.Appointment;
import Entity.Bill;
import Entity.Case;
import Entity.Client;
import GUITools.ErrorDisplayer;
import GUITools.Tweakers.TweakedButton;
import GUITools.Tweakers.TweakedFrame;
import GUITools.Tweakers.TweakedHeader;
import GUITools.Tweakers.TweakedLink;
import GUITools.Tweakers.TweakedMenu;
import GUITools.Tweakers.TweakedTable;
import States.Run.Forms.AppointmentForm;
import States.Run.Forms.CaseForm;
import States.Run.Forms.ClientForm;
import States.Run.Refrechers.RefrechAppointmentTable;
import States.Run.Refrechers.RefrechBillTable;
import States.Run.Refrechers.RefrechCaseTable;
import States.Run.Refrechers.RefrechClientTable;
import java.util.Arrays;
import States.Run.Tables.*;
import java.awt.Color;
import java.awt.Desktop;
import javax.swing.JTable;
import javax.swing.border.Border;

/**
 *
 * @author Raiisa
 */
public class RunDisplay extends javax.swing.JFrame {
    //My Attribiute
    private BuisnesObjects bo;
    private SecuredObjects so;
    
    
    
    
    
    
    public RunDisplay() {
        bo=new BuisnesObjects();
        so=new SecuredObjects();
        initComponents();
        myInit();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ApplicationPannel = new javax.swing.JPanel();
        HeaderPannel = new javax.swing.JPanel();
        Close = new javax.swing.JLabel();
        V = new javax.swing.JLabel();
        MenuPannel = new javax.swing.JPanel();
        CaseManagementLink = new javax.swing.JLabel();
        AppointmentManagementLink = new javax.swing.JLabel();
        ClientManagementLink = new javax.swing.JLabel();
        SubpeonaManagementLink = new javax.swing.JLabel();
        MenuLayout = new javax.swing.JPanel();
        ClientManagementPage = new javax.swing.JPanel();
        ClientMenu = new javax.swing.JPanel();
        Name = new javax.swing.JLabel();
        AddClientButton = new javax.swing.JLabel();
        DeleteClientButton = new javax.swing.JLabel();
        EditClientButton = new javax.swing.JLabel();
        ClientScroll = new javax.swing.JScrollPane();
        ClientTable = new javax.swing.JTable();
        CaseManagementPage = new javax.swing.JPanel();
        CaseMenu = new javax.swing.JPanel();
        Name1 = new javax.swing.JLabel();
        AddCaseButton = new javax.swing.JLabel();
        DeleteCaseButton = new javax.swing.JLabel();
        EditCaseButton = new javax.swing.JLabel();
        ReadFile = new javax.swing.JLabel();
        CaseScroll = new javax.swing.JScrollPane();
        CaseTable = new javax.swing.JTable();
        SubpeonaManagementPage = new javax.swing.JPanel();
        SubpeonaMenu = new javax.swing.JPanel();
        Name2 = new javax.swing.JLabel();
        payedSubpeonaButton = new javax.swing.JLabel();
        DeleteSubpeonaButton = new javax.swing.JLabel();
        BillScroll = new javax.swing.JScrollPane();
        BillTable = new javax.swing.JTable();
        AppointmentManagementPage = new javax.swing.JPanel();
        AppointmentMenu = new javax.swing.JPanel();
        Name3 = new javax.swing.JLabel();
        AddAppointmentButton = new javax.swing.JLabel();
        OccuredAppointmentButton = new javax.swing.JLabel();
        DeleteAppointmentButton = new javax.swing.JLabel();
        CancelAppointmentButton = new javax.swing.JLabel();
        AppointmentScroll = new javax.swing.JScrollPane();
        AppointmentTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        ApplicationPannel.setBackground(new java.awt.Color(255, 255, 255));

        HeaderPannel.setBackground(new java.awt.Color(239, 130, 63));

        Close.setBackground(new java.awt.Color(239, 130, 63));
        Close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUITools/Icons/Close.png"))); // NOI18N
        Close.setOpaque(true);

        V.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        V.setForeground(new java.awt.Color(255, 255, 255));
        V.setText("The Donna ");

        javax.swing.GroupLayout HeaderPannelLayout = new javax.swing.GroupLayout(HeaderPannel);
        HeaderPannel.setLayout(HeaderPannelLayout);
        HeaderPannelLayout.setHorizontalGroup(
            HeaderPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderPannelLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(V, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        HeaderPannelLayout.setVerticalGroup(
            HeaderPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPannelLayout.createSequentialGroup()
                .addComponent(Close, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(HeaderPannelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(V, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MenuPannel.setBackground(new java.awt.Color(239, 130, 63));

        CaseManagementLink.setBackground(new java.awt.Color(241, 147, 89));
        CaseManagementLink.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        CaseManagementLink.setForeground(new java.awt.Color(255, 255, 255));
        CaseManagementLink.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CaseManagementLink.setText("Case Management");
        CaseManagementLink.setOpaque(true);

        AppointmentManagementLink.setBackground(new java.awt.Color(241, 147, 89));
        AppointmentManagementLink.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AppointmentManagementLink.setForeground(new java.awt.Color(255, 255, 255));
        AppointmentManagementLink.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AppointmentManagementLink.setText("Appointment Management");
        AppointmentManagementLink.setOpaque(true);

        ClientManagementLink.setBackground(new java.awt.Color(241, 147, 89));
        ClientManagementLink.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ClientManagementLink.setForeground(new java.awt.Color(255, 255, 255));
        ClientManagementLink.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ClientManagementLink.setText("Client Management");
        ClientManagementLink.setOpaque(true);

        SubpeonaManagementLink.setBackground(new java.awt.Color(241, 147, 89));
        SubpeonaManagementLink.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SubpeonaManagementLink.setForeground(new java.awt.Color(255, 255, 255));
        SubpeonaManagementLink.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SubpeonaManagementLink.setText("Bill Management");
        SubpeonaManagementLink.setOpaque(true);

        javax.swing.GroupLayout MenuPannelLayout = new javax.swing.GroupLayout(MenuPannel);
        MenuPannel.setLayout(MenuPannelLayout);
        MenuPannelLayout.setHorizontalGroup(
            MenuPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPannelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ClientManagementLink, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CaseManagementLink, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SubpeonaManagementLink, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AppointmentManagementLink, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)))
        );
        MenuPannelLayout.setVerticalGroup(
            MenuPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPannelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(ClientManagementLink, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CaseManagementLink, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SubpeonaManagementLink, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AppointmentManagementLink, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MenuLayout.setBackground(new java.awt.Color(255, 255, 255));
        MenuLayout.setLayout(new java.awt.CardLayout());

        ClientManagementPage.setBackground(new java.awt.Color(255, 255, 255));

        ClientMenu.setBackground(new java.awt.Color(245, 200, 81));

        Name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Name.setForeground(new java.awt.Color(255, 255, 255));
        Name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Name.setText("Client");

        AddClientButton.setBackground(new java.awt.Color(239, 130, 63));
        AddClientButton.setForeground(new java.awt.Color(255, 255, 255));
        AddClientButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddClientButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUITools/Icons/add.png"))); // NOI18N
        AddClientButton.setOpaque(true);

        DeleteClientButton.setBackground(new java.awt.Color(239, 130, 63));
        DeleteClientButton.setForeground(new java.awt.Color(255, 255, 255));
        DeleteClientButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DeleteClientButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUITools/Icons/delete.png"))); // NOI18N
        DeleteClientButton.setOpaque(true);

        EditClientButton.setBackground(new java.awt.Color(239, 130, 63));
        EditClientButton.setForeground(new java.awt.Color(255, 255, 255));
        EditClientButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EditClientButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUITools/Icons/edit.png"))); // NOI18N
        EditClientButton.setOpaque(true);

        javax.swing.GroupLayout ClientMenuLayout = new javax.swing.GroupLayout(ClientMenu);
        ClientMenu.setLayout(ClientMenuLayout);
        ClientMenuLayout.setHorizontalGroup(
            ClientMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ClientMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ClientMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddClientButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DeleteClientButton, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(EditClientButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                .addContainerGap())
        );
        ClientMenuLayout.setVerticalGroup(
            ClientMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClientMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Name)
                .addGap(18, 18, 18)
                .addComponent(AddClientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EditClientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DeleteClientButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ClientScroll.setBackground(new java.awt.Color(255, 255, 255));
        ClientScroll.setBorder(null);
        ClientScroll.setForeground(new java.awt.Color(255, 255, 255));

        ClientTable.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        ClientTable.setForeground(new java.awt.Color(14, 67, 117));
        ClientTable.setModel(new ClientTableModel(so.getAllClient()));
        ClientTable.setGridColor(new java.awt.Color(255, 255, 255));
        ClientTable.setSelectionBackground(new java.awt.Color(245, 200, 81));
        ClientScroll.setViewportView(ClientTable);

        javax.swing.GroupLayout ClientManagementPageLayout = new javax.swing.GroupLayout(ClientManagementPage);
        ClientManagementPage.setLayout(ClientManagementPageLayout);
        ClientManagementPageLayout.setHorizontalGroup(
            ClientManagementPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ClientManagementPageLayout.createSequentialGroup()
                .addComponent(ClientScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ClientMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ClientManagementPageLayout.setVerticalGroup(
            ClientManagementPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ClientMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ClientScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
        );

        MenuLayout.add(ClientManagementPage, "card2");

        CaseManagementPage.setBackground(new java.awt.Color(255, 255, 255));

        CaseMenu.setBackground(new java.awt.Color(245, 200, 81));

        Name1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Name1.setForeground(new java.awt.Color(255, 255, 255));
        Name1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Name1.setText("Case");

        AddCaseButton.setBackground(new java.awt.Color(239, 130, 63));
        AddCaseButton.setForeground(new java.awt.Color(255, 255, 255));
        AddCaseButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddCaseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUITools/Icons/add.png"))); // NOI18N
        AddCaseButton.setOpaque(true);

        DeleteCaseButton.setBackground(new java.awt.Color(239, 130, 63));
        DeleteCaseButton.setForeground(new java.awt.Color(255, 255, 255));
        DeleteCaseButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DeleteCaseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUITools/Icons/delete.png"))); // NOI18N
        DeleteCaseButton.setOpaque(true);

        EditCaseButton.setBackground(new java.awt.Color(239, 130, 63));
        EditCaseButton.setForeground(new java.awt.Color(255, 255, 255));
        EditCaseButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EditCaseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUITools/Icons/edit.png"))); // NOI18N
        EditCaseButton.setOpaque(true);

        ReadFile.setBackground(new java.awt.Color(239, 130, 63));
        ReadFile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ReadFile.setForeground(new java.awt.Color(255, 255, 255));
        ReadFile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ReadFile.setText("Read File");
        ReadFile.setOpaque(true);

        javax.swing.GroupLayout CaseMenuLayout = new javax.swing.GroupLayout(CaseMenu);
        CaseMenu.setLayout(CaseMenuLayout);
        CaseMenuLayout.setHorizontalGroup(
            CaseMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Name1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(CaseMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CaseMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddCaseButton, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(DeleteCaseButton, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(EditCaseButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(ReadFile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        CaseMenuLayout.setVerticalGroup(
            CaseMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CaseMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Name1)
                .addGap(18, 18, 18)
                .addComponent(AddCaseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EditCaseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DeleteCaseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ReadFile, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CaseTable.setModel(new CaseTableModel(so.getAllCase()));
        CaseScroll.setViewportView(CaseTable);

        javax.swing.GroupLayout CaseManagementPageLayout = new javax.swing.GroupLayout(CaseManagementPage);
        CaseManagementPage.setLayout(CaseManagementPageLayout);
        CaseManagementPageLayout.setHorizontalGroup(
            CaseManagementPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CaseManagementPageLayout.createSequentialGroup()
                .addComponent(CaseScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CaseMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        CaseManagementPageLayout.setVerticalGroup(
            CaseManagementPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CaseMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CaseScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
        );

        MenuLayout.add(CaseManagementPage, "card3");

        SubpeonaManagementPage.setBackground(new java.awt.Color(255, 255, 255));

        SubpeonaMenu.setBackground(new java.awt.Color(245, 200, 81));

        Name2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Name2.setForeground(new java.awt.Color(255, 255, 255));
        Name2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Name2.setText("Bill");

        payedSubpeonaButton.setBackground(new java.awt.Color(239, 130, 63));
        payedSubpeonaButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        payedSubpeonaButton.setForeground(new java.awt.Color(255, 255, 255));
        payedSubpeonaButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        payedSubpeonaButton.setText("Payed");
        payedSubpeonaButton.setOpaque(true);

        DeleteSubpeonaButton.setBackground(new java.awt.Color(239, 130, 63));
        DeleteSubpeonaButton.setForeground(new java.awt.Color(255, 255, 255));
        DeleteSubpeonaButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DeleteSubpeonaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUITools/Icons/delete.png"))); // NOI18N
        DeleteSubpeonaButton.setOpaque(true);

        javax.swing.GroupLayout SubpeonaMenuLayout = new javax.swing.GroupLayout(SubpeonaMenu);
        SubpeonaMenu.setLayout(SubpeonaMenuLayout);
        SubpeonaMenuLayout.setHorizontalGroup(
            SubpeonaMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Name2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(SubpeonaMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SubpeonaMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(payedSubpeonaButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(DeleteSubpeonaButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                .addContainerGap())
        );
        SubpeonaMenuLayout.setVerticalGroup(
            SubpeonaMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SubpeonaMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Name2)
                .addGap(18, 18, 18)
                .addComponent(payedSubpeonaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DeleteSubpeonaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BillScroll.setBackground(new java.awt.Color(255, 255, 255));
        BillScroll.setBorder(null);

        BillTable.setModel(new BillTableModel(bo.getAllBill()));
        BillScroll.setViewportView(BillTable);

        javax.swing.GroupLayout SubpeonaManagementPageLayout = new javax.swing.GroupLayout(SubpeonaManagementPage);
        SubpeonaManagementPage.setLayout(SubpeonaManagementPageLayout);
        SubpeonaManagementPageLayout.setHorizontalGroup(
            SubpeonaManagementPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SubpeonaManagementPageLayout.createSequentialGroup()
                .addComponent(BillScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SubpeonaMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        SubpeonaManagementPageLayout.setVerticalGroup(
            SubpeonaManagementPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SubpeonaMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BillScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
        );

        MenuLayout.add(SubpeonaManagementPage, "card4");

        AppointmentManagementPage.setBackground(new java.awt.Color(255, 255, 255));

        AppointmentMenu.setBackground(new java.awt.Color(245, 200, 81));

        Name3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Name3.setForeground(new java.awt.Color(255, 255, 255));
        Name3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Name3.setText("Appointment");

        AddAppointmentButton.setBackground(new java.awt.Color(239, 130, 63));
        AddAppointmentButton.setForeground(new java.awt.Color(255, 255, 255));
        AddAppointmentButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddAppointmentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUITools/Icons/add.png"))); // NOI18N
        AddAppointmentButton.setOpaque(true);

        OccuredAppointmentButton.setBackground(new java.awt.Color(239, 130, 63));
        OccuredAppointmentButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        OccuredAppointmentButton.setForeground(new java.awt.Color(255, 255, 255));
        OccuredAppointmentButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OccuredAppointmentButton.setText("Canceld");
        OccuredAppointmentButton.setOpaque(true);

        DeleteAppointmentButton.setBackground(new java.awt.Color(239, 130, 63));
        DeleteAppointmentButton.setForeground(new java.awt.Color(255, 255, 255));
        DeleteAppointmentButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DeleteAppointmentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUITools/Icons/delete.png"))); // NOI18N
        DeleteAppointmentButton.setOpaque(true);

        CancelAppointmentButton.setBackground(new java.awt.Color(239, 130, 63));
        CancelAppointmentButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CancelAppointmentButton.setForeground(new java.awt.Color(255, 255, 255));
        CancelAppointmentButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CancelAppointmentButton.setText("Occured");
        CancelAppointmentButton.setOpaque(true);

        javax.swing.GroupLayout AppointmentMenuLayout = new javax.swing.GroupLayout(AppointmentMenu);
        AppointmentMenu.setLayout(AppointmentMenuLayout);
        AppointmentMenuLayout.setHorizontalGroup(
            AppointmentMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Name3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(AppointmentMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AppointmentMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddAppointmentButton, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(OccuredAppointmentButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(DeleteAppointmentButton, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(CancelAppointmentButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                .addContainerGap())
        );
        AppointmentMenuLayout.setVerticalGroup(
            AppointmentMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AppointmentMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Name3)
                .addGap(18, 18, 18)
                .addComponent(AddAppointmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CancelAppointmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(OccuredAppointmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DeleteAppointmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        AppointmentScroll.setBackground(new java.awt.Color(255, 255, 255));
        AppointmentScroll.setBorder(null);

        AppointmentTable.setModel(new AppointmentTableModel(bo.getAllAppointment()));
        AppointmentScroll.setViewportView(AppointmentTable);

        javax.swing.GroupLayout AppointmentManagementPageLayout = new javax.swing.GroupLayout(AppointmentManagementPage);
        AppointmentManagementPage.setLayout(AppointmentManagementPageLayout);
        AppointmentManagementPageLayout.setHorizontalGroup(
            AppointmentManagementPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AppointmentManagementPageLayout.createSequentialGroup()
                .addComponent(AppointmentScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AppointmentMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        AppointmentManagementPageLayout.setVerticalGroup(
            AppointmentManagementPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AppointmentMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(AppointmentScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
        );

        MenuLayout.add(AppointmentManagementPage, "card5");

        javax.swing.GroupLayout ApplicationPannelLayout = new javax.swing.GroupLayout(ApplicationPannel);
        ApplicationPannel.setLayout(ApplicationPannelLayout);
        ApplicationPannelLayout.setHorizontalGroup(
            ApplicationPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HeaderPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ApplicationPannelLayout.createSequentialGroup()
                .addComponent(MenuPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MenuLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ApplicationPannelLayout.setVerticalGroup(
            ApplicationPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ApplicationPannelLayout.createSequentialGroup()
                .addComponent(HeaderPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ApplicationPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MenuPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MenuLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ApplicationPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ApplicationPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void myInit() {
        new TweakedFrame(this);
        new TweakedHeader(HeaderPannel, this);
        new TweakedButton(Close, true) {
            @Override
            public void action() {
                System.exit(0);
            }
        };
        new TweakedMenu(
                Arrays.asList(
                    new TweakedLink(ClientManagementLink, ClientManagementPage),
                    new TweakedLink(CaseManagementLink, CaseManagementPage),
                    new TweakedLink(AppointmentManagementLink, AppointmentManagementPage),
                    new TweakedLink(SubpeonaManagementLink, SubpeonaManagementPage)
                )
        );
        initClientCRUDOperations();
        initCaseCRUDOperations();
        initSubpeonaCRUDOperations();
        initAppointmentCRUDOperations();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddAppointmentButton;
    private javax.swing.JLabel AddCaseButton;
    private javax.swing.JLabel AddClientButton;
    private javax.swing.JPanel ApplicationPannel;
    private javax.swing.JLabel AppointmentManagementLink;
    private javax.swing.JPanel AppointmentManagementPage;
    private javax.swing.JPanel AppointmentMenu;
    private javax.swing.JScrollPane AppointmentScroll;
    private javax.swing.JTable AppointmentTable;
    private javax.swing.JScrollPane BillScroll;
    private javax.swing.JTable BillTable;
    private javax.swing.JLabel CancelAppointmentButton;
    private javax.swing.JLabel CaseManagementLink;
    private javax.swing.JPanel CaseManagementPage;
    private javax.swing.JPanel CaseMenu;
    private javax.swing.JScrollPane CaseScroll;
    private javax.swing.JTable CaseTable;
    private javax.swing.JLabel ClientManagementLink;
    private javax.swing.JPanel ClientManagementPage;
    private javax.swing.JPanel ClientMenu;
    private javax.swing.JScrollPane ClientScroll;
    private javax.swing.JTable ClientTable;
    private javax.swing.JLabel Close;
    private javax.swing.JLabel DeleteAppointmentButton;
    private javax.swing.JLabel DeleteCaseButton;
    private javax.swing.JLabel DeleteClientButton;
    private javax.swing.JLabel DeleteSubpeonaButton;
    private javax.swing.JLabel EditCaseButton;
    private javax.swing.JLabel EditClientButton;
    private javax.swing.JPanel HeaderPannel;
    private javax.swing.JPanel MenuLayout;
    private javax.swing.JPanel MenuPannel;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Name1;
    private javax.swing.JLabel Name2;
    private javax.swing.JLabel Name3;
    private javax.swing.JLabel OccuredAppointmentButton;
    private javax.swing.JLabel ReadFile;
    private javax.swing.JLabel SubpeonaManagementLink;
    private javax.swing.JPanel SubpeonaManagementPage;
    private javax.swing.JPanel SubpeonaMenu;
    private javax.swing.JLabel V;
    private javax.swing.JLabel payedSubpeonaButton;
    // End of variables declaration//GEN-END:variables

    private void initClientCRUDOperations() {
        
        //init Table and Scroll
        new TweakedTable(ClientTable);
        ClientScroll.setBorder(null);
        
        
        /*Insert*/
        TweakedButton addClient= new TweakedButton(AddClientButton, false) {
            @Override
            public void action() {
                disable();
               new ClientForm(this, false,ClientTable);
            }
        };
        
        
        /*update*/
        TweakedButton updateClient=new TweakedButton(EditClientButton, false) {
            @Override
            public void action() {
                disable();
                new ClientForm(this, true,ClientTable);
            }
        };
        
        /*Delete*/
        
        TweakedButton delete=new TweakedButton(DeleteClientButton, true) {
            @Override
            public void action() {
                int[] srw=ClientTable.getSelectedRows();
                    for(int i=0;i<srw.length;i++){
                      ClientTableModel ctm=(ClientTableModel)ClientTable.getModel();
                      so.deleteClient(new Client((int)ctm.getValueAt(srw[i], ClientTableModel.IDCLIENT)));
                    }
                   new  RefrechClientTable(ClientTable);
                   new RefrechCaseTable(CaseTable);
            }
        };
    }

    private void initCaseCRUDOperations() {
        //init Table and Scroll
        new TweakedTable(CaseTable);
        CaseScroll.setBorder(null);
        
        //Insert
        TweakedButton addCase=new TweakedButton(AddCaseButton, false) {
            @Override
            public void action() {
                disable();
                new CaseForm(this, false, CaseTable,BillTable);
                new RefrechBillTable(BillTable);
            }
        };
        
        //update
        TweakedButton updateCase=new TweakedButton(EditCaseButton, false) {
            @Override
            public void action() {
                 new CaseForm(this,true, CaseTable,BillTable);
            }
        };
        
        
        //delete
        TweakedButton deleteCase=new TweakedButton(DeleteCaseButton, true) {
            @Override
            public void action() {int[] srw=CaseTable.getSelectedRows();
                    for(int i=0;i<srw.length;i++){
                      CaseTableModel ctm=(CaseTableModel)CaseTable.getModel();
                      so.deleteCase(new Case((int)ctm.getValueAt(srw[i], CaseTableModel.IDCASE)));
                    }
                   new RefrechCaseTable(CaseTable);
                   new RefrechBillTable(BillTable);
            }
        };
        
        //readFile
        TweakedButton readFile=new TweakedButton(ReadFile, false) {
            @Override
            public void action() {
             CaseTableModel ctm=(CaseTableModel)CaseTable.getModel();
             int selectedRow=CaseTable.getSelectedRow();
             Case Case=so.getCaseById(new Case((int)ctm.getValueAt(selectedRow, CaseTableModel.IDCASE)));
             try{
                Desktop.getDesktop().open(Case.getLegalDocument());
             }catch(Exception e){
                 new ErrorDisplayer("File doesn't Exist");
             }
            }
        };
    }

    private void initSubpeonaCRUDOperations() {
        
        //preparation
        BillScroll.setBorder(null);
        new TweakedTable(BillTable);
        //payed
        
        new TweakedButton(payedSubpeonaButton, false) {
            @Override
            public void action() {
                BillTableModel btm=(BillTableModel)BillTable.getModel();
                int str=BillTable.getSelectedRow();
                Bill bill=bo.getBillById(new Bill((int)btm.getValueAt(str,BillTableModel.IDBILL)));
                bill.setPayed(true);
                bo.updateBill(bill);
                new RefrechBillTable(BillTable);
            }
        };
        
        
        /*
        //delete
        new TweakedButton(DeleteSubpeonaButton, false) {
            @Override
            public void action() {
                BillTableModel btm=(BillTableModel)BillTable.getModel();
                int str=BillTable.getSelectedRow();
                Bill bill=bo.getBillById(new Bill((int)btm.getValueAt(str,BillTableModel.IDBILL)));
                bo.deleteBill(bill);
                new RefrechBillTable(BillTable);
            }
        };*/
        DeleteSubpeonaButton.setVisible(false);
    }

    private void initAppointmentCRUDOperations() {
        AppointmentScroll.setBorder(null);
        new TweakedTable(AppointmentTable);
        
        
        
        //insert Appointment
        new TweakedButton(AddAppointmentButton, false) {
            @Override
            public void action() {
                new AppointmentForm(this, AppointmentTable);
            }
        };
       
        
        //update
        //Occured
        new TweakedButton(CancelAppointmentButton, false) {
            @Override
            public void action() {
                int str=AppointmentTable.getSelectedRow();
                AppointmentTableModel atm=(AppointmentTableModel)AppointmentTable.getModel();
                Appointment app;
                app=bo.getAppointmentById(new Appointment((int)atm.getValueAt(str, AppointmentTableModel.IDAPPOINTMENT)));
                app.setDone(true);
                app.setCancelled(false);
                app.setPostPoned(false);
                bo.updateAppointment(app);
                new RefrechAppointmentTable(AppointmentTable);
            }
        };
        
        
        //canceled
        new TweakedButton(OccuredAppointmentButton, false) {
            @Override
            public void action() {
                int str=AppointmentTable.getSelectedRow();
                AppointmentTableModel atm=(AppointmentTableModel)AppointmentTable.getModel();
                Appointment app;
                app=bo.getAppointmentById(new Appointment((int)atm.getValueAt(str, AppointmentTableModel.IDAPPOINTMENT)));
                app.setDone(false);
                app.setCancelled(true);
                app.setPostPoned(false);
                bo.updateAppointment(app);
                new RefrechAppointmentTable(AppointmentTable);
            }
        };
        
        //delet
        new TweakedButton(DeleteAppointmentButton, true) {
            @Override
            public void action() {
                int str=AppointmentTable.getSelectedRow();
                AppointmentTableModel atm=(AppointmentTableModel)AppointmentTable.getModel();
                bo.deleteAppointment(new Appointment((int)atm.getValueAt(str, AppointmentTableModel.IDAPPOINTMENT)));
                new RefrechAppointmentTable(AppointmentTable);
            }
        };
    }
    private void refrechClientTable(){
        ClientTable=new JTable(new ClientTableModel(so.getAllClient()));
    }
}
