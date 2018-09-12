
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Grace
 */
public class ApprovedAcademicUpdate extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        String driver="",driverphone="",vehicleplate="",trip="",ddate="",rdate="",destination="";
        int tripid=0;
        try {
            response.setContentType("text/html;charset=UTF-8");

            String drivername = request.getParameter("DriverName");
            String vehicle = request.getParameter("Vehicle");
            String tripname = request.getParameter("TripName");


            //db connectivity
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

            System.out.println("connected");
            
            String query1 = "select * from staff where NAME=?";
            PreparedStatement st1 = con.prepareStatement(query1);
            st1.setString(1, drivername);
            ResultSet rs1 = st1.executeQuery();
             while (rs1.next()) {
                 driver = rs1.getString("NAME");
                 driverphone = rs1.getString("PHONENUMBER");
             }

            String query2 = "select * from vehicles where PLATENUMBER=?";
            PreparedStatement st2 = con.prepareStatement(query2);
            st2.setString(1, vehicle);
            ResultSet rs2 = st2.executeQuery();
            while (rs2.next()) {
                vehicleplate = rs2.getString("PLATENUMBER");       
            }

            String query3 = "select * from pendingacademic where TripName=?";
            PreparedStatement st3 = con.prepareStatement(query3);
            st3.setString(1, tripname);
            ResultSet rs3 = st3.executeQuery();
            while (rs3.next()) {
                trip = rs3.getString("TripName");
                tripid = rs3.getInt("TripId");
                ddate = rs3.getString("DepartureDate");
                rdate = rs3.getString("ReturnDate");
               destination = rs3.getString("Destination");
            }
            
            String query8 = "insert into assignedtask (TripId,vehicleassigned,driverassigned,tripname,departuredate,returndate,destination) values(?,?,?,?,?,?,?)";
            PreparedStatement st8 = con.prepareStatement(query8);
            st8.setInt(1, tripid);
            st8.setString(2, vehicleplate);
            st8.setString(3, driver);
            st8.setString(4, trip);
            st8.setString(5, ddate);
            st8.setString(6, rdate);
            st8.setString(7, destination);
            st8.executeUpdate();
            
            String query4 = "insert into approvedacademictrips (VehicleAssigned,trip_Name,driverphone_No,driver_assigned) values (?,?,?,?)";           
            PreparedStatement st4 = con.prepareStatement(query4);
            st4.setString(1,vehicleplate);
            st4.setString(2,trip);
            st4.setString(3,driverphone);
            st4.setString(4,driver);
            int i1 = st4.executeUpdate();

                        
            String query5 = "UPDATE staff SET STATUS=? WHERE NAME=?";
            PreparedStatement st5 = con.prepareStatement(query5);
            st5.setString(1,"BOOKED");
            st5.setString(2,driver);
            st5.executeUpdate();
            
            
            String query6 = "UPDATE vehicles SET STATUS=? WHERE PLATENUMBER=?";
            PreparedStatement st6 = con.prepareStatement(query6);
            st6.setString(1,"BOOKED");
            st6.setString(2,vehicleplate);
            st6.executeUpdate();
            
            String query7 = "DELETE FROM pendingacademic WHERE TripName= ?";
            PreparedStatement st7 = con.prepareStatement(query7);
            st7.setString(1, trip);
            st7.executeUpdate();
            
            if (i1 > 0) {
                response.sendRedirect("newjspPendingAcademic.jsp");
            }   

        } catch (Exception se) {
            System.out.println(se);


        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
