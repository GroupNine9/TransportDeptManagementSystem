
package Beans;


import java.sql.SQLException;
import java.sql.*;
import Model.MyDb;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BookOfficial {
    private String destination,departuredate,returndate,passCount,duration,purpose,tripId;
    
     
    public BookOfficial(){
        destination="";
        departuredate="";
        returndate="";
        passCount="";
        duration="";
        purpose="";
        tripId="";
        
               
                        
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getTripId() {
        return tripId;
    }

    public void setTripId(String tripId) {
        this.tripId = tripId;
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
    public void BookOfficialVehicle()
    {
        try
        {    
            MyDb dbconn=new MyDb();
            dbconn.getCon();

            String sqlString="INSERT INTO pendingofficial (Purpose,Destination,DepartureDate,ReturnDate,Duration,PassengerNumber,tripId) VALUES ('"+tripId+"','"+purpose+"','"+destination+"','"+departuredate+"','"+returndate+"','"+duration+"','"+passCount+"')";
            
            Statement myStatement = dbconn.con.createStatement();
            
            try
            {    
                myStatement.executeUpdate(sqlString);
                myStatement.close();
                dbconn.con.close();
            } catch (SQLException ex) {Logger.getLogger(BookOfficial.class.getName()).log(Level.SEVERE, null, ex);}
        } catch (SQLException ex) {Logger.getLogger(BookOfficial.class.getName()).log(Level.SEVERE, null, ex);}  
    }
}
