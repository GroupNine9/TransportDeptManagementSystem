/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.io.IOException;
import java.sql.*;
import java.util.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Barno
 */
public class ViewReport extends HttpServlet 
{
    String page = "mechanicreport.jsp";

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String url = "jdbc:mysql://localhost:3306/transportmanagement";
        
        Connection con;
        ResultSet rs;

        response.setContentType("text/html");
        
        List list = new ArrayList();
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            
            con = DriverManager.getConnection(url, "root", "");
            
            String sql = "select * from taskreport";
            
            Statement st = con.createStatement();
            st.executeQuery(sql);
            
            rs = st.getResultSet();
            
            while(rs.next())
            {
                list.add(rs.getString("workinstruction"));
                list.add(rs.getString("additionalrepair"));
                list.add(rs.getString("workdone"));
                list.add(rs.getString("defects"));
                list.add(rs.getString("item"));
                list.add(rs.getString("reqno"));
                list.add(rs.getString("noteno"));
                list.add(rs.getString("date"));
                list.add(rs.getString("cost"));
                list.add(rs.getString("model"));
                list.add(rs.getString("regno"));
                list.add(rs.getString("labourhourscost"));
                list.add(rs.getString("gasweldingcost"));
                list.add(rs.getString("wheelbalancecost"));
                list.add(rs.getString("paintcost"));
            }
            rs.close();
            
            st.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception is ;" + e);
        }
        request.setAttribute("data", list);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher(page);
        
        if(dispatcher != null)
        {
            dispatcher.forward(request, response);
        }
    }
        
    }

