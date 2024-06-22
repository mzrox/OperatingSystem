//Hello
package os;
import java.awt.BorderLayout;
import java.io.*;
import java.net.*;
 
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Queue;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import os.Process;

public class nexOS extends javax.swing.JFrame {
    private Process[] process = new Process[100];
    public int n=0;

    public nexOS() {
        
        initComponents();
        // Set initial visibility
        MainPanel.setVisible(true);
        createPanel.setVisible(false);
        ProcessPanel.setVisible(false);
        destroyScroll.setVisible(false);
        suspendScroll.setVisible(false);
        changePriorityPanel.setVisible(false);
        MemoryManagement.setVisible(false);
        SchedulingPanel.setVisible(false);
        IOmanagmentPanel.setVisible(false);
        OtherOperationPanel.setVisible(false);
        PageSchedulingPanel.setVisible(false);
        PaggingPanel.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        io = new javax.swing.ButtonGroup();
        jLabel21 = new javax.swing.JLabel();
        ProcessPanel = new javax.swing.JPanel();
        goBack = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        destroyButton = new javax.swing.JButton();
        processButton = new javax.swing.JButton();
        suspendButton = new javax.swing.JButton();
        resumeButton = new javax.swing.JButton();
        blockButton = new javax.swing.JButton();
        wakeButton = new javax.swing.JButton();
        dispatchButton = new javax.swing.JButton();
        changePriorityButton = new javax.swing.JButton();
        changePriorityPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        changePriorityPId = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        changePriorityPPriority = new javax.swing.JComboBox<>();
        displayPScroll = new javax.swing.JScrollPane();
        displayPPanel = new javax.swing.JPanel();
        suspendScroll = new javax.swing.JScrollPane();
        suspendPanel = new javax.swing.JPanel();
        destroyScroll = new javax.swing.JScrollPane();
        destroyPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        OtherOperationPanel = new javax.swing.JPanel();
        goBack4 = new javax.swing.JLabel();
        SocketPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        clientMessage = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        clientMessageField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        IOmanagmentPanel = new javax.swing.JPanel();
        goBack3 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        ioIn = new javax.swing.JPanel();
        mouse = new javax.swing.JLabel();
        keyboard = new javax.swing.JLabel();
        printer = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        keyboardR = new javax.swing.JRadioButton();
        mouseR = new javax.swing.JRadioButton();
        printerR = new javax.swing.JRadioButton();
        IOProcessID = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        ioOut = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        IOProcessID1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        MemoryManagement = new javax.swing.JPanel();
        ApplyLru2 = new javax.swing.JButton();
        ApplyLru1 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        PageSchedulingPanel = new javax.swing.JPanel();
        ApplyLru = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        referstring = new javax.swing.JTextField();
        Framesize = new javax.swing.JTextField();
        ApplyFifo = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        PaggingPanel = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        logicaladdress = new javax.swing.JTextField();
        pagesize = new javax.swing.JTextField();
        physicaladdress = new javax.swing.JTextField();
        Paging = new javax.swing.JButton();
        FIFOScroll = new javax.swing.JScrollPane();
        FIFO = new javax.swing.JPanel();
        goBack1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        SchedulingPanel = new javax.swing.JPanel();
        sjfNonPremButton = new javax.swing.JButton();
        rrButton = new javax.swing.JButton();
        fcfsPremButton = new javax.swing.JButton();
        fcfsButton = new javax.swing.JButton();
        sjfButton = new javax.swing.JButton();
        DisplaySchedulingPanel = new javax.swing.JPanel();
        goBack2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        MemoryManag = new javax.swing.JButton();
        ProcessManagementButton = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        createPanel = new javax.swing.JPanel();
        createPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        maxProcessField = new javax.swing.JTextField();
        maxProcessButton = new javax.swing.JButton();

        jLabel21.setText("jLabel21");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProcessPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        goBack.setText("                                                            ");
        goBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goBackMouseClicked(evt);
            }
        });
        ProcessPanel.add(goBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 40));

        jButton4.setBackground(new java.awt.Color(22, 41, 42));
        jButton4.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(170, 171, 171));
        jButton4.setText("Scheduling");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        ProcessPanel.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 482, 230, 30));

        destroyButton.setBackground(new java.awt.Color(22, 41, 42));
        destroyButton.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        destroyButton.setForeground(new java.awt.Color(170, 171, 171));
        destroyButton.setText("Destroy");
        destroyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destroyButtonActionPerformed(evt);
            }
        });
        ProcessPanel.add(destroyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 184, 230, 30));

        processButton.setBackground(new java.awt.Color(22, 41, 42));
        processButton.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        processButton.setForeground(new java.awt.Color(170, 171, 171));
        processButton.setText("Process");
        processButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processButtonActionPerformed(evt);
            }
        });
        ProcessPanel.add(processButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 142, 230, 30));

        suspendButton.setBackground(new java.awt.Color(22, 41, 42));
        suspendButton.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        suspendButton.setForeground(new java.awt.Color(170, 171, 171));
        suspendButton.setText("Suspend");
        suspendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suspendButtonActionPerformed(evt);
            }
        });
        ProcessPanel.add(suspendButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 226, 230, 30));

        resumeButton.setBackground(new java.awt.Color(22, 41, 42));
        resumeButton.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        resumeButton.setForeground(new java.awt.Color(170, 171, 171));
        resumeButton.setText("Resume");
        resumeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resumeButtonActionPerformed(evt);
            }
        });
        ProcessPanel.add(resumeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 268, 230, 30));

        blockButton.setBackground(new java.awt.Color(22, 41, 42));
        blockButton.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        blockButton.setForeground(new java.awt.Color(170, 171, 171));
        blockButton.setText("Block");
        blockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blockButtonActionPerformed(evt);
            }
        });
        ProcessPanel.add(blockButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 310, 230, 30));

        wakeButton.setBackground(new java.awt.Color(22, 41, 42));
        wakeButton.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        wakeButton.setForeground(new java.awt.Color(170, 171, 171));
        wakeButton.setText("Wake up");
        wakeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wakeButtonActionPerformed(evt);
            }
        });
        ProcessPanel.add(wakeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 353, 230, 30));

        dispatchButton.setBackground(new java.awt.Color(22, 41, 42));
        dispatchButton.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        dispatchButton.setForeground(new java.awt.Color(170, 171, 171));
        dispatchButton.setText("Dsipatch");
        dispatchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispatchButtonActionPerformed(evt);
            }
        });
        ProcessPanel.add(dispatchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 396, 230, 30));

        changePriorityButton.setBackground(new java.awt.Color(22, 41, 42));
        changePriorityButton.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        changePriorityButton.setForeground(new java.awt.Color(170, 171, 171));
        changePriorityButton.setText("Change Priority");
        changePriorityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePriorityButtonActionPerformed(evt);
            }
        });
        ProcessPanel.add(changePriorityButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 439, 230, 30));

        changePriorityPanel.setBackground(new java.awt.Color(22, 41, 42));
        changePriorityPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(170, 171, 171));
        jLabel2.setText("Priority:");
        changePriorityPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(170, 171, 171));
        jLabel3.setText("Process ID:");
        changePriorityPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));
        changePriorityPanel.add(changePriorityPId, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 200, -1));

        jButton1.setBackground(new java.awt.Color(24, 41, 42));
        jButton1.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(170, 171, 171));
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        changePriorityPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, -1, -1));

        changePriorityPPriority.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--------------------------------", "Low", "Medium", "High" }));
        changePriorityPanel.add(changePriorityPPriority, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 200, -1));

        ProcessPanel.add(changePriorityPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 132, 652, 390));

        displayPScroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        displayPPanel.setBackground(new java.awt.Color(22, 41, 42));
        displayPPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        displayPScroll.setViewportView(displayPPanel);

        ProcessPanel.add(displayPScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 132, 652, 390));

        suspendScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        suspendScroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        suspendPanel.setBackground(new java.awt.Color(22, 41, 42));
        suspendPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        suspendScroll.setViewportView(suspendPanel);

        ProcessPanel.add(suspendScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 132, 652, 390));

        destroyScroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        destroyPanel.setBackground(new java.awt.Color(22, 41, 42));
        destroyPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        destroyScroll.setViewportView(destroyPanel);

        ProcessPanel.add(destroyScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 132, 652, 390));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/process-management.png"))); // NOI18N
        ProcessPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 540));

        getContentPane().add(ProcessPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 540));

        OtherOperationPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        goBack4.setText("                                                            ");
        goBack4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goBack4MouseClicked(evt);
            }
        });
        OtherOperationPanel.add(goBack4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 40));

        SocketPanel.setBackground(new java.awt.Color(22, 41, 42));
        SocketPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(18, 72, 64));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setBackground(new java.awt.Color(24, 41, 42));
        jButton7.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(170, 171, 171));
        jButton7.setText("Start");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 120, -1));

        jButton9.setBackground(new java.awt.Color(24, 41, 42));
        jButton9.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(170, 171, 171));
        jButton9.setText("Stop");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 110, -1));

        clientMessage.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        clientMessage.setForeground(new java.awt.Color(170, 171, 171));
        clientMessage.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel3.add(clientMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 370, 190));

        jLabel16.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(170, 171, 171));
        jLabel16.setText("Clients Message:");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        jLabel7.setFont(new java.awt.Font("SimSun", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(170, 171, 171));
        jLabel7.setText("Server");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 130, 30));

        SocketPanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 410, 360));

        jPanel2.setBackground(new java.awt.Color(18, 72, 64));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton10.setBackground(new java.awt.Color(24, 41, 42));
        jButton10.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(170, 171, 171));
        jButton10.setText("Send");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 100, 30));
        jPanel2.add(clientMessageField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 310, 110));

        jLabel17.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(170, 171, 171));
        jLabel17.setText("Message:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 100, 30));

        jLabel27.setFont(new java.awt.Font("SimSun", 1, 36)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(170, 171, 171));
        jLabel27.setText("Client");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 120, 30));

        SocketPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 410, 360));

        OtherOperationPanel.add(SocketPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 890, 370));

        jLabel19.setFont(new java.awt.Font("SimSun", 1, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(170, 171, 171));
        jLabel19.setText("Socket Programming");
        OtherOperationPanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 370, 30));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/OTHER-OPERATION.png"))); // NOI18N
        OtherOperationPanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 540));

        getContentPane().add(OtherOperationPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 540));

        IOmanagmentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        goBack3.setText("                                                            ");
        goBack3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goBack3MouseClicked(evt);
            }
        });
        IOmanagmentPanel.add(goBack3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 40));

        jTabbedPane1.setBackground(new java.awt.Color(22, 41, 42));
        jTabbedPane1.setForeground(new java.awt.Color(170, 171, 171));
        jTabbedPane1.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        ioIn.setBackground(new java.awt.Color(22, 41, 42));
        ioIn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mouse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mouse.png"))); // NOI18N
        ioIn.add(mouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, -1, 129));

        keyboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/keyboard.png"))); // NOI18N
        ioIn.add(keyboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, 129));

        printer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/printer.png"))); // NOI18N
        ioIn.add(printer, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        jLabel13.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(170, 171, 171));
        jLabel13.setText("Process ID:");
        ioIn.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, -1, -1));

        jLabel8.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(170, 171, 171));
        jLabel8.setText("SELECT THE I/O INTERRUPT");
        ioIn.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        io.add(keyboardR);
        keyboardR.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        keyboardR.setForeground(new java.awt.Color(170, 171, 171));
        keyboardR.setText("KEYBOARD");
        keyboardR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyboardRActionPerformed(evt);
            }
        });
        ioIn.add(keyboardR, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, -1, -1));

        io.add(mouseR);
        mouseR.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        mouseR.setForeground(new java.awt.Color(170, 171, 171));
        mouseR.setText("MOUSE");
        mouseR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mouseRActionPerformed(evt);
            }
        });
        ioIn.add(mouseR, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, -1, -1));

        io.add(printerR);
        printerR.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        printerR.setForeground(new java.awt.Color(170, 171, 171));
        printerR.setText("PRINTER");
        printerR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printerRActionPerformed(evt);
            }
        });
        ioIn.add(printerR, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));
        ioIn.add(IOProcessID, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 260, 30));

        jButton2.setBackground(new java.awt.Color(22, 41, 42));
        jButton2.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(170, 171, 171));
        jButton2.setText("SUBMIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        ioIn.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 100, 30));

        jTabbedPane1.addTab("INTERRUPT IN", ioIn);

        ioOut.setBackground(new java.awt.Color(22, 41, 42));
        ioOut.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(170, 171, 171));
        jLabel14.setText("Process ID:");
        ioOut.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));
        ioOut.add(IOProcessID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 260, 30));

        jButton5.setBackground(new java.awt.Color(22, 41, 42));
        jButton5.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(170, 171, 171));
        jButton5.setText("SUBMIT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        ioOut.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 100, 30));

        jTabbedPane1.addTab("INTERRUPT OUT", ioOut);

        IOmanagmentPanel.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 880, 370));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IO-MANAGEMENT.png"))); // NOI18N
        IOmanagmentPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 540));

        getContentPane().add(IOmanagmentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 540));

        MemoryManagement.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ApplyLru2.setBackground(new java.awt.Color(22, 41, 42));
        ApplyLru2.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        ApplyLru2.setForeground(new java.awt.Color(170, 171, 171));
        ApplyLru2.setText("PAGING");
        ApplyLru2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApplyLru2ActionPerformed(evt);
            }
        });
        MemoryManagement.add(ApplyLru2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 152, 200, 30));

        ApplyLru1.setBackground(new java.awt.Color(22, 41, 42));
        ApplyLru1.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        ApplyLru1.setForeground(new java.awt.Color(170, 171, 171));
        ApplyLru1.setText("PAGE REPLACEMENT");
        ApplyLru1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApplyLru1ActionPerformed(evt);
            }
        });
        MemoryManagement.add(ApplyLru1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 152, 200, 30));

        jLabel25.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(170, 171, 171));
        jLabel25.setText("OUTPUT");
        MemoryManagement.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, 80, 40));

        PageSchedulingPanel.setBackground(new java.awt.Color(22, 42, 41));
        PageSchedulingPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ApplyLru.setBackground(new java.awt.Color(22, 41, 42));
        ApplyLru.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        ApplyLru.setForeground(new java.awt.Color(170, 171, 171));
        ApplyLru.setText("LRU");
        ApplyLru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApplyLruActionPerformed(evt);
            }
        });
        PageSchedulingPanel.add(ApplyLru, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(170, 171, 171));
        jLabel6.setText("Enter reference string:");
        PageSchedulingPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 240, -1));
        PageSchedulingPanel.add(referstring, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 140, 30));

        Framesize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FramesizeActionPerformed(evt);
            }
        });
        PageSchedulingPanel.add(Framesize, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 140, 30));

        ApplyFifo.setBackground(new java.awt.Color(22, 41, 42));
        ApplyFifo.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        ApplyFifo.setForeground(new java.awt.Color(170, 171, 171));
        ApplyFifo.setText("FIFO");
        ApplyFifo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApplyFifoActionPerformed(evt);
            }
        });
        PageSchedulingPanel.add(ApplyFifo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, -1));

        jLabel18.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(170, 171, 171));
        jLabel18.setText("INPUT");
        PageSchedulingPanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 70, 40));

        jLabel5.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(170, 171, 171));
        jLabel5.setText("Frame Size:");
        PageSchedulingPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 130, -1));

        MemoryManagement.add(PageSchedulingPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 440, 310));

        PaggingPanel.setBackground(new java.awt.Color(22, 42, 41));
        PaggingPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(170, 171, 171));
        jLabel26.setText("INPUT");
        PaggingPanel.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 70, 40));

        jLabel22.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(170, 171, 171));
        jLabel22.setText("Physical address:");
        PaggingPanel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel23.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(170, 171, 171));
        jLabel23.setText("Logical address:");
        PaggingPanel.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel24.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(170, 171, 171));
        jLabel24.setText("PageSize:");
        PaggingPanel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));
        PaggingPanel.add(logicaladdress, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 120, -1));
        PaggingPanel.add(pagesize, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 120, -1));

        physicaladdress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                physicaladdressActionPerformed(evt);
            }
        });
        PaggingPanel.add(physicaladdress, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 120, -1));

        Paging.setBackground(new java.awt.Color(22, 42, 41));
        Paging.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        Paging.setForeground(new java.awt.Color(170, 171, 171));
        Paging.setText("Apply");
        Paging.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagingActionPerformed(evt);
            }
        });
        PaggingPanel.add(Paging, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 80, -1));

        MemoryManagement.add(PaggingPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 440, 310));

        FIFOScroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        FIFO.setBackground(new java.awt.Color(22, 42, 41));
        FIFO.setForeground(new java.awt.Color(170, 171, 171));
        FIFO.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        FIFOScroll.setViewportView(FIFO);

        MemoryManagement.add(FIFOScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 420, 300));

        goBack1.setText("                                                            ");
        goBack1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goBack1MouseClicked(evt);
            }
        });
        MemoryManagement.add(goBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 40));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/memory-management.png"))); // NOI18N
        MemoryManagement.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 540));

        getContentPane().add(MemoryManagement, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 540));

        SchedulingPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sjfNonPremButton.setBackground(new java.awt.Color(22, 41, 42));
        sjfNonPremButton.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
        sjfNonPremButton.setForeground(new java.awt.Color(170, 171, 171));
        sjfNonPremButton.setText("SJF(Non-Premptive)");
        sjfNonPremButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sjfNonPremButtonActionPerformed(evt);
            }
        });
        SchedulingPanel.add(sjfNonPremButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 160, 150, 28));

        rrButton.setBackground(new java.awt.Color(22, 41, 42));
        rrButton.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
        rrButton.setForeground(new java.awt.Color(170, 171, 171));
        rrButton.setText("Round Robbin");
        rrButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rrButtonActionPerformed(evt);
            }
        });
        SchedulingPanel.add(rrButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 160, 150, 28));

        fcfsPremButton.setBackground(new java.awt.Color(22, 41, 42));
        fcfsPremButton.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
        fcfsPremButton.setForeground(new java.awt.Color(170, 171, 171));
        fcfsPremButton.setText("FCFS(Premptive)");
        fcfsPremButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fcfsPremButtonActionPerformed(evt);
            }
        });
        SchedulingPanel.add(fcfsPremButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 150, 28));

        fcfsButton.setBackground(new java.awt.Color(22, 41, 42));
        fcfsButton.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
        fcfsButton.setForeground(new java.awt.Color(170, 171, 171));
        fcfsButton.setText("FCFS(Non-Premptive)");
        fcfsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fcfsButtonActionPerformed(evt);
            }
        });
        SchedulingPanel.add(fcfsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 150, 28));

        sjfButton.setBackground(new java.awt.Color(22, 41, 42));
        sjfButton.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
        sjfButton.setForeground(new java.awt.Color(170, 171, 171));
        sjfButton.setText("SJF(Premptive)");
        sjfButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sjfButtonActionPerformed(evt);
            }
        });
        SchedulingPanel.add(sjfButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 160, 150, 28));

        DisplaySchedulingPanel.setBackground(new java.awt.Color(17, 32, 33));
        DisplaySchedulingPanel.setForeground(new java.awt.Color(170, 171, 171));
        DisplaySchedulingPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        SchedulingPanel.add(DisplaySchedulingPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 200, 873, 310));

        goBack2.setText("                                                            ");
        goBack2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goBack2MouseClicked(evt);
            }
        });
        SchedulingPanel.add(goBack2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nexos_Scheduling (1).png"))); // NOI18N
        SchedulingPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 540));

        getContentPane().add(SchedulingPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 540));

        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });
        MainPanel.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 440, 120));

        jButton3.setBackground(new java.awt.Color(22, 41, 42));
        jButton3.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(170, 171, 171));
        jButton3.setText("Socket Programming");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        MainPanel.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 450, 160, 40));

        MemoryManag.setBackground(new java.awt.Color(22, 41, 42));
        MemoryManag.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
        MemoryManag.setForeground(new java.awt.Color(170, 171, 171));
        MemoryManag.setText("Memory management");
        MemoryManag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MemoryManagActionPerformed(evt);
            }
        });
        MainPanel.add(MemoryManag, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 160, 40));

        ProcessManagementButton.setBackground(new java.awt.Color(22, 41, 42));
        ProcessManagementButton.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
        ProcessManagementButton.setForeground(new java.awt.Color(170, 171, 171));
        ProcessManagementButton.setText("Process management ");
        ProcessManagementButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProcessManagementButtonMouseClicked(evt);
            }
        });
        ProcessManagementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcessManagementButtonActionPerformed(evt);
            }
        });
        MainPanel.add(ProcessManagementButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 160, 40));

        jButton8.setBackground(new java.awt.Color(22, 41, 42));
        jButton8.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
        jButton8.setForeground(new java.awt.Color(170, 171, 171));
        jButton8.setText("I/O management");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        MainPanel.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, 160, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nexos.png"))); // NOI18N
        MainPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 540));

        getContentPane().add(MainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        createPanel.setBackground(new java.awt.Color(22, 41, 42));
        createPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        createPanel3.setBackground(new java.awt.Color(22, 41, 42));
        createPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(170, 171, 171));
        jLabel15.setText("Enter No of Process");
        createPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, -1, -1));

        maxProcessField.setBackground(new java.awt.Color(30, 56, 57));
        maxProcessField.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
        maxProcessField.setForeground(new java.awt.Color(148, 148, 148));
        createPanel3.add(maxProcessField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 198, -1));

        maxProcessButton.setBackground(new java.awt.Color(22, 41, 42));
        maxProcessButton.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
        maxProcessButton.setForeground(new java.awt.Color(170, 171, 171));
        maxProcessButton.setText("Save");
        maxProcessButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxProcessButtonActionPerformed(evt);
            }
        });
        createPanel3.add(maxProcessButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, -1, -1));

        createPanel.add(createPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 700, 340));

        getContentPane().add(createPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 2, 970, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MemoryManagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MemoryManagActionPerformed
        MemoryManagement.setVisible(true);
      FIFO.setVisible(false);
      FIFOScroll.setVisible(false);
        MainPanel.setVisible(false);

    }//GEN-LAST:event_MemoryManagActionPerformed

    private void ProcessManagementButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProcessManagementButtonMouseClicked

    }//GEN-LAST:event_ProcessManagementButtonMouseClicked

    private void ProcessManagementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcessManagementButtonActionPerformed
        MainPanel.setVisible(false);
        displayPScroll.setVisible(true);
        displayPPanel.setVisible(true);
        ProcessPanel.setVisible(true);
        processButtonActionPerformed(evt);
        
    }//GEN-LAST:event_ProcessManagementButtonActionPerformed

    private void goBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackMouseClicked
        MainPanel.setVisible(true);
        ProcessPanel.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_goBackMouseClicked
    private class ActionListenerImpl implements ActionListener {

        private final Process currentProcess;

        public ActionListenerImpl(Process currentProcess) {
            this.currentProcess = currentProcess;
        }

        public void actionPerformed(ActionEvent e) {
            deleteProcess(currentProcess);
        }
    }
private JLabel createHeaderLabel(String text) {
    JLabel label = new JLabel(text);
    label.setFont(new Font("SimSun", Font.BOLD, 16));
    label.setForeground(new Color(171, 170, 170));
    return label;
}

// Utility method to create and configure a JLabel for data
private JLabel createLabel(String text) {
    JLabel label = new JLabel(text);
    label.setFont(new Font("SimSun", Font.PLAIN, 16));
    label.setForeground(new Color(171, 170, 170));
    return label;
}

private void deleteProcess(Process processToDelete) {
        // Find and remove the specified process from the array
        for (int i = 0; i < n; i++) {
            if (process[i] == processToDelete) {
                // Shift elements to the left to fill the gap
                for (int j = i; j < n - 1; j++) {
                    process[j] = process[j + 1];
                }
                // Decrement the count of processes
                n--;
                break;
            }
        }

        // Optionally, perform any additional cleanup or update UI
        // For example, repaint the panel after deletion
        destroyButtonActionPerformed(null); // Update the displayed list after deletion
}    
private class SuspendActionListener implements ActionListener {

        private final Process currentProcess;

        public SuspendActionListener(Process currentProcess) {
            this.currentProcess = currentProcess;
        }

        public void actionPerformed(ActionEvent e) {
            suspendProcess(currentProcess);
            
        }
    }
    private void suspendProcess(Process processToSuspend) {
        // Update the status of the specified process to suspended
        processToSuspend.setStatus("Suspended"); // Assuming there's a setStatus method in your Process class
        //  Optionally, perform any additional cleanup or update UI
        // For example, repaint the panel after suspension
        suspendButtonActionPerformed(null); // Update the displayed list after suspension
    }
    private class ResumeActionListener implements ActionListener {

        private final Process currentProcess;

        public ResumeActionListener(Process currentProcess) {
            this.currentProcess = currentProcess;
        }

        public void actionPerformed(ActionEvent e) {
            resumeProcess(currentProcess);
            
        }
    }
    private void resumeProcess(Process processToResume) {
        // Update the status of the specified process to suspended
        processToResume.setStatus("Ready"); // Assuming there's a setStatus method in your Process class
        //  Optionally, perform any additional cleanup or update UI
        // For example, repaint the panel after suspension
        resumeButtonActionPerformed(null); // Update the displayed list after suspension
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        for (int i = 0; i < n - 1; i++) {
        boolean swapped = false;
        for (int j = 0; j < n - 1 - i; j++) {
            if (process[j].arrivalTime > process[j + 1].arrivalTime) {
                Process temp = process[j];
                process[j] = process[j + 1];
                process[j + 1] = temp;
                swapped = true;
            }
        }
        // If no two elements were swapped by inner loop, then break
        if (!swapped) {
            break;
        }
    }
        SchedulingPanel.setVisible(true);
        ProcessPanel.setVisible(false);
        MemoryManagement.setVisible(false);
        MainPanel.setVisible(false);
        createPanel.setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void changePriorityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePriorityButtonActionPerformed
        changePriorityPanel.setVisible(true);
        destroyScroll.setVisible(false);
        suspendScroll.setVisible(false);
    }//GEN-LAST:event_changePriorityButtonActionPerformed

    private void dispatchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dispatchButtonActionPerformed
      
        changePriorityPanel.setVisible(false);// Clear existing components from suspendPanel
        suspendPanel.removeAll();
        suspendPanel.setLayout(null); // Set layout to null for absolute positioning

        // Define initial coordinates for headers and data
        int xHeaderOffset = 10;
        int yHeaderOffset = 10;
        int xDataOffset = 10;
        int yDataOffset = 40;

        // Create header labels
        JLabel suspendPID = createHeaderLabel("ID");
        suspendPID.setBounds(xHeaderOffset, yHeaderOffset, 80, 30);
        suspendPanel.add(suspendPID);

        JLabel suspendPN = createHeaderLabel("Name");
        suspendPN.setBounds(xHeaderOffset + 100, yHeaderOffset, 150, 30);
        suspendPanel.add(suspendPN);

        JLabel suspendPAT = createHeaderLabel("Arrival Time");
        suspendPAT.setBounds(xHeaderOffset + 200, yHeaderOffset, 120, 30);
        suspendPanel.add(suspendPAT);

        JLabel suspendPBT = createHeaderLabel("Burst Time");
        suspendPBT.setBounds(xHeaderOffset + 360, yHeaderOffset, 120, 30);
        suspendPanel.add(suspendPBT);

        JLabel suspendLabel = createHeaderLabel("Start");
        suspendLabel.setBounds(xHeaderOffset + 520, yHeaderOffset, 80, 30);
        suspendPanel.add(suspendLabel);

        // Iterate over existing processes and display their details with suspend buttons
        for (int i = 0; i < n; i++) {
            Process currentProcess = process[i];
            if(currentProcess.status.equals("Ready")){
                // Create and display JLabels for process details
                JLabel idLabel = createLabel(String.valueOf(currentProcess.id));
                idLabel.setBounds(xDataOffset, yDataOffset, 80, 30);
                suspendPanel.add(idLabel);

                JLabel nameLabel = createLabel(currentProcess.name);
                nameLabel.setBounds(xDataOffset + 100, yDataOffset, 150, 30);
                suspendPanel.add(nameLabel);

                JLabel arrivalLabel = createLabel(String.valueOf(currentProcess.arrivalTime));
                arrivalLabel.setBounds(xDataOffset + 200, yDataOffset, 120, 30);
                suspendPanel.add(arrivalLabel);

                JLabel burstLabel = createLabel(String.valueOf(currentProcess.burstTime));
                burstLabel.setBounds(xDataOffset + 360, yDataOffset, 120, 30);
                suspendPanel.add(burstLabel);

                // Create and display suspend button
                JButton resumeBtn = new JButton("Start");
                resumeBtn.setFont(new Font("SimSun", Font.PLAIN, 12));
                resumeBtn.setForeground(new Color(171, 170, 170));
                resumeBtn.setBackground(new Color(41, 24, 40));
                resumeBtn.setBounds(xDataOffset + 520, yDataOffset, 80, 30);
                resumeBtn.addActionListener(new StartActionListener(currentProcess));
                suspendPanel.add(resumeBtn);
                // Increment y offset for the next row
                yDataOffset += 40;
            }

        }

        // Set preferred size of suspendPanel based on the content
        suspendPanel.setPreferredSize(new Dimension(620, yDataOffset + 20));

        // Repaint the suspendPanel to reflect changes
        suspendPanel.revalidate();
        suspendPanel.repaint();

        // Hide other panels and show the suspendPanel
        displayPPanel.setVisible(false);
        displayPScroll.setVisible(false);
        destroyPanel.setVisible(false);
        destroyScroll.setVisible(false);
        suspendPanel.setVisible(true);
        suspendScroll.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_dispatchButtonActionPerformed
    private class StartActionListener implements ActionListener {

        private final Process currentProcess;

        public StartActionListener(Process currentProcess) {
            this.currentProcess = currentProcess;
        }

        public void actionPerformed(ActionEvent e) {
            startProcess(currentProcess);
            
        }
    }
    private void startProcess(Process processToResume) {
        // Update the status of the specified process to suspended
        processToResume.setStatus("Running"); // Assuming there's a setStatus method in your Process class
        //  Optionally, perform any additional cleanup or update UI
        // For example, repaint the panel after suspension
        dispatchButtonActionPerformed(null); // Update the displayed list after suspension
    }
    private void wakeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wakeButtonActionPerformed
        changePriorityPanel.setVisible(false);
        suspendPanel.removeAll();
        suspendPanel.setLayout(null); // Set layout to null for absolute positioning

        // Define initial coordinates for headers and data
        int xHeaderOffset = 10;
        int yHeaderOffset = 10;
        int xDataOffset = 10;
        int yDataOffset = 40;

        // Create header labels
        JLabel suspendPID = createHeaderLabel("ID");
        suspendPID.setBounds(xHeaderOffset, yHeaderOffset, 80, 30);
        suspendPanel.add(suspendPID);

        JLabel suspendPN = createHeaderLabel("Name");
        suspendPN.setBounds(xHeaderOffset + 100, yHeaderOffset, 150, 30);
        suspendPanel.add(suspendPN);

        JLabel suspendPAT = createHeaderLabel("Arrival Time");
        suspendPAT.setBounds(xHeaderOffset + 200, yHeaderOffset, 120, 30);
        suspendPanel.add(suspendPAT);

        JLabel suspendPBT = createHeaderLabel("Burst Time");
        suspendPBT.setBounds(xHeaderOffset + 360, yHeaderOffset, 120, 30);
        suspendPanel.add(suspendPBT);

        JLabel suspendLabel = createHeaderLabel("Wake up");
        suspendLabel.setBounds(xHeaderOffset + 520, yHeaderOffset, 80, 30);
        suspendPanel.add(suspendLabel);

        // Iterate over existing processes and display their details with suspend buttons
        for (int i = 0; i < n; i++) {
            Process currentProcess = process[i];
            if(currentProcess.status.equals("Blocked")){
                // Create and display JLabels for process details
                JLabel idLabel = createLabel(String.valueOf(currentProcess.id));
                idLabel.setBounds(xDataOffset, yDataOffset, 80, 30);
                suspendPanel.add(idLabel);

                JLabel nameLabel = createLabel(currentProcess.name);
                nameLabel.setBounds(xDataOffset + 100, yDataOffset, 150, 30);
                suspendPanel.add(nameLabel);

                JLabel arrivalLabel = createLabel(String.valueOf(currentProcess.arrivalTime));
                arrivalLabel.setBounds(xDataOffset + 200, yDataOffset, 120, 30);
                suspendPanel.add(arrivalLabel);

                JLabel burstLabel = createLabel(String.valueOf(currentProcess.burstTime));
                burstLabel.setBounds(xDataOffset + 360, yDataOffset, 120, 30);
                suspendPanel.add(burstLabel);

                // Create and display suspend button
                JButton suspendBtn = new JButton("Wake");
                suspendBtn.setFont(new Font("SimSun", Font.PLAIN, 12));
                suspendBtn.setForeground(new Color(171, 170, 170));
                suspendBtn.setBackground(new Color(41, 24, 40));
                suspendBtn.setBounds(xDataOffset + 520, yDataOffset, 80, 30);
                suspendBtn.addActionListener(new WakeActionListener(currentProcess));
                suspendPanel.add(suspendBtn);

                // Increment y offset for the next row
                yDataOffset += 40;
            }

        }

        // Set preferred size of suspendPanel based on the content
        suspendPanel.setPreferredSize(new Dimension(620, yDataOffset + 20));

        // Repaint the suspendPanel to reflect changes
        suspendPanel.revalidate();
        suspendPanel.repaint();

        // Hide other panels and show the suspendPanel
        displayPPanel.setVisible(false);
        displayPScroll.setVisible(false);
        destroyScroll.setVisible(false);
        suspendScroll.setVisible(true);
        suspendPanel.setVisible(true);
    }//GEN-LAST:event_wakeButtonActionPerformed
     private class WakeActionListener implements ActionListener {

        private final Process currentProcess;

        public WakeActionListener(Process currentProcess) {
            this.currentProcess = currentProcess;
        }

        public void actionPerformed(ActionEvent e) {
            wakeProcess(currentProcess);
            
        }
    }
    private void wakeProcess(Process processToBlock) {
        // Update the status of the specified process to suspended
        processToBlock.setStatus("Ready"); // Assuming there's a setStatus method in your Process class
        //  Optionally, perform any additional cleanup or update UI
        // For example, repaint the panel after suspension
        wakeButtonActionPerformed(null); // Update the displayed list after suspension
    }
    private void blockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blockButtonActionPerformed
        changePriorityPanel.setVisible(false);
        suspendPanel.removeAll();
        suspendPanel.setLayout(null); // Set layout to null for absolute positioning

        // Define initial coordinates for headers and data
        int xHeaderOffset = 10;
        int yHeaderOffset = 10;
        int xDataOffset = 10;
        int yDataOffset = 40;

        // Create header labels
        JLabel suspendPID = createHeaderLabel("ID");
        suspendPID.setBounds(xHeaderOffset, yHeaderOffset, 80, 30);
        suspendPanel.add(suspendPID);

        JLabel suspendPN = createHeaderLabel("Name");
        suspendPN.setBounds(xHeaderOffset + 100, yHeaderOffset, 150, 30);
        suspendPanel.add(suspendPN);

        JLabel suspendPAT = createHeaderLabel("Arrival Time");
        suspendPAT.setBounds(xHeaderOffset + 200, yHeaderOffset, 120, 30);
        suspendPanel.add(suspendPAT);

        JLabel suspendPBT = createHeaderLabel("Burst Time");
        suspendPBT.setBounds(xHeaderOffset + 360, yHeaderOffset, 120, 30);
        suspendPanel.add(suspendPBT);

        JLabel suspendLabel = createHeaderLabel("Block");
        suspendLabel.setBounds(xHeaderOffset + 520, yHeaderOffset, 80, 30);
        suspendPanel.add(suspendLabel);

        // Iterate over existing processes and display their details with suspend buttons
        for (int i = 0; i < n; i++) {
            Process currentProcess = process[i];
            if(currentProcess.status.equals("Running")){
                // Create and display JLabels for process details
                JLabel idLabel = createLabel(String.valueOf(currentProcess.id));
                idLabel.setBounds(xDataOffset, yDataOffset, 80, 30);
                suspendPanel.add(idLabel);

                JLabel nameLabel = createLabel(currentProcess.name);
                nameLabel.setBounds(xDataOffset + 100, yDataOffset, 150, 30);
                suspendPanel.add(nameLabel);

                JLabel arrivalLabel = createLabel(String.valueOf(currentProcess.arrivalTime));
                arrivalLabel.setBounds(xDataOffset + 200, yDataOffset, 120, 30);
                suspendPanel.add(arrivalLabel);

                JLabel burstLabel = createLabel(String.valueOf(currentProcess.burstTime));
                burstLabel.setBounds(xDataOffset + 360, yDataOffset, 120, 30);
                suspendPanel.add(burstLabel);

                // Create and display suspend button
                JButton suspendBtn = new JButton("Block");
                suspendBtn.setFont(new Font("SimSun", Font.PLAIN, 12));
                suspendBtn.setForeground(new Color(171, 170, 170));
                suspendBtn.setBackground(new Color(41, 24, 40));
                suspendBtn.setBounds(xDataOffset + 520, yDataOffset, 80, 30);
                suspendBtn.addActionListener(new BlockActionListener(currentProcess));
                suspendPanel.add(suspendBtn);

                // Increment y offset for the next row
                yDataOffset += 40;
            }

        }

        // Set preferred size of suspendPanel based on the content
        suspendPanel.setPreferredSize(new Dimension(620, yDataOffset + 20));

        // Repaint the suspendPanel to reflect changes
        suspendPanel.revalidate();
        suspendPanel.repaint();

        // Hide other panels and show the suspendPanel
        displayPPanel.setVisible(false);
        displayPScroll.setVisible(false);
        destroyScroll.setVisible(false);
        suspendScroll.setVisible(true);
        suspendPanel.setVisible(true);
    }//GEN-LAST:event_blockButtonActionPerformed
    private class BlockActionListener implements ActionListener {

        private final Process currentProcess;

        public BlockActionListener(Process currentProcess) {
            this.currentProcess = currentProcess;
        }

        public void actionPerformed(ActionEvent e) {
            blockProcess(currentProcess);
            
        }
    }
    private void blockProcess(Process processToBlock) {
        // Update the status of the specified process to suspended
        processToBlock.setStatus("Blocked"); // Assuming there's a setStatus method in your Process class
        //  Optionally, perform any additional cleanup or update UI
        // For example, repaint the panel after suspension
        blockButtonActionPerformed(null); // Update the displayed list after suspension
    }
    private void resumeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resumeButtonActionPerformed
        changePriorityPanel.setVisible(false);// Clear existing components from suspendPanel
        suspendPanel.removeAll();
        suspendPanel.setLayout(null); // Set layout to null for absolute positioning

        // Define initial coordinates for headers and data
        int xHeaderOffset = 10;
        int yHeaderOffset = 10;
        int xDataOffset = 10;
        int yDataOffset = 40;

        // Create header labels
        JLabel suspendPID = createHeaderLabel("ID");
        suspendPID.setBounds(xHeaderOffset, yHeaderOffset, 80, 30);
        suspendPanel.add(suspendPID);

        JLabel suspendPN = createHeaderLabel("Name");
        suspendPN.setBounds(xHeaderOffset + 100, yHeaderOffset, 150, 30);
        suspendPanel.add(suspendPN);

        JLabel suspendPAT = createHeaderLabel("Arrival Time");
        suspendPAT.setBounds(xHeaderOffset + 200, yHeaderOffset, 120, 30);
        suspendPanel.add(suspendPAT);

        JLabel suspendPBT = createHeaderLabel("Burst Time");
        suspendPBT.setBounds(xHeaderOffset + 360, yHeaderOffset, 120, 30);
        suspendPanel.add(suspendPBT);

        JLabel suspendLabel = createHeaderLabel("Resume");
        suspendLabel.setBounds(xHeaderOffset + 520, yHeaderOffset, 80, 30);
        suspendPanel.add(suspendLabel);

        // Iterate over existing processes and display their details with suspend buttons
        for (int i = 0; i < n; i++) {
            Process currentProcess = process[i];
            if(currentProcess.status.equals("Suspended")){
                // Create and display JLabels for process details
                JLabel idLabel = createLabel(String.valueOf(currentProcess.id));
                idLabel.setBounds(xDataOffset, yDataOffset, 80, 30);
                suspendPanel.add(idLabel);

                JLabel nameLabel = createLabel(currentProcess.name);
                nameLabel.setBounds(xDataOffset + 100, yDataOffset, 150, 30);
                suspendPanel.add(nameLabel);

                JLabel arrivalLabel = createLabel(String.valueOf(currentProcess.arrivalTime));
                arrivalLabel.setBounds(xDataOffset + 200, yDataOffset, 120, 30);
                suspendPanel.add(arrivalLabel);

                JLabel burstLabel = createLabel(String.valueOf(currentProcess.burstTime));
                burstLabel.setBounds(xDataOffset + 360, yDataOffset, 120, 30);
                suspendPanel.add(burstLabel);

                // Create and display suspend button
                JButton resumeBtn = new JButton("Resume");
                resumeBtn.setFont(new Font("SimSun", Font.PLAIN, 12));
                resumeBtn.setForeground(new Color(171, 170, 170));
                resumeBtn.setBackground(new Color(41, 24, 40));
                resumeBtn.setBounds(xDataOffset + 520, yDataOffset, 80, 30);
                resumeBtn.addActionListener(new ResumeActionListener(currentProcess));
                suspendPanel.add(resumeBtn);
                // Increment y offset for the next row
                yDataOffset += 40;
            }

        }

        // Set preferred size of suspendPanel based on the content
        suspendPanel.setPreferredSize(new Dimension(620, yDataOffset + 20));

        // Repaint the suspendPanel to reflect changes
        suspendPanel.revalidate();
        suspendPanel.repaint();

        // Hide other panels and show the suspendPanel
        displayPPanel.setVisible(false);
        displayPScroll.setVisible(false);
        destroyPanel.setVisible(false);
        destroyScroll.setVisible(false);
        suspendPanel.setVisible(true);
        suspendScroll.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_resumeButtonActionPerformed

    private void suspendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suspendButtonActionPerformed
        changePriorityPanel.setVisible(false);// Clear existing components from suspendPanel
        suspendPanel.removeAll();
        suspendPanel.setLayout(null); // Set layout to null for absolute positioning

        // Define initial coordinates for headers and data
        int xHeaderOffset = 10;
        int yHeaderOffset = 10;
        int xDataOffset = 10;
        int yDataOffset = 40;

        // Create header labels
        JLabel suspendPID = createHeaderLabel("ID");
        suspendPID.setBounds(xHeaderOffset, yHeaderOffset, 80, 30);
        suspendPanel.add(suspendPID);

        JLabel suspendPN = createHeaderLabel("Name");
        suspendPN.setBounds(xHeaderOffset + 100, yHeaderOffset, 150, 30);
        suspendPanel.add(suspendPN);

        JLabel suspendPAT = createHeaderLabel("Arrival Time");
        suspendPAT.setBounds(xHeaderOffset + 200, yHeaderOffset, 120, 30);
        suspendPanel.add(suspendPAT);

        JLabel suspendPBT = createHeaderLabel("Burst Time");
        suspendPBT.setBounds(xHeaderOffset + 360, yHeaderOffset, 120, 30);
        suspendPanel.add(suspendPBT);

        JLabel suspendLabel = createHeaderLabel("Suspend");
        suspendLabel.setBounds(xHeaderOffset + 520, yHeaderOffset, 80, 30);
        suspendPanel.add(suspendLabel);

        // Iterate over existing processes and display their details with suspend buttons
        for (int i = 0; i < n; i++) {
            Process currentProcess = process[i];
            if(currentProcess.status.equals("Running")){
                // Create and display JLabels for process details
                JLabel idLabel = createLabel(String.valueOf(currentProcess.id));
                idLabel.setBounds(xDataOffset, yDataOffset, 80, 30);
                suspendPanel.add(idLabel);

                JLabel nameLabel = createLabel(currentProcess.name);
                nameLabel.setBounds(xDataOffset + 100, yDataOffset, 150, 30);
                suspendPanel.add(nameLabel);

                JLabel arrivalLabel = createLabel(String.valueOf(currentProcess.arrivalTime));
                arrivalLabel.setBounds(xDataOffset + 200, yDataOffset, 120, 30);
                suspendPanel.add(arrivalLabel);

                JLabel burstLabel = createLabel(String.valueOf(currentProcess.burstTime));
                burstLabel.setBounds(xDataOffset + 360, yDataOffset, 120, 30);
                suspendPanel.add(burstLabel);

                // Create and display suspend button
                JButton suspendBtn = new JButton("Suspend");
                suspendBtn.setFont(new Font("SimSun", Font.PLAIN, 12));
                suspendBtn.setForeground(new Color(171, 170, 170));
                suspendBtn.setBackground(new Color(41, 24, 40));
                suspendBtn.setBounds(xDataOffset + 520, yDataOffset, 80, 30);
                suspendBtn.addActionListener(new SuspendActionListener(currentProcess));
                suspendPanel.add(suspendBtn);

                // Increment y offset for the next row
                yDataOffset += 40;
            }

        }

        // Set preferred size of suspendPanel based on the content
        suspendPanel.setPreferredSize(new Dimension(620, yDataOffset + 20));

        // Repaint the suspendPanel to reflect changes
        suspendPanel.revalidate();
        suspendPanel.repaint();

        // Hide other panels and show the suspendPanel
        displayPPanel.setVisible(false);
        displayPScroll.setVisible(false);
        destroyScroll.setVisible(false);
        suspendScroll.setVisible(true);
        suspendPanel.setVisible(true);
    }//GEN-LAST:event_suspendButtonActionPerformed

    private void destroyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destroyButtonActionPerformed
        
        changePriorityPanel.setVisible(false);// Clear existing components from destroyPanel
        destroyPanel.removeAll();
        destroyPanel.setLayout(null); // Set layout to null for absolute positioning

        // Define initial coordinates for headers and data
        int xHeaderOffset = 10;
        int yHeaderOffset = 10;
        int xDataOffset = 10;
        int yDataOffset = 40;

        // Create header labels
        JLabel destroyPID = createHeaderLabel("ID");
        destroyPID.setBounds(xHeaderOffset, yHeaderOffset, 80, 30);
        destroyPanel.add(destroyPID);

        JLabel destroyPN = createHeaderLabel("Name");
        destroyPN.setBounds(xHeaderOffset + 100, yHeaderOffset, 150, 30);
        destroyPanel.add(destroyPN);

        JLabel destroyPAT = createHeaderLabel("Arrival Time");
        destroyPAT.setBounds(xHeaderOffset + 200, yHeaderOffset, 120, 30);
        destroyPanel.add(destroyPAT);

        JLabel destroyPBT = createHeaderLabel("Burst Time");
        destroyPBT.setBounds(xHeaderOffset + 360, yHeaderOffset, 120, 30);
        destroyPanel.add(destroyPBT);

        JLabel deleteLabel = createHeaderLabel("Delete");
        deleteLabel.setBounds(xHeaderOffset + 520, yHeaderOffset, 80, 30);
        destroyPanel.add(deleteLabel);

        // Iterate over existing processes and display their details with delete buttons
        for (int i = 0; i < n; i++) {
            Process currentProcess = process[i];

            // Create and display JLabels for process details
            JLabel idLabel = createLabel(String.valueOf(currentProcess.id));
            idLabel.setBounds(xDataOffset, yDataOffset, 80, 30);
            destroyPanel.add(idLabel);

            JLabel nameLabel = createLabel(currentProcess.name);
            nameLabel.setBounds(xDataOffset + 100, yDataOffset, 150, 30);
            destroyPanel.add(nameLabel);

            JLabel arrivalLabel = createLabel(String.valueOf(currentProcess.arrivalTime));
            arrivalLabel.setBounds(xDataOffset + 200, yDataOffset, 120, 30);
            destroyPanel.add(arrivalLabel);

            JLabel burstLabel = createLabel(String.valueOf(currentProcess.burstTime));
            burstLabel.setBounds(xDataOffset + 360, yDataOffset, 120, 30);
            destroyPanel.add(burstLabel);

            // Create and display delete button
            JButton deleteButton = new JButton("Delete");
            deleteButton.setFont(new Font("SimSun", Font.PLAIN, 16));
            deleteButton.setForeground(new Color(171, 170, 170));
            deleteButton.setBackground(new Color(41,24,40));
            deleteButton.setBounds(xDataOffset + 520, yDataOffset, 80, 30);
            deleteButton.addActionListener(new ActionListenerImpl(currentProcess));
            destroyPanel.add(deleteButton);

            // Increment y offset for the next row
            yDataOffset += 40;
        }

        // Set preferred size of destroyPanel based on the content
        destroyPanel.setPreferredSize(new Dimension(620, yDataOffset + 20));

        // Repaint the destroyPanel to reflect changes
        destroyPanel.revalidate();
        destroyPanel.repaint();

        // Hide other panels and show the destroyPanel
        displayPPanel.setVisible(false);
        displayPScroll.setVisible(false);
        suspendPanel.setVisible(false);
        suspendScroll.setVisible(false);
        destroyScroll.setVisible(true);
        destroyPanel.setVisible(true);
    }//GEN-LAST:event_destroyButtonActionPerformed

    private void processButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processButtonActionPerformed
        changePriorityPanel.setVisible(false);
        displayPPanel.removeAll();
        displayPPanel.setLayout(null); // Set layout to null for absolute positioning

        // Define initial coordinates for headers and data
        int xHeaderOffset = 10;
        int yHeaderOffset = 10;
        int xDataOffset = 10;
        int yDataOffset = 40;

        // Create header labels
        JLabel destroyPID = createHeaderLabel("ID");
        destroyPID.setBounds(xHeaderOffset, yHeaderOffset, 80, 30);
        displayPPanel.add(destroyPID);

        JLabel destroyPN = createHeaderLabel("Name");
        destroyPN.setBounds(xHeaderOffset + 100, yHeaderOffset, 150, 30);
        displayPPanel.add(destroyPN);

        JLabel destroyStatus = createHeaderLabel("Status");
        destroyStatus.setBounds(xHeaderOffset + 200, yHeaderOffset, 120, 30);
       displayPPanel.add(destroyStatus);
       
        JLabel destroyAT = createHeaderLabel("Arrival Time");
        destroyAT.setBounds(xHeaderOffset + 360, yHeaderOffset, 120, 30);
        displayPPanel.add(destroyAT);
        
        JLabel destroyPBT = createHeaderLabel("Burst Time");
        destroyPBT.setBounds(xHeaderOffset + 520, yHeaderOffset, 120, 30);
        displayPPanel.add(destroyPBT);
        // Iterate over existing processes and display their details with delete buttons
        for (int i = 0; i < n; i++) {
            Process currentProcess = process[i];

            // Create and display JLabels for process details
            JLabel idLabel = createLabel(String.valueOf(currentProcess.id));
            idLabel.setBounds(xDataOffset, yDataOffset, 80, 30);
            displayPPanel.add(idLabel);

            JLabel nameLabel = createLabel(currentProcess.name);
            nameLabel.setBounds(xDataOffset + 100, yDataOffset, 150, 30);
            displayPPanel.add(nameLabel);

            JLabel statusLabel = createLabel(currentProcess.status);
            
            statusLabel.setBounds(xDataOffset + 200, yDataOffset, 120, 30);
           displayPPanel.add(statusLabel);
          
           JLabel burstLabel = createLabel(String.valueOf(currentProcess.arrivalTime));
            burstLabel.setBounds(xDataOffset + 360, yDataOffset, 120, 30);
            displayPPanel.add(burstLabel);
           
            JLabel arrivalLabel = createLabel(String.valueOf(currentProcess.burstTime));
            arrivalLabel.setBounds(xDataOffset + 520, yDataOffset, 120, 30);
            displayPPanel.add(arrivalLabel);

            // Create and display delete button
          

            // Increment y offset for the next row
            yDataOffset += 40;
        }

        // Set preferred size of destroyPanel based on the content
       displayPPanel.setPreferredSize(new Dimension(620, yDataOffset + 20));

        // Repaint the destroyPanel to reflect changes
        displayPPanel.revalidate();
        displayPPanel.repaint();

        // Hide other panels and show the destroyPanel
        
        suspendPanel.setVisible(false);
        suspendScroll.setVisible(false);
        destroyScroll.setVisible(false);
        displayPPanel.setVisible(true);
        displayPScroll.setVisible(true);
        destroyPanel.setVisible(false);
        // TODO add your handling code here:
        
    }//GEN-LAST:event_processButtonActionPerformed
public class CustomProcessInputDialog extends JDialog implements ActionListener {
    private JTextField nameField;
    private JTextField arrivalField;
    private JTextField burstField;
    private JButton createButton;
    private boolean inputValid;

    public CustomProcessInputDialog(Frame parent) {
        super(parent, "Enter Process Details", true);
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        panel.setBackground(new Color(22, 41, 42));

        // Custom font for text fields
        Font textFieldFont = new Font("SimSun", Font.PLAIN, 14);

        // Create components with custom styles
        JLabel nameLabel = new JLabel("Process Name:");
        nameLabel.setForeground(new Color(171, 170, 170));
        nameLabel.setFont(textFieldFont);
        nameField = new JTextField(15);
        nameField.setBackground(new Color(22,41,42));
        nameField.setForeground(new Color(171, 170, 170));
        nameField.setFont(textFieldFont);

        JLabel arrivalLabel = new JLabel("Arrival Time:");
        arrivalLabel.setForeground(new Color(171, 170, 170));
        arrivalLabel.setFont(textFieldFont);
        arrivalField = new JTextField(5);
        arrivalField.setBackground(new Color(22,41,42));
        arrivalField.setForeground(new Color(171, 170, 170));
        arrivalField.setFont(textFieldFont);

        JLabel burstLabel = new JLabel("Burst Time:");
        burstLabel.setForeground(new Color(171, 170, 170));
        burstLabel.setFont(textFieldFont);
        burstField = new JTextField(5);
        burstField.setBackground(new Color(22,41,42));
        burstField.setForeground(new Color(171, 170, 170));
        burstField.setFont(textFieldFont);

        createButton = new JButton("Create");
        createButton.setBackground(new Color(22, 41, 42));
        createButton.setForeground(new Color(171, 170, 170));
        createButton.addActionListener(this);

        // Add components to the panel with custom layout
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.anchor = GridBagConstraints.WEST;
        panel.add(nameLabel, constraints);

        constraints.gridx = 1;
        panel.add(nameField, constraints);

        constraints.gridy = 1;
        constraints.gridx = 0;
        panel.add(arrivalLabel, constraints);

        constraints.gridx = 1;
        panel.add(arrivalField, constraints);

        constraints.gridy = 2;
        constraints.gridx = 0;
        panel.add(burstLabel, constraints);

        constraints.gridx = 1;
        panel.add(burstField, constraints);

        constraints.gridy = 3;
        constraints.gridx = 0;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        panel.add(createButton, constraints);

        getContentPane().add(panel);
        pack();
        setLocationRelativeTo(parent);

        inputValid = false;
    }

    public String getProcessName() {
        return nameField.getText().trim();
    }

    public int getArrivalTime() {
        try {
            return Integer.parseInt(arrivalField.getText().trim());
        } catch (NumberFormatException e) {
            return -1; // Return invalid value if parsing fails
        }
    }

    public int getBurstTime() {
        try {
            return Integer.parseInt(burstField.getText().trim());
        } catch (NumberFormatException e) {
            return -1; // Return invalid value if parsing fails
        }
    }

    public boolean isInputValid() {
        return inputValid;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == createButton) {
            // Validate input before proceeding
            String na = getProcessName();
            int at = getArrivalTime();
            int bt = getBurstTime();

            if (na.isEmpty() || at < 0 || bt < 0) {
                JOptionPane.showMessageDialog(this, "Please fill in all fields with valid values.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            } else {
                inputValid = true;
                dispose(); // Close the dialog if input is valid
            }
        }
    }
}
    private void maxProcessButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxProcessButtonActionPerformed
        try{
            n = Integer.parseInt(maxProcessField.getText());
        } catch(Exception e){
            JOptionPane.showMessageDialog(createPanel, "Invalid Input.\n For Number of Processes: "+e.getMessage());
            return;
        }
        
         
         for (int i = 0; i < n; i++) {
        CustomProcessInputDialog dialog = new CustomProcessInputDialog((Frame) SwingUtilities.getWindowAncestor(createPanel));
        dialog.setVisible(true);

        if (dialog.isInputValid()) {
            String na = dialog.getProcessName();
            int at = dialog.getArrivalTime();
            int bt = dialog.getBurstTime();

            // Create a new Process object and set its attributes
            process[i] = new Process();
            process[i].setProcess(na, at, bt);

            JOptionPane.showMessageDialog(createPanel, "Process #" + (i + 1) + " Created");
        } else {
            JOptionPane.showMessageDialog(createPanel, "Process creation canceled or invalid input.");
            return; // Exit the method if user cancels or input is invalid
        }
    }

    // After all processes are created
    JOptionPane.showMessageDialog(createPanel, "All Processes Created Successfully");
    createPanel.setVisible(false);
    MainPanel.setVisible(true);
         
    }//GEN-LAST:event_maxProcessButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String input_id = changePriorityPId.getText();
        int id = 0;
        try{
            id = Integer.parseInt(input_id);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"INVALID INPUT. ("+ e.getMessage()+")");
            return;
        }
        String priority = (String) changePriorityPPriority.getSelectedItem();
        int found = 0;
        for(int i=0; i<n ; i++){
            if(id == process[i].id){
                process[i].priority = priority;
                found++;
                JOptionPane.showMessageDialog(changePriorityPanel, "Priority Updated");
                return;
            }
        }
        if(found == 0){
            JOptionPane.showMessageDialog(changePriorityPanel, "No Such ID Found");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void goBack1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBack1MouseClicked
MemoryManagement.setVisible(false);
        MainPanel.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_goBack1MouseClicked

    private void goBack2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBack2MouseClicked
        MainPanel.setVisible(true);
        SchedulingPanel.setVisible(false); 
        // TODO add your handling code here:
    }//GEN-LAST:event_goBack2MouseClicked

    private void fcfsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fcfsButtonActionPerformed
        if(n == 0){
            JOptionPane.showMessageDialog(null, "NO PROCESS CREATED.");
            return;
        }
        // Initialize variables
        int currentTime = 0;
        int totalWaitingTime = 0;
        int totalTurnaroundTime = 0;

        // Sort the processes based on their arrival times
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (process[i].arrivalTime > process[j].arrivalTime) {
                    // Swap the processes
                    Process temp = process[i];
                    process[i] = process[j];
                    process[j] = temp;
                }
            }
        }
        // Perform FCFS scheduling
        for (Process p : process) {
            if (p != null) { 
                // Update the current time
                if (p.arrivalTime > currentTime) {
                    currentTime = p.arrivalTime;
                }

                // Calculate the completion time
                p.completionTime = currentTime + p.burstTime;
                currentTime = p.completionTime;

                // Calculate the waiting time, turnaround time, and response time
                p.waitingTime = p.completionTime - p.arrivalTime - p.burstTime;
                p.turnAroundTime = p.completionTime - p.arrivalTime;
                p.responseTime = p.waitingTime;

                // Update the total waiting time and total turnaround time
                totalWaitingTime += p.waitingTime;
                totalTurnaroundTime += p.turnAroundTime;
            }
        }

        // Calculate the average waiting time and average turnaround time
        double avgWaitingTime = (double) totalWaitingTime / n;
        double avgTurnaroundTime = (double) totalTurnaroundTime / n;

        // Display the results
        DisplaySchedulingPanel.removeAll();
        DisplaySchedulingPanel.setLayout(null); // Set layout to null for absolute positioning

        // Define initial coordinates for headers and data
        int xHeaderOffset = 10;
        int yHeaderOffset = 10;
        int xDataOffset = 10;
        int yDataOffset = 40;

        // Create header labels
        JLabel id = createHeaderLabel("ID");
        id.setBounds(xHeaderOffset, yHeaderOffset, 80, 30);
        DisplaySchedulingPanel.add(id);

        JLabel name = createHeaderLabel("Name");
        name.setBounds(xHeaderOffset + 100, yHeaderOffset, 150, 30);
        DisplaySchedulingPanel.add(name);

        JLabel at = createHeaderLabel("AT");
        at.setBounds(xHeaderOffset + 200, yHeaderOffset, 120, 30);
       DisplaySchedulingPanel.add(at);
       
        JLabel bt = createHeaderLabel("BT");
        bt.setBounds(xHeaderOffset + 300, yHeaderOffset, 120, 30);
        DisplaySchedulingPanel.add(bt);
        
        JLabel ct = createHeaderLabel("CT");
        ct.setBounds(xHeaderOffset + 400, yHeaderOffset, 120, 30);
        DisplaySchedulingPanel.add(ct);
        
        JLabel tat = createHeaderLabel("TAT");
        tat.setBounds(xHeaderOffset + 500, yHeaderOffset, 120, 30);
        DisplaySchedulingPanel.add(tat);
        
        JLabel wt = createHeaderLabel("WT");
        wt.setBounds(xHeaderOffset + 600, yHeaderOffset, 120, 30);
        DisplaySchedulingPanel.add(wt);
        
        JLabel rt = createHeaderLabel("RT");
        rt.setBounds(xHeaderOffset + 700, yHeaderOffset, 120, 30);
        DisplaySchedulingPanel.add(rt);
        JLabel awt = createHeaderLabel("AWT");
        awt.setBounds(xHeaderOffset + 750, yHeaderOffset, 120, 30);
        DisplaySchedulingPanel.add(awt);
        JLabel atat = createHeaderLabel("ATAT");
        atat.setBounds(xHeaderOffset + 800, yHeaderOffset, 120, 30);
        DisplaySchedulingPanel.add(atat);
        JLabel pawt = createHeaderLabel(""+avgWaitingTime);
        pawt.setBounds(xDataOffset + 750, yDataOffset, 120, 30);
        DisplaySchedulingPanel.add(pawt);
        JLabel patat = createHeaderLabel(""+avgTurnaroundTime);
        patat.setBounds(xDataOffset + 800, yDataOffset, 120, 30);
        DisplaySchedulingPanel.add(patat);
        for (Process p : process) {
            if (p != null) { 
                JLabel pid = createHeaderLabel(""+p.id);
                pid.setBounds(xDataOffset, yDataOffset, 80, 30);
                DisplaySchedulingPanel.add(pid);

                JLabel pname = createHeaderLabel(p.name);
                pname.setBounds(xDataOffset + 100, yDataOffset, 150, 30);
                DisplaySchedulingPanel.add(pname);

                JLabel pat = createHeaderLabel(""+p.arrivalTime);
                pat.setBounds(xDataOffset + 200, yDataOffset, 120, 30);
               DisplaySchedulingPanel.add(pat);

                JLabel pbt = createHeaderLabel(""+p.burstTime);
                pbt.setBounds(xDataOffset + 300, yDataOffset, 120, 30);
                DisplaySchedulingPanel.add(pbt);

                JLabel pct = createHeaderLabel(""+p.completionTime);
                pct.setBounds(xDataOffset + 400, yDataOffset, 120, 30);
                DisplaySchedulingPanel.add(pct);

                JLabel ptat = createHeaderLabel(""+p.turnAroundTime);
                ptat.setBounds(xDataOffset + 500, yDataOffset, 120, 30);
                DisplaySchedulingPanel.add(ptat);

                JLabel pwt = createHeaderLabel(""+p.waitingTime);
                pwt.setBounds(xDataOffset + 600, yDataOffset, 120, 30);
                DisplaySchedulingPanel.add(pwt);

                JLabel prt = createHeaderLabel(""+p.responseTime);
                prt.setBounds(xDataOffset + 700, yDataOffset, 120, 30);
                DisplaySchedulingPanel.add(prt);
                
                  yDataOffset += 40;
//                System.out.println(p.id + "\t" + p.completionTime + "\t" + p.waitingTime + "\t" + p.turnAroundTime + "\t" + p.responseTime);
            }
        }
        
        DisplaySchedulingPanel.setPreferredSize(new Dimension(620, yDataOffset + 20));

        // Repaint the destroyPanel to reflect changes
        DisplaySchedulingPanel.revalidate();
        DisplaySchedulingPanel.repaint();
        for(int i =0; i<n; i++){
            process[i].setStatus("Running");
        }
//        System.out.println("Average Waiting Time: " + avgWaitingTime);
//        System.out.println("Average Turnaround Time: " + avgTurnaroundTime);
    }//GEN-LAST:event_fcfsButtonActionPerformed

    private void sjfButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sjfButtonActionPerformed
        if(n == 0){
            JOptionPane.showMessageDialog(null, "NO PROCESS CREATED.");
            return;
        }
        // Assume tempProcess array is defined and populated
    Process[] tempProcess = process;

    int[] remainingBurstTime = new int[n];
    boolean[] isFirstResponse = new boolean[n];
    int[] responseTimes = new int[n];
    
    for (int i = 0; i < n; i++) {
        remainingBurstTime[i] = tempProcess[i].burstTime;
        isFirstResponse[i] = true;
    }

    int completed = 0;
    int currentTime = 0;
    int shortest = -1;
    boolean foundProcess;
    DisplaySchedulingPanel.removeAll();
        DisplaySchedulingPanel.setLayout(null); // Set layout to null for absolute positioning

        // Define initial coordinates for headers and data
        int xHeaderOffset = 10;
        int yHeaderOffset = 10;
        int xDataOffset = 10;
        int yDataOffset = 40;

        // Create header labels
        JLabel id = createHeaderLabel("ID");
        id.setBounds(xHeaderOffset, yHeaderOffset, 80, 30);
        DisplaySchedulingPanel.add(id);

        JLabel name = createHeaderLabel("Name");
        name.setBounds(xHeaderOffset + 100, yHeaderOffset, 150, 30);
        DisplaySchedulingPanel.add(name);

        JLabel at = createHeaderLabel("AT");
        at.setBounds(xHeaderOffset + 200, yHeaderOffset, 120, 30);
       DisplaySchedulingPanel.add(at);
       
        JLabel bt = createHeaderLabel("BT");
        bt.setBounds(xHeaderOffset + 300, yHeaderOffset, 120, 30);
        DisplaySchedulingPanel.add(bt);
        
        JLabel ct = createHeaderLabel("CT");
        ct.setBounds(xHeaderOffset + 400, yHeaderOffset, 120, 30);
        DisplaySchedulingPanel.add(ct);
        
        JLabel tat = createHeaderLabel("TAT");
        tat.setBounds(xHeaderOffset + 500, yHeaderOffset, 120, 30);
        DisplaySchedulingPanel.add(tat);
        
        JLabel wt = createHeaderLabel("WT");
        wt.setBounds(xHeaderOffset + 600, yHeaderOffset, 120, 30);
        DisplaySchedulingPanel.add(wt);
        
        JLabel rt = createHeaderLabel("RT");
        rt.setBounds(xHeaderOffset + 700, yHeaderOffset, 120, 30);
        DisplaySchedulingPanel.add(rt);
    while (completed != n) {
        foundProcess = false;
        int minRemainingTime = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (tempProcess[i].arrivalTime <= currentTime && remainingBurstTime[i] > 0 && remainingBurstTime[i] < minRemainingTime) {
                minRemainingTime = remainingBurstTime[i];
                shortest = i;
                foundProcess = true;
            }
        }

        if (!foundProcess) {
            currentTime++;
            continue;
        }

        if (isFirstResponse[shortest]) {
            responseTimes[shortest] = currentTime - tempProcess[shortest].arrivalTime;
            isFirstResponse[shortest] = false;
        }

        remainingBurstTime[shortest]--;
        currentTime++;

        if (remainingBurstTime[shortest] == 0) {
            completed++;
            tempProcess[shortest].completionTime = currentTime;
            tempProcess[shortest].turnAroundTime = tempProcess[shortest].completionTime - tempProcess[shortest].arrivalTime;
            tempProcess[shortest].waitingTime = tempProcess[shortest].turnAroundTime - tempProcess[shortest].burstTime;
            tempProcess[shortest].responseTime = responseTimes[shortest];

            JLabel pid = createHeaderLabel(""+tempProcess[shortest].id);
                pid.setBounds(xDataOffset, yDataOffset, 80, 30);
                DisplaySchedulingPanel.add(pid);

                JLabel pname = createHeaderLabel(tempProcess[shortest].name);
                pname.setBounds(xDataOffset + 100, yDataOffset, 150, 30);
                DisplaySchedulingPanel.add(pname);

                JLabel pat = createHeaderLabel(""+tempProcess[shortest].arrivalTime);
                pat.setBounds(xDataOffset + 200, yDataOffset, 120, 30);
               DisplaySchedulingPanel.add(pat);

                JLabel pbt = createHeaderLabel(""+tempProcess[shortest].burstTime);
                pbt.setBounds(xDataOffset + 300, yDataOffset, 120, 30);
                DisplaySchedulingPanel.add(pbt);

                JLabel pct = createHeaderLabel(""+tempProcess[shortest].completionTime);
                pct.setBounds(xDataOffset + 400, yDataOffset, 120, 30);
                DisplaySchedulingPanel.add(pct);

                JLabel ptat = createHeaderLabel(""+tempProcess[shortest].turnAroundTime);
                ptat.setBounds(xDataOffset + 500, yDataOffset, 120, 30);
                DisplaySchedulingPanel.add(ptat);

                JLabel pwt = createHeaderLabel(""+tempProcess[shortest].waitingTime);
                pwt.setBounds(xDataOffset + 600, yDataOffset, 120, 30);
                DisplaySchedulingPanel.add(pwt);

                JLabel prt = createHeaderLabel(""+tempProcess[shortest].responseTime);
                prt.setBounds(xDataOffset + 700, yDataOffset, 120, 30);
                DisplaySchedulingPanel.add(prt);
                
                  yDataOffset += 40;
        }
    }
            DisplaySchedulingPanel.setPreferredSize(new Dimension(620, yDataOffset + 20));

        // Repaint the destroyPanel to reflect changes
        DisplaySchedulingPanel.revalidate();
        DisplaySchedulingPanel.repaint();
        for(int i =0; i<n; i++){
            process[i].setStatus("Running");
        }
    }//GEN-LAST:event_sjfButtonActionPerformed

    private void rrButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rrButtonActionPerformed
        if(n == 0){
            JOptionPane.showMessageDialog(null, "NO PROCESS CREATED.");
            return;
        }
        String input = JOptionPane.showInputDialog("Enter the time quantum:");

    int quantum;
    try {
        quantum = Integer.parseInt(input);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid integer.");
        return;
    } catch (NullPointerException e) {
        JOptionPane.showMessageDialog(null, "Input was cancelled.");
        return;
    }
            DisplaySchedulingPanel.removeAll();
        DisplaySchedulingPanel.setLayout(null); // Set layout to null for absolute positioning

        // Define initial coordinates for headers and data
        int xHeaderOffset = 10;
        int yHeaderOffset = 10;
        int xDataOffset = 10;
        int yDataOffset = 40;

        // Create header labels
        JLabel id = createHeaderLabel("ID");
        id.setBounds(xHeaderOffset, yHeaderOffset, 80, 30);
        DisplaySchedulingPanel.add(id);

        JLabel name = createHeaderLabel("Name");
        name.setBounds(xHeaderOffset + 100, yHeaderOffset, 150, 30);
        DisplaySchedulingPanel.add(name);

        JLabel at = createHeaderLabel("AT");
        at.setBounds(xHeaderOffset + 200, yHeaderOffset, 120, 30);
       DisplaySchedulingPanel.add(at);
       
        JLabel bt = createHeaderLabel("BT");
        bt.setBounds(xHeaderOffset + 300, yHeaderOffset, 120, 30);
        DisplaySchedulingPanel.add(bt);
        
        JLabel ct = createHeaderLabel("CT");
        ct.setBounds(xHeaderOffset + 400, yHeaderOffset, 120, 30);
        DisplaySchedulingPanel.add(ct);
        
        JLabel tat = createHeaderLabel("TAT");
        tat.setBounds(xHeaderOffset + 500, yHeaderOffset, 120, 30);
        DisplaySchedulingPanel.add(tat);
        
        JLabel wt = createHeaderLabel("WT");
        wt.setBounds(xHeaderOffset + 600, yHeaderOffset, 120, 30);
        DisplaySchedulingPanel.add(wt);
        
        JLabel rt = createHeaderLabel("RT");
        rt.setBounds(xHeaderOffset + 700, yHeaderOffset, 120, 30);
        DisplaySchedulingPanel.add(rt);
    // Assume tempProcess array is defined and populated
    Process[] tempProcess = process;

    int[] remainingBurstTime = new int[n];
    int[] originalBurstTime = new int[n];
    boolean[] isFirstResponse = new boolean[n];
    int[] responseTimes = new int[n];

    for (int i = 0; i < n; i++) {
        remainingBurstTime[i] = tempProcess[i].burstTime;
        originalBurstTime[i] = tempProcess[i].burstTime;
        isFirstResponse[i] = true;
    }

    int currentTime = 0;
    int completed = 0;

    while (completed < n) {
        boolean processInCycle = false;

        for (int i = 0; i < n; i++) {
            if (tempProcess[i].arrivalTime <= currentTime && remainingBurstTime[i] > 0) {
                processInCycle = true;

                if (isFirstResponse[i]) {
                    responseTimes[i] = currentTime - tempProcess[i].arrivalTime;
                    isFirstResponse[i] = false;
                }

                if (remainingBurstTime[i] > quantum) {
                    currentTime += quantum;
                    remainingBurstTime[i] -= quantum;
                } else {
                    currentTime += remainingBurstTime[i];
                    remainingBurstTime[i] = 0;
                    completed++;

                    tempProcess[i].completionTime = currentTime;
                    tempProcess[i].turnAroundTime = tempProcess[i].completionTime - tempProcess[i].arrivalTime;
                    tempProcess[i].waitingTime = tempProcess[i].turnAroundTime - originalBurstTime[i];
                    tempProcess[i].responseTime = responseTimes[i];

                    JLabel pid = createHeaderLabel(""+tempProcess[i].id);
                pid.setBounds(xDataOffset, yDataOffset, 80, 30);
                DisplaySchedulingPanel.add(pid);

                JLabel pname = createHeaderLabel(tempProcess[i].name);
                pname.setBounds(xDataOffset + 100, yDataOffset, 150, 30);
                DisplaySchedulingPanel.add(pname);

                JLabel pat = createHeaderLabel(""+tempProcess[i].arrivalTime);
                pat.setBounds(xDataOffset + 200, yDataOffset, 120, 30);
               DisplaySchedulingPanel.add(pat);

                JLabel pbt = createHeaderLabel(""+tempProcess[i].burstTime);
                pbt.setBounds(xDataOffset + 300, yDataOffset, 120, 30);
                DisplaySchedulingPanel.add(pbt);

                JLabel pct = createHeaderLabel(""+tempProcess[i].completionTime);
                pct.setBounds(xDataOffset + 400, yDataOffset, 120, 30);
                DisplaySchedulingPanel.add(pct);

                JLabel ptat = createHeaderLabel(""+tempProcess[i].turnAroundTime);
                ptat.setBounds(xDataOffset + 500, yDataOffset, 120, 30);
                DisplaySchedulingPanel.add(ptat);

                JLabel pwt = createHeaderLabel(""+tempProcess[i].waitingTime);
                pwt.setBounds(xDataOffset + 600, yDataOffset, 120, 30);
                DisplaySchedulingPanel.add(pwt);

                JLabel prt = createHeaderLabel(""+tempProcess[i].responseTime);
                prt.setBounds(xDataOffset + 700, yDataOffset, 120, 30);
                DisplaySchedulingPanel.add(prt);
                
                  yDataOffset += 40;
                }
            }
        }

        if (!processInCycle) {
            // Find the next arrival time
            int nextArrivalTime = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if (remainingBurstTime[i] > 0 && tempProcess[i].arrivalTime > currentTime) {
                    nextArrivalTime = Math.min(nextArrivalTime, tempProcess[i].arrivalTime);
                }
            }

            // If there is a future process, advance the current time to its arrival
            if (nextArrivalTime != Integer.MAX_VALUE) {
                currentTime = nextArrivalTime;
            } else {
                currentTime++; // Otherwise, just increment the time by one unit
            }
        }
    }
            DisplaySchedulingPanel.setPreferredSize(new Dimension(620, yDataOffset + 20));

        // Repaint the destroyPanel to reflect changes
        DisplaySchedulingPanel.revalidate();
        DisplaySchedulingPanel.repaint();
        for(int i =0; i<n; i++){
            process[i].setStatus("Running");
        }
    }//GEN-LAST:event_rrButtonActionPerformed

    private void sjfNonPremButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sjfNonPremButtonActionPerformed
    if(n == 0){
            JOptionPane.showMessageDialog(null, "NO PROCESS CREATED.");
            return;
        }     // Assume tempProcess array is defined and populated
    Process[] tempProcess = process;

    int[] remainingBurstTime = new int[n];
    boolean[] isFirstResponse = new boolean[n];
    int[] responseTimes = new int[n];
    
    for (int i = 0; i < n; i++) {
        remainingBurstTime[i] = tempProcess[i].burstTime;
        isFirstResponse[i] = true;
    }

    int completed = 0;
    int currentTime = 0;
    DisplaySchedulingPanel.removeAll();
        DisplaySchedulingPanel.setLayout(null); // Set layout to null for absolute positioning

        // Define initial coordinates for headers and data
        int xHeaderOffset = 10;
        int yHeaderOffset = 10;
        int xDataOffset = 10;
        int yDataOffset = 40;

        // Create header labels
        JLabel id = createHeaderLabel("ID");
        id.setBounds(xHeaderOffset, yHeaderOffset, 80, 30);
        DisplaySchedulingPanel.add(id);

        JLabel name = createHeaderLabel("Name");
        name.setBounds(xHeaderOffset + 100, yHeaderOffset, 150, 30);
        DisplaySchedulingPanel.add(name);

        JLabel at = createHeaderLabel("AT");
        at.setBounds(xHeaderOffset + 200, yHeaderOffset, 120, 30);
       DisplaySchedulingPanel.add(at);
       
        JLabel bt = createHeaderLabel("BT");
        bt.setBounds(xHeaderOffset + 300, yHeaderOffset, 120, 30);
        DisplaySchedulingPanel.add(bt);
        
        JLabel ct = createHeaderLabel("CT");
        ct.setBounds(xHeaderOffset + 400, yHeaderOffset, 120, 30);
        DisplaySchedulingPanel.add(ct);
        
        JLabel tat = createHeaderLabel("TAT");
        tat.setBounds(xHeaderOffset + 500, yHeaderOffset, 120, 30);
        DisplaySchedulingPanel.add(tat);
        
        JLabel wt = createHeaderLabel("WT");
        wt.setBounds(xHeaderOffset + 600, yHeaderOffset, 120, 30);
        DisplaySchedulingPanel.add(wt);
        
        JLabel rt = createHeaderLabel("RT");
        rt.setBounds(xHeaderOffset + 700, yHeaderOffset, 120, 30);
        DisplaySchedulingPanel.add(rt);
    while (completed != n) {
        int shortest = -1;
        int minBurstTime = Integer.MAX_VALUE;
        boolean foundProcess = false;

        for (int i = 0; i < n; i++) {
            if (tempProcess[i].arrivalTime <= currentTime && remainingBurstTime[i] > 0 && tempProcess[i].burstTime < minBurstTime) {
                minBurstTime = tempProcess[i].burstTime;
                shortest = i;
                foundProcess = true;
            }
        }

        if (!foundProcess) {
            currentTime++;
            continue;
        }

        if (isFirstResponse[shortest]) {
            responseTimes[shortest] = currentTime - tempProcess[shortest].arrivalTime;
            isFirstResponse[shortest] = false;
        }

        currentTime += tempProcess[shortest].burstTime;
        remainingBurstTime[shortest] = 0;
        completed++;

        tempProcess[shortest].completionTime = currentTime;
        tempProcess[shortest].turnAroundTime = tempProcess[shortest].completionTime - tempProcess[shortest].arrivalTime;
        tempProcess[shortest].waitingTime = tempProcess[shortest].turnAroundTime - tempProcess[shortest].burstTime;
        tempProcess[shortest].responseTime = responseTimes[shortest];

        JLabel pid = createHeaderLabel(""+tempProcess[shortest].id);
                pid.setBounds(xDataOffset, yDataOffset, 80, 30);
                DisplaySchedulingPanel.add(pid);

                JLabel pname = createHeaderLabel(tempProcess[shortest].name);
                pname.setBounds(xDataOffset + 100, yDataOffset, 150, 30);
                DisplaySchedulingPanel.add(pname);

                JLabel pat = createHeaderLabel(""+tempProcess[shortest].arrivalTime);
                pat.setBounds(xDataOffset + 200, yDataOffset, 120, 30);
               DisplaySchedulingPanel.add(pat);

                JLabel pbt = createHeaderLabel(""+tempProcess[shortest].burstTime);
                pbt.setBounds(xDataOffset + 300, yDataOffset, 120, 30);
                DisplaySchedulingPanel.add(pbt);

                JLabel pct = createHeaderLabel(""+tempProcess[shortest].completionTime);
                pct.setBounds(xDataOffset + 400, yDataOffset, 120, 30);
                DisplaySchedulingPanel.add(pct);

                JLabel ptat = createHeaderLabel(""+tempProcess[shortest].turnAroundTime);
                ptat.setBounds(xDataOffset + 500, yDataOffset, 120, 30);
                DisplaySchedulingPanel.add(ptat);

                JLabel pwt = createHeaderLabel(""+tempProcess[shortest].waitingTime);
                pwt.setBounds(xDataOffset + 600, yDataOffset, 120, 30);
                DisplaySchedulingPanel.add(pwt);

                JLabel prt = createHeaderLabel(""+tempProcess[shortest].responseTime);
                prt.setBounds(xDataOffset + 700, yDataOffset, 120, 30);
                DisplaySchedulingPanel.add(prt);
                
                  yDataOffset += 40;
    }
    
        DisplaySchedulingPanel.setPreferredSize(new Dimension(620, yDataOffset + 20));

        // Repaint the destroyPanel to reflect changes
        DisplaySchedulingPanel.revalidate();
        DisplaySchedulingPanel.repaint();
        for(int i =0; i<n; i++){
            process[i].setStatus("Running");
        }
    }//GEN-LAST:event_sjfNonPremButtonActionPerformed

    private void fcfsPremButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fcfsPremButtonActionPerformed
        if(n == 0){
            JOptionPane.showMessageDialog(null, "NO PROCESS CREATED.");
            return;
        }
    int currentTime = 0;
    int totalWaitingTime = 0;
    int totalTurnaroundTime = 0;

    // Sort the processes based on their arrival times
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            if (process[i].arrivalTime > process[j].arrivalTime) {
                // Swap the processes
                Process temp = process[i];
                process[i] = process[j];
                process[j] = temp;
            }
        }
    }

    // Perform FCFS scheduling
    for (Process p : process) {
        if (p != null) { 
            // Update the current time
            if (p.arrivalTime > currentTime) {
                currentTime = p.arrivalTime;
            }

            // Calculate the completion time
            p.completionTime = currentTime + p.burstTime;
            currentTime = p.completionTime;

            // Calculate the waiting time, turnaround time, and response time
            p.waitingTime = p.completionTime - p.arrivalTime - p.burstTime;
            p.turnAroundTime = p.completionTime - p.arrivalTime;
            p.responseTime = p.waitingTime;

            // Update the total waiting time and total turnaround time
            totalWaitingTime += p.waitingTime;
            totalTurnaroundTime += p.turnAroundTime;
        }
    }

    // Calculate the average waiting time and average turnaround time
    double avgWaitingTime = (double) totalWaitingTime / n;
    double avgTurnaroundTime = (double) totalTurnaroundTime / n;

            DisplaySchedulingPanel.removeAll();
        DisplaySchedulingPanel.setLayout(null); // Set layout to null for absolute positioning

        // Define initial coordinates for headers and data
        int xHeaderOffset = 10;
        int yHeaderOffset = 10;
        int xDataOffset = 10;
        int yDataOffset = 40;

        // Create header labels
        JLabel id = createHeaderLabel("ID");
        id.setBounds(xHeaderOffset, yHeaderOffset, 80, 30);
        DisplaySchedulingPanel.add(id);

        JLabel name = createHeaderLabel("Name");
        name.setBounds(xHeaderOffset + 100, yHeaderOffset, 150, 30);
        DisplaySchedulingPanel.add(name);

        JLabel at = createHeaderLabel("AT");
        at.setBounds(xHeaderOffset + 200, yHeaderOffset, 120, 30);
       DisplaySchedulingPanel.add(at);
       
        JLabel bt = createHeaderLabel("BT");
        bt.setBounds(xHeaderOffset + 300, yHeaderOffset, 120, 30);
        DisplaySchedulingPanel.add(bt);
        
        JLabel ct = createHeaderLabel("CT");
        ct.setBounds(xHeaderOffset + 400, yHeaderOffset, 120, 30);
        DisplaySchedulingPanel.add(ct);
        
        JLabel tat = createHeaderLabel("TAT");
        tat.setBounds(xHeaderOffset + 500, yHeaderOffset, 120, 30);
        DisplaySchedulingPanel.add(tat);
        
        JLabel wt = createHeaderLabel("WT");
        wt.setBounds(xHeaderOffset + 600, yHeaderOffset, 120, 30);
        DisplaySchedulingPanel.add(wt);
        
        JLabel rt = createHeaderLabel("RT");
        rt.setBounds(xHeaderOffset + 700, yHeaderOffset, 120, 30);
        DisplaySchedulingPanel.add(rt);
        JLabel awt = createHeaderLabel("AWT");
        awt.setBounds(xHeaderOffset + 750, yHeaderOffset, 120, 30);
        DisplaySchedulingPanel.add(awt);
        JLabel atat = createHeaderLabel("ATAT");
        atat.setBounds(xHeaderOffset + 800, yHeaderOffset, 120, 30);
        DisplaySchedulingPanel.add(atat);
        JLabel pawt = createHeaderLabel(""+avgWaitingTime);
        pawt.setBounds(xDataOffset + 750, yDataOffset, 120, 30);
        DisplaySchedulingPanel.add(pawt);
        JLabel patat = createHeaderLabel(""+avgTurnaroundTime);
        patat.setBounds(xDataOffset + 800, yDataOffset, 120, 30);
        DisplaySchedulingPanel.add(patat);
        for (Process p : process) {
            if (p != null) { 
                JLabel pid = createHeaderLabel(""+p.id);
                pid.setBounds(xDataOffset, yDataOffset, 80, 30);
                DisplaySchedulingPanel.add(pid);

                JLabel pname = createHeaderLabel(p.name);
                pname.setBounds(xDataOffset + 100, yDataOffset, 150, 30);
                DisplaySchedulingPanel.add(pname);

                JLabel pat = createHeaderLabel(""+p.arrivalTime);
                pat.setBounds(xDataOffset + 200, yDataOffset, 120, 30);
               DisplaySchedulingPanel.add(pat);

                JLabel pbt = createHeaderLabel(""+p.burstTime);
                pbt.setBounds(xDataOffset + 300, yDataOffset, 120, 30);
                DisplaySchedulingPanel.add(pbt);

                JLabel pct = createHeaderLabel(""+p.completionTime);
                pct.setBounds(xDataOffset + 400, yDataOffset, 120, 30);
                DisplaySchedulingPanel.add(pct);

                JLabel ptat = createHeaderLabel(""+p.turnAroundTime);
                ptat.setBounds(xDataOffset + 500, yDataOffset, 120, 30);
                DisplaySchedulingPanel.add(ptat);

                JLabel pwt = createHeaderLabel(""+p.waitingTime);
                pwt.setBounds(xDataOffset + 600, yDataOffset, 120, 30);
                DisplaySchedulingPanel.add(pwt);

                JLabel prt = createHeaderLabel(""+p.responseTime);
                prt.setBounds(xDataOffset + 700, yDataOffset, 120, 30);
                DisplaySchedulingPanel.add(prt);
                
                  yDataOffset += 40;
//                System.out.println(p.id + "\t" + p.completionTime + "\t" + p.waitingTime + "\t" + p.turnAroundTime + "\t" + p.responseTime);
            }
        }
        
        DisplaySchedulingPanel.setPreferredSize(new Dimension(620, yDataOffset + 20));

        // Repaint the destroyPanel to reflect changes
        DisplaySchedulingPanel.revalidate();
        DisplaySchedulingPanel.repaint();
        for(int i =0; i<n; i++){
            process[i].setStatus("Running");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_fcfsPremButtonActionPerformed

    private void goBack3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBack3MouseClicked
        IOmanagmentPanel.setVisible(false);
        MainPanel.setVisible(true);
    }//GEN-LAST:event_goBack3MouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        IOmanagmentPanel.setVisible(true);
        MainPanel.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void FramesizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FramesizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FramesizeActionPerformed

    private void printerRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printerRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_printerRActionPerformed

    private void keyboardRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyboardRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keyboardRActionPerformed

    private void mouseRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mouseRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mouseRActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int id;
        String device;
        if(!mouseR.isSelected()&&!keyboardR.isSelected()&&!printerR.isSelected()){
            JOptionPane.showMessageDialog(null,"Please Select an I/O Device.");
            return;
        }
        try{
            id = Integer.parseInt(IOProcessID.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Please Enter Valid ID in numbers only.");
            return;
        }
        if(mouseR.isSelected()){
            device = "Mouse";
        }else if(keyboardR.isSelected()){
            device = "Keyboard";
        }else{
            device = "Printer";
        }
        boolean findId = false;
        for(int i=0;i<n;i++){
            if(id == process[i].id){
                if(process[i].status.equals("Blocked")){
                    JOptionPane.showMessageDialog(null,"Process Already Busy with an interrupt");
                    return;
                }
                if(!process[i].status.equals("Running")){
                    JOptionPane.showMessageDialog(null,"Process is Not Running.\n Status: "+process[i].status);
                    return;
                }
                process[i].status = "Blocked";
                JOptionPane.showMessageDialog(null,"Process: "+process[i].name+" with ID: "+process[i].id+" has I/O interrupt of "+device);
                findId = true;
                break;
            }
        }
        if(findId == false){
            JOptionPane.showMessageDialog(null,"ID NOT FOUND.");
            return;
        }
        IOProcessID.setText("");
        

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int id = 0;
        try{
           id = Integer.parseInt(IOProcessID1.getText()); 
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Please Enter Valid ID. (In numbers only)");
            return;
        }
        boolean findId = false;
        for(int i=0;i<n;i++){
            if(id == process[i].id){
                if(process[i].status.equals("Blocked")){
                    process[i].status = "Ready";
                    JOptionPane.showMessageDialog(null,"Process: "+process[i].name+" with ID: "+process[i].id+" has left the I/O Operation "+"\n Status: "+process[i].status);
                    return;
                }
                if(!process[i].status.equals("Running")){
                    JOptionPane.showMessageDialog(null,"Process is Not Running.\n Status: "+process[i].status);
                    return;
                }
                findId = true;
                break;
            }
        }
        if(findId == false){
            JOptionPane.showMessageDialog(null,"ID NOT FOUND.");
            return;
        }
        IOProcessID1.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void goBack4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBack4MouseClicked
        OtherOperationPanel.setVisible(false);
        MainPanel.setVisible(true);
        
// TODO add your handling code here:
    }//GEN-LAST:event_goBack4MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        MainPanel.setVisible(false);
         
        OtherOperationPanel.setVisible(true);
         SocketPanel.setVisible(true);
 
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed
private Thread serverThread;
private volatile boolean running;

private void startServer(Boolean var) {
    if (var) {
        running = true;
        serverThread = new Thread(this::Server);
        serverThread.start();
    } else {
        running = false;
        if (serverThread != null) {
            try {
                serverThread.join();
            } catch (InterruptedException e) {
                JOptionPane.showMessageDialog(null, "Error stopping server thread. " + e);
            }
        }
    }
}

private void Server() {
    ServerSocket serverSocket = null;
    try {
        serverSocket = new ServerSocket(1234);
        JOptionPane.showMessageDialog(null, "Server started on port 1234.");
        
        while (running) {
            try {
                serverSocket.setSoTimeout(1000);  // Set timeout for accept() method to check running flag periodically
                Socket s = serverSocket.accept();
                DataInputStream dt = new DataInputStream(s.getInputStream());
                String message = dt.readUTF();
                clientMessage.setText("" + message);
                s.close();  // Close the client socket after handling the message
            } catch (SocketTimeoutException e) {
                // Timeout to check the running condition
            } catch (IOException e) {
                if (!running) {
                    JOptionPane.showMessageDialog(null, "Server stopped.");
                    break;
                }
                JOptionPane.showMessageDialog(null, "ERROR CONNECTING. " + e);
            }
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Could not start server. " + e);
    } finally {
        try {
            if (serverSocket != null && !serverSocket.isClosed()) {
                serverSocket.close();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error closing server socket. " + e);
        }
    }
}


    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        startServer(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        startServer(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed
private void Client(String message) {
    try (Socket socket = new Socket("localhost", 1234);
         DataOutputStream dt = new DataOutputStream(socket.getOutputStream())) {
        dt.writeUTF(message);
        
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error connecting to server. " + e);
    }
}


    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        String message = clientMessageField.getText();
        Client(message);
// TODO add your handling code here:
            
    }//GEN-LAST:event_jButton10ActionPerformed

    private void ApplyLruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApplyLruActionPerformed
   FIFO.setVisible(true);
    FIFOScroll.setVisible(true);
    String pagesStr = referstring.getText().trim(); // Example input from referstring JTextField

    int frameSize = Integer.parseInt(Framesize.getText().trim()); // Example input from Framesize JTextField

    // Convert pagesStr to an array of integers
    FIFO.removeAll();
    FIFO.setLayout(new BorderLayout()); // Set layout to BorderLayout for proper positioning

    // Split pagesStr into individual digits
    int[] pages = new int[pagesStr.length()];
    for (int i = 0; i < pagesStr.length(); i++) {
        pages[i] = Character.getNumericValue(pagesStr.charAt(i));
    }

    // To represent set of current pages
    HashSet<Integer> s = new HashSet<>(frameSize);

    // To store least recently used indexes of pages
    HashMap<Integer, Integer> indexes = new HashMap<>();

    int page_faults = 0;
    int page_hits = 0;

    // Table model to hold the data
    DefaultTableModel tableModel = new DefaultTableModel();
    tableModel.addColumn("Step");
    tableModel.addColumn("Current Page");
    tableModel.addColumn("Page Fault/Hit");
    tableModel.addColumn("Current Frames");

    for (int i = 0; i < pages.length; i++) {
        int currentPage = pages[i];
        String status;

        // Check if the set can hold more pages
        if (s.size() < frameSize) {
            // Insert it into set if not present already which represents page fault
            if (!s.contains(currentPage)) {
                s.add(currentPage);
                page_faults++;
                status = "Page Fault";
            } else {
                page_hits++;
                status = "Page Hit";
            }
            indexes.put(currentPage, i);
        } else {
            // If the set is full then need to perform LRU
            if (!s.contains(currentPage)) {
                int lru = Integer.MAX_VALUE, val = Integer.MIN_VALUE;

                Iterator<Integer> itr = s.iterator();
                while (itr.hasNext()) {
                    int temp = itr.next();
                    if (indexes.get(temp) < lru) {
                        lru = indexes.get(temp);
                        val = temp;
                    }
                }

                s.remove(val);
                indexes.remove(val);

                s.add(currentPage);
                page_faults++;
                status = "Page Fault";
            } else {
                page_hits++;
                status = "Page Hit";
            }
            indexes.put(currentPage, i);
        }

        tableModel.addRow(new Object[]{i + 1, currentPage, status, s.toString()});
    }

    tableModel.addRow(new Object[]{"", "", "Page Faults: " + page_faults, ""});
    tableModel.addRow(new Object[]{"", "", "Page Hits: " + page_hits, ""});

    JTable table = new JTable(tableModel);
    JScrollPane scrollPane = new JScrollPane(table);
    table.setFillsViewportHeight(true);

    FIFO.add(scrollPane, BorderLayout.CENTER);

    FIFO.revalidate();
    FIFO.repaint();
    }//GEN-LAST:event_ApplyLruActionPerformed

    private void ApplyFifoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApplyFifoActionPerformed
    FIFO.setVisible(true);
    FIFOScroll.setVisible(true);
    String pagesStr = referstring.getText().trim(); // Example input from ;

    int frameSize = Integer.parseInt(Framesize.getText().trim()); // Example input from ;
    // Convert pagesStr to an array of integers
    FIFO.removeAll();
    FIFO.setLayout(new BorderLayout()); // Set layout to BorderLayout for proper positioning

    int[] pages = new int[pagesStr.length()];
    for (int i = 0; i < pagesStr.length(); i++) {
        pages[i] = Character.getNumericValue(pagesStr.charAt(i));
    }
    // Validate frameSize to not exceed memorySize

    // FIFO queue to hold the current pages in memory
    Queue<Integer> fifoQueue = new ArrayDeque<>();
    int pageFaults = 0;
    int pageHits = 0;

    // Table model to hold the data
    DefaultTableModel tableModel = new DefaultTableModel();
    tableModel.addColumn("Step");
    tableModel.addColumn("Current Page");
    tableModel.addColumn("Page Fault/Hit");
    tableModel.addColumn("Current Frames");
    
    // Process each page in the reference string
    for (int i = 0; i < pages.length; i++) {
        int currentPage = pages[i];
        String status;

        // Check if current page is already in memory
        if (!fifoQueue.contains(currentPage)) {
            // Page fault, because current page is not in memory
            pageFaults++;
            status = "Page Fault";

            // If the FIFO queue is full, remove the oldest page (front of the queue)
            if (fifoQueue.size() == frameSize) {
                fifoQueue.poll();
            }

            // Add current page to the FIFO queue
            fifoQueue.offer(currentPage);
        } else {
            // Page hit, because current page is already in memory
            pageHits++;
            status = "Page Hit";
        }

        // Add the current step information to the table
        tableModel.addRow(new Object[]{i + 1, currentPage, status, fifoQueue.toString()});
    }

    // Add final counts of page faults and hits
    tableModel.addRow(new Object[]{"", "", "Total Faults: " + pageFaults, ""});
    tableModel.addRow(new Object[]{"", "", "Total Hits: " + pageHits, ""});

    // Create the table with the model
    JTable table = new JTable(tableModel);
    JScrollPane scrollPane = new JScrollPane(table);
    table.setFillsViewportHeight(true);

    // Add the scroll pane (with the table) to the FIFO panel
    FIFO.add(scrollPane, BorderLayout.CENTER);

    // Repaint the FIFO panel to reflect changes
    FIFO.revalidate();
    FIFO.repaint();
    }//GEN-LAST:event_ApplyFifoActionPerformed

    private void ApplyLru1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApplyLru1ActionPerformed
        PageSchedulingPanel.setVisible(true);
        PaggingPanel.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_ApplyLru1ActionPerformed

    private void ApplyLru2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApplyLru2ActionPerformed
        PaggingPanel.setVisible(true);
        PageSchedulingPanel.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_ApplyLru2ActionPerformed

    private void physicaladdressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_physicaladdressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_physicaladdressActionPerformed

    private void PagingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagingActionPerformed
     String physicalAddressInput = physicaladdress.getText().trim();
    String logicalAddressInput = logicaladdress.getText().trim();
    String pageSizeInput = pagesize.getText().trim();
    
    // Convert inputs to powers of 2 (bits)
    long physicalAddressBits = convertToBits(physicalAddressInput);
    long logicalAddressBits = convertToBits(logicalAddressInput);
    long pageSizeBits = convertToBits(pageSizeInput);
    
    // Make the FIFO panel and its scroll pane visible
    FIFO.setVisible(true);
    FIFOScroll.setVisible(true);
    
    // Clear previous components and set layout
    FIFO.removeAll();
    FIFO.setLayout(null);

    // Calculate the number of pages and frames
    long noOfPages = logicalAddressBits / pageSizeBits;
    long noOfFrames = physicalAddressBits / pageSizeBits;

    // The number of entries is equal to the number of pages
    long entries = noOfPages;

    // Typically, the size of the page table is the number of entries
    long sizeOfPageTable = entries;

    // Print results to the panel
    JLabel nop = createHeaderLabel("NO OF PAGES ARE: " + noOfPages);
    nop.setBounds(7, 5, 600, 30);
    FIFO.add(nop);

    JLabel nof = createHeaderLabel("NO OF FRAMES ARE: " + noOfFrames);
    nof.setBounds(7, 30, 600, 30);
    FIFO.add(nof);

    JLabel e = createHeaderLabel("NO OF ENTRIES ARE: " + entries);
    e.setBounds(7, 55, 600, 30);
    FIFO.add(e);

    JLabel sop = createHeaderLabel("SIZE OF PAGE TABLE IS: " + sizeOfPageTable);
    sop.setBounds(7, 80, 600, 30);
    FIFO.add(sop);

    // Set the preferred size of the FIFO panel
    FIFO.setPreferredSize(new Dimension(620, 120));

    // Repaint the panel to reflect changes
    FIFO.revalidate();
    FIFO.repaint();
}

private long convertToBits(String input) {
    input = input.toUpperCase();
    if (input.endsWith("GB")) {
        return Long.parseLong(input.replace("GB", "").trim()) * 1024 * 1024 * 1024 * 8; // Convert GB to bits
    } else if (input.endsWith("MB")) {
        return Long.parseLong(input.replace("MB", "").trim()) * 1024 * 1024 * 8; // Convert MB to bits
    } else if (input.endsWith("KB")) {
        return Long.parseLong(input.replace("KB", "").trim()) * 1024 * 8; // Convert KB to bits
    } else {
        return Long.parseLong(input.trim()) * 8; // Assume input is already in bits if no unit is specified
    }
    }//GEN-LAST:event_PagingActionPerformed

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        MainPanel.setVisible(false);
        createPanel.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel28MouseClicked
private JLabel createHeaderLabel3(String text) {
    JLabel label = new JLabel(text);
    label.setFont(new Font("Arial", Font.BOLD, 14));
    return label;
}

private JLabel createHeaderLabel1(String text) {
    JLabel label = new JLabel(text);
    label.setFont(new java.awt.Font("SimSun", 1, 14));
    label.setForeground(new Color(170,171,171));
    return label;
}
    private int comparePriority(String priority1, String priority2) {
    // Assigning numerical values to priorities
    int priorityValue1 = getPriorityValue(priority1);
    int priorityValue2 = getPriorityValue(priority2);

    // Compare priorities
    return Integer.compare(priorityValue1, priorityValue2);
    }
private int getPriorityValue(String priority) {
    switch (priority.toLowerCase()) {
        case "high":
            return 3;
        case "medium":
            return 2;
        case "low":
            return 1;
        default:
            return 0;
    }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(nexOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nexOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nexOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nexOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                nexOS os = new nexOS();
                new nexOS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ApplyFifo;
    private javax.swing.JButton ApplyLru;
    private javax.swing.JButton ApplyLru1;
    private javax.swing.JButton ApplyLru2;
    private javax.swing.JPanel DisplaySchedulingPanel;
    private javax.swing.JPanel FIFO;
    private javax.swing.JScrollPane FIFOScroll;
    private javax.swing.JTextField Framesize;
    private javax.swing.JTextField IOProcessID;
    private javax.swing.JTextField IOProcessID1;
    private javax.swing.JPanel IOmanagmentPanel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton MemoryManag;
    private javax.swing.JPanel MemoryManagement;
    private javax.swing.JPanel OtherOperationPanel;
    private javax.swing.JPanel PageSchedulingPanel;
    private javax.swing.JPanel PaggingPanel;
    private javax.swing.JButton Paging;
    private javax.swing.JButton ProcessManagementButton;
    private javax.swing.JPanel ProcessPanel;
    private javax.swing.JPanel SchedulingPanel;
    private javax.swing.JPanel SocketPanel;
    private javax.swing.JButton blockButton;
    private javax.swing.JButton changePriorityButton;
    private javax.swing.JTextField changePriorityPId;
    private javax.swing.JComboBox<String> changePriorityPPriority;
    private javax.swing.JPanel changePriorityPanel;
    private javax.swing.JLabel clientMessage;
    private javax.swing.JTextField clientMessageField;
    private javax.swing.JPanel createPanel;
    private javax.swing.JPanel createPanel3;
    private javax.swing.JButton destroyButton;
    private javax.swing.JPanel destroyPanel;
    private javax.swing.JScrollPane destroyScroll;
    private javax.swing.JButton dispatchButton;
    private javax.swing.JPanel displayPPanel;
    private javax.swing.JScrollPane displayPScroll;
    private javax.swing.JButton fcfsButton;
    private javax.swing.JButton fcfsPremButton;
    private javax.swing.JLabel goBack;
    private javax.swing.JLabel goBack1;
    private javax.swing.JLabel goBack2;
    private javax.swing.JLabel goBack3;
    private javax.swing.JLabel goBack4;
    private javax.swing.ButtonGroup io;
    private javax.swing.JPanel ioIn;
    private javax.swing.JPanel ioOut;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel keyboard;
    private javax.swing.JRadioButton keyboardR;
    private javax.swing.JTextField logicaladdress;
    private javax.swing.JButton maxProcessButton;
    private javax.swing.JTextField maxProcessField;
    private javax.swing.JLabel mouse;
    private javax.swing.JRadioButton mouseR;
    private javax.swing.JTextField pagesize;
    private javax.swing.JTextField physicaladdress;
    private javax.swing.JLabel printer;
    private javax.swing.JRadioButton printerR;
    private javax.swing.JButton processButton;
    private javax.swing.JTextField referstring;
    private javax.swing.JButton resumeButton;
    private javax.swing.JButton rrButton;
    private javax.swing.JButton sjfButton;
    private javax.swing.JButton sjfNonPremButton;
    private javax.swing.JButton suspendButton;
    private javax.swing.JPanel suspendPanel;
    private javax.swing.JScrollPane suspendScroll;
    private javax.swing.JButton wakeButton;
    // End of variables declaration//GEN-END:variables

}
