
package Class;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Inventory {
    
     Connection connection;
    
    private Integer id;
    private String brand;
    private String model;

    public Inventory(){}
    
    public Inventory(Integer ID, String BRAND, String MODEL)
    {
        this.id = ID;
        this.brand = BRAND;
        this.model = MODEL;        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }    

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    // insert a new product
    public static void insertInventory(Inventory product)
    {
        Connection con = DB_INFO.getConnection();
        PreparedStatement ps;
        
        try {
            ps = con.prepareStatement("INSERT INTO `inventory`(`brand`, `model`) VALUES (?,?)");

            ps.setString(1, product.getBrand());            
            ps.setString(2, product.getModel());

            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "New Inventory Added");
                
                }
                else{
                    JOptionPane.showMessageDialog(null, "Something Wrong");
                    
                }
            
        } catch (SQLException ex) {
            Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
        }

    }    
    
    // update product
    // changeImage mean if you want to update the product image to
    public static void updateInventory(Inventory item)
    {
        Connection con = DB_INFO.getConnection();
        PreparedStatement ps;
                
            try {
            ps = con.prepareStatement("UPDATE `inventory` SET `brand`=?,`model`=? WHERE `id` = ?");

            ps.setString(1, item.getBrand());
            ps.setString(2, item.getModel());
            ps.setInt(3, item.getId());

            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Inventory Updated");
                
                }
                else{
                    JOptionPane.showMessageDialog(null, "Something Wrong");                    
                }
            
        } catch (SQLException ex) {
            Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
    // delete product by id
    public static void deleteItem(int id)
    {
        Connection con = DB_INFO.getConnection();
        PreparedStatement ps;
        
        try {
            ps = con.prepareStatement("DELETE FROM `inventory` WHERE `id` = ?");

            ps.setInt(1, id);

            // show a confirmation message before deleting the product
            int YesOrNo = JOptionPane.showConfirmDialog(null,"Do You Really Want To Delete This Bike From Inventory","Delete Product", JOptionPane.YES_NO_OPTION);
            if(YesOrNo == 0){
                
                if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Inventory Deleted");                
                }
                else{
                    JOptionPane.showMessageDialog(null, "Something Wrong");                    
                }                
            }            
        } catch (SQLException ex) {
            Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     // get prodcuts list using arraylist
    public ArrayList<Inventory> inventoryList(String val){
        
        ArrayList<Inventory> inventory_list = new ArrayList<>();
        connection = DB_INFO.getConnection();
        ResultSet rs;
        PreparedStatement ps;
        
               //String query = "SELECT product.id, product.name, category_id, quantity, price, picture,description,category.name as 'category' FROM product INNER JOIN category ON category.id = product.category_id";
        
               String query = "SELECT product.id, product.brand,model.name as 'category'\n" +
"  FROM product\n" +
"INNER JOIN category ON category.id = product.category_id\n" +
"WHERE\n" +
"CONCAT(\n" +
"Convert(product.id , char(11)), product.brand,\n" +
"model, category.name\n" +
")\n" +
"LIKE ?;";
        
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, "%" + val + "%");
            rs = ps.executeQuery();
           
            Inventory item;
            // Integer ID, String NAME, Integer CATEGORY_ID, String PRICE, byte[] PICTURE, Integer QUANTITY, String DESCRIPTION
            while(rs.next()){
                item = new Inventory(rs.getInt("id"), 
                                 rs.getString("brand"),
                                 rs.getString("model")
                                 );
                
                inventory_list.add(item);
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return inventory_list;        
    }
    
    
    public HashMap<String, Integer> populateCombo(){

      HashMap<String, Integer> map = new HashMap<>();

      connection = DB_INFO.getConnection();

      Statement st;

      ResultSet rs;

       try {

           st = connection.createStatement();

           rs = st.executeQuery("SELECT `id`, `name`, `surname`, `phone` FROM `employees`");

           Inventory item;

           

           while(rs.next()){

               item = new Inventory(rs.getInt(1), rs.getString(2), rs.getString(3));

               map.put(item.getBrand(), item.getId());

           }

       } catch (SQLException ex) {

           Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);

       }
       
       return map;

   }
}