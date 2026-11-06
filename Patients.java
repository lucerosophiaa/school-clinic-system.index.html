import java.awt.Color;
import javax.swing.JOptionPane;

import java.util.ArrayList;

public class Patients extends javax.swing.JFrame {

    private static final java.util.ArrayList<PatientData> patientRecords =
            new java.util.ArrayList<>();

    public static void addPatient(PatientData p) {
        patientRecords.add(p);
    }

    private static final java.util.logging.Logger logger =
            java.util.logging.Logger.getLogger(Patients.class.getName());

    public Patients() {
        initComponents();
        txtSearch.setText("Search Student ID or Name");
    txtSearch.setForeground(Color.GRAY);
    refreshPatientData();

    txtSearch.addFocusListener(new java.awt.event.FocusAdapter() {
        @Override
        public void focusGained(java.awt.event.FocusEvent evt) {
            if (txtSearch.getText().equals("Search Student ID or Name")) {
                txtSearch.setText("");
                txtSearch.setForeground(Color.BLACK);
            }
        }

        @Override
        public void focusLost(java.awt.event.FocusEvent evt) {
            if (txtSearch.getText().trim().isEmpty()) {
                txtSearch.setText("Search Student ID or Name");
                txtSearch.setForeground(Color.GRAY);
            }
        }
    });

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFooter = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pnlHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btLogout = new javax.swing.JButton();
        pnlContent = new javax.swing.JPanel();
        pnlMain = new javax.swing.JPanel();
        pnlCards = new javax.swing.JPanel();
        pnlCard1 = new javax.swing.JPanel();
        lblTotalTitle = new javax.swing.JLabel();
        lblTotalPatients = new javax.swing.JLabel();
        pnlCard2 = new javax.swing.JPanel();
        lblTotalTitle1 = new javax.swing.JLabel();
        lblTotalPatients1 = new javax.swing.JLabel();
        pnlCard3 = new javax.swing.JPanel();
        lblTotalTitle2 = new javax.swing.JLabel();
        lblTotalPatients2 = new javax.swing.JLabel();
        pnlCard4 = new javax.swing.JPanel();
        lblTotalTitle3 = new javax.swing.JLabel();
        lblTotalPatients3 = new javax.swing.JLabel();
        pnlBody = new javax.swing.JPanel();
        pnlQuick = new javax.swing.JPanel();
        pnlButtons = new javax.swing.JPanel();
        cmbType = new javax.swing.JComboBox<>();
        btnAddPatient = new javax.swing.JButton();
        lblQuick = new javax.swing.JLabel();
        pnlBottom = new javax.swing.JPanel();
        pnlHistory = new javax.swing.JPanel();
        lblHistoryTitle = new javax.swing.JLabel();
        pnlStockList = new javax.swing.JPanel();
        scrollHistory = new javax.swing.JScrollPane();
        tblHistory = new javax.swing.JTable();
        pnlVisits = new javax.swing.JPanel();
        lblRecents = new javax.swing.JLabel();
        spVisits = new javax.swing.JScrollPane();
        tblRecentVisits = new javax.swing.JTable();
        pnlTop = new javax.swing.JPanel();
        pnlgreeting = new javax.swing.JPanel();
        lblGreeting = new javax.swing.JLabel();
        lblSubstitute = new javax.swing.JLabel();
        pnlSearch = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        pnlSidebar = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        pnlBrand = new javax.swing.JPanel();
        lblPhinmaCOC = new javax.swing.JLabel();
        lblSchoolClinic = new javax.swing.JLabel();
        lblCollege = new javax.swing.JLabel();
        pnlLineWrap = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        pnlMenu = new javax.swing.JPanel();
        btnDashboard = new javax.swing.JButton();
        btnPatients = new javax.swing.JButton();
        btnInventory = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlFooter.setBackground(new java.awt.Color(0, 102, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Authorized clinic staff only");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PHINMA Cagayan de Oro College Clinic Services");

        javax.swing.GroupLayout pnlFooterLayout = new javax.swing.GroupLayout(pnlFooter);
        pnlFooter.setLayout(pnlFooterLayout);
        pnlFooterLayout.setHorizontalGroup(
            pnlFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFooterLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 631, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(21, 21, 21))
        );
        pnlFooterLayout.setVerticalGroup(
            pnlFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFooterLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(pnlFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        getContentPane().add(pnlFooter, java.awt.BorderLayout.SOUTH);

        pnlHeader.setBackground(new java.awt.Color(0, 102, 0));
        pnlHeader.setPreferredSize(new java.awt.Dimension(679, 37));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PHINMA COC School Clinic Recording System");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Logged in:");

        btLogout.setBackground(new java.awt.Color(255, 255, 0));
        btLogout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btLogout.setForeground(new java.awt.Color(0, 152, 0));
        btLogout.setText("Log out");
        btLogout.setBorderPainted(false);
        btLogout.addActionListener(this::btLogoutActionPerformed);

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 521, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(203, 203, 203)
                .addComponent(btLogout)
                .addContainerGap())
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(btLogout))
                .addContainerGap())
        );

        getContentPane().add(pnlHeader, java.awt.BorderLayout.NORTH);

        pnlContent.setBackground(new java.awt.Color(255, 255, 255));
        pnlContent.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 15, 15));
        pnlContent.setLayout(new java.awt.BorderLayout());

        pnlMain.setBackground(new java.awt.Color(255, 255, 255));
        pnlMain.setLayout(new java.awt.BorderLayout(0, 12));

        pnlCards.setBackground(new java.awt.Color(255, 255, 255));
        pnlCards.setPreferredSize(new java.awt.Dimension(100, 95));
        pnlCards.setLayout(new java.awt.GridLayout(1, 4, 10, 0));

        pnlCard1.setBackground(new java.awt.Color(255, 255, 255));
        pnlCard1.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 0, 0, 0, new java.awt.Color(46, 158, 0)));
        pnlCard1.setLayout(new java.awt.GridLayout(2, 1));

        lblTotalTitle.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblTotalTitle.setForeground(new java.awt.Color(85, 85, 85));
        lblTotalTitle.setText("Total Patients");
        pnlCard1.add(lblTotalTitle);

        lblTotalPatients.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTotalPatients.setForeground(new java.awt.Color(17, 17, 17));
        lblTotalPatients.setText("0");
        pnlCard1.add(lblTotalPatients);

        pnlCards.add(pnlCard1);

        pnlCard2.setBackground(new java.awt.Color(255, 255, 255));
        pnlCard2.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 0, 0, 0, new java.awt.Color(46, 158, 0)));
        pnlCard2.setLayout(new java.awt.GridLayout(2, 1));

        lblTotalTitle1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblTotalTitle1.setForeground(new java.awt.Color(85, 85, 85));
        lblTotalTitle1.setText("Students");
        pnlCard2.add(lblTotalTitle1);

        lblTotalPatients1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTotalPatients1.setForeground(new java.awt.Color(17, 17, 17));
        lblTotalPatients1.setText("0");
        pnlCard2.add(lblTotalPatients1);

        pnlCards.add(pnlCard2);

        pnlCard3.setBackground(new java.awt.Color(255, 255, 255));
        pnlCard3.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 0, 0, 0, new java.awt.Color(255, 216, 0)));
        pnlCard3.setLayout(new java.awt.GridLayout(2, 1));

        lblTotalTitle2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblTotalTitle2.setForeground(new java.awt.Color(85, 85, 85));
        lblTotalTitle2.setText("Visitors");
        pnlCard3.add(lblTotalTitle2);

        lblTotalPatients2.setBackground(new java.awt.Color(255, 255, 255));
        lblTotalPatients2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTotalPatients2.setForeground(new java.awt.Color(17, 17, 17));
        lblTotalPatients2.setText("0");
        pnlCard3.add(lblTotalPatients2);

        pnlCards.add(pnlCard3);

        pnlCard4.setBackground(new java.awt.Color(255, 255, 255));
        pnlCard4.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 0, 0, 0, new java.awt.Color(0, 100, 0)));
        pnlCard4.setLayout(new java.awt.GridLayout(2, 1));

        lblTotalTitle3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblTotalTitle3.setForeground(new java.awt.Color(85, 85, 85));
        lblTotalTitle3.setText("Visits Today");
        pnlCard4.add(lblTotalTitle3);

        lblTotalPatients3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTotalPatients3.setForeground(new java.awt.Color(17, 17, 17));
        lblTotalPatients3.setText("0");
        pnlCard4.add(lblTotalPatients3);

        pnlCards.add(pnlCard4);

        pnlMain.add(pnlCards, java.awt.BorderLayout.NORTH);

        pnlBody.setBackground(new java.awt.Color(255, 255, 255));
        pnlBody.setLayout(new java.awt.BorderLayout());

        pnlQuick.setBackground(new java.awt.Color(255, 255, 255));
        pnlQuick.setPreferredSize(new java.awt.Dimension(100, 90));
        pnlQuick.setLayout(new java.awt.BorderLayout());

        pnlButtons.setBackground(new java.awt.Color(255, 255, 255));
        pnlButtons.setLayout(new java.awt.GridLayout(1, 4));

        cmbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALL", "Student", "Staff", "Visitor" }));
        cmbType.addActionListener(this::cmbTypeActionPerformed);
        pnlButtons.add(cmbType);

        btnAddPatient.setBackground(new java.awt.Color(0, 100, 0));
        btnAddPatient.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnAddPatient.setForeground(new java.awt.Color(255, 255, 255));
        btnAddPatient.setText("Add New Patient");
        btnAddPatient.setBorderPainted(false);
        btnAddPatient.addActionListener(this::btnAddPatientActionPerformed);
        pnlButtons.add(btnAddPatient);

        pnlQuick.add(pnlButtons, java.awt.BorderLayout.CENTER);

        lblQuick.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblQuick.setText("Quick Actions");
        pnlQuick.add(lblQuick, java.awt.BorderLayout.NORTH);

        pnlBody.add(pnlQuick, java.awt.BorderLayout.NORTH);

        pnlBottom.setBackground(new java.awt.Color(255, 255, 255));
        pnlBottom.setLayout(new java.awt.BorderLayout(10, 0));

        pnlHistory.setBackground(new java.awt.Color(255, 255, 255));
        pnlHistory.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(207, 216, 207), 1, true));
        pnlHistory.setPreferredSize(new java.awt.Dimension(330, 100));
        pnlHistory.setLayout(new java.awt.BorderLayout());

        lblHistoryTitle.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblHistoryTitle.setText("Visit History");
        lblHistoryTitle.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 10, 8, 10));
        pnlHistory.add(lblHistoryTitle, java.awt.BorderLayout.NORTH);

        pnlStockList.setBackground(new java.awt.Color(255, 255, 255));
        pnlStockList.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 0, 10));
        pnlStockList.setLayout(new javax.swing.BoxLayout(pnlStockList, javax.swing.BoxLayout.LINE_AXIS));

        tblHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Date", "Patient Name", "Reason"
            }
        ));
        scrollHistory.setViewportView(tblHistory);

        pnlStockList.add(scrollHistory);

        pnlHistory.add(pnlStockList, java.awt.BorderLayout.CENTER);

        pnlBottom.add(pnlHistory, java.awt.BorderLayout.EAST);

        pnlVisits.setBackground(new java.awt.Color(255, 255, 255));
        pnlVisits.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(207, 216, 207)));
        pnlVisits.setLayout(new java.awt.BorderLayout());

        lblRecents.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblRecents.setForeground(new java.awt.Color(17, 17, 17));
        lblRecents.setText("Recent Clinic Visits");
        lblRecents.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 10, 8, 10));
        pnlVisits.add(lblRecents, java.awt.BorderLayout.NORTH);

        spVisits.setBackground(new java.awt.Color(255, 255, 255));
        spVisits.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        tblRecentVisits.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Name", "Type", "Last Visit", "Visit Count"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRecentVisits.setGridColor(new java.awt.Color(228, 228, 228));
        tblRecentVisits.setRowHeight(30);
        tblRecentVisits.setSelectionBackground(new java.awt.Color(200, 230, 185));
        tblRecentVisits.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRecentVisitsMouseClicked(evt);
            }
        });
        spVisits.setViewportView(tblRecentVisits);

        pnlVisits.add(spVisits, java.awt.BorderLayout.CENTER);

        pnlBottom.add(pnlVisits, java.awt.BorderLayout.CENTER);

        pnlBody.add(pnlBottom, java.awt.BorderLayout.CENTER);

        pnlMain.add(pnlBody, java.awt.BorderLayout.CENTER);

        pnlContent.add(pnlMain, java.awt.BorderLayout.CENTER);

        pnlTop.setBackground(new java.awt.Color(255, 255, 255));
        pnlTop.setPreferredSize(new java.awt.Dimension(100, 70));
        pnlTop.setLayout(new java.awt.BorderLayout());

        pnlgreeting.setBackground(new java.awt.Color(255, 255, 255));
        pnlgreeting.setLayout(new java.awt.GridLayout(2, 1));

        lblGreeting.setBackground(new java.awt.Color(255, 255, 255));
        lblGreeting.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblGreeting.setForeground(new java.awt.Color(17, 17, 17));
        lblGreeting.setText("Good Day,");
        pnlgreeting.add(lblGreeting);

        lblSubstitute.setBackground(new java.awt.Color(255, 255, 255));
        lblSubstitute.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblSubstitute.setForeground(new java.awt.Color(85, 85, 85));
        lblSubstitute.setText("Here is your clinic overview for today");
        pnlgreeting.add(lblSubstitute);

        pnlTop.add(pnlgreeting, java.awt.BorderLayout.WEST);

        pnlSearch.setBackground(new java.awt.Color(255, 255, 255));
        pnlSearch.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 0, 18));

        txtSearch.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(136, 136, 136));
        txtSearch.setText("Search Student ID or Name");
        txtSearch.setPreferredSize(new java.awt.Dimension(250, 34));
        txtSearch.addActionListener(this::txtSearchActionPerformed);
        pnlSearch.add(txtSearch);

        pnlTop.add(pnlSearch, java.awt.BorderLayout.CENTER);

        pnlContent.add(pnlTop, java.awt.BorderLayout.NORTH);

        getContentPane().add(pnlContent, java.awt.BorderLayout.CENTER);

        pnlSidebar.setBackground(new java.awt.Color(0, 153, 0));
        pnlSidebar.setPreferredSize(new java.awt.Dimension(220, 100));
        pnlSidebar.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.BorderLayout());
        pnlSidebar.add(jPanel2, java.awt.BorderLayout.CENTER);

        pnlBrand.setBackground(new java.awt.Color(46, 158, 0));
        pnlBrand.setPreferredSize(new java.awt.Dimension(220, 110));
        pnlBrand.setLayout(new java.awt.GridLayout(4, 1));

        lblPhinmaCOC.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        lblPhinmaCOC.setForeground(new java.awt.Color(255, 255, 0));
        lblPhinmaCOC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPhinmaCOC.setText("PHINMA Cagayan de Oro ");
        pnlBrand.add(lblPhinmaCOC);

        lblSchoolClinic.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSchoolClinic.setForeground(new java.awt.Color(255, 255, 255));
        lblSchoolClinic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSchoolClinic.setText("School Clinic");
        lblSchoolClinic.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblSchoolClinic.setMaximumSize(new java.awt.Dimension(32767, 32767));
        lblSchoolClinic.setMinimumSize(new java.awt.Dimension(0, 0));
        pnlBrand.add(lblSchoolClinic);

        lblCollege.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        lblCollege.setForeground(new java.awt.Color(255, 255, 0));
        lblCollege.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCollege.setText("College");
        pnlBrand.add(lblCollege);

        pnlLineWrap.setBackground(new java.awt.Color(46, 158, 0));
        pnlLineWrap.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 12));

        jPanel6.setBackground(new java.awt.Color(255, 204, 0));
        jPanel6.setPreferredSize(new java.awt.Dimension(60, 2));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        pnlLineWrap.add(jPanel6);

        pnlBrand.add(pnlLineWrap);

        pnlSidebar.add(pnlBrand, java.awt.BorderLayout.NORTH);

        pnlMenu.setBackground(new java.awt.Color(46, 158, 0));
        pnlMenu.setLayout(new java.awt.GridLayout(10, 1));

        btnDashboard.setBackground(new java.awt.Color(46, 158, 0));
        btnDashboard.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDashboard.setForeground(new java.awt.Color(255, 255, 255));
        btnDashboard.setText("Dashboard");
        btnDashboard.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 20, 0, 0));
        btnDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDashboard.setFocusPainted(false);
        btnDashboard.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDashboard.setMaximumSize(null);
        btnDashboard.setMinimumSize(null);
        btnDashboard.setOpaque(true);
        btnDashboard.setPreferredSize(new java.awt.Dimension(220, 50));
        btnDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDashboardMouseExited(evt);
            }
        });
        btnDashboard.addActionListener(this::btnDashboardActionPerformed);
        pnlMenu.add(btnDashboard);

        btnPatients.setBackground(new java.awt.Color(46, 158, 0));
        btnPatients.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPatients.setForeground(new java.awt.Color(255, 255, 255));
        btnPatients.setText("Patients");
        btnPatients.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 20, 0, 0));
        btnPatients.setBorderPainted(false);
        btnPatients.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPatients.setFocusPainted(false);
        btnPatients.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPatients.setMaximumSize(null);
        btnPatients.setMinimumSize(null);
        btnPatients.setPreferredSize(new java.awt.Dimension(220, 50));
        btnPatients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPatientsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPatientsMouseExited(evt);
            }
        });
        btnPatients.addActionListener(this::btnPatientsActionPerformed);
        pnlMenu.add(btnPatients);

        btnInventory.setBackground(new java.awt.Color(46, 158, 0));
        btnInventory.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnInventory.setForeground(new java.awt.Color(255, 255, 255));
        btnInventory.setText("Medicine Inventory");
        btnInventory.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 20, 0, 0));
        btnInventory.setBorderPainted(false);
        btnInventory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInventory.setFocusPainted(false);
        btnInventory.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInventory.setMaximumSize(null);
        btnInventory.setMinimumSize(null);
        btnInventory.setPreferredSize(new java.awt.Dimension(220, 50));
        btnInventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInventoryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInventoryMouseExited(evt);
            }
        });
        btnInventory.addActionListener(this::btnInventoryActionPerformed);
        pnlMenu.add(btnInventory);

        pnlSidebar.add(pnlMenu, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlSidebar, java.awt.BorderLayout.WEST);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogoutActionPerformed
new LogIn().setVisible(true); this.dispose();
    }//GEN-LAST:event_btLogoutActionPerformed

    private void cmbTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTypeActionPerformed
        refreshPatientData();
    }//GEN-LAST:event_cmbTypeActionPerformed

    private void btnAddPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPatientActionPerformed
        new AddPatient().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddPatientActionPerformed

    private void tblRecentVisitsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRecentVisitsMouseClicked
        int row = tblRecentVisits.getSelectedRow();
        if (row < 0) return;
        Object id = tblRecentVisits.getValueAt(row, 0);
        try {
            ClinicDAO.fillHistory((javax.swing.table.DefaultTableModel) tblHistory.getModel(), String.valueOf(id));
        } catch (java.sql.SQLException ex) {
            JOptionPane.showMessageDialog(this, "Could not load visit history: " + ex.getMessage());
        }
    }//GEN-LAST:event_tblRecentVisitsMouseClicked

    private void btnDashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardMouseEntered
        btnDashboard.setBackground(new java.awt.Color(0, 100, 0));
    }//GEN-LAST:event_btnDashboardMouseEntered

    private void btnDashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDashboardMouseExited
        btnDashboard.setBackground(new java.awt.Color(45, 157, 0));
    }//GEN-LAST:event_btnDashboardMouseExited

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        new Dashboard1().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void btnPatientsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPatientsMouseEntered
        btnPatients.setBackground(new java.awt.Color(0, 100, 0));
    }//GEN-LAST:event_btnPatientsMouseEntered

    private void btnPatientsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPatientsMouseExited
        btnPatients.setBackground(new java.awt.Color(45, 157, 0));
    }//GEN-LAST:event_btnPatientsMouseExited

    private void btnPatientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientsActionPerformed
        new Patients().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPatientsActionPerformed

    private void btnInventoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInventoryMouseEntered
        btnInventory.setBackground(new java.awt.Color(0, 100, 0));      // TODO add your handling code here:
    }//GEN-LAST:event_btnInventoryMouseEntered

    private void btnInventoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInventoryMouseExited
        btnInventory.setBackground(new java.awt.Color(45, 157, 0));
    }//GEN-LAST:event_btnInventoryMouseExited

    private void btnInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventoryActionPerformed
        new MedicineInventory().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInventoryActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        refreshPatientData();
    }//GEN-LAST:event_txtSearchActionPerformed

    private void refreshPatientData() {
        try {
            String type = cmbType == null ? "ALL" : String.valueOf(cmbType.getSelectedItem());
            String search = txtSearch == null ? "" : txtSearch.getText().trim();
            if ("Search Student ID or Name".equals(search)) search = "";
            ClinicDAO.fillPatientTable((javax.swing.table.DefaultTableModel) tblRecentVisits.getModel(), search, type);
            ClinicDAO.fillHistory((javax.swing.table.DefaultTableModel) tblHistory.getModel(), "");
            lblTotalPatients.setText(String.valueOf(ClinicDAO.totalPatients()));
            lblTotalPatients1.setText(String.valueOf(ClinicDAO.visitsToday()));
            lblTotalPatients2.setText(String.valueOf(ClinicDAO.lowStockCount()));
            lblTotalPatients3.setText(NurseStore.currentNurse == null || NurseStore.currentNurse.trim().isEmpty() ? "0" : "1");
        } catch (java.sql.SQLException ex) {
            JOptionPane.showMessageDialog(this, "Could not load patient records: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Patients().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLogout;
    private javax.swing.JButton btnAddPatient;
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnInventory;
    private javax.swing.JButton btnPatients;
    private javax.swing.JComboBox<String> cmbType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblCollege;
    private javax.swing.JLabel lblGreeting;
    private javax.swing.JLabel lblHistoryTitle;
    private javax.swing.JLabel lblPhinmaCOC;
    private javax.swing.JLabel lblQuick;
    private javax.swing.JLabel lblRecents;
    private javax.swing.JLabel lblSchoolClinic;
    private javax.swing.JLabel lblSubstitute;
    private javax.swing.JLabel lblTotalPatients;
    private javax.swing.JLabel lblTotalPatients1;
    private javax.swing.JLabel lblTotalPatients2;
    private javax.swing.JLabel lblTotalPatients3;
    private javax.swing.JLabel lblTotalTitle;
    private javax.swing.JLabel lblTotalTitle1;
    private javax.swing.JLabel lblTotalTitle2;
    private javax.swing.JLabel lblTotalTitle3;
    private javax.swing.JPanel pnlBody;
    private javax.swing.JPanel pnlBottom;
    private javax.swing.JPanel pnlBrand;
    private javax.swing.JPanel pnlButtons;
    private javax.swing.JPanel pnlCard1;
    private javax.swing.JPanel pnlCard2;
    private javax.swing.JPanel pnlCard3;
    private javax.swing.JPanel pnlCard4;
    private javax.swing.JPanel pnlCards;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JPanel pnlFooter;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlHistory;
    private javax.swing.JPanel pnlLineWrap;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlQuick;
    private javax.swing.JPanel pnlSearch;
    private javax.swing.JPanel pnlSidebar;
    private javax.swing.JPanel pnlStockList;
    private javax.swing.JPanel pnlTop;
    private javax.swing.JPanel pnlVisits;
    private javax.swing.JPanel pnlgreeting;
    private javax.swing.JScrollPane scrollHistory;
    private javax.swing.JScrollPane spVisits;
    private javax.swing.JTable tblHistory;
    private javax.swing.JTable tblRecentVisits;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}