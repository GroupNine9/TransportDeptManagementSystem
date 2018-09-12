/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import transportmgtsys.datasource.DataSource;
import transportmgtsys.model.ServiceRequest;

/**
 *
 * @author GraceTina
 */
@WebServlet(name = "ServiceHome", urlPatterns = {"/service/home"})
public class ServiceRequestController extends HttpServlet {

    @EJB 
    private DataSource dataSource;
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext()
                .getRequestDispatcher("/WEB-INF/jsp/driver/servicerequest.jsp")
                .forward(request, response);

    }
            
       

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        ServiceRequest req = new ServiceRequest();
        req.setContactPrsn(request.getParameter("contactPrsn"));
        req.setDateIn(request.getParameter("dateIn"));
        req.setPartRepair(request.getParameter("partRepair"));
        req.setServiceWanted(request.getParameter("serviceWanted"));
        req.setVehicleId(request.getParameter("vehicleId"));
                
        dataSource.createServiceRequest(req);

    }

}
