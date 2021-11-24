
import java.awt.Color;
import javax.swing.JOptionPane;

public class Reg extends javax.swing.JFrame {

   
    public Reg() {
       initComponents();
        
       firstname.setBackground(new Color(0 , 0 , 0,64));
       email.setBackground(new Color(0 , 0 , 0,64));
       lastname.setBackground(new Color(0 , 0 , 0,64));
       gender.setBackground(new Color(0 , 0 , 0,64));
       address.setBackground(new Color(0 , 0 , 0,64));
       age.setBackground(new Color(0 , 0 , 0,64));
       firstname.setOpaque(false);
       email.setOpaque(false);
       lastname.setOpaque(false);
       gender.setOpaque(false);
       address.setOpaque(false);
       age.setOpaque(false);
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        gender = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lastname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(null);
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
        jLabel3.setBounds(30, 260, 70, 30);

        firstname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameActionPerformed(evt);
            }
        });
        jPanel2.add(firstname);
        firstname.setBounds(120, 170, 170, 40);

        email.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel2.add(email);
        email.setBounds(120, 260, 360, 40);

        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(290, 500, 125, 44);

        jLabel4.setFont(new java.awt.Font("HP Simplified Hans", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("First Name");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 170, 100, 40);

        jLabel5.setFont(new java.awt.Font("HP Simplified Hans", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Gender");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 340, 90, 40);
        jPanel2.add(jLabel6);
        jLabel6.setBounds(70, 280, 0, 0);

        jLabel7.setFont(new java.awt.Font("HP Simplified Hans", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Address");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(10, 430, 100, 40);

        gender.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel2.add(gender);
        gender.setBounds(120, 340, 120, 40);

        address.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        jPanel2.add(address);
        address.setBounds(120, 430, 540, 40);

        jLabel8.setFont(new java.awt.Font("HP Simplified Hans", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Last Name");
        jLabel8.setAutoscrolls(true);
        jPanel2.add(jLabel8);
        jLabel8.setBounds(360, 170, 80, 40);

        lastname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
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
        jLabel9.setBounds(380, 340, 80, 40);

        age.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jPanel2.add(age);
        age.setBounds(450, 340, 130, 40);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/reg2.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(0, 0, 700, 570);

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
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
       
    }//GEN-LAST:event_addressActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String fname,lname,el,gndr,add;
        String ag;
        fname=firstname.getText();
        lname=lastname.getText();
        gndr=gender.getText();
        el=email.getText();
        add=address.getText();
        ag=age.getText();
       boolean num=false;
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
        if(("".equals(el)) || ("".equals(fname)) || ("".equals(lname)) ||("".equals(gndr))||("".equals(add))||("".equals(ag)))
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
            E_magazine e=new E_magazine();
            e.setVisible(true);}
        }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
      
    }//GEN-LAST:event_emailActionPerformed

    private void firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameActionPerformed
    
    }//GEN-LAST:event_firstnameActionPerformed

    private void lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameActionPerformed
    
    }//GEN-LAST:event_lastnameActionPerformed

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
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JTextField email;
    private javax.swing.JTextField firstname;
    private javax.swing.JTextField gender;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
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
    // End of variables declaration//GEN-END:variables
}
