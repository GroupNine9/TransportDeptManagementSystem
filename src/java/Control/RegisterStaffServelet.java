
package Control;

import beans.Staff;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterStaffServelet extends HttpServlet{
    
  
 protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try(PrintWriter out = response.getWriter()) {
                    
        Staff staff = new Staff();
       

        staff.setStaffid(request.getParameter("staffid"));
        staff.setName(request.getParameter("name"));
        staff.setEmail(request.getParameter("email"));
        staff.setIdnumber(request.getParameter("idnumber"));
        staff.setPhonenumber(request.getParameter("phonenumber"));
        staff.setRole(request.getParameter("role"));
        staff.setPassword(request.getParameter("password"));
       
        staff.registerWorker();
        
        out.println("<br>");
        out.println("<center>Great!!!</center>");
               
            }
                      
    }
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
        {
            processRequest(request, response);
        }
 @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
        {
            processRequest(request, response);
        }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}