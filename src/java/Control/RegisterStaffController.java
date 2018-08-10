/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Staff;
import datasource.DataSource;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author GraceTina
 */
@WebServlet(name = "RegisterStaffController", urlPatterns = {"/staff/register"})
public class RegisterStaffController extends HttpServlet {

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
                .getRequestDispatcher("/WEB-INF/jsp/registerstaff.jsp")
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

        Staff newStaff = new Staff();
        newStaff.setSurname(request.getParameter("surName"));
        newStaff.setOtherNames(request.getParameter("otherNames"));
        newStaff.setEmailAddress(request.getParameter("emailAddr"));
        newStaff.setNationalId(request.getParameter("nationalId"));
        newStaff.setPhoneNumber(request.getParameter("phoneNo"));
        newStaff.setStaffRole(request.getParameter("staffRole"));
        newStaff.setPassword(request.getParameter("password"));

        dataSource.createStaff(newStaff);

        request.setAttribute("staff", dataSource.findAllStaff());
        getServletContext()
                .getRequestDispatcher("/WEB-INF/jsp/allstaff.jsp")
                .forward(request, response);
    }
}
