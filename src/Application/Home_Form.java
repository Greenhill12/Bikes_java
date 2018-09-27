package Application;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Home_Form extends javax.swing.JFrame {
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_SCHEDULE_ = new javax.swing.JMenu();
        jMenu_EMPLOYEES_ = new javax.swing.JMenu();
        jMenu_INVENTORY_ = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("File");
        jMenuBar3.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar3.add(jMenu4);

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 204, 255));
        jLabel1.setFont(new java.awt.Font("BankGothic Lt BT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ELECTRIC BIKE MANAGER");

        jMenu_SCHEDULE_.setBackground(new java.awt.Color(51, 204, 0));
        jMenu_SCHEDULE_.setForeground(new java.awt.Color(0, 0, 153));
        jMenu_SCHEDULE_.setText(" SCHEDULE |");
        jMenu_SCHEDULE_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu_SCHEDULE_.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jMenu_SCHEDULE_.setOpaque(true);
        jMenu_SCHEDULE_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu_SCHEDULE_MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu_SCHEDULE_);

        jMenu_EMPLOYEES_.setBackground(new java.awt.Color(51, 204, 0));
        jMenu_EMPLOYEES_.setForeground(new java.awt.Color(0, 0, 153));
        jMenu_EMPLOYEES_.setText(" EMPLOYEES |");
        jMenu_EMPLOYEES_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu_EMPLOYEES_.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jMenu_EMPLOYEES_.setOpaque(true);
        jMenu_EMPLOYEES_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu_EMPLOYEES_MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu_EMPLOYEES_);

        jMenu_INVENTORY_.setBackground(new java.awt.Color(51, 204, 0));
        jMenu_INVENTORY_.setForeground(new java.awt.Color(0, 0, 153));
        jMenu_INVENTORY_.setText(" INVENTORY");
        jMenu_INVENTORY_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu_INVENTORY_.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jMenu_INVENTORY_.setOpaque(true);
        jMenu_INVENTORY_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu_INVENTORY_MouseClicked(evt);
            }
        });
        jMenu_INVENTORY_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_INVENTORY_ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu_INVENTORY_);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu_INVENTORY_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_INVENTORY_ActionPerformed
        
    }//GEN-LAST:event_jMenu_INVENTORY_ActionPerformed

    // open the inventory form
    private void jMenu_INVENTORY_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu_INVENTORY_MouseClicked
        
        Inventory_MANAGE_Form inventoryForm = new Inventory_MANAGE_Form();
        inventoryForm.pack();
        inventoryForm.setVisible(true);
        inventoryForm.setLocationRelativeTo(null);
        inventoryForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_jMenu_INVENTORY_MouseClicked

    // open the schedule form
    private void jMenu_SCHEDULE_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu_SCHEDULE_MouseClicked
        
        Schedule_MANAGE_Form scheduleForm = new Schedule_MANAGE_Form();
        scheduleForm.pack();
        scheduleForm.setVisible(true);
        scheduleForm.setLocationRelativeTo(null);
        scheduleForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_jMenu_SCHEDULE_MouseClicked

    // open the employees form
    private void jMenu_EMPLOYEES_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu_EMPLOYEES_MouseClicked
        
        Employees_MANAGE_Form employeesForm = new Employees_MANAGE_Form();
        employeesForm.pack();
        employeesForm.setVisible(true);
        employeesForm.setLocationRelativeTo(null);
        employeesForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_jMenu_EMPLOYEES_MouseClicked

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
            java.util.logging.Logger.getLogger(Home_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu jMenu_EMPLOYEES_;
    private javax.swing.JMenu jMenu_INVENTORY_;
    private javax.swing.JMenu jMenu_SCHEDULE_;
    // End of variables declaration//GEN-END:variables
}
