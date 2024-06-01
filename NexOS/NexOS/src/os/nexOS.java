
package os;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import os.Process;

public class nexOS extends javax.swing.JFrame {
    private Process[] process = new Process[100];
    public int n;

    public nexOS() {
        
        initComponents();
        // Set initial visibility
        MainPanel.setVisible(false);
        createPanel.setVisible(true);
        createPanel2.setVisible(false);
        ProcessPanel.setVisible(false);
        destroyScroll.setVisible(false);
        suspendScroll.setVisible(false);
        changePriorityPanel.setVisible(false);
        MemoryManagement.setVisible(false);
        SchedulingPanel.setVisible(false);
        IOmanagmentPanel.setVisible(false);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        IOmanagmentPanel = new javax.swing.JPanel();
        goBack3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        MemoryManagement = new javax.swing.JPanel();
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
        jButton3 = new javax.swing.JButton();
        MemoryManag = new javax.swing.JButton();
        ProcessManagementButton = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        createPanel = new javax.swing.JPanel();
        createPanel2 = new javax.swing.JPanel();
        createPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        maxProcessField = new javax.swing.JTextField();
        maxProcessButton = new javax.swing.JButton();

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

        IOmanagmentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        goBack3.setText("                                                            ");
        goBack3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goBack3MouseClicked(evt);
            }
        });
        IOmanagmentPanel.add(goBack3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/memory-management.png"))); // NOI18N
        IOmanagmentPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 540));

        getContentPane().add(IOmanagmentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 540));

        MemoryManagement.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jButton3.setBackground(new java.awt.Color(22, 41, 42));
        jButton3.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(170, 171, 171));
        jButton3.setText("Other operations");
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

        createPanel2.setBackground(new java.awt.Color(22, 41, 42));
        createPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        createPanel.add(createPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 440, 260));

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
      // Clear existing components from suspendPanel
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
        // Clear existing components from suspendPanel
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
        // Clear existing components from suspendPanel
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
        // Clear existing components from destroyPanel
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
         n = Integer.parseInt(maxProcessField.getText());
         
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
    createPanel2.setVisible(false);
    MainPanel.setVisible(true);
         
    }//GEN-LAST:event_maxProcessButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String input_id = changePriorityPId.getText();
        int id = Integer.parseInt(input_id);
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
        System.out.println("Process\tCompletion Time\tWaiting Time\tTurnaround Time\tResponse Time");
        for (Process p : process) {
            if (p != null) { 
                System.out.println(p.id + "\t" + p.completionTime + "\t" + p.waitingTime + "\t" + p.turnAroundTime + "\t" + p.responseTime);
            }
        }
        System.out.println("Average Waiting Time: " + avgWaitingTime);
        System.out.println("Average Turnaround Time: " + avgTurnaroundTime);
    }//GEN-LAST:event_fcfsButtonActionPerformed

    private void sjfButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sjfButtonActionPerformed
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

            System.out.println("Process ID: " + tempProcess[shortest].name);
            System.out.println("Completion Time: " + tempProcess[shortest].completionTime);
            System.out.println("Turnaround Time: " + tempProcess[shortest].turnAroundTime);
            System.out.println("Waiting Time: " + tempProcess[shortest].waitingTime);
            System.out.println("Response Time: " + tempProcess[shortest].responseTime);
            System.out.println("");
        }
    }
    }//GEN-LAST:event_sjfButtonActionPerformed

    private void rrButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rrButtonActionPerformed
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

                    System.out.println("Process ID: " + tempProcess[i].id);
                    System.out.println("Completion Time: " + tempProcess[i].completionTime);
                    System.out.println("Turnaround Time: " + tempProcess[i].turnAroundTime);
                    System.out.println("Waiting Time: " + tempProcess[i].waitingTime);
                    System.out.println("Response Time: " + tempProcess[i].responseTime);
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
    }//GEN-LAST:event_rrButtonActionPerformed

    private void sjfNonPremButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sjfNonPremButtonActionPerformed
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

        System.out.println("Process ID: " + tempProcess[shortest].name);
        System.out.println("Completion Time: " + tempProcess[shortest].completionTime);
        System.out.println("Turnaround Time: " + tempProcess[shortest].turnAroundTime);
        System.out.println("Waiting Time: " + tempProcess[shortest].waitingTime);
        System.out.println("Response Time: " + tempProcess[shortest].responseTime);
        System.out.println("");
    }
    }//GEN-LAST:event_sjfNonPremButtonActionPerformed

    private void fcfsPremButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fcfsPremButtonActionPerformed
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
    System.out.println("Process\tCompletion Time\tWaiting Time\tTurnaround Time\tResponse Time");
    for (Process p : process) {
        if (p != null) { 
            System.out.println(p.id + "\t" + p.completionTime + "\t" + p.waitingTime + "\t" + p.turnAroundTime + "\t" + p.responseTime);
        }
    }
    System.out.println("Average Waiting Time: " + avgWaitingTime);
    System.out.println("Average Turnaround Time: " + avgTurnaroundTime);
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
    private javax.swing.JPanel DisplaySchedulingPanel;
    private javax.swing.JPanel IOmanagmentPanel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton MemoryManag;
    private javax.swing.JPanel MemoryManagement;
    private javax.swing.JButton ProcessManagementButton;
    private javax.swing.JPanel ProcessPanel;
    private javax.swing.JPanel SchedulingPanel;
    private javax.swing.JButton blockButton;
    private javax.swing.JButton changePriorityButton;
    private javax.swing.JTextField changePriorityPId;
    private javax.swing.JComboBox<String> changePriorityPPriority;
    private javax.swing.JPanel changePriorityPanel;
    private javax.swing.JPanel createPanel;
    private javax.swing.JPanel createPanel2;
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton maxProcessButton;
    private javax.swing.JTextField maxProcessField;
    private javax.swing.JButton processButton;
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
