package DATABASE;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *

 */
public class Myconnection {
    public static Connection getConnection() throws ClassNotFoundException, SQLException
    {
        Connection con=null;
        try{
              Class.forName("com.mysql.jdbc.Driver");
              con=DriverManager.getConnection("jdbc:mysql://localhost:3308/project?autoReconnect=true&useSSL=false","root","nitesh123@");
        }catch(ClassNotFoundException | SQLException ex)
        {
        System.out.println(ex.getMessage());
        }
    return con;
    }

    
}
