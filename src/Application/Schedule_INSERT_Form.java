package Application;


import Class.Employees;
import Class.Inventory;
import Class.Schedule;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Schedule_INSERT_Form extends javax.swing.JFrame {
 
    String imagePth = null;
    HashMap<String, Integer> employeeMap;
    HashMap<String, Integer> inventoryMap;
    
    // get the id of the product to edit from the manage product form
    public Integer ItemId;
    
    public Schedule_INSERT_Form() {
        initComponents();
        
        // populate the combobox with key and value
        BindEmployees();
        BindInventory();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox_EMPLOYEE = new javax.swing.JComboBox<>();
        jButton_ADD_RENTAL = new javax.swing.JButton();
        jComboBox_INVENTORY = new javax.swing.JComboBox<>();
        jFormattedTextField_START = new javax.swing.JFormattedTextField();
        jFormattedTextField_END = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 204, 0));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Employee:");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("End date:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Start date:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Bike:");

        jButton_ADD_RENTAL.setBackground(new java.awt.Color(65, 131, 215));
        jButton_ADD_RENTAL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_ADD_RENTAL.setForeground(new java.awt.Color(255, 255, 255));
        jButton_ADD_RENTAL.setText("Insert");
        jButton_ADD_RENTAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ADD_RENTALActionPerformed(evt);
            }
        });

        jFormattedTextField_START.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd hh:mm:ss"))));
        jFormattedTextField_START.setToolTipText("yyyy-MM-dd hh:mm:ss");
        jFormattedTextField_START.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField_STARTActionPerformed(evt);
            }
        });

        jFormattedTextField_END.setToolTipText("yyyy-MM-dd hh:mm:ss");
        jFormattedTextField_END.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField_ENDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBox_INVENTORY, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox_EMPLOYEE, javax.swing.GroupLayout.Alignment.LEADING, 0, 200, Short.MAX_VALUE)
                            .addComponent(jFormattedTextField_END)
                            .addComponent(jFormattedTextField_START, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton_ADD_RENTAL, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_EMPLOYEE)
                    .addComponent(jLabel5))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox_INVENTORY))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jFormattedTextField_START, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jFormattedTextField_END, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jButton_ADD_RENTAL, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // create the methode to fill combobox with keys and values

    public void BindEmployees(){

        Employees employee = new Employees();

         employeeMap = employee.populateCombo();

        for(String s : employeeMap.keySet()){

            jComboBox_EMPLOYEE.addItem(s);
        }
    }
    
    public void BindInventory(){

        Inventory item = new Inventory();

        inventoryMap = item.populateCombo();

        for(String s : inventoryMap.keySet()){

            jComboBox_INVENTORY.addItem(s);
        }
    }

   
    // update product
    private void jButton_ADD_RENTALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ADD_RENTALActionPerformed

        Schedule rental = new Schedule();


        if(verifFields()){
           
        Integer employee = employeeMap.get(jComboBox_EMPLOYEE.getSelectedItem().toString());
        Integer item = inventoryMap.get(jComboBox_INVENTORY.getSelectedItem().toString());        
        String start = jFormattedTextField_START.getText();
        String end = jFormattedTextField_END.getText();

            rental = new Schedule(null,employee,item,start,end);
            Schedule.insertSchedule(rental);
            
            this.setVisible(false);
        }       

    }//GEN-LAST:event_jButton_ADD_RENTALActionPerformed

    private void jFormattedTextField_STARTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField_STARTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField_STARTActionPerformed

    private void jFormattedTextField_ENDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField_ENDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField_ENDActionPerformed

    
    // verify the empty fields
    public boolean verifFields()
    {
     
        if(jFormattedTextField_START.getText().equals("") || jFormattedTextField_END.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "One Or More Fields Are Empty", "Empty Fields", 0);
            return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_ADD_RENTAL;
    public javax.swing.JComboBox<String> jComboBox_EMPLOYEE;
    public javax.swing.JComboBox<String> jComboBox_INVENTORY;
    private javax.swing.JFormattedTextField jFormattedTextField_END;
    private javax.swing.JFormattedTextField jFormattedTextField_START;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
