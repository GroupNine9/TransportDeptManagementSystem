/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;


import java.sql.SQLException;
import java.sql.*;
import Model.MyDb;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author HP-
 */
public class Officialtrip {
    private String destination,departuredate,returndate,passCount,duration,purpose;
    
     
    public Officialtrip(){
        destination="";
        departuredate="";
        returndate="";
        passCount="";
        duration="";
        purpose="";
        
               
                        
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
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
            dbconn.getCon();

            String sqlString="INSERT INTO pendingofficialtrip (destination,purpose,deration,number_of_passengers,return_date,departure_date) VALUES ('"+destination+"','"+purpose+"','"+duration+"','"+passCount+"','"+returndate+"','"+departuredate+"')";
            
            Statement myStatement = dbconn.con.createStatement();
            
            try
            {    
                myStatement.executeUpdate(sqlString);
                myStatement.close();
                dbconn.con.close();
            } catch (SQLException ex) {Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);}
        } catch (SQLException ex) {Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);}  
    }
}
