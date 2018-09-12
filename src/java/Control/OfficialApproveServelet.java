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
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OfficialApproveServelet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            //processRequest(request, response);
            
            String vehicleplate="", driver="",driverphone="",purpose=""; 
          
            response.setContentType("text/html;charset=UTF-8");

            request.setAttribute("driver", request.getParameter("drivername"));
            request.setAttribute("car", request.getParameter("vehicle"));
            request.setAttribute("trip",request.getParameter("tripname"));
            
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
            
            String dn = (String)(request.getAttribute("driver"));
            String query1 = "select * from staff where NAME=?";
            PreparedStatement st1 = con.prepareStatement(query1);
            st1.setString(1, dn);
            ResultSet rs1 = st1.executeQuery();
             while (rs1.next()) {
                 driver = rs1.getString("NAME");
                 driverphone = rs1.getString("PHONENUMBER");
             }

            String v = (String)(request.getAttribute("car"));
            String query2 = "select * from vehicles where PLATENUMBER=?";
            PreparedStatement st2 = con.prepareStatement(query2);
            st2.setString(1, v);
            ResultSet rs2 = st2.executeQuery();
            while (rs2.next()) {
                vehicleplate = rs2.getString("PLATENUMBER");       
            }

            String p = (String)(request.getAttribute("trip"));
            String query3 = "select * from pendingofficial where Purpose=?";
            PreparedStatement st3 = con.prepareStatement(query3);
            st3.setString(1, p);
            ResultSet rs3 = st3.executeQuery();
            while (rs3.next()) {
                purpose = rs3.getString("Purpose");
            }
            
            String query4 = "insert into approvedofficialtrips (VehicleAssigned,DriverAssigned,DriverPhone,PURPOSE) values (?,?,?,?)";           
            PreparedStatement st4 = con.prepareStatement(query4);
            st4.setString(1,vehicleplate);
            st4.setString(2,driver);
            st4.setString(3,driverphone);
            st4.setString(4,purpose);
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
            
            String query7 = "DELETE FROM pendingofficial WHERE Purpose= ?";
            PreparedStatement st7 = con.prepareStatement(query7);
            st7.setString(1, purpose);
            st7.executeUpdate();
            
            if (i1 > 0) {
                response.sendRedirect("PendingOfficial.jsp");
            }

        } catch (SQLException ex) {
            Logger.getLogger(OfficialApproveServelet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}