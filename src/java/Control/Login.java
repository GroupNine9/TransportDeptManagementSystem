
package Control;

import Model.LoginBean;
import Model.LoginDao;
import java.io.IOException;
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
        String STAFFID = request.getParameter("STAFFID");
        String PASSWORD = request.getParameter("PASSWORD");
        
        LoginBean loginBean = new LoginBean();
        
        loginBean.setStaffId(STAFFID);
        loginBean.setPassword(PASSWORD);
        
        LoginDao loginDao = new LoginDao();
        
        try
        {
            String userValidate = loginDao.authenticateUser(loginBean);
            
            if(userValidate.equals("Admin"))
            {
                System.out.println("Admin");
                
                HttpSession session = request.getSession();
                session.setAttribute("Admin", STAFFID);
                request.setAttribute("STAFFID", STAFFID);
                
                request.getRequestDispatcher("management.jsp").forward(request, response);
            }
            else if(userValidate.equals("Driver"))
            {
                System.out.println("Driver");
                
                HttpSession session = request.getSession();
                session.setAttribute("Driver", STAFFID);
                request.setAttribute("STAFFID", STAFFID);
                
                request.getRequestDispatcher("driverdashboard.jsp").forward(request, response);
            }
            else if(userValidate.equals("School Official"))
            {
                System.out.println("School Official");
                
                HttpSession session = request.getSession();
                session.setAttribute("School Official", STAFFID);
                request.setAttribute("STAFFID", STAFFID);
                
                request.getRequestDispatcher("booking.jsp").forward(request, response);
            }
            else if(userValidate.equals("TT Secretary"))
            {
                System.out.println("TT Secretary");
                
                HttpSession session = request.getSession();
                session.setAttribute("TT Secretary", STAFFID);
                request.setAttribute("STAFFID", STAFFID);
                
                request.getRequestDispatcher("Home.jsp").forward(request, response);
            }
            else if(userValidate.equals("Mechanic"))
            {
                System.out.println("Mechanic");
                
                HttpSession session = request.getSession();
                session.setMaxInactiveInterval(10*60);
                session.setAttribute("Mechanic", STAFFID);
                request.setAttribute("STAFFID", STAFFID);
                
                request.getRequestDispatcher("mechanicdashboard.jsp").forward(request, response);
            }
            else
            {
                System.out.println("Error message =" +userValidate);
                request.setAttribute("errMessage", userValidate);
                
                request.getRequestDispatcher("login.jsp").forward(request, response);
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
}
