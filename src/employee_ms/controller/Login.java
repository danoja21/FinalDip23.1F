
package employee_ms.controller;

import employee_ms.model.DBConnection;
import employee_ms.view.Admin_dashboard;
import employee_ms.view.CEO_dashboard;
import employee_ms.view.CM_dashboard;
import employee_ms.view.PM_dashboard;
import employee_ms.view.FM_dashboard;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    
    //Validation
    public boolean validateLogin(){
       String uname = txt_Username.getText();
       char[] passwordChars = pwd_Password.getPassword();
      String Passwd = new String(passwordChars);
      String Position = (String)cmbPosition.getSelectedItem();
       if (uname.equals("")) {
            JOptionPane.showMessageDialog(this, "Please Enter Username");
            return false;
        } else if (Passwd.equals("")) {
            JOptionPane.showMessageDialog(this, "Please Enter Password");
            return false;
        }else if (Position.equals("")) {
            JOptionPane.showMessageDialog(this, "Select the Position");
            return false;
        }
        return true;
    }
    
    //verify credentials
    public boolean login() {
        String Username = txt_Username.getText();
        char[] passwordChars = pwd_Password.getPassword();
        String Passwd = new String(passwordChars);
        String Position = (String)cmbPosition.getSelectedItem();
        
         try (Connection con = DBConnection.getConnection()) {
            String query = "SELECT * FROM usertype WHERE username = ? AND password = ? AND position = ?";
            try (PreparedStatement pst = con.prepareStatement(query)) {
                pst.setString(1, Username);
                pst.setString(2, Passwd);
                 pst.setString(3, Position);

                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    return true; // Login Successful
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage());
        }
        return false; // Login Failed
    }
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_Username = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        rSPanelImage3 = new rojerusan.RSPanelImage();
        pwd_Password = new javax.swing.JPasswordField();
        Show_PasswordCheckBox = new javax.swing.JCheckBox();
        btn_Login = new javax.swing.JButton();
        btn_Reset_Password = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        cmbPosition = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginPanel1.setBackground(new java.awt.Color(255, 255, 255));
        loginPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("User Login ");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 130, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("ArchiTech CAD Academy");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 229, 30));

        txt_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_UsernameActionPerformed(evt);
            }
        });
        jPanel3.add(txt_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 230, 31));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Position");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 110, 35));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("User Name");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 110, 35));

        rSPanelImage3.setImagen(new javax.swing.ImageIcon(getClass().getResource("/images/OIP copy.png"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage3Layout = new javax.swing.GroupLayout(rSPanelImage3);
        rSPanelImage3.setLayout(rSPanelImage3Layout);
        rSPanelImage3Layout.setHorizontalGroup(
            rSPanelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        rSPanelImage3Layout.setVerticalGroup(
            rSPanelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        jPanel3.add(rSPanelImage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));
        jPanel3.add(pwd_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 230, 30));

        Show_PasswordCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Show_PasswordCheckBox.setForeground(new java.awt.Color(255, 255, 0));
        Show_PasswordCheckBox.setText("Show Password");
        Show_PasswordCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Show_PasswordCheckBoxActionPerformed(evt);
            }
        });
        jPanel3.add(Show_PasswordCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, -1, -1));

        btn_Login.setBackground(new java.awt.Color(0, 0, 204));
        btn_Login.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Login.setForeground(new java.awt.Color(255, 255, 0));
        btn_Login.setText("Login");
        btn_Login.setBorder(null);
        btn_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LoginActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 425, 220, 30));

        btn_Reset_Password.setBackground(new java.awt.Color(0, 0, 204));
        btn_Reset_Password.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Reset_Password.setForeground(new java.awt.Color(255, 255, 0));
        btn_Reset_Password.setText("Reset Password?");
        btn_Reset_Password.setBorder(null);
        btn_Reset_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Reset_PasswordActionPerformed(evt);
            }
        });
        jPanel3.add(btn_Reset_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 220, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Password");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 110, 35));

        cmbPosition.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cmbPosition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CEO", "Center Manager", "Financial Manager", "Admin", "Program Manager" }));
        jPanel3.add(cmbPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 230, 30));

        loginPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 520));

        getContentPane().add(loginPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_UsernameActionPerformed

    private void Show_PasswordCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Show_PasswordCheckBoxActionPerformed
        if (Show_PasswordCheckBox.isSelected()) {
            pwd_Password.setEchoChar((char) 0); // Show password
        } else {
            pwd_Password.setEchoChar('*'); // Hide password
        }
    }//GEN-LAST:event_Show_PasswordCheckBoxActionPerformed

    private void btn_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LoginActionPerformed
        if (validateLogin()) {
            
            if (login()) {
                String Position = (String) cmbPosition.getSelectedItem(); // Get the selected position
            JOptionPane.showMessageDialog(this, "Login Successful!");
            this.dispose();  // Close the login window

            // Open the respective dashboard based on the position
            switch (Position) {
                case "Admin":
                     new Admin_dashboard().setVisible(true);
                    break;
                case "CEO":
                     new CEO_dashboard().setVisible(true);
                    break;
                case "Center Manager":
                     new CM_dashboard().setVisible(true);
                    break;
                case "Program Manager":
                     new PM_dashboard().setVisible(true);
                    break;
                case "Financial Manager":
                     new FM_dashboard().setVisible(true);
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "Unknown position!"); 
                    break;
            }
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or password.");
            }
        }
    }//GEN-LAST:event_btn_LoginActionPerformed

    private void btn_Reset_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Reset_PasswordActionPerformed
        reset_password obj = new reset_password();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_Reset_PasswordActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel 
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Show_PasswordCheckBox;
    private javax.swing.JButton btn_Login;
    private javax.swing.JButton btn_Reset_Password;
    private javax.swing.JComboBox<String> cmbPosition;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel loginPanel1;
    private javax.swing.JPasswordField pwd_Password;
    private rojerusan.RSPanelImage rSPanelImage3;
    private javax.swing.JTextField txt_Username;
    // End of variables declaration//GEN-END:variables
}

