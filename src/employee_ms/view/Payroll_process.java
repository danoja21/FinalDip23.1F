package employee_ms.view;

public class Payroll_process extends javax.swing.JFrame {

    public Payroll_process(String source) {
        initComponents();
        
        switch (source) {
            case "FM_dashboard":
                btnCalc.setVisible(true);
                btnUpdate.setVisible(true);
                btnFilter.setVisible(true);
                break;
            case "CM_dashboard":
            case "PM_dashboard":
            case "CEO_dashboard":
            case "Admin_dashboard":
                btnCalc.setVisible(false);
                btnUpdate.setVisible(false);
                btnFilter.setVisible(true);
                break;
            default:
                // Handle unexpected cases or set default visibility
                btnCalc.setVisible(false);
                btnUpdate.setVisible(false);
                btnFilter.setVisible(true);
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CreateEmployeePanel1 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txt_Employee_ID = new javax.swing.JTextField();
        txt_Employee_Name = new javax.swing.JTextField();
        txt_Employee_Type = new javax.swing.JTextField();
        txt_Total_Salary = new javax.swing.JTextField();
        btnCalculate = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txt_Month = new javax.swing.JTextField();
        txt_Year = new javax.swing.JTextField();
        txt_Basic_Salary = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        txt_Hour_Rate = new javax.swing.JTextField();
        txt_Working_Days = new javax.swing.JTextField();
        txt_OT_Hours = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txt_Tax_Amount = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        btnCalculate1 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        txt_Incentive = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        txt_ETF = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txt_EPF = new javax.swing.JTextField();
        CreateEmployeePanel2 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        txt_Employee_ID1 = new javax.swing.JTextField();
        txt_Employee_Name1 = new javax.swing.JTextField();
        txt_Employee_Type1 = new javax.swing.JTextField();
        txt_Total_Salary1 = new javax.swing.JTextField();
        btnCalculate2 = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        txt_Month1 = new javax.swing.JTextField();
        txt_Year1 = new javax.swing.JTextField();
        txt_Basic_Salary1 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        txt_Hour_Rate1 = new javax.swing.JTextField();
        txt_Working_Days1 = new javax.swing.JTextField();
        txt_OT_Hours1 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        txt_Tax_Amount1 = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        btnCalculate3 = new javax.swing.JButton();
        jLabel53 = new javax.swing.JLabel();
        txt_Incentive1 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        txt_ETF1 = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        txt_EPF1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtEmpId = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtBonus = new javax.swing.JTextField();
        cmbPosition = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtEmpName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtWorkHours = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtGrossSal = new javax.swing.JTextField();
        txtTaxAmount = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtETF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtEPF = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtOTHours = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        MonthChooser = new com.toedter.calendar.JMonthChooser();
        jLabel14 = new javax.swing.JLabel();
        YearChooser = new com.toedter.calendar.JYearChooser();
        jLabel15 = new javax.swing.JLabel();
        DateChooser = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();
        txtNetSal = new javax.swing.JTextField();
        btnFilter = new javax.swing.JButton();
        btnCalc = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 102));
        getContentPane().setLayout(null);

        CreateEmployeePanel1.setBackground(new java.awt.Color(0, 0, 102));
        CreateEmployeePanel1.setLayout(null);

        jLabel26.setBackground(new java.awt.Color(0, 0, 204));
        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Employee ID");
        CreateEmployeePanel1.add(jLabel26);
        jLabel26.setBounds(20, 30, 144, 25);

        jLabel27.setBackground(new java.awt.Color(0, 0, 204));
        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Employee Name");
        CreateEmployeePanel1.add(jLabel27);
        jLabel27.setBounds(20, 60, 144, 25);

        jLabel28.setBackground(new java.awt.Color(0, 0, 204));
        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Position");
        CreateEmployeePanel1.add(jLabel28);
        jLabel28.setBounds(20, 90, 144, 25);

        jLabel29.setBackground(new java.awt.Color(0, 0, 204));
        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Month");
        CreateEmployeePanel1.add(jLabel29);
        jLabel29.setBounds(20, 120, 144, 25);

        jLabel32.setBackground(new java.awt.Color(0, 0, 204));
        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Gross Salary");
        CreateEmployeePanel1.add(jLabel32);
        jLabel32.setBounds(20, 180, 144, 25);

        jLabel33.setBackground(new java.awt.Color(0, 0, 204));
        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Hour Rate");
        CreateEmployeePanel1.add(jLabel33);
        jLabel33.setBounds(57, 338, 144, 25);

        txt_Employee_ID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_Employee_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Employee_IDActionPerformed(evt);
            }
        });
        CreateEmployeePanel1.add(txt_Employee_ID);
        txt_Employee_ID.setBounds(260, 30, 213, 26);

        txt_Employee_Name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CreateEmployeePanel1.add(txt_Employee_Name);
        txt_Employee_Name.setBounds(260, 60, 213, 26);

        txt_Employee_Type.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CreateEmployeePanel1.add(txt_Employee_Type);
        txt_Employee_Type.setBounds(260, 90, 213, 26);

        txt_Total_Salary.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CreateEmployeePanel1.add(txt_Total_Salary);
        txt_Total_Salary.setBounds(260, 480, 213, 26);

        btnCalculate.setBackground(new java.awt.Color(0, 0, 204));
        btnCalculate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCalculate.setForeground(new java.awt.Color(255, 255, 0));
        btnCalculate.setText("Calculate");
        btnCalculate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });
        CreateEmployeePanel1.add(btnCalculate);
        btnCalculate.setBounds(260, 520, 100, 30);

        jLabel34.setBackground(new java.awt.Color(0, 0, 204));
        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Bonus");
        CreateEmployeePanel1.add(jLabel34);
        jLabel34.setBounds(20, 210, 144, 25);

        jLabel35.setBackground(new java.awt.Color(0, 0, 204));
        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Time Worked");
        CreateEmployeePanel1.add(jLabel35);
        jLabel35.setBounds(20, 250, 144, 25);

        jLabel36.setBackground(new java.awt.Color(0, 0, 204));
        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Working Days");
        CreateEmployeePanel1.add(jLabel36);
        jLabel36.setBounds(57, 275, 144, 25);

        txt_Month.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CreateEmployeePanel1.add(txt_Month);
        txt_Month.setBounds(260, 120, 213, 26);

        txt_Year.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CreateEmployeePanel1.add(txt_Year);
        txt_Year.setBounds(260, 150, 213, 26);

        txt_Basic_Salary.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CreateEmployeePanel1.add(txt_Basic_Salary);
        txt_Basic_Salary.setBounds(260, 180, 213, 26);

        jLabel37.setBackground(new java.awt.Color(0, 0, 204));
        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("OT Houres");
        CreateEmployeePanel1.add(jLabel37);
        jLabel37.setBounds(57, 309, 144, 25);

        txt_Hour_Rate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CreateEmployeePanel1.add(txt_Hour_Rate);
        txt_Hour_Rate.setBounds(260, 340, 141, 26);

        txt_Working_Days.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CreateEmployeePanel1.add(txt_Working_Days);
        txt_Working_Days.setBounds(260, 280, 141, 26);

        txt_OT_Hours.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CreateEmployeePanel1.add(txt_OT_Hours);
        txt_OT_Hours.setBounds(260, 310, 141, 26);

        jLabel38.setBackground(new java.awt.Color(0, 0, 204));
        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("ETF");
        CreateEmployeePanel1.add(jLabel38);
        jLabel38.setBounds(20, 380, 144, 25);

        txt_Tax_Amount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CreateEmployeePanel1.add(txt_Tax_Amount);
        txt_Tax_Amount.setBounds(260, 430, 213, 26);

        jLabel39.setBackground(new java.awt.Color(0, 0, 204));
        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Total Salary");
        CreateEmployeePanel1.add(jLabel39);
        jLabel39.setBounds(10, 470, 225, 40);

        btnCalculate1.setBackground(new java.awt.Color(0, 0, 204));
        btnCalculate1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCalculate1.setForeground(new java.awt.Color(255, 255, 0));
        btnCalculate1.setText("Clear");
        btnCalculate1.setActionCommand("cLEAR");
        btnCalculate1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCalculate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculate1ActionPerformed(evt);
            }
        });
        CreateEmployeePanel1.add(btnCalculate1);
        btnCalculate1.setBounds(390, 520, 90, 30);

        jLabel30.setBackground(new java.awt.Color(0, 0, 204));
        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Year");
        CreateEmployeePanel1.add(jLabel30);
        jLabel30.setBounds(20, 150, 144, 25);

        txt_Incentive.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CreateEmployeePanel1.add(txt_Incentive);
        txt_Incentive.setBounds(260, 210, 213, 26);

        jLabel40.setBackground(new java.awt.Color(0, 0, 204));
        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("EPF");
        CreateEmployeePanel1.add(jLabel40);
        jLabel40.setBounds(20, 400, 144, 25);

        txt_ETF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CreateEmployeePanel1.add(txt_ETF);
        txt_ETF.setBounds(260, 370, 213, 26);

        jLabel41.setBackground(new java.awt.Color(0, 0, 204));
        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Tax Amount");
        CreateEmployeePanel1.add(jLabel41);
        jLabel41.setBounds(20, 420, 144, 25);

        txt_EPF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CreateEmployeePanel1.add(txt_EPF);
        txt_EPF.setBounds(260, 400, 213, 26);

        getContentPane().add(CreateEmployeePanel1);
        CreateEmployeePanel1.setBounds(0, 0, 0, 0);

        CreateEmployeePanel2.setBackground(new java.awt.Color(0, 0, 102));
        CreateEmployeePanel2.setLayout(null);

        jLabel31.setBackground(new java.awt.Color(0, 0, 204));
        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Employee ID");
        CreateEmployeePanel2.add(jLabel31);
        jLabel31.setBounds(20, 30, 144, 25);

        jLabel42.setBackground(new java.awt.Color(0, 0, 204));
        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Employee Name");
        CreateEmployeePanel2.add(jLabel42);
        jLabel42.setBounds(20, 60, 144, 25);

        jLabel43.setBackground(new java.awt.Color(0, 0, 204));
        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Position");
        CreateEmployeePanel2.add(jLabel43);
        jLabel43.setBounds(20, 90, 144, 25);

        jLabel44.setBackground(new java.awt.Color(0, 0, 204));
        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Month");
        CreateEmployeePanel2.add(jLabel44);
        jLabel44.setBounds(20, 120, 144, 25);

        jLabel45.setBackground(new java.awt.Color(0, 0, 204));
        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Gross Salary");
        CreateEmployeePanel2.add(jLabel45);
        jLabel45.setBounds(20, 180, 144, 25);

        jLabel46.setBackground(new java.awt.Color(0, 0, 204));
        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Hour Rate");
        CreateEmployeePanel2.add(jLabel46);
        jLabel46.setBounds(57, 338, 144, 25);

        txt_Employee_ID1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_Employee_ID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Employee_ID1ActionPerformed(evt);
            }
        });
        CreateEmployeePanel2.add(txt_Employee_ID1);
        txt_Employee_ID1.setBounds(260, 30, 213, 26);

        txt_Employee_Name1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CreateEmployeePanel2.add(txt_Employee_Name1);
        txt_Employee_Name1.setBounds(260, 60, 213, 26);

        txt_Employee_Type1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CreateEmployeePanel2.add(txt_Employee_Type1);
        txt_Employee_Type1.setBounds(260, 90, 213, 26);

        txt_Total_Salary1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CreateEmployeePanel2.add(txt_Total_Salary1);
        txt_Total_Salary1.setBounds(260, 480, 213, 26);

        btnCalculate2.setBackground(new java.awt.Color(0, 0, 204));
        btnCalculate2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCalculate2.setForeground(new java.awt.Color(255, 255, 0));
        btnCalculate2.setText("Calculate");
        btnCalculate2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCalculate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculate2ActionPerformed(evt);
            }
        });
        CreateEmployeePanel2.add(btnCalculate2);
        btnCalculate2.setBounds(260, 520, 100, 30);

        jLabel47.setBackground(new java.awt.Color(0, 0, 204));
        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Bonus");
        CreateEmployeePanel2.add(jLabel47);
        jLabel47.setBounds(20, 210, 144, 25);

        jLabel48.setBackground(new java.awt.Color(0, 0, 204));
        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Time Worked");
        CreateEmployeePanel2.add(jLabel48);
        jLabel48.setBounds(20, 250, 144, 25);

        jLabel49.setBackground(new java.awt.Color(0, 0, 204));
        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Working Days");
        CreateEmployeePanel2.add(jLabel49);
        jLabel49.setBounds(57, 275, 144, 25);

        txt_Month1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CreateEmployeePanel2.add(txt_Month1);
        txt_Month1.setBounds(260, 120, 213, 26);

        txt_Year1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CreateEmployeePanel2.add(txt_Year1);
        txt_Year1.setBounds(260, 150, 213, 26);

        txt_Basic_Salary1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CreateEmployeePanel2.add(txt_Basic_Salary1);
        txt_Basic_Salary1.setBounds(260, 180, 213, 26);

        jLabel50.setBackground(new java.awt.Color(0, 0, 204));
        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("OT Houres");
        CreateEmployeePanel2.add(jLabel50);
        jLabel50.setBounds(57, 309, 144, 25);

        txt_Hour_Rate1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CreateEmployeePanel2.add(txt_Hour_Rate1);
        txt_Hour_Rate1.setBounds(260, 340, 141, 26);

        txt_Working_Days1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CreateEmployeePanel2.add(txt_Working_Days1);
        txt_Working_Days1.setBounds(260, 280, 141, 26);

        txt_OT_Hours1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CreateEmployeePanel2.add(txt_OT_Hours1);
        txt_OT_Hours1.setBounds(260, 310, 141, 26);

        jLabel51.setBackground(new java.awt.Color(0, 0, 204));
        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("ETF");
        CreateEmployeePanel2.add(jLabel51);
        jLabel51.setBounds(20, 380, 144, 25);

        txt_Tax_Amount1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CreateEmployeePanel2.add(txt_Tax_Amount1);
        txt_Tax_Amount1.setBounds(260, 430, 213, 26);

        jLabel52.setBackground(new java.awt.Color(0, 0, 204));
        jLabel52.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("Total Salary");
        CreateEmployeePanel2.add(jLabel52);
        jLabel52.setBounds(10, 470, 225, 40);

        btnCalculate3.setBackground(new java.awt.Color(0, 0, 204));
        btnCalculate3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCalculate3.setForeground(new java.awt.Color(255, 255, 0));
        btnCalculate3.setText("Clear");
        btnCalculate3.setActionCommand("cLEAR");
        btnCalculate3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCalculate3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculate3ActionPerformed(evt);
            }
        });
        CreateEmployeePanel2.add(btnCalculate3);
        btnCalculate3.setBounds(390, 520, 90, 30);

        jLabel53.setBackground(new java.awt.Color(0, 0, 204));
        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("Year");
        CreateEmployeePanel2.add(jLabel53);
        jLabel53.setBounds(20, 150, 144, 25);

        txt_Incentive1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CreateEmployeePanel2.add(txt_Incentive1);
        txt_Incentive1.setBounds(260, 210, 213, 26);

        jLabel54.setBackground(new java.awt.Color(0, 0, 204));
        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("EPF");
        CreateEmployeePanel2.add(jLabel54);
        jLabel54.setBounds(20, 400, 144, 25);

        txt_ETF1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CreateEmployeePanel2.add(txt_ETF1);
        txt_ETF1.setBounds(260, 370, 213, 26);

        jLabel55.setBackground(new java.awt.Color(0, 0, 204));
        jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("Tax Amount");
        CreateEmployeePanel2.add(jLabel55);
        jLabel55.setBounds(20, 420, 144, 25);

        txt_EPF1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CreateEmployeePanel2.add(txt_EPF1);
        txt_EPF1.setBounds(260, 400, 213, 26);

        getContentPane().add(CreateEmployeePanel2);
        CreateEmployeePanel2.setBounds(0, 0, 0, 0);

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));
        jPanel2.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(0, 102, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 40, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Payroll Process");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 140, 30));

        jPanel2.add(jPanel4);
        jPanel4.setBounds(0, 0, 1170, 40);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Employee ID");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(60, 70, 107, 25);

        txtEmpId.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPanel2.add(txtEmpId);
        txtEmpId.setBounds(220, 70, 160, 28);

        btnUpdate.setBackground(new java.awt.Color(0, 0, 204));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 0));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(btnUpdate);
        btnUpdate.setBounds(310, 500, 120, 40);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Position");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(430, 130, 69, 25);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gross Salary");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(60, 180, 104, 25);
        jPanel2.add(txtBonus);
        txtBonus.setBounds(540, 180, 180, 22);

        cmbPosition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Center Manager", "Program Manager", "Financial Manager", "Admin", " " }));
        jPanel2.add(cmbPosition);
        cmbPosition.setBounds(540, 130, 180, 22);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Employee Name");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(60, 130, 138, 25);
        jPanel2.add(txtEmpName);
        txtEmpName.setBounds(220, 130, 160, 22);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Bonus");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(430, 180, 53, 25);
        jPanel2.add(txtWorkHours);
        txtWorkHours.setBounds(540, 280, 180, 22);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Date");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(430, 380, 40, 25);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Year");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(60, 380, 38, 25);
        jPanel2.add(txtGrossSal);
        txtGrossSal.setBounds(220, 180, 160, 22);
        jPanel2.add(txtTaxAmount);
        txtTaxAmount.setBounds(220, 330, 160, 22);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ETF");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(60, 230, 30, 25);
        jPanel2.add(txtETF);
        txtETF.setBounds(220, 230, 160, 22);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("EPF");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(430, 230, 30, 25);
        jPanel2.add(txtEPF);
        txtEPF.setBounds(540, 230, 180, 22);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("OT Hours");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(60, 280, 81, 25);
        jPanel2.add(txtOTHours);
        txtOTHours.setBounds(220, 280, 160, 22);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Work Hours");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(430, 280, 102, 25);
        jPanel2.add(MonthChooser);
        MonthChooser.setBounds(540, 330, 125, 22);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Tax Amount");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(60, 330, 105, 25);
        jPanel2.add(YearChooser);
        YearChooser.setBounds(220, 380, 100, 22);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Month");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(430, 330, 57, 25);
        jPanel2.add(DateChooser);
        DateChooser.setBounds(540, 380, 130, 22);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Net Salary(Rs.)");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(120, 450, 140, 27);

        txtNetSal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(txtNetSal);
        txtNetSal.setBounds(310, 450, 170, 26);

        btnFilter.setBackground(new java.awt.Color(0, 0, 204));
        btnFilter.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnFilter.setForeground(new java.awt.Color(255, 255, 0));
        btnFilter.setText("Filter");
        btnFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterActionPerformed(evt);
            }
        });
        jPanel2.add(btnFilter);
        btnFilter.setBounds(400, 70, 130, 32);

        btnCalc.setBackground(new java.awt.Color(0, 0, 204));
        btnCalc.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCalc.setForeground(new java.awt.Color(255, 255, 0));
        btnCalc.setText("Calculate");
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });
        jPanel2.add(btnCalc);
        btnCalc.setBounds(128, 500, 140, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 860, 730);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_Employee_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Employee_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Employee_IDActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
       

       
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void btnCalculate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculate1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalculate1ActionPerformed

    private void txt_Employee_ID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Employee_ID1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Employee_ID1ActionPerformed

    private void btnCalculate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculate2ActionPerformed
      
    }//GEN-LAST:event_btnCalculate2ActionPerformed

    private void btnCalculate3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculate3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalculate3ActionPerformed

    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalcActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFilterActionPerformed

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
            java.util.logging.Logger.getLogger(Payroll_process.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payroll_process.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payroll_process.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payroll_process.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payroll_process("FM_dashboard").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CreateEmployeePanel1;
    private javax.swing.JPanel CreateEmployeePanel2;
    private com.toedter.calendar.JDateChooser DateChooser;
    private com.toedter.calendar.JMonthChooser MonthChooser;
    private com.toedter.calendar.JYearChooser YearChooser;
    private javax.swing.JButton btnCalc;
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnCalculate1;
    private javax.swing.JButton btnCalculate2;
    private javax.swing.JButton btnCalculate3;
    private javax.swing.JButton btnFilter;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbPosition;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtBonus;
    private javax.swing.JTextField txtEPF;
    private javax.swing.JTextField txtETF;
    private javax.swing.JTextField txtEmpId;
    private javax.swing.JTextField txtEmpName;
    private javax.swing.JTextField txtGrossSal;
    private javax.swing.JTextField txtNetSal;
    private javax.swing.JTextField txtOTHours;
    private javax.swing.JTextField txtTaxAmount;
    private javax.swing.JTextField txtWorkHours;
    private javax.swing.JTextField txt_Basic_Salary;
    private javax.swing.JTextField txt_Basic_Salary1;
    private javax.swing.JTextField txt_EPF;
    private javax.swing.JTextField txt_EPF1;
    private javax.swing.JTextField txt_ETF;
    private javax.swing.JTextField txt_ETF1;
    private javax.swing.JTextField txt_Employee_ID;
    private javax.swing.JTextField txt_Employee_ID1;
    private javax.swing.JTextField txt_Employee_Name;
    private javax.swing.JTextField txt_Employee_Name1;
    private javax.swing.JTextField txt_Employee_Type;
    private javax.swing.JTextField txt_Employee_Type1;
    private javax.swing.JTextField txt_Hour_Rate;
    private javax.swing.JTextField txt_Hour_Rate1;
    private javax.swing.JTextField txt_Incentive;
    private javax.swing.JTextField txt_Incentive1;
    private javax.swing.JTextField txt_Month;
    private javax.swing.JTextField txt_Month1;
    private javax.swing.JTextField txt_OT_Hours;
    private javax.swing.JTextField txt_OT_Hours1;
    private javax.swing.JTextField txt_Tax_Amount;
    private javax.swing.JTextField txt_Tax_Amount1;
    private javax.swing.JTextField txt_Total_Salary;
    private javax.swing.JTextField txt_Total_Salary1;
    private javax.swing.JTextField txt_Working_Days;
    private javax.swing.JTextField txt_Working_Days1;
    private javax.swing.JTextField txt_Year;
    private javax.swing.JTextField txt_Year1;
    // End of variables declaration//GEN-END:variables
}
