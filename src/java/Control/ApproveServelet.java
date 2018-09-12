/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.io.IOException;
import java.io.PrintWriter;
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
 * @author paige
 */
public class ApproveServelet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
        }
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
        
        String driver="",driverphone="",vehicleplate="",trip="";
        try {
            response.setContentType("text/html;charset=UTF-8");
            String drivername = request.getParameter("DriverName");
            String vehicle = request.getParameter("Vehicle");
            String purpose = request.getParameter("purpose");

            System.out.println("connected");

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

            String query3 = "select * from pendingofficial where Purpose=?";
            PreparedStatement st3 = con.prepareStatement(query3);
            st3.setString(1, purpose);
            ResultSet rs3 = st3.executeQuery();
            while (rs3.next()) {
                trip = rs3.getString("Purpose");
            }
            
            
            String query4 = "insert into approvedofficialtrips (VehicleAssigned,DriverAssigned,DriverPhone,PURPOSE) values (?,?,?,?)";           
            PreparedStatement st4 = con.prepareStatement(query4);
            st4.setString(1,vehicleplate);
            st4.setString(2,driver);
            st4.setString(3,driverphone);
            st4.setString(4,trip);
            int i1 = st4.executeUpdate();
           
            if (i1 > 0) {
                response.sendRedirect("PendingOfficial.jsp");
            }   
               // response.sendRedirect("PendingOfficial.jsp");

        } catch (Exception se) {
            System.out.println(se);


        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
