package employee_ms.view;

public class Pay_slip extends javax.swing.JFrame {

    /**
     * Creates new form view_paySlip
     */
    public Pay_slip() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        EarningsTable = new javax.swing.JTable();
        txtBankName = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtEmployeeId = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        DeductionTable = new javax.swing.JTable();
        txtNetSal = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        MonthChooser = new com.toedter.calendar.JMonthChooser();
        YearChooser = new com.toedter.calendar.JYearChooser();
        cmbPosition = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        txtBankAccNo = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        txtComAccNo = new javax.swing.JTextField();
        btnFilter = new javax.swing.JButton();
        btnGenerate1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setLayout(null);

        jLabel26.setBackground(new java.awt.Color(0, 0, 204));
        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Employee ID");
        jPanel1.add(jLabel26);
        jLabel26.setBounds(170, 60, 144, 22);

        jLabel27.setBackground(new java.awt.Color(0, 0, 204));
        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Position");
        jPanel1.add(jLabel27);
        jLabel27.setBounds(30, 110, 144, 25);

        jLabel29.setBackground(new java.awt.Color(0, 0, 204));
        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Name");
        jPanel1.add(jLabel29);
        jLabel29.setBounds(30, 260, 110, 25);

        jLabel32.setBackground(new java.awt.Color(0, 0, 204));
        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Month");
        jPanel1.add(jLabel32);
        jLabel32.setBounds(430, 160, 110, 25);

        jLabel34.setBackground(new java.awt.Color(0, 0, 204));
        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 0));
        jLabel34.setText("Earnings");
        jPanel1.add(jLabel34);
        jLabel34.setBounds(30, 300, 144, 25);

        jLabel30.setBackground(new java.awt.Color(0, 0, 204));
        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Bank Name");
        jPanel1.add(jLabel30);
        jLabel30.setBounds(430, 110, 110, 25);

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pay Slip");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 5, 110, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 810, 40);

        EarningsTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        EarningsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Salary Head", "Amount"
            }
        ));
        EarningsTable.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(EarningsTable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 340, 630, 130);

        txtBankName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtBankName);
        txtBankName.setBounds(580, 110, 140, 20);
        jPanel1.add(txtName);
        txtName.setBounds(240, 260, 160, 20);

        txtEmployeeId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtEmployeeId);
        txtEmployeeId.setBounds(300, 60, 160, 20);

        jLabel35.setBackground(new java.awt.Color(0, 0, 204));
        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Year");
        jPanel1.add(jLabel35);
        jLabel35.setBounds(430, 210, 144, 22);

        jLabel36.setBackground(new java.awt.Color(0, 0, 204));
        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 0));
        jLabel36.setText("Deductions");
        jPanel1.add(jLabel36);
        jLabel36.setBounds(30, 490, 144, 25);

        DeductionTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DeductionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Salary Head", "Amount"
            }
        ));
        jScrollPane2.setViewportView(DeductionTable);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(30, 530, 630, 130);

        txtNetSal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtNetSal);
        txtNetSal.setBounds(240, 680, 210, 26);

        jLabel37.setBackground(new java.awt.Color(0, 0, 204));
        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 0));
        jLabel37.setText("NET SALARY(Rs)");
        jPanel1.add(jLabel37);
        jLabel37.setBounds(30, 680, 200, 27);

        MonthChooser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(MonthChooser);
        MonthChooser.setBounds(580, 160, 210, 22);
        jPanel1.add(YearChooser);
        YearChooser.setBounds(580, 210, 64, 22);

        cmbPosition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Center Manager", "Financial Manager", "Program Manager", "Admin" }));
        jPanel1.add(cmbPosition);
        cmbPosition.setBounds(240, 110, 160, 22);

        jLabel31.setBackground(new java.awt.Color(0, 0, 204));
        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Bank Account No");
        jPanel1.add(jLabel31);
        jLabel31.setBounds(30, 160, 170, 25);

        txtBankAccNo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtBankAccNo);
        txtBankAccNo.setBounds(240, 160, 160, 20);

        jLabel33.setBackground(new java.awt.Color(0, 0, 204));
        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Company Account No");
        jPanel1.add(jLabel33);
        jLabel33.setBounds(30, 210, 190, 25);

        txtComAccNo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtComAccNo);
        txtComAccNo.setBounds(240, 210, 160, 20);

        btnFilter.setBackground(new java.awt.Color(0, 0, 204));
        btnFilter.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnFilter.setForeground(new java.awt.Color(255, 255, 0));
        btnFilter.setText("Filter");
        jPanel1.add(btnFilter);
        btnFilter.setBounds(490, 50, 160, 32);

        btnGenerate1.setBackground(new java.awt.Color(0, 0, 204));
        btnGenerate1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnGenerate1.setForeground(new java.awt.Color(255, 255, 0));
        btnGenerate1.setText("Generate");
        jPanel1.add(btnGenerate1);
        btnGenerate1.setBounds(490, 680, 160, 32);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 809, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 809, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 742, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Pay_slip().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DeductionTable;
    private javax.swing.JTable EarningsTable;
    private com.toedter.calendar.JMonthChooser MonthChooser;
    private com.toedter.calendar.JYearChooser YearChooser;
    private javax.swing.JButton btnFilter;
    private javax.swing.JButton btnGenerate1;
    private javax.swing.JComboBox<String> cmbPosition;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtBankAccNo;
    private javax.swing.JTextField txtBankName;
    private javax.swing.JTextField txtComAccNo;
    private javax.swing.JTextField txtEmployeeId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNetSal;
    // End of variables declaration//GEN-END:variables
}
