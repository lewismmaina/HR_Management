
import static java.lang.Thread.sleep;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class welcome extends javax.swing.JFrame {

    /**
     * Creates new form welcome
     */
    public welcome() {
        initComponents();
        currentTimeDate();
    }
public welcome(String para){
        initComponents();
        
        jTextField_User.setText(para);
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBtn_SalaryDetails = new javax.swing.JButton();
        jBtn_SalaryDetails1 = new javax.swing.JButton();
        jBtn_Add = new javax.swing.JButton();
        jBtn_Exit = new javax.swing.JButton();
        jBtn_SalaryDetails2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField_User = new javax.swing.JLabel();
        jLabel_Date = new javax.swing.JLabel();
        jLabel_Time = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("BARAKA ROSES");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Click on the Required Service:");

        jBtn_SalaryDetails.setBackground(new java.awt.Color(255, 51, 51));
        jBtn_SalaryDetails.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBtn_SalaryDetails.setText("1.Daily Details");
        jBtn_SalaryDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_SalaryDetailsActionPerformed(evt);
            }
        });

        jBtn_SalaryDetails1.setBackground(new java.awt.Color(255, 51, 51));
        jBtn_SalaryDetails1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBtn_SalaryDetails1.setText("2.Salary Details");
        jBtn_SalaryDetails1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_SalaryDetails1ActionPerformed(evt);
            }
        });

        jBtn_Add.setBackground(new java.awt.Color(255, 51, 51));
        jBtn_Add.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBtn_Add.setText("4.Add/Modify Records/Users");
        jBtn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_AddActionPerformed(evt);
            }
        });

        jBtn_Exit.setBackground(new java.awt.Color(255, 51, 51));
        jBtn_Exit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBtn_Exit.setText("5.Quit");
        jBtn_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_ExitActionPerformed(evt);
            }
        });

        jBtn_SalaryDetails2.setBackground(new java.awt.Color(255, 51, 51));
        jBtn_SalaryDetails2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBtn_SalaryDetails2.setText("3.Advance Request");
        jBtn_SalaryDetails2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_SalaryDetails2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Welcome");

        jTextField_User.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel_Date.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel_Time.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                                .addComponent(jLabel_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel_Time, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField_User, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtn_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jBtn_SalaryDetails1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtn_SalaryDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtn_SalaryDetails2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBtn_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel_Time, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_User, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addComponent(jBtn_SalaryDetails)
                .addGap(37, 37, 37)
                .addComponent(jBtn_SalaryDetails1)
                .addGap(34, 34, 34)
                .addComponent(jBtn_SalaryDetails2)
                .addGap(42, 42, 42)
                .addComponent(jBtn_Add)
                .addGap(45, 45, 45)
                .addComponent(jBtn_Exit)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void currentTimeDate(){
        Thread clock=new Thread(){
        public void run(){
            for(;;){
                Calendar cal=new GregorianCalendar();
    int second=cal.get(Calendar.SECOND);
    int minute=cal.get(Calendar.MINUTE);
    int hour=cal.get(Calendar.HOUR); 
    jLabel_Time.setText("Current Time  "+hour+":"+minute+":"+second);
    
    
    int day=cal.get(Calendar.DAY_OF_MONTH);
    int month=cal.get(Calendar.MONTH);
    int year=cal.get(Calendar.YEAR); 
    jLabel_Date.setText("Current Date  "+day+"/"+(month+1)+"/"+year);
     try{
         sleep (1000);  
    }catch (InterruptedException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        }
        };
        clock.start();
    }
    private void jBtn_SalaryDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_SalaryDetailsActionPerformed

        new DailyDet().setVisible(true);
        this.setVisible(false);;

    }//GEN-LAST:event_jBtn_SalaryDetailsActionPerformed

    private void jBtn_SalaryDetails1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_SalaryDetails1ActionPerformed

        new SalaryDetails().setVisible(true);
        this.setVisible(false);;

    }//GEN-LAST:event_jBtn_SalaryDetails1ActionPerformed

    private void jBtn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_AddActionPerformed
        new AdminLogin().setVisible(true);
        this.setVisible(false);;

    }//GEN-LAST:event_jBtn_AddActionPerformed

    private void jBtn_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_ExitActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jBtn_ExitActionPerformed

    private void jBtn_SalaryDetails2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_SalaryDetails2ActionPerformed
        new myadvance().setVisible(true);
        this.setVisible(false);;
    }//GEN-LAST:event_jBtn_SalaryDetails2ActionPerformed

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
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_Add;
    private javax.swing.JButton jBtn_Exit;
    private javax.swing.JButton jBtn_SalaryDetails;
    private javax.swing.JButton jBtn_SalaryDetails1;
    private javax.swing.JButton jBtn_SalaryDetails2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_Date;
    private javax.swing.JLabel jLabel_Time;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jTextField_User;
    // End of variables declaration//GEN-END:variables
}