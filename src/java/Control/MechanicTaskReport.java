/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;


import Beans.Task;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author paige
 */
public class MechanicTaskReport extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            Task task = new Task();
            
                task.setInstructions(request.getParameter("instructions"));
                task.setAdditionals(request.getParameter("additionals"));
                task.setWork(request.getParameter("work"));
                task.setDefects(request.getParameter("defects"));
                task.setItem(request.getParameter("item"));
                task.setReqno(request.getParameter("reqno"));
               task.setNoteno(request.getParameter("noteno"));
               task.setDate(request.getParameter("date"));
               task.setCost(request.getParameter("cost"));
                task.setModel(request.getParameter("model"));               
                task.setReg(request.getParameter("reg"));
               task.setLabourhourscost(request.getParameter("labourhourscost")); 
               task.setGasweldingcost(request.getParameter("gasweldingcost"));
               task.setWheelbalancecost(request.getParameter("wheelbalancecost"));
               task.setPaintcost(request.getParameter("paintcost"));
                
                

               task.taskReport();
                
                RequestDispatcher dispatcher = request.getRequestDispatcher("Mech.jsp");
                dispatcher.forward(request, response);
            
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
