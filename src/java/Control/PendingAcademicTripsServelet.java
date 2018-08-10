/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import beans.Trip;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class PendingAcademicTripsServelet extends HttpServlet {
    
 @Override
 protected void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException{
     
        Trip p = new Trip();
        List list = p.pendingtripList();

        req.setAttribute("tripdata", list);//adds data into a request object
        //forward request to jsp page
        RequestDispatcher rd = req.getRequestDispatcher("PendingAcademicTrips.jsp");
        rd.forward(req, res);
    }

    
   

}
