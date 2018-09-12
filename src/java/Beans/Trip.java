package Beans;

import Model.MyDb;
import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Trip implements Serializable{
     MyDb db = new MyDb();
   private String tripname, departuredate, returndate, passengercount, duration, destination,department;
   
   public Trip()
   {
   tripname="";
   departuredate="";
   returndate="";
   passengercount="";
   duration="";
   destination="";
   department="";
   
   }

    public String getTripname() {
        return tripname;
    }

    public void setTripname(String tripname) {
        this.tripname = tripname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
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

    public String getPassengercount() {
        return passengercount;
    }

    public void setPassengercount(String passengercount) {
        this.passengercount = passengercount;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDestination() throws SQLException {
             db.getCon();
             Statement stmt = db.con.createStatement();
             String query = "select Destination from pendingacademictrips";
             stmt.executeQuery(query);
             
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
    
   public ResultSet resultSet;
    public void getPendingTrips() throws SQLException
    {
    
        
        db.getCon();
        String query = "select * from pending_trips ";
        
        Statement stmt = db.con.createStatement();
        resultSet = stmt.executeQuery(query);
    }
    
    public List pendingtripList() throws SQLException{
           ArrayList list=new ArrayList();
      
           db.getCon();
           Statement st=db.con.createStatement();
           
           ResultSet rs=st.executeQuery("select * from pendingacademictrips");
            while(rs.next())
            {
               list.add(rs.getString("TripName"));
               list.add(rs.getString("Destination"));
               list.add(rs.getString("DepartureDate"));
               list.add(rs.getString("ReturnDate"));               
               list.add(rs.getString("Duration"));
               list.add(rs.getString("PassengerNumber"));
               list.add(rs.getString("Department"));
            }
       
    return list;
    }
}

