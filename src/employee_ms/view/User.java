
package employee_ms.view;

import employee_ms.model.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class User extends javax.swing.JFrame {

    /**
     * Creates new form User
     * @param source
     */
    public User(String source) {
        initComponents();
        
        switch (source) {
            case "CEO_dashboard":
            case "Admin_dashboard":
                btnCreate.setVisible(true);
                btnClear.setVisible(true);
                btnDelete.setVisible(true);
                btnUpdate.setVisible(true);
                btnView.setVisible(true);
                break;
            default:
                btnCreate.setVisible(false);
                btnClear.setVisible(false);
                btnDelete.setVisible(false);
                btnUpdate.setVisible(false);
                btnView.setVisible(false);
                break;
        }


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUserId = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        cmbPosition = new javax.swing.JComboBox<>();
        btnCreate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("User");

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));
        jPanel2.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(0, 102, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 40, -1, -1));

        jLabel25.setBackground(new java.awt.Color(0, 0, 102));
        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("User");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 219, 40));

        jPanel2.add(jPanel4);
        jPanel4.setBounds(0, 0, 690, 40);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User ID");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(32, 58, 62, 25);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(32, 103, 85, 25);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(30, 160, 80, 25);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(320, 60, 46, 25);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Position");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(320, 110, 69, 25);

        txtUserId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(txtUserId);
        txtUserId.setBounds(135, 59, 102, 26);

        txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(txtUsername);
        txtUsername.setBounds(135, 104, 150, 30);

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(txtPassword);
        txtPassword.setBounds(140, 160, 140, 26);

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(txtEmail);
        txtEmail.setBounds(400, 60, 200, 30);

        cmbPosition.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbPosition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "CEO", "Program Manager", "Center Manager", "Financial Manager" }));
        jPanel2.add(cmbPosition);
        cmbPosition.setBounds(400, 110, 150, 26);

        btnCreate.setBackground(new java.awt.Color(0, 0, 204));
        btnCreate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 255, 0));
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        jPanel2.add(btnCreate);
        btnCreate.setBounds(40, 230, 85, 32);

        btnClear.setBackground(new java.awt.Color(0, 0, 204));
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 0));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel2.add(btnClear);
        btnClear.setBounds(540, 230, 73, 32);

        btnView.setBackground(new java.awt.Color(0, 0, 204));
        btnView.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnView.setForeground(new java.awt.Color(255, 255, 0));
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        jPanel2.add(btnView);
        btnView.setBounds(160, 230, 72, 32);

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
        btnUpdate.setBounds(270, 230, 100, 32);

        btnDelete.setBackground(new java.awt.Color(0, 0, 204));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 0));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btnDelete);
        btnDelete.setBounds(410, 230, 85, 32);

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UserID", "Username", "Password", "Email", "Position"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userTable);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(30, 290, 620, 170);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 692, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 491, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
       DefaultTableModel model = (DefaultTableModel) userTable.getModel();
    
    // Connect to the database
    try (Connection con = DBConnection.getConnection()) {
        String query = "SELECT * FROM UserType";
        try (PreparedStatement pst = con.prepareStatement(query);
             ResultSet rs = pst.executeQuery()) {

            // Loop through the result set and add rows to the table
            while (rs.next()) {
                String dbUserId = rs.getString("userId"); // Get the userId as a String from the database
                String username = rs.getString("username");
                String password = rs.getString("password");
                String email = rs.getString("email");
                String position = rs.getString("position");

                // Check if the userId already exists in the JTable
                boolean userExists = false;
                for (int i = 0; i < model.getRowCount(); i++) {
                    String tableUserId = (String) model.getValueAt(i, 0); // Get the userId from the table as String
                    if (tableUserId.equals(dbUserId)) { // Compare userId as String
                        userExists = true;
                        break;
                    }
                }

                // If the userId already exists, show an error message and skip adding this row
                if (userExists) {
                    JOptionPane.showMessageDialog(this, "User ID " + dbUserId + " already exists in the table.", "Validation Error", JOptionPane.WARNING_MESSAGE);
                    continue; // Skip adding this record to the table
                }

                // Add data to the table if the userId doesn't exist
                model.addRow(new Object[]{dbUserId, username, password, email, position});
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error loading data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "User ID must be a valid number.", "Validation Error", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
         DefaultTableModel model = (DefaultTableModel) userTable.getModel();

    // Get the selected row index
    int selectedRowIndex = userTable.getSelectedRow();

    // Check if a row is selected
    if (selectedRowIndex == -1) {
        JOptionPane.showMessageDialog(this, "Please select a row to update.", "Selection Error", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Get the user ID from the selected row (assuming userId is in the first column)
    String userId = (String) model.getValueAt(selectedRowIndex, 0); // Get userId as a String
    String username = (String) model.getValueAt(selectedRowIndex, 1); // Assuming username is in the second column
    String password = (String) model.getValueAt(selectedRowIndex, 2); // Assuming password is in the third column
    String email = (String) model.getValueAt(selectedRowIndex, 3); // Assuming email is in the fourth column
    String position = (String) model.getValueAt(selectedRowIndex, 4); // Assuming position is in the fifth column

    // Prompt user to update the information
    String newUsername = JOptionPane.showInputDialog(this, "Enter new username:", username);
    String newPassword = JOptionPane.showInputDialog(this, "Enter new password:", password);
    String newEmail = JOptionPane.showInputDialog(this, "Enter new email:", email);
    String newPosition = JOptionPane.showInputDialog(this, "Enter new position:", position);

    // Validate input (simple validation)
    if (newUsername.isEmpty() || newPassword.isEmpty() || newEmail.isEmpty() || newPosition.isEmpty()) {
        JOptionPane.showMessageDialog(this, "All fields must be filled out.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Check if the email format is valid
    if (!newEmail.matches("^[\\w-\\.]+@[\\w-\\.]+\\.\\w+$")) {
        JOptionPane.showMessageDialog(this, "Please enter a valid email address.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    // Optional: Add additional validation for the userId if needed, like ensuring it's alphanumeric
    if (!userId.matches("^[a-zA-Z0-9]+$")) {
        JOptionPane.showMessageDialog(this, "User ID must be alphanumeric.", "Validation Error", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Update the database with the new values
    try (Connection con = DBConnection.getConnection()) {
        String query = "UPDATE UserType SET username = ?, password = ?, email = ?, position = ? WHERE userId = ?";
        try (PreparedStatement pst = con.prepareStatement(query)) {
            pst.setString(1, newUsername);
            pst.setString(2, newPassword);
            pst.setString(3, newEmail);
            pst.setString(4, newPosition);
            pst.setString(5, userId);  // Make sure userId is passed as a String

            int rowsUpdated = pst.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(this, "User data updated successfully.", "Update Success", JOptionPane.INFORMATION_MESSAGE);

                // Update the table with the new values
                model.setValueAt(newUsername, selectedRowIndex, 1);
                model.setValueAt(newPassword, selectedRowIndex, 2);
                model.setValueAt(newEmail, selectedRowIndex, 3);
                model.setValueAt(newPosition, selectedRowIndex, 4);
            } else {
                JOptionPane.showMessageDialog(this, "Error updating user data.", "Update Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error updating data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        DefaultTableModel model = (DefaultTableModel) userTable.getModel();

    // Get the selected row index
    int selectedRowIndex = userTable.getSelectedRow();

    // Check if a row is selected
    if (selectedRowIndex == -1) {
        JOptionPane.showMessageDialog(this, "Please select a row to delete.", "Selection Error", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Get the user ID from the selected row (assuming userId is in the first column)
    String userId = (String) model.getValueAt(selectedRowIndex, 0); // Assuming userId is in the first column

    // Confirm deletion with the user
    int confirmation = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this user?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);

    if (confirmation == JOptionPane.YES_OPTION) {
        // Delete the user from the database
        try (Connection con = DBConnection.getConnection()) {
            String query = "DELETE FROM UserType WHERE userId = ?";
            try (PreparedStatement pst = con.prepareStatement(query)) {
                pst.setString(1, userId); // Use setString for userId (since it's a String)

                int rowsDeleted = pst.executeUpdate();
                if (rowsDeleted > 0) {
                    JOptionPane.showMessageDialog(this, "User deleted successfully.", "Deletion Success", JOptionPane.INFORMATION_MESSAGE);

                    // Remove the row from the JTable
                    model.removeRow(selectedRowIndex);
                } else {
                    JOptionPane.showMessageDialog(this, "Error deleting user data.", "Deletion Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error deleting data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
       txtUserId.setText("");
        txtUsername.setText("");
        txtPassword.setText("");
        txtEmail.setText("");
        cmbPosition.setSelectedIndex(0);

    }//GEN-LAST:event_btnClearActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
      String userId = txtUserId.getText();
    String userName = txtUsername.getText();
    String passwd = txtPassword.getText();
    String email = txtEmail.getText();
    String position = (String) cmbPosition.getSelectedItem();

    if (userId.isEmpty() || userName.isEmpty() || passwd.isEmpty() || email.isEmpty() || position.isEmpty()) {
        JOptionPane.showMessageDialog(this, "All fields are required.", "Validation Error", JOptionPane.WARNING_MESSAGE);
        return;
    }

    if (!email.matches("^[\\w-\\.]+@[\\w-\\.]+\\.\\w+$")) {
        JOptionPane.showMessageDialog(this, "Please enter a valid email address.", "Validation Error", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Optional: Add additional validation for the userId if needed, like ensuring it's alphanumeric
    if (!userId.matches("^[a-zA-Z0-9]+$")) {
        JOptionPane.showMessageDialog(this, "User ID must be alphanumeric.", "Validation Error", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Prevent duplicate User ID in JTable (compare as string)
    DefaultTableModel model = (DefaultTableModel) userTable.getModel();
    for (int i = 0; i < model.getRowCount(); i++) {
        if (model.getValueAt(i, 0).toString().equals(userId)) {
            JOptionPane.showMessageDialog(this, "User ID already exists in the table.", "Validation Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }

    try (Connection con = DBConnection.getConnection()) {
        String query = "INSERT INTO UserType (userId, username, password, email, position) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement pst = con.prepareStatement(query)) {
            pst.setString(1, userId);  // Set userId as string
            pst.setString(2, userName);
            pst.setString(3, passwd);
            pst.setString(4, email);
            pst.setString(5, position);

            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "User record created successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);

                // Add row to the table
                model.addRow(new Object[]{userId, userName, passwd, email, position});
            } else {
                JOptionPane.showMessageDialog(this, "Failed to create the record.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnCreateActionPerformed

    


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
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                      String source = "Admin_dashboard"; 
        if ("Admin_dashboard".equals(source)) {
            new User("Admin_dashboard").setVisible(true);
        }else if ("CM_dashboard".equals(source)) {
            new User("CM_dashboard").setVisible(true); 
        }
        
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JComboBox<String> cmbPosition;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserId;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTable userTable;
    // End of variables declaration//GEN-END:variables

   

    
}