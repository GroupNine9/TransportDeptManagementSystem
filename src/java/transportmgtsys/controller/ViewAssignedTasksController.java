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
import transportmgtsys.model.AssignedTasks;

/**
 *
 * @author GraceTina
 */
@WebServlet(name = "ViewAssignedTasksController", urlPatterns = {"/view/assigned/tasks"})
public class ViewAssignedTasksController extends HttpServlet {

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


        /*dataSource.createStaff(newStaff);

        request.setAttribute("staff", dataSource.findAllStaff());
        getServletContext()
                .getRequestDispatcher("/WEB-INF/jsp/allstaff.jsp")
                .forward(request, response);*/

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
      AssignedTasks task = new AssignedTasks();
       task.setContactPrsn(request.getParameter("contactPrsn"));
       task.setDateIn(request.getParameter("dateIn"));
       task.setStaffId(request.getParameter("staffId"));
       task.setPartRepair(request.getParameter("partRepair"));
       task.setServiceWanted(request.getParameter("serviceWanted"));
       task.setVehicleId(request.getParameter("vehicleId"));
       
       getServletContext()
               .getRequestDispatcher("/WEB-INF/jsp/mechanic/assignedtasks")
               .forward(request, response);
    }

}
