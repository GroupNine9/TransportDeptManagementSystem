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
public class AssignMechanic extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // processRequest(request, response);
       
         String assign = request.getParameter("assign");
        if(assign!=null){
        String q = "select * from servicereport where vehicleId=? ";
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
                PreparedStatement st = con.prepareStatement(q);
                st.setString(1,assign);
                ResultSet rs;
                st.executeQuery();
                rs = st.getResultSet();
                while(rs.next())
                  {
                      request.setAttribute("datein", rs.getString("dateIn"));
                      request.setAttribute("services", rs.getString("serviceWanted"));
                      request.setAttribute("repairparts", rs.getString("partRepair"));
                      request.setAttribute("contact", rs.getString("contactPrsn"));
                  }
        } catch (SQLException ex) {
            Logger.getLogger(ApprovalServelet.class.getName()).log(Level.SEVERE, null, ex);
        }
           
             RequestDispatcher rd2=request.getRequestDispatcher("newmechanic.jsp");  
            rd2.include(request, response);
        }
           
        
    }


}
