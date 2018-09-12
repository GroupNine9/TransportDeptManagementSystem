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


public class threedetails extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
        }
    }
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         
        try {
            response.setContentType("text/html;charset=UTF-8");

            String tripname = request.getParameter("tripname");
            
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
                       
            String query1 = "select * from assignedtask where tripname=?";
            PreparedStatement st1 = con.prepareStatement(query1);
            st1.setString(1, tripname);
            ResultSet rs1 = st1.executeQuery();
             while (rs1.next()) {
                request.setAttribute("ddate", rs1.getString("departuredate"));
                request.setAttribute("rdate", rs1.getString("returndate"));
                request.setAttribute("name", rs1.getString("tripname"));
             }       
             
        } catch (SQLException ex) {
            Logger.getLogger(threedetails.class.getName()).log(Level.SEVERE, null, ex);
        }
           
                RequestDispatcher rd2=request.getRequestDispatcher("driverreport.jsp");  
                rd2.include(request, response);
        }
  

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
