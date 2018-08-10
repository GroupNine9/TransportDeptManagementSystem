/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.io.IOException;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Barno
 */
public class ForgotPass extends HttpServlet 
{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        
        try
        {
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/transportmanagement", "root", "");

            String email = request.getParameter("email");
            String pass = request.getParameter("password");
            String confirm = request.getParameter("confirm");
            
            PreparedStatement ps = con.prepareStatement("update staff set password = ? where email =? ");
            ps.setString(1, pass);
            ps.setString(2, email);
            
            int i = ps.executeUpdate();
            
            if(!pass.equals(confirm))
            {
                request.setAttribute("msg", "Passwords does not match");
                getServletContext().getRequestDispatcher("/View/forgotpassword.jsp").forward(request, response);
            }
            else
            {
                
                if(i > 0)
            {
                request.setAttribute("msg", "Password changed successfully");
                getServletContext().getRequestDispatcher("/View/update.jsp").forward(request, response);
                //response.sendRedirect("update.jsp");
                
            }
            else
            {
                System.out.println("Error in changing password..Try Again");
                response.sendRedirect("/View/forgotpassword.jsp");
            }
                
            }         
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    } 
}
