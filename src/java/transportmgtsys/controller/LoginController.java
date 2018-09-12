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

@WebServlet(name = "LoginController", urlPatterns = {"/login"})
public class LoginController extends HttpServlet {

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
                .getRequestDispatcher("/WEB-INF/jsp/testlogin.jsp")
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

        User loggedInUser = dataSource.authenticate(
                request.getParameter("staffId"), request.getParameter("pwd"));

        // match not found
        if (loggedInUser == null) {
            getServletContext()
                    .getRequestDispatcher("/WEB-INF/jsp/testlogin.jsp")
                    .forward(request, response);
        } else { // match found
            request.setAttribute("user", loggedInUser);
            // add user object to session
            request.getSession(true).setAttribute("user", loggedInUser);
            response.sendRedirect("/");
        }
    }
}
