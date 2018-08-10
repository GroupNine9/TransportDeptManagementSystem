package beans;

import Model.MyDb;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Trip {
   private String tripid, departuredate, returndate, passengercount, duration, destination;
   
   public Trip()
   {
   tripid="";
   departuredate="";
   returndate="";
   passengercount="";
   duration="";
   destination="";
   }

    public String getTripid() {
        return tripid;
    }

    public void setTripid(String tripid) {
        this.tripid = tripid;
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

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
   public ResultSet resultSet;
    public void getPendingTrips()
    {
    try{
        MyDb db = new MyDb();
        db.getCon();
        String query = "select * from pending_trips ";
        
        Statement stmt = db.con.createStatement();
        try
        {
          resultSet = stmt.executeQuery(query);

        }
        
        catch (SQLException ex) 
            {
                Logger.getLogger(Staff.class.getName()).log(Level.SEVERE, null, ex);
            }
          } 
    catch (SQLException ex) 
          {
              Logger.getLogger(Staff.class.getName()).log(Level.SEVERE, null, ex);
          }  
    }
    public List pendingtripList(){
        ArrayList list=new ArrayList();
        try{
           MyDb db = new MyDb();
           db.getCon();
           Statement st=db.con.createStatement();
           ResultSet rs=st.executeQuery("select * from pendingacademictrips");
           while(rs.next()){
               list.add(rs.getString("TripName"));
               list.add(rs.getString("Destination"));
               list.add(rs.getString("DepartureDate"));
               list.add(rs.getString("ReturnDate"));               
               list.add(rs.getInt("Duration"));
               list.add(rs.getInt("PassengerNumber"));
               list.add(rs.getString("Department"));

                           }
            }
        catch(Exception e){}
    return list;
    }
}

