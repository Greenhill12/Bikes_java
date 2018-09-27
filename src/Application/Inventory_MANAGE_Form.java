package Application;

import Class.Inventory;
import Class.TABLE_MODEL;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.JTableHeader;

public class Inventory_MANAGE_Form extends javax.swing.JFrame {

    /**
     * Creates new form Manage_Inventory_Form
     */
    String imagePth = null;
    Inventory item;
    
    public Inventory_MANAGE_Form() {
        
        initComponents();
       
        populateJtable("");
        
        jTable_Inventory.setShowGrid(true);
        
        jTable_Inventory.setGridColor(Color.YELLOW);
        
        jTable_Inventory.setSelectionBackground(Color.gray);
        
        JTableHeader th = jTable_Inventory.getTableHeader();

        th.setFont(new Font("Tahoma", Font.PLAIN, 16));
    }
    
    // populate the jtable
    public void populateJtable(String val){
        
        Inventory item = new Inventory();
        ArrayList<Inventory> InventoryList = item.inventoryList(val);
        
        String[] colNames = {"Id","Brand","Model"};
        Object[][] rows = new Object[InventoryList.size()][7];
        
        for(int i = 0; i < InventoryList.size(); i++){
            rows[i][0] = InventoryList.get(i).getId();
            rows[i][1] = InventoryList.get(i).getBrand();
            rows[i][2] = InventoryList.get(i).getModel();
        }
        
        TABLE_MODEL mmd = new TABLE_MODEL(rows, colNames);
        jTable_Inventory.setModel(mmd);
        jTable_Inventory.setRowHeight(80);
        jTable_Inventory.getColumnModel().getColumn(5).setPreferredWidth(150);
        jTable_Inventory.getColumnModel().getColumn(4).setPreferredWidth(120);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton_INSERT_ITEM_ = new javax.swing.JButton();
        jButton_DELETE_ITEM_ = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Inventory = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 153));

        jPanel1.setBackground(new java.awt.Color(51, 204, 0));

        jButton_INSERT_ITEM_.setBackground(new java.awt.Color(30, 130, 76));
        jButton_INSERT_ITEM_.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton_INSERT_ITEM_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_INSERT_ITEM_.setText("Add New Item");
        jButton_INSERT_ITEM_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_INSERT_ITEM_ActionPerformed(evt);
            }
        });

        jButton_DELETE_ITEM_.setBackground(new java.awt.Color(246, 36, 89));
        jButton_DELETE_ITEM_.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton_DELETE_ITEM_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_DELETE_ITEM_.setText("Remove Selected Item");
        jButton_DELETE_ITEM_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DELETE_ITEM_ActionPerformed(evt);
            }
        });

        jTable_Inventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable_Inventory);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_INSERT_ITEM_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_DELETE_ITEM_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_INSERT_ITEM_)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_DELETE_ITEM_)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // button delete product
    private void jButton_DELETE_ITEM_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DELETE_ITEM_ActionPerformed

        try{
            int rowIndex = jTable_Inventory.getSelectedRow();
            int id = Integer.valueOf(jTable_Inventory.getValueAt(rowIndex, 0).toString());
            Inventory.deleteItem(id);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "You Must Select An Item From The Table", "No Item Selected", 2);
        }
    }//GEN-LAST:event_jButton_DELETE_ITEM_ActionPerformed

    // button insert product
    private void jButton_INSERT_ITEM_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_INSERT_ITEM_ActionPerformed

        Inventory_INSERT_Form addProductForm = new Inventory_INSERT_Form();
        addProductForm.pack();
        addProductForm.setVisible(true);
        addProductForm.setLocationRelativeTo(null);
        addProductForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }//GEN-LAST:event_jButton_INSERT_ITEM_ActionPerformed

    
    
    
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
            java.util.logging.Logger.getLogger(Inventory_MANAGE_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventory_MANAGE_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventory_MANAGE_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventory_MANAGE_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventory_MANAGE_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_DELETE_ITEM_;
    private javax.swing.JButton jButton_INSERT_ITEM_;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Inventory;
    // End of variables declaration//GEN-END:variables
}
