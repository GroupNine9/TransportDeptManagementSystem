/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.LoginBean;
import Model.LoginDao;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Barno
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet 
{
    
     public Login()
    {
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    { 
        String PASSWORD = request.getParameter("PASSWORD");
        String NAME = request.getParameter("NAME");
        
        LoginBean loginBean = new LoginBean();
        
        loginBean.setName(NAME);
        loginBean.setPassword(PASSWORD);
        
        LoginDao loginDao = new LoginDao();
        
        try
        {
            String userValidate = loginDao.authenticateUser(loginBean);
           
            if(userValidate.equals("Admin"))
            {
                System.out.println("Admin");
                
                //Create a session
                HttpSession session = request.getSession();
                //setting session attribute
                session.setAttribute("Admin", NAME);
                request.setAttribute("NAME", NAME);
                
                request.getRequestDispatcher("/View/admin.jsp").forward(request, response);
            }
            else if(userValidate.equals("Mechanic"))
            {
                System.out.println("Mechanic");
                
                HttpSession session = request.getSession();
                session.setAttribute("Mechanic", NAME);
                request.setAttribute("NAME", NAME);
                
                request.getRequestDispatcher("/View/admin.jsp").forward(request, response);
            }
            else if(userValidate.equals("School Official") )
            {
                System.out.println("School Official");
                
                HttpSession session = request.getSession();
                session.setAttribute("School Official", NAME);
                request.setAttribute("NAME", NAME);
                
                request.getRequestDispatcher("/View/admin.jsp").forward(request, response);
            }
            else if(userValidate.equals("Booking Officer") )
            {
                System.out.println("Booking Officer");
                
                HttpSession session = request.getSession();
                session.setAttribute("Booking Officer", NAME);
                request.setAttribute("NAME", NAME);
                
                request.getRequestDispatcher("/View/admin.jsp").forward(request, response);
            }
            else if(userValidate.equals("Driver"))
            {
                System.out.println("Driver");
                
                HttpSession session = request.getSession();
                session.setMaxInactiveInterval(10*60);
                session.setAttribute("Driver", NAME);
                request.setAttribute("NAME", NAME);
                
                request.getRequestDispatcher("/View/Home.jsp").forward(request, response);
            }
            else
            {
                 System.out.println("Error message =" +userValidate);
                 request.setAttribute("errMessage", userValidate);
                
                request.getRequestDispatcher("/View/loginjsp").forward(request, response);
            }
           
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (Exception e1)
        {
            e1.printStackTrace();
        }
     
    }
   
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        //Fetch session object
        HttpSession session = request.getSession(false);
        
        //If sesson is not nul
        if(session != null)
        {
            //remove all session attribute bound to the session
            session.invalidate();
            request.setAttribute("errMessage", "You have logged out successfully");
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/View/Home.jsp");
            requestDispatcher.forward(request, response);
            System.out.println("Logged out");
        }
}
}
