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
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Grace
 */
public class OfficialCancelServelet extends HttpServlet {

    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            //processRequest(request, response);
            
             String purpose = request.getParameter("purpose");
             String id = request.getParameter("id");
             String reason = request.getParameter("reason");
             String destination = request.getParameter("destination");
             String ddate = request.getParameter("ddate");
             String rdate = request.getParameter("rdate");
             String duration = request.getParameter("duration");
             String pass = request.getParameter("pass");
           
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
             String query8 = "insert into cancelledofficial (TripId,Purpose,Destination,Ddate,Rdate,Duration,Pass,Reason) values (?,?,?,?,?,?,?,?)";
            PreparedStatement st8 = con.prepareStatement(query8);
            st8.setString(1, id);
            st8.setString(2, purpose);
            st8.setString(3, destination);
            st8.setString(4, ddate);
            st8.setString(5, rdate);
            st8.setString(6, duration);
            st8.setString(7, pass);
            st8.setString(8, reason);
            
            
            st8.executeUpdate();
            
            
            String query7 = "DELETE FROM pendingofficial WHERE Purpose= ?";
            PreparedStatement st7 = con.prepareStatement(query7);
            st7.setString(1, purpose);
            st7.executeUpdate();
        
         RequestDispatcher rd1=request.getRequestDispatcher("PendingOfficial.jsp");  
         rd1.include(request, response);
            
        } catch (SQLException ex) {
            Logger.getLogger(OfficialCancelServelet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }}   
   

