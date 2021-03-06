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
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class Inventory_MANAGE_Form extends javax.swing.JFrame {

    String imagePth = null;
    Inventory item;
    
    public Inventory_MANAGE_Form() {
        
        initComponents();
       
        populateJtable();
        
        jTable_Inventory.setShowGrid(true);
        
        jTable_Inventory.setGridColor(Color.YELLOW);
        
        jTable_Inventory.setSelectionBackground(Color.gray);
        
        JTableHeader th = jTable_Inventory.getTableHeader();

        th.setFont(new Font("Tahoma", Font.PLAIN, 16));
    }
    
    // populate the jtable
    public void populateJtable(){
        
        Inventory item = new Inventory();
        ArrayList<Inventory> InventoryList = item.inventoryList();
        
        String[] colNames = {"ID","Brand","Model"};
        Object[][] rows = new Object[InventoryList.size()][3];
        DefaultTableModel model = (DefaultTableModel) jTable_Inventory.getModel();
              
        for(int i = 0; i < InventoryList.size(); i++){
            rows[i][0] = InventoryList.get(i).getId();
            rows[i][1] = InventoryList.get(i).getBrand();
            rows[i][2] = InventoryList.get(i).getModel();
        }
        
        model.setDataVector(rows, colNames);
        
        jTable_Inventory.setModel(model);
        jTable_Inventory.setRowHeight(45);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton_INSERT_ITEM_ = new javax.swing.JButton();
        jButton_DELETE_ITEM_ = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Inventory = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 153));

        jPanel1.setBackground(new java.awt.Color(51, 204, 0));

        jButton_INSERT_ITEM_.setBackground(new java.awt.Color(30, 130, 76));
        jButton_INSERT_ITEM_.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton_INSERT_ITEM_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_INSERT_ITEM_.setText("Insert");
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

        jButton1.setBackground(new java.awt.Color(30, 130, 76));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton_DELETE_ITEM_, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                        .addComponent(jButton_INSERT_ITEM_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_INSERT_ITEM_)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_DELETE_ITEM_)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE))
                .addContainerGap())
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

    // button delete product
    private void jButton_DELETE_ITEM_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DELETE_ITEM_ActionPerformed

        try{
            int rowIndex = jTable_Inventory.getSelectedRow();
            int id = Integer.valueOf(jTable_Inventory.getValueAt(rowIndex, 0).toString());
            Inventory.deleteItem(id);
            populateJtable();
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        populateJtable();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_DELETE_ITEM_;
    private javax.swing.JButton jButton_INSERT_ITEM_;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Inventory;
    // End of variables declaration//GEN-END:variables
}
