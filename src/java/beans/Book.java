/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;
import Model.MyDb;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author HP-
 */
public class Book {
    private String destination,departuredate,returndate,passCount,duration;
    
     
    public Book(){
        destination="";
        departuredate="";
        returndate="";
        passCount="";
        duration="";
        
               
                        
    }


    public String getPassCount() {
        return passCount;
    }

    public void setPassCount(String passCount) {
        this.passCount = passCount;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    } 

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDeparturedate() {
        return departuredate;
    }

    public void setDeparturedate(String departuredate) {
        this.departuredate = departuredate;
    }

    public String getReturndate() {
        return returndate;
    }

    public void setReturndate(String returndate) {
        this.returndate = returndate;
    }

    
    
    //
    public void BookVehicle()
    {
        try
        {    
            MyDb dbconn=new MyDb();
            Connection myconnection= dbconn.Connection();

            String sqlString="INSERT INTO pending trips (DEPARTURE DATE,RETURN DATE,PASSENGER COUNT,DURATION,DESTINATION) VALUES ('"+destination+"','"+departuredate+"','"+returndate+"','"+passCount+"','"+duration+"')";
            
            Statement myStatement = myconnection.createStatement();
            
            try
            {    
                myStatement.executeUpdate(sqlString);
                myStatement.close();
                myconnection.close();
            } catch (SQLException ex) {Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);}
        } catch (SQLException ex) {Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);}  
    }
}
