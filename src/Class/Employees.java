
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

public class Employees {
        
    Connection connection;
    
    private Integer id;
    private String name;
    private String surname;
    private String phone;
    
    public Employees(){}
    
    public Employees(Integer ID, String NAME, String SURNAME, String PHONE){
        this.id = ID;
        this.name = NAME;
        this.surname = SURNAME;
        this.phone = PHONE;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    // get the customers list
    public ArrayList<Employees> employeesList(){
        
        ArrayList<Employees> employees_list = new ArrayList<>();
        connection = DB_INFO.getConnection();
        
        Statement st;
        ResultSet rs;
        PreparedStatement ps;

               String query = "SELECT `id`, `name`, `surname`, `phone` FROM `employees`";
        
        try {
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
           
            Employees employee;
            // Integer ID, String NAME, Integer CATEGORY_ID, String PRICE, byte[] PICTURE, Integer QUANTITY, String DESCRIPTION
            while(rs.next()){
                employee = new Employees(rs.getInt("id"), 
                                 rs.getString("name"),
                                 rs.getString("surname"),
                                 rs.getString("phone")
                                 );
                
                employees_list.add(employee);
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(Employees.class.getName()).log(Level.SEVERE, null, ex);
        }
        return employees_list;        
    }
    
    // insert a new employee
     public static void insertEmployee(Employees employee)
    {
        Connection conn = DB_INFO.getConnection();
        PreparedStatement ps;
        
        try {
            ps = conn.prepareStatement("INSERT INTO `employees`(`name`, `surname`, `phone`) VALUES (?,?,?)");

            ps.setString(1, employee.getName());
            ps.setString(2, employee.getSurname());
            ps.setString(3, employee.getPhone());
            

            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "New Employee Added");                
                }
                else{
                    JOptionPane.showMessageDialog(null, "Something Wrong");                    
                }
            
        } catch (SQLException e) {
            Logger.getLogger(Employees.class.getName()).log(Level.SEVERE, null, e);
        }
    }
     
     // update employee data
    public static void updateEmployees(Employees employee)
    {
        Connection conn = DB_INFO.getConnection();
        PreparedStatement ps;
        
        try {
            ps = conn.prepareStatement("UPDATE `employees` SET `name`=?,`surname`=?,`phone`=? WHERE `id`=?");

            ps.setString(1, employee.getName());
            ps.setString(2, employee.getSurname());
            ps.setString(3, employee.getPhone());
            ps.setInt(4, employee.getId());

            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Employee Updated");
                
                }
                else{
                    JOptionPane.showMessageDialog(null, "Something Wrong");                    
                }            
        } catch (SQLException ex) {
            Logger.getLogger(Employees.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    // delete employee by id
    public static void deleteEmployee(int employeeId)
    {
        
        Connection conn = DB_INFO.getConnection();
        PreparedStatement ps;
        
        try {
            ps = conn.prepareStatement("DELETE FROM `employees` WHERE `id` = ?");

            ps.setInt(1, employeeId);

            // show a confirmation message before deleting the Customer
            int YesOrNo = JOptionPane.showConfirmDialog(null,"Do You Really Want To Delete This Employee","Delete Employee", JOptionPane.YES_NO_OPTION);
            if(YesOrNo == 0){
                
                if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Employee Deleted");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Something Wrong");
                }
            }            
        } catch (SQLException ex) {
            Logger.getLogger(Employees.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    
    public HashMap<String, Integer> populateCombo(){

      HashMap<String, Integer> map = new HashMap<>();

      connection = DB_INFO.getConnection();

      Statement st;

      ResultSet rs;

       try {

           st = connection.createStatement();

           rs = st.executeQuery("SELECT `id`, `name`, `surname`, `phone` FROM `employees`");

           Employees employee;

           

           while(rs.next()){

               employee = new Employees(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));

               map.put(employee.getName(), employee.getId());

           }

       } catch (SQLException ex) {

           Logger.getLogger(Employees.class.getName()).log(Level.SEVERE, null, ex);

       }
       
       return map;

   }
}

