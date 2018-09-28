
package Class;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class DB_INFO {
    
    private static final String CONN_STRING = "jdbc:mysql://localhost:3306/electric_bikes?useUnicode=true&characterEncoding=UTF-8";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    
    static Connection conn = null;
    
    public static Connection getConnection()
    {
        if (conn != null) return conn;
        
        return getConnection(CONN_STRING, USERNAME, PASSWORD);
    }

    private static Connection getConnection(String db_name,String user_name,String password)
    {
        try
        {            
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            System.out.println("Connected!");
        }
        catch(SQLException e)
        {
            System.err.println("e");;
        }

        return conn;
    }    
}
