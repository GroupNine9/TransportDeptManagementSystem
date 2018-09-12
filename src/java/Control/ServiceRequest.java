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
 * @author paige
 */
public class ServiceRequest extends HttpServlet {

        @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
       // processRequest(request, response);
        
        try
        {
                String vehicleid = request.getParameter("vehicleid");
                String datein = request.getParameter("datein");
                String services = request.getParameter("services");
                String repairparts = request.getParameter("repairparts");
                String contact = request.getParameter("contact");
                
                
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
            
            
            String sqlString="INSERT INTO servicereport (vehicleId,dateIn,serviceWanted,partRepair,contactPrsn) VALUES (?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sqlString);
            st.setString(1,vehicleid);
            st.setString(2,datein);
            st.setString(3,services);
            st.setString(4,repairparts);        
            st.setString(5,contact);
            st.executeUpdate();
  
            RequestDispatcher dispatcher = request.getRequestDispatcher("servicerequest.jsp");
            dispatcher.forward(request, response);
                
                
        } catch (SQLException ex) {
            Logger.getLogger(DriverReportServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

}
