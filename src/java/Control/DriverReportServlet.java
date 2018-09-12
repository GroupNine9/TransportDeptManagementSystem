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
 * @author paige
 */
public class DriverReportServlet extends HttpServlet {

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
           // processRequest(request, response);
                        
                  
                  request.setAttribute("ddate",request.getParameter("ddate"));
                  request.setAttribute("rdate",request.getParameter("rdate"));
                  request.setAttribute("tname",request.getParameter("tname"));
           
      
                String tripname = (String)(request.getAttribute("tname"));
                String ddate = (String)(request.getAttribute("ddate"));
                String rdate = (String)(request.getAttribute("rdate"));
                String timeout = request.getParameter("timeout");
                String timein = request.getParameter("timein");
                int driverno = (Integer.parseInt(request.getParameter("driverno")));
                String fueldrawn = request.getParameter("fueldrawn");
                String journeydetails = request.getParameter("journeydetails");
                String oildrawn = request.getParameter("oildrawn");
                String receipts = request.getParameter("receipts");
                String kms = request.getParameter("kms");
                String speedo = request.getParameter("speedo");
      
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
            
            String sqlString="INSERT INTO tripreport (tripname,ddate,timeout,rdate,timein,driverno,journeydetails,oildrawn,fueldrawn,receipts,speedo,kms) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sqlString);
            st.setString(1,tripname);
            st.setString(2,ddate);
            st.setString(3,timeout);
            st.setString(4,rdate);        
            st.setString(5,timein);
            st.setInt(6,driverno);
            st.setString(7,journeydetails);
            st.setString(8,oildrawn);
            st.setString(9,fueldrawn);
            st.setString(10,receipts);
            st.setString(11,speedo);
            st.setString(12,kms);
            st.executeUpdate();
            
            

            String query7 = "DELETE FROM assignedtask WHERE tripname=?";
            PreparedStatement st7 = con.prepareStatement(query7);
            st7.setString(1, tripname);
            st7.executeUpdate();
                
            RequestDispatcher dispatcher = request.getRequestDispatcher("drivertasks.jsp");
            dispatcher.forward(request, response);
                
                
        } catch (SQLException ex) {
            Logger.getLogger(DriverReportServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
