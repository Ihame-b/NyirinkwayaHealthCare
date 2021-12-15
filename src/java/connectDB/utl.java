/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author IHAME
 */
public class utl {
     public static Connection getConnection() throws SQLException{
        DriverManager.registerDriver(new org.postgresql.Driver());
        
        String url="jdbc:postgresql://localhost:5432/mystaff";
        String username = "postgres";
        String password = "ihame1";
       
        return DriverManager.getConnection(url, username, password);
    }
    
}
