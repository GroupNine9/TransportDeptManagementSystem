/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Control.ApprovalServelet;
import Model.MyDb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Grace
 */
public class ApprovedAcademicTrip {
    private String department,driverphone_No,driver_assigned,trip_Name,VehicleAssigned;
    
    public ApprovedAcademicTrip(){
        department="";
	driverphone_No="";
	driver_assigned="";
	trip_Name="";
	VehicleAssigned="";    
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDriverphone_No() {
        return driverphone_No;
    }

    public void setDriverphone_No(String driverphone_No) {
        this.driverphone_No = driverphone_No;
    }

    public String getDriver_assigned() {
        return driver_assigned;
    }

    public void setDriver_assigned(String driver_assigned) {
        this.driver_assigned = driver_assigned;
    }

    public String getTrip_Name() {
        return trip_Name;
    }

    public void setTrip_Name(String trip_Name) {
        this.trip_Name = trip_Name;
    }

    public String getVehicle_assigned() {
        return VehicleAssigned;
    }

    public void setVehicle_assigned(String vehicle_assigned) {
        this.VehicleAssigned = vehicle_assigned;
    }

    
    public void AddAcademic(){
         try {
             Connection con;
             String driverName = "com.mysql.jdbc.Driver";
             String connectionURL = "jdbc:mysql://localhost:3306/transportmanagement?";
             String username = "root";
             String password = "";
             try {
                 Class.forName(driverName);
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(ApprovalServelet.class.getName()).log(Level.SEVERE, null, ex);
             }
             
            con = DriverManager.getConnection(connectionURL, username, password);
            String query = "insert into approvedacademictrips (department,driverphone_No,driver_assigned,trip_Name,vehicle_assigned) values ('"+department+"','"+driverphone_No+"','"+driver_assigned+"','"+trip_Name+"' , '"+VehicleAssigned+"')";           
            Statement stmt = con.createStatement();
             try
             {
            stmt.executeUpdate(query);
            stmt.close();
            con.close();
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
    
}
