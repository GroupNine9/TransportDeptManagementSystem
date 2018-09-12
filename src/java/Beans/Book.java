
package Beans;


import java.sql.SQLException;
import java.sql.*;
import Model.MyDb;
import java.time.temporal.ChronoUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Book {
    private String destination,departuredate,returndate,passCount,tripName,department;
    
     
    public Book(){
        destination="";
        departuredate="";
        returndate="";
        passCount="";
        tripName="";
        department="";
        
               
                        
    }


    public String getTripName() {
        return tripName;
    }

    public void setTripName(String tripName) {
        this.tripName = tripName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    public String getPassCount() {
        return passCount;
    }

    public void setPassCount(String passCount) {
        this.passCount = passCount;
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

            String sqlString="INSERT INTO pendingacademic (TripName,Destination,DepartureDate,ReturnDate,PassengerNumber,Department) VALUES ('"+tripName+"','"+destination+"','"+departuredate+"','"+returndate+"','"+passCount+"','"+department+"')";
            
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
