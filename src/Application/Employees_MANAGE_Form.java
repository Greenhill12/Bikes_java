package Application;

import Class.Employees;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class Employees_MANAGE_Form extends javax.swing.JFrame {

    public Employees_MANAGE_Form() {
        initComponents();
        
        populateJtable();
        
        jTable_EMPLOYEES_.setShowGrid(true);
        
        jTable_EMPLOYEES_.setGridColor(Color.YELLOW);
        
        jTable_EMPLOYEES_.setSelectionBackground(Color.gray);
        
        JTableHeader th = jTable_EMPLOYEES_.getTableHeader();

        th.setFont(new Font("Tahoma", Font.PLAIN, 16));
    }
    
    // function to populate the jtable with customers data
    public void populateJtable(){
        
        Employees employee = new Employees();
        ArrayList<Employees> EmployeesList = employee.employeesList();
        
        String[] colNames = {"ID","Name","Surname","Phone"};
        Object[][] rows = new Object[EmployeesList.size()][4];
        DefaultTableModel model = (DefaultTableModel) jTable_EMPLOYEES_.getModel();
        
        for(int i = 0; i < EmployeesList.size(); i++){
            rows[i][0] = EmployeesList.get(i).getId();
            rows[i][1] = EmployeesList.get(i).getName();
            rows[i][2] = EmployeesList.get(i).getSurname();
            rows[i][3] = EmployeesList.get(i).getPhone();
        }
        
        model.setDataVector(rows, colNames);

        jTable_EMPLOYEES_.setModel(model);
        jTable_EMPLOYEES_.setRowHeight(45);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_EMPLOYEES_ = new javax.swing.JTable();
        jTextField_ID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_NAME = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField_SURNAME = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField_PHONE = new javax.swing.JTextField();
        jButton_INSERT_ = new javax.swing.JButton();
        jButton_DELETE_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 204, 0));

        jTable_EMPLOYEES_.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_EMPLOYEES_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_EMPLOYEES_MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_EMPLOYEES_);

        jTextField_ID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("First Name:");

        jTextField_NAME.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Last Name:");

        jTextField_SURNAME.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Phone:");

        jTextField_PHONE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton_INSERT_.setBackground(new java.awt.Color(30, 130, 76));
        jButton_INSERT_.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton_INSERT_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_INSERT_.setText("Insert");
        jButton_INSERT_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_INSERT_ActionPerformed(evt);
            }
        });

        jButton_DELETE_.setBackground(new java.awt.Color(246, 36, 89));
        jButton_DELETE_.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton_DELETE_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_DELETE_.setText("Remove");
        jButton_DELETE_.setMaximumSize(new java.awt.Dimension(60, 30));
        jButton_DELETE_.setMinimumSize(new java.awt.Dimension(60, 30));
        jButton_DELETE_.setPreferredSize(new java.awt.Dimension(60, 30));
        jButton_DELETE_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DELETE_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel3)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_NAME, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(jTextField_ID, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField_SURNAME, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField_PHONE, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_DELETE_, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                            .addComponent(jButton_INSERT_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField_NAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField_SURNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField_PHONE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addComponent(jButton_INSERT_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_DELETE_, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // button delete
    private void jButton_DELETE_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DELETE_ActionPerformed

        try{
            Integer id = Integer.valueOf(jTextField_ID.getText());
            Employees.deleteEmployee(id);
            populateJtable();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Select a Employee Before Removing", "No Employee Selected", 1);
        }
    }//GEN-LAST:event_jButton_DELETE_ActionPerformed

    // button insert
    private void jButton_INSERT_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_INSERT_ActionPerformed

        if(verifFields())
        {
            String name = jTextField_NAME.getText();
            String surname = jTextField_SURNAME.getText();
            String phone = jTextField_PHONE.getText();

            Employees employee = new Employees(null, name, surname, phone);
            Employees.insertEmployee(employee);
            populateJtable();
        }
    }//GEN-LAST:event_jButton_INSERT_ActionPerformed

    // get selected customer from jtable to textfields
    private void jTable_EMPLOYEES_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_EMPLOYEES_MouseClicked

        try{

            Integer rowIndex = jTable_EMPLOYEES_.getSelectedRow();
            jTextField_ID.setText(jTable_EMPLOYEES_.getValueAt(rowIndex, 0).toString());
            jTextField_NAME.setText(jTable_EMPLOYEES_.getValueAt(rowIndex, 1).toString());
            jTextField_SURNAME.setText(jTable_EMPLOYEES_.getValueAt(rowIndex, 2).toString());
            jTextField_PHONE.setText(jTable_EMPLOYEES_.getValueAt(rowIndex, 3).toString());
           
        }catch(Exception ex){

        }
    }//GEN-LAST:event_jTable_EMPLOYEES_MouseClicked

    // function to check empty fields
    public boolean verifFields()
    {
        if(jTextField_NAME.getText().equals("") || jTextField_SURNAME.getText().equals("") || jTextField_PHONE.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "One Or More Fields Are Empty", "Empty Fields", 0);
            return false;
        }else{
            return true;
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Employees_MANAGE_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employees_MANAGE_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employees_MANAGE_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employees_MANAGE_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employees_MANAGE_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_DELETE_;
    private javax.swing.JButton jButton_INSERT_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_EMPLOYEES_;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_NAME;
    private javax.swing.JTextField jTextField_PHONE;
    private javax.swing.JTextField jTextField_SURNAME;
    // End of variables declaration//GEN-END:variables
}
