/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.User;
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
@WebServlet(name = "RegisterUserController", urlPatterns = {"/register"})
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

        getServletContext()
                .getRequestDispatcher("/WEB-INF/jsp/testreg.jsp")
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

        User newUser = new User();

        newUser.setEmailAddr(request.getParameter("emailAddr"));
        newUser.setSurName(request.getParameter("surName"));
        newUser.setOtherNames(request.getParameter("otherNames"));
        newUser.setPwd(request.getParameter("password"));
        newUser.setRole(request.getParameter("role"));

        dataSource.createUser(newUser);
        getServletContext()
                .getRequestDispatcher("/WEB-INF/jsp/testlogin.jsp")
                .forward(request, response);
    }
}
