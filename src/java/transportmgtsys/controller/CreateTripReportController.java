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
import transportmgtsys.model.TripReport;


@WebServlet(name = "CreateTripReportController", urlPatterns = {"/driver/trip_report"})
public class CreateTripReportController extends HttpServlet {

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
                .getRequestDispatcher("/WEB-INF/jsp/driver/driverreport.jsp")
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
        
        TripReport report= new TripReport();
        report.setDateTimeIn(request.getParameter("dateTimeIn"));
        report.setDateTimeOut(request.getParameter("dateTimeOut"));
        report.setDriverNo(request.getParameter("driverNo"));
        report.setFuelDrawn(request.getParameter("fuelDrawn"));
        report.setKmJourney(request.getParameter("kmJourney"));
        report.setReceiptNo(request.getParameter("receiptNo"));
        report.setServices(request.getParameter("services"));
        report.setSpeedReading(request.getParameter("speedReading"));
        report.setTripName(request.getParameter("tripName"));
        
        dataSource.createTripReport(report);
        
       
    }
}
