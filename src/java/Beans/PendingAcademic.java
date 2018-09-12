package Beans;
import Model.MyDb;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class PendingAcademic {
    
    private String TripName,Destination,DepartureDate,ReturnDate,Duration,PassengerNumber,Department;

    public String getTripName() {
        return TripName;
    }

    public void setTripName(String TripName) {
        this.TripName = TripName;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

    public String getDepartureDate() {
        return DepartureDate;
    }

    public void setDepartureDate(String DepartureDate) {
        this.DepartureDate = DepartureDate;
    }

    public String getReturnDate() {
        return ReturnDate;
    }

    public void setReturnDate(String ReturnDate) {
        this.ReturnDate = ReturnDate;
    }

    public String getDuration() {
        return Duration;
    }

    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    public String getPassengerNumber() {
        return PassengerNumber;
    }

    public void setPassengerNumber(String PassengerNumber) {
        this.PassengerNumber = PassengerNumber;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }
  
}
