/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
        String STAFFID = loginBean.getStaffId();
        String PASSWORD = loginBean.getPassword();
        
        //Calling class MyDb 
        MyDb db = new MyDb();
        
        String staffid = "";
        String password = "";
        String role = "";
        
        try
        {
            db.getCon();
            Statement statement = db.con.createStatement();
            ResultSet resultSet = statement.executeQuery("select STAFFID, PASSWORD, ROLE from staff");
            
            while(resultSet.next())
            {
                staffid = resultSet.getString("STAFFID");
                password = resultSet.getString("PASSWORD");
                role = resultSet.getString("ROLE");
                
                if(STAFFID.equals(staffid) && PASSWORD.equals(password) && role.equals("Admin"))
                    return "Admin";
                else if(STAFFID.equals(staffid) && PASSWORD.equals(password) && role.equals("Mechanic"))
                    return "Mechanic";
                else if(STAFFID.equals(staffid) && PASSWORD.equals(password) && role.equals("School Official"))
                    return "School Official";
                else if(STAFFID.equals(staffid) && PASSWORD.equals(password) && role.equals("TT Secretary"))
                    return "TT Secretary";
                else if(STAFFID.equals(staffid) && PASSWORD.equals(password) && role.equals("Driver"))
                    return "Driver";
            }
        }
        
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return "Invalid user credentials";
    }
     
     public static int resetPass(LoginBean loginBean, String sql)
     {
         int i = 0;
         
         MyDb db = new MyDb();
         Connection con = db.getCon();
         try
         {
         PreparedStatement ps = con.prepareStatement(sql);
         ps.setString(7, loginBean.getPassword());
         ps.setString(1, loginBean.getStaffId());
         i = ps.executeUpdate();
         }
         catch(SQLException e)
         {
             e.printStackTrace();
         }
         return i;
     }
}
