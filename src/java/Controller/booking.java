/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import beans.Book;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;


/**
 *
 * @author HP-
 */
public class booking extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           
    
            
            Book book = new Book();
            
            
                book.setDestination(request.getParameter("destination"));
                book.setDeparturedate(request.getParameter("departuredate"));
                book.setReturndate(request.getParameter("returndate"));
                book.setPassCount(request.getParameter("passCount"));               
            
                book.setDuration(request.getParameter("duration"));
                

                book.BookVehicle();
                
                out.println("<br>");
                out.println("<br>");
                out.println("<center>Great!!!</center>");
                RequestDispatcher rd = request.getRequestDispatcher("login_form.jsp");
                rd.forward(request,response);
            } finally {out.close();}
        }
           
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
            
}
    

