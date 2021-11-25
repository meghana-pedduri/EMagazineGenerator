
import java.awt.Color;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;

public class Reg extends javax.swing.JFrame {

   
    public Reg() {
       initComponents();
        
       firstname.setBackground(new Color(0 , 0 , 0,64));
       email.setBackground(new Color(0 , 0 , 0,64));
       lastname.setBackground(new Color(0 , 0 , 0,64));
       gender.setBackground(new Color(0 , 0 , 0,64));
       
       age.setBackground(new Color(0 , 0 , 0,64));
       firstname.setOpaque(false);
       email.setOpaque(false);
       lastname.setOpaque(false);
       gender.setOpaque(false);
      
       age.setOpaque(false);
      
       this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lastname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox<>();
        close = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        retypePassword = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 204));
        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel2.setToolTipText("");
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Bodoni MT Black", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registeration");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(170, 20, 370, 94);

        jLabel3.setFont(new java.awt.Font("HP Simplified Hans", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Email ID");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(40, 240, 70, 30);

        firstname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        firstname.setForeground(new java.awt.Color(255, 255, 255));
        firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameActionPerformed(evt);
            }
        });
        jPanel2.add(firstname);
        firstname.setBounds(130, 170, 200, 40);

        email.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel2.add(email);
        email.setBounds(130, 240, 450, 40);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(102, 0, 102));
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(290, 440, 125, 44);

        jLabel4.setFont(new java.awt.Font("HP Simplified Hans", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("First Name");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(30, 170, 100, 40);

        jLabel5.setFont(new java.awt.Font("HP Simplified Hans", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Retype Password");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(340, 360, 130, 40);

        jLabel8.setFont(new java.awt.Font("HP Simplified Hans", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Last Name");
        jLabel8.setAutoscrolls(true);
        jPanel2.add(jLabel8);
        jLabel8.setBounds(360, 170, 80, 40);

        lastname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lastname.setForeground(new java.awt.Color(255, 255, 255));
        lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameActionPerformed(evt);
            }
        });
        jPanel2.add(lastname);
        lastname.setBounds(450, 170, 200, 40);

        jLabel9.setFont(new java.awt.Font("HP Simplified Hans", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Age");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(370, 300, 80, 40);

        age.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        age.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(age);
        age.setBounds(450, 300, 130, 40);

        gender.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gender.setForeground(new java.awt.Color(255, 255, 255));
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Female", "Male ", "Other" }));
        jPanel2.add(gender);
        gender.setBounds(130, 300, 150, 40);

        close.setBackground(new java.awt.Color(255, 51, 51));
        close.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        close.setForeground(new java.awt.Color(255, 255, 255));
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("X");
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        jPanel2.add(close);
        close.setBounds(670, 10, 20, 22);

        minimize.setBackground(new java.awt.Color(255, 51, 51));
        minimize.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        minimize.setForeground(new java.awt.Color(255, 255, 255));
        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setText("-");
        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        jPanel2.add(minimize);
        minimize.setBounds(650, 10, 20, 20);

        jLabel7.setFont(new java.awt.Font("HP Simplified Hans", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Gender");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(30, 300, 90, 40);

        jLabel6.setFont(new java.awt.Font("HP Simplified Hans", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Password");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(40, 360, 90, 40);

        password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.add(password);
        password.setBounds(130, 360, 180, 40);

        retypePassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.add(retypePassword);
        retypePassword.setBounds(480, 360, 180, 40);

        jLabel10.setBackground(new java.awt.Color(51, 51, 51));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/reg2.jpg"))); // NOI18N
        jPanel2.add(jLabel10);
        jLabel10.setBounds(0, 0, 700, 510);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String fname,lname,el,gndr,psswd,retypePsswd;
        String ag;
        fname=firstname.getText();
        lname=lastname.getText();
        gndr=gender.getSelectedItem().toString();
        el=email.getText();
        ag=age.getText();
        psswd = new String(password.getPassword());
        retypePsswd = new String(retypePassword.getPassword());
       boolean num=false;
       
//       PreparedStatement ps;
//       String query = "INSERT INTO `user_details`(`fname`, `lname`, `email`, `gender`, `age`, `password`) VALUES (?,?,?,?,?,?)";
//       
//       try{
//                  ps = myConnection.getConnection().prepareStatement(query);
//                  ps.setString(1,fname);
//                  ps.setString(2,lname);
//                  ps.setString(3,el);
//                  ps.setString(4,gndr);
//                  ps.setString(5,ag);
//                  ps.setString(6,psswd);
//                  
//                  if(ps.executeUpdate()>0){
//                      JOptionPane.showMessageDialog(null, "New User Added");
//                  }
//       }catch(Exception e){
//           System.out.println(e.getMessage());
//       }
       
       
        try
        {
            double y=Double.parseDouble(ag);
        }
        catch(NumberFormatException e)
        {
            num=true;
        }
        if(num)
        {
            System.out.println();
            JOptionPane.showMessageDialog(null, "Please enter Valid Age");
        }
        else{
        if(("".equals(el)) || ("".equals(fname)) || ("".equals(lname)) ||("".equals(gndr))||("".equals(ag)) || ("".equals(psswd)))
        {
            System.out.println();
            JOptionPane.showMessageDialog(null, "Please enter all the fields");

        }
        else
        {
            if(!(el.contains("@")))
            {
              System.out.println();
            JOptionPane.showMessageDialog(null, "Please enter Valid E-Mail");  
            }
            else{
             
                if(!psswd.equals(retypePsswd)){
                  System.out.println();
                  JOptionPane.showMessageDialog(null, "Password not matched");  
                }
            
            else{
        PreparedStatement ps;
       String query = "INSERT INTO `user_details`(`fname`, `lname`, `email`, `gender`, `age`, `password`) VALUES (?,?,?,?,?,?)";
       
       try{
                  ps = myConnection.getConnection().prepareStatement(query);
                  ps.setString(1,fname);
                  ps.setString(2,lname);
                  ps.setString(3,el);
                  ps.setString(4,gndr);
                  ps.setString(5,ag);
                  ps.setString(6,psswd);
                  
                  if(ps.executeUpdate()>0){
                      System.out.println();
                      JOptionPane.showMessageDialog(null, "New User Added");
                  }
                  
            E_magazine e=new E_magazine();
            e.setVisible(true);
       }catch(Exception e){
           System.out.println(e.getMessage());
       }
           }
          }
        }
        
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
      
    }//GEN-LAST:event_emailActionPerformed

    private void firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameActionPerformed
    
    }//GEN-LAST:event_firstnameActionPerformed

    private void lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameActionPerformed
    
    }//GEN-LAST:event_lastnameActionPerformed

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

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
            java.util.logging.Logger.getLogger(Reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age;
    private javax.swing.JLabel close;
    private javax.swing.JTextField email;
    private javax.swing.JTextField firstname;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lastname;
    private javax.swing.JLabel minimize;
    private javax.swing.JPasswordField password;
    private javax.swing.JPasswordField retypePassword;
    // End of variables declaration//GEN-END:variables
}
