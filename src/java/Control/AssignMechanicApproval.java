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
public class AssignMechanicApproval extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

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
        
         String vehicleId = "",datein="", services="", repairparts="", dcontact="",mechanic="", mcontact="";
        
        try {
            response.setContentType("text/html;charset=UTF-8");

            String mechanicname = request.getParameter("MechanicName");
            String contact = request.getParameter("contactPrsn");
            


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
            st1.setString(1, mechanicname);
            ResultSet rs1 = st1.executeQuery();
             while (rs1.next()) {
                 mechanic = rs1.getString("NAME");
                 mcontact = rs1.getString("PHONENUMBER");
             }


            String query2 = "select * from servicereport where contactPrsn=?";
            PreparedStatement st2 = con.prepareStatement(query2);
            st2.setString(1, contact);
            ResultSet rs2 = st2.executeQuery();
            while (rs2.next()) {
                vehicleId = rs2.getString("vehicleId");
                datein = rs2.getString("dateIn");
                services = rs2.getString("serviceWanted");
                repairparts = rs2.getString("partRepair");
                dcontact = rs2.getString("contactPrsn");
              
            }
          
            String query8 = "insert into assignedmechanictask (vehicleId,dateIn,serviceWanted,partRepair,driverContact,mechanicContact,mechanic) values(?,?,?,?,?,?,?)";
            PreparedStatement st8 = con.prepareStatement(query8);
            st8.setString(1, vehicleId);
            st8.setString(2, datein);
            st8.setString(3, services);
            st8.setString(4, repairparts);
            st8.setString(5, dcontact);
            st8.setString(6, mcontact);
            st8.setString(7, mechanic);
            int i1 = st8.executeUpdate();
            
            

                        
            String query5 = "UPDATE staff SET STATUS=? WHERE NAME=?";
            PreparedStatement st5 = con.prepareStatement(query5);
            st5.setString(1,"BOOKED");
            st5.setString(2,mechanic);
            st5.executeUpdate();
            
            
            String query7 = "DELETE FROM servicereport WHERE contactPrsn= ?";
            PreparedStatement st7 = con.prepareStatement(query7);
            st7.setString(1, contact);
            st7.executeUpdate();
            
            if (i1 > 0) {
                response.sendRedirect("servicing.jsp");
            }   

        } catch (Exception se) {
            System.out.println(se);


        }
    }

    
}
