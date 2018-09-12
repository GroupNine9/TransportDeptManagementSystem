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
import transportmgtsys.model.User;

/**
 *
 * @author sudo-su
 */
@WebServlet(name = "RegisterUserController", urlPatterns = {"/admin/register_user"})
public class RegisterUserController extends HttpServlet {

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
        
        
        User newUser = getUser(request);

        if (dataSource.createUser(newUser)) {

            switch (newUser.getRole()) {
                case DRIVER:
                case MECHANIC:
                case SO:
                case TTS:
                    dataSource.createUser(newUser);
                    break;
                case TO:
                    dataSource.createUser(newUser);
                    // more profile stuff
                    break;
            }
        } else {
            // error
        }
    }

    private User getUser(HttpServletRequest request) {

        User newUser = new User();
        newUser.setStaffId(request.getParameter("staffId"));
        newUser.setPwd(request.getParameter("pwd"));
        newUser.setRole(User.enumToObject(request.getParameter("role")));
        newUser.setFirstName(request.getParameter("fname"));
        newUser.setLastName(request.getParameter("lname"));
        newUser.setNationalId(request.getParameter("nationalId"));
        newUser.setGender(request.getParameter("gender"));
        newUser.setPhoneNo(request.getParameter("phoneNo"));
        newUser.setEmailAddr(request.getParameter("email"));

        return newUser;
    }
}
