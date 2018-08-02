/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Barno
 */
public class LoginDao 
{
     public String authenticateUser(LoginBean loginBean)
    {
        String NAME = loginBean.getName();
        String PASSWORD = loginBean.getPassword();
        
        MyDb db = new MyDb();
        
        String name = "";
        String password = "";
        String role = "";
        
        try
        {
            db.getCon();
            Statement statement = db.con.createStatement();
            ResultSet resultSet = statement.executeQuery("select NAME, PASSWORD, ROLE from staff");
            
            while(resultSet.next())
            {
                name = resultSet.getString("NAME");
                password = resultSet.getString("PASSWORD");
                role = resultSet.getString("ROLE");
                
                if(NAME.equals(name) && PASSWORD.equals(password) && role.equals("Admin"))
                    return "Admin";
                else if(NAME.equals(name) && PASSWORD.equals(password) && role.equals("Mechanic"))
                    return "Mechanic";
                else if(NAME.equals(name) && PASSWORD.equals(password) && role.equals("School Official"))
                    return "School Official";
                else if(NAME.equals(name) && PASSWORD.equals(password) && role.equals("Booking Officer"))
                    return "Booking Officer";
                else if(NAME.equals(name) && PASSWORD.equals(password) && role.equals("Driver"))
                    return "Driver";
            }
        }
        
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return "Invalid user credentials";
    }
}
