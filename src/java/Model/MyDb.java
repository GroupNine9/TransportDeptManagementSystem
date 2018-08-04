package Model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyDb {
     public Connection con;
    String driverName = "com.mysql.jdbc.Driver";
    String connectionURL = "jdbc:mysql://localhost:3306/transportmanagement?";
    String username = "root";
    String password = "";
    
    public Connection getCon()
    {
        try
        {
            Class.forName(driverName);
            con = DriverManager.getConnection(connectionURL,username, password);
        }
        catch (ClassNotFoundException | SQLException e) 
        {
        }
        return con;
    }

    public Connection Connection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
