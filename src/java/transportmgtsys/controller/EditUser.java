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
import transportmgtsys.model.Staff;

@WebServlet(name = "EditUser", urlPatterns = {"/edit/profile"})
public class EditUser extends HttpServlet {

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

        Staff loggedInUser = (Staff) request.getSession(true).getAttribute("staff");

        if (loggedInUser != null) {
            request.setAttribute("staff", loggedInUser);
            getServletContext()
                    .getRequestDispatcher("/WEB-INF/jsp/mechanic/profile_edit.jsp")
                    .forward(request, response);
        } else {
            response.sendRedirect("/login");
        }
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

        Staff loggedInUser = (Staff) request.getSession(true).getAttribute("staff");

        if (loggedInUser != null) {
            loggedInUser.setStaffId(request.getParameter("staffId"));
            loggedInUser.setPwd(request.getParameter("pwd"));
            loggedInUser.setRole(Staff.enumToObject(request.getParameter("role")));
            loggedInUser.setFirstName(request.getParameter("fname"));
            loggedInUser.setLastName(request.getParameter("lname"));
            loggedInUser.setNationalId(request.getParameter("nationalId"));
            loggedInUser.setGender(request.getParameter("gender"));
            loggedInUser.setPhoneNo(request.getParameter("phoneNo"));
            loggedInUser.setEmailAddr(request.getParameter("email"));
            
            dataSource.updateStaff(loggedInUser);
            request.setAttribute("staff", loggedInUser);
            request.getSession(true).setAttribute("staff", loggedInUser);
            getServletContext()
                    .getRequestDispatcher("/WEB-INF/jsp/mechanic/profile_view.jsp")
                    .forward(request, response);
        } else {
            response.sendRedirect("/login");
        }
    }
}
