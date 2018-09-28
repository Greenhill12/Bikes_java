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
    private Integer userId;
    private Integer itemId;

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
    
    public Schedule(Integer ID, Integer userId, Integer itemId, String START, String END)
    {
        this.id = ID;
        this.userId = userId;
        this.itemId = itemId;
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
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

               String query = "SELECT `e`.`id`, `e`.`name`, `e`.`surname`, `e`.`phone`, `i`.`id`, `i`.`brand`, `i`.`model`, `r`.`id`, `r`.`user_id`, `r`.`inv_id`, `r`.`date_start`, `r`.`date_end`"
                       + "      FROM `employees` AS `e`, `inventory` AS `i`, `rental` AS `r`"
                       + "      WHERE `e`.`id` = `r`.`user_id` AND `i`.`id` = `r`.`inv_id` ";
        
        try {
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
           
            Schedule user;
            while(rs.next()){
                user = new Schedule(
                    rs.getInt("id"), 
                    rs.getString("e.name"),
                    rs.getString("e.surname"),
                    rs.getString("e.phone"),    
                    rs.getString("i.brand"),
                    rs.getString("i.model"),
                    rs.getString("r.date_start"),
                    rs.getString("r.date_end")
                     );
                schedule_list.add(user);
            }
        
        } catch (SQLException ex) {
            //Logger.getLogger(Schedule.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
        return schedule_list;
    }
    
    public static void insertSchedule(Schedule list){
        Connection con = DB_INFO.getConnection();
        PreparedStatement ps;
                
            try {
            ps = con.prepareStatement("INSERT INTO `rental`(`user_id`, `inv_id`, `date_start`, `date_end`) VALUES (?,?,?,?)");

            ps.setInt(1, list.getUserId());
            ps.setInt(2, list.getItemId());
            ps.setString(3, list.getStart());
            ps.setString(4, list.getEnd());

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