/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportmgtsys.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import transportmgtsys.datasource.DataSource;
import transportmgtsys.model.AssignedTrips;

/**
 *
 * @author GraceTina
 */
@WebServlet(name = "ViewAssignedTripsController", urlPatterns = {"/view/assigned/trips"})
public class ViewAssignedTripsController extends HttpServlet {

    @EJB
     private DataSource dataSource;
   
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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
        AssignedTrips trip = new AssignedTrips();
        trip.setDepartment(request.getParameter("department"));
        trip.setDepartureDate(request.getParameter("departmentDate"));
        trip.setDestination(request.getParameter("destination"));
        trip.setDriverAssigned(request.getParameter("driverAssigned"));
        trip.setDriverPhoneNo(request.getParameter("driverPhoneNo"));
        trip.setDuration(request.getParameter("duration"));
        trip.setPassengers(request.getParameter("passengers"));
        trip.setReturnDate(request.getParameter("returnDate"));
        trip.setTripName(request.getParameter("tripName"));
        trip.setVehicleAssigned(request.getParameter("vehicleAssigned"));
        
        getServletContext()
               .getRequestDispatcher("/WEB-INF/jsp/driver/assignedtasks")
               .forward(request, response);
        
    }

    }
