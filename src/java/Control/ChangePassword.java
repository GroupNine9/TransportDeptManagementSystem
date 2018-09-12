/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.LoginBean;
import Model.LoginDao;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Barno
 */
public class ChangePassword extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        //retrieve all parameters from jsp page
        String currentpass = request.getParameter("currentpassword");
        String newpass = request.getParameter("newpassword");
        String confirmpass = request.getParameter("confirmpassword");
        
        HttpSession session = request.getSession();
        String cpass = (String)session.getAttribute("password");
        String staff = (String)session.getAttribute("staffid");
        
        if(currentpass.equals("") || newpass.equals("") || confirmpass.equals(""))
        {
            request.setAttribute("msg", "All fields are required");
            getServletContext().getRequestDispatcher("changepassword.jsp").forward(request, response);
        }
        else if(!newpass.equals(confirmpass))
        {
            request.setAttribute("msg", "Passwords does not match");
            getServletContext().getRequestDispatcher("changepassword.jsp").forward(request, response);
        }
        else if(!cpass.equals(currentpass))
        {
            request.setAttribute("msg", "Old password is not correct");
            getServletContext().getRequestDispatcher("changepassword.jsp").forward(request, response);
        }
        else
        {
            //set values to model class object
            LoginBean loginBean = new LoginBean();
            loginBean.setStaffId(staff);
            loginBean.setPassword(newpass);
            
            //call a method in Dao to update table
            String sql = "update staff set PASSWORD = ? where STAFFID = ? ";
            int i = LoginDao.resetPass(loginBean, sql);
            
            if(i != 0)
            {
                request.setAttribute("msg", "Password changed successfully");
                getServletContext().getRequestDispatcher("management.jsp").forward(request, response);
            }
            else
            {
                request.setAttribute("msg", "Password not changed. Try after some time...");
                getServletContext().getRequestDispatcher("changepassword.jsp").forward(request, response);
            }
        } 
    }
}
