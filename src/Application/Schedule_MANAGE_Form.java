package Application;

import Class.Schedule;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class Schedule_MANAGE_Form extends javax.swing.JFrame {

    public Schedule_MANAGE_Form() {
        initComponents();
        
        populateJtable();
        
        jTable_SCHEDULE.setShowGrid(true);
        
        jTable_SCHEDULE.setGridColor(Color.BLACK);
        
        jTable_SCHEDULE.setSelectionBackground(Color.gray);
        
        JTableHeader th = jTable_SCHEDULE.getTableHeader();

        th.setFont(new Font("Tahoma", Font.PLAIN, 16));
    }

    // function to populate the jtable with rental data
    public void populateJtable(){
        
        Schedule rental = new Schedule();
        ArrayList<Schedule> ScheduleList = rental.ScheduleList();
        
        String[] colNames = {"Name","Surname","Phone","Brand","Model","Start Date","End Date"};
        Object[][] rows = new Object[ScheduleList.size()][7];

        for(int i = 0; i < ScheduleList.size(); i++){
          
            rows[i][0] = ScheduleList.get(i).getName();
            rows[i][1] = ScheduleList.get(i).getSurname();
            rows[i][2] = ScheduleList.get(i).getPhone();
            rows[i][3] = ScheduleList.get(i).getBrand();            
            rows[i][4] = ScheduleList.get(i).getModel();
            rows[i][5] = ScheduleList.get(i).getStart();
            rows[i][6] = ScheduleList.get(i).getEnd();          
        }
        
        DefaultTableModel mmodel = new DefaultTableModel(rows, colNames);
        jTable_SCHEDULE.setModel(mmodel);
        jTable_SCHEDULE.setRowHeight(45);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_SCHEDULE = new javax.swing.JTable();
        jButton_ADD_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 204, 0));

        jTable_SCHEDULE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_SCHEDULE.setSelectionBackground(new java.awt.Color(153, 153, 153));
        jScrollPane1.setViewportView(jTable_SCHEDULE);

        jButton_ADD_.setBackground(new java.awt.Color(30, 130, 76));
        jButton_ADD_.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton_ADD_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_ADD_.setText("Add");
        jButton_ADD_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ADD_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_ADD_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_ADD_, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // button add a new user
    private void jButton_ADD_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ADD_ActionPerformed

        Schedule_INSERT_Form scheduleForm = new Schedule_INSERT_Form();
        scheduleForm.pack();
        scheduleForm.setVisible(true);
        scheduleForm.setLocationRelativeTo(null);
        scheduleForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }//GEN-LAST:event_jButton_ADD_ActionPerformed

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
            java.util.logging.Logger.getLogger(Schedule_MANAGE_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Schedule_MANAGE_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Schedule_MANAGE_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Schedule_MANAGE_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Schedule_MANAGE_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_ADD_;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_SCHEDULE;
    // End of variables declaration//GEN-END:variables
}
