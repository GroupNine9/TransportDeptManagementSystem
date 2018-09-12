/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportmgtsys.controller;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import transportmgtsys.datasource.DataSource;
import transportmgtsys.model.Vehicle;

@WebServlet(name = "RegisterVehicleController", urlPatterns = {"/admin/register/vehicle"})
public class RegisterVehicleController extends HttpServlet {

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
        
        Vehicle newVehicle = new Vehicle();
        
        newVehicle.setCapacity(Integer.parseInt(request.getParameter("capacity")));
        newVehicle.setPlateNumber(request.getParameter("plateNo"));
        newVehicle.setDescription(request.getParameter("desc"));
        
        dataSource.createVehicle(newVehicle);
        response.sendRedirect("/admin/vehicles");
    }

}
