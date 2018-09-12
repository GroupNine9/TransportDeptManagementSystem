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
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Grace
 */
public class OfficialApprovalServelet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
        String approve = request.getParameter("approve");
        String cancel = request.getParameter("cancel");
   
        
            if(approve!=null)
            {  
                            String q = "select * from pendingofficial where TripId=? ";
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
                     st.setString(1,approve);
                     ResultSet rs;
                     st.executeQuery();
                     rs = st.getResultSet();
                      while(rs.next())
                        {
                            
                            request.setAttribute("purpose", rs.getString("Purpose"));
                            request.setAttribute("destination", rs.getString("Destination"));
                            request.setAttribute("departuredate", rs.getString("DepartureDate"));
                            request.setAttribute("returndate", rs.getString("ReturnDate"));
                            request.setAttribute("duration", rs.getString("Duration"));
                            request.setAttribute("passengernumber", rs.getString("PassengerNumber"));
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(ApprovalServelet.class.getName()).log(Level.SEVERE, null, ex);
                    }

                 RequestDispatcher rd2=request.getRequestDispatcher("OfficialApprove.jsp");  
                rd2.include(request, response);
            }
            if(cancel!=null)
            {
                                String q = "select * from pendingofficial where TripId=? ";
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
                         st.setString(1,cancel);
                         ResultSet rs;
                         st.executeQuery();
                         rs = st.getResultSet();
                          while(rs.next())
                            {
                                request.setAttribute("id", rs.getString("TripId"));
                                request.setAttribute("purpose", rs.getString("Purpose"));
                                request.setAttribute("destination", rs.getString("Destination"));
                                request.setAttribute("departuredate", rs.getString("DepartureDate"));
                                request.setAttribute("returndate", rs.getString("ReturnDate"));
                                request.setAttribute("duration", rs.getString("Duration"));
                                request.setAttribute("passengernumber", rs.getString("PassengerNumber"));
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(ApprovalServelet.class.getName()).log(Level.SEVERE, null, ex);
                        }

                RequestDispatcher rd1=request.getRequestDispatcher("OfficialCancel.jsp");  
                rd1.include(request, response);
             }
            
        
    }
}
 