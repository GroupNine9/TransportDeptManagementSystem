
package Control;

import Beans.Vehicle;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegisterVehicleServelet extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
            
        Vehicle vehicle = new Vehicle();
 
        vehicle.setVehicleid(request.getParameter("vehicleid"));
        vehicle.setPlatenumber(request.getParameter("platenumber"));
        vehicle.setModel(request.getParameter("model"));
        vehicle.setCapacity(request.getParameter("capacity"));
        vehicle.setType(request.getParameter("type"));
        vehicle.setStatus(request.getParameter("status"));
        
        vehicle.registerVehicle();
        
          RequestDispatcher rd1=request.getRequestDispatcher("RegisterVehicle.jsp");  
            rd1.include(request, response);
    
        
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
