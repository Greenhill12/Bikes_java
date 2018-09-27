package Class;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Schedule {


    Connection connection;
    
    private Integer id;
    private String name;
    private String surname;
    private String phone;
    private String brand;
    private String model;
    private String start;
    private String end;

    
   public Schedule(){}
    
    
    public Schedule(Integer ID, String NAME, String SURNAME, String PHONE, String BRAND, String MODEL, String START, String END)
    {
        this.id = ID;
        this.name = NAME;
        this.surname = SURNAME;
        this.phone = PHONE;
        this.brand = BRAND;
        this.model = MODEL;
        this.start = START;
        this.end = END;
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

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }
    
    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }
       
    
    // get users list
    public ArrayList<Schedule> ScheduleList(){
        
        ArrayList<Schedule> schedule_list = new ArrayList<>();
        connection = DB_INFO.getConnection();

        ResultSet rs;
        PreparedStatement ps;

               String query = "SELECT `employees.id`, `employees.name`, `employees.surname`, `employees.phone`, `inventory.brand`, `inventory.model`, `rental.user_id`, `rental.inv_id`, `rental.date_start`, `rental.date_end` FROM `employees`, `inventory`, `rental` WHERE `employees.id` = `rental.user_id` AND `inventory.id` = `rental.inv_id` ";
        
        try {
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
           
            Schedule user;
            while(rs.next()){
                user = new Schedule(
                    rs.getInt("id"), 
                    rs.getString("name"),
                    rs.getString("surname"),
                    rs.getString("phone"),
                    rs.getString("brand"),
                    rs.getString("model"),
                    rs.getString("date_start"),
                    rs.getString("date_end")
                     );
                schedule_list.add(user);
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(Schedule.class.getName()).log(Level.SEVERE, null, ex);
        }
        return schedule_list;
    }
    
    public static void updateSchedule(Schedule list){
        Connection con = DB_INFO.getConnection();
        PreparedStatement ps;
                
            try {
            ps = con.prepareStatement("UPDATE `rental` SET `user_id`=?,`inv_id`=?,`date_start`=?,`date_end`=? WHERE `id` = ?");

            ps.setString(1, list.getName());
            ps.setString(2, list.getBrand());
            ps.setString(3, list.getStart());
            ps.setString(4, list.getEnd());
            ps.setInt(5, list.getId());

            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Schedule Updated");
                
                }
                else{
                    JOptionPane.showMessageDialog(null, "Something Wrong");                    
                }
            
        } catch (SQLException ex) {
            Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
}