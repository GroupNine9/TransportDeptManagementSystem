/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Control.ApprovedAcademicUpdate;
import Model.MyDb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author paige
 */
public class Report {
     private String ddate,timeout,rdate,timein,journeydetails,oildrawn,fueldrawn,receipts,speedo,kms;
    private int driverno,tripid;
     
    public Report(){
        ddate="";
        timeout="";
        rdate="";
        timein="";
        driverno=0;
        journeydetails="";
        oildrawn="";
        fueldrawn="";
        receipts="";
        speedo="";
        kms="";
        tripid=0;
    }

    public int getTripid() {
        return tripid;
    }

    public void setTripid(int tripid) {
        this.tripid = tripid;
    }

    public String getDdate() {
        return ddate;
    }

    public void setDdate(String ddate) {
        this.ddate = ddate;
    }

    public String getTimeout() {
        return timeout;
    }

    public void setTimeout(String timeout) {
        this.timeout = timeout;
    }

    public String getRdate() {
        return rdate;
    }

    public void setRdate(String rdate) {
        this.rdate = rdate;
    }

    public String getTimein() {
        return timein;
    }

    public void setTimein(String timein) {
        this.timein = timein;
    }

    public int getDriverno() {
        return driverno;
    }

    public void setDriverno(int driverno) {
        this.driverno = driverno;
    }
    

    public String getJourneydetails() {
        return journeydetails;
    }

    public void setJourneydetails(String journeydetails) {
        this.journeydetails = journeydetails;
    }

    public String getOildrawn() {
        return oildrawn;
    }

    public void setOildrawn(String oildrawn) {
        this.oildrawn = oildrawn;
    }

    public String getFueldrawn() {
        return fueldrawn;
    }

    public void setFueldrawn(String fueldrawn) {
        this.fueldrawn = fueldrawn;
    }

    public String getReceipts() {
        return receipts;
    }

    public void setReceipts(String receipts) {
        this.receipts = receipts;
    }

    public String getSpeedo() {
        return speedo;
    }

    public void setSpeedo(String speedo) {
        this.speedo = speedo;
    }

    public String getKms() {
        return kms;
    }

    public void setKms(String kms) {
        this.kms = kms;
    }

    
    public void tripReport()
    {
        
        try
        {   
             String driverName = "com.mysql.jdbc.Driver";
            String connectionURL = "jdbc:mysql://localhost:3306/transportmanagement?";
            String username = "root";
            String password = "";
           try {
                Class.forName(driverName);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ApprovedAcademicUpdate.class.getName()).log(Level.SEVERE, null, ex);
            }
            Connection con = DriverManager.getConnection(connectionURL, username, password);


            String sqlString="INSERT INTO tripreport (timeout,timein,driverno,journeydetails,oildrawn,fueldrawn,receipts,speedo,kms) VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sqlString);
            st.setString(1,"tripid");
            st.setString(2,"ddate");
            st.setString(3,"timeout");
            st.setString(4,"rdate");        
            st.setString(5,"timein");
            st.setString(6,"driverno");
            st.setString(7,"journeydetails");
            st.setString(8,"oildrawn");
            st.setString(9,"fueldrawn");
            st.setString(10,"receipts");
            st.setString(11,"speedo");
            st.setString(12,"kms");
            st.executeUpdate();
            
            
            Statement myStatement = con.createStatement();
            
            try
            {    
                myStatement.executeUpdate(sqlString);
                myStatement.close();
                con.close();
            } catch (SQLException ex) {Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);}
        } catch (SQLException ex) {Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);}  
    }
}


