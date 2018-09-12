/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Barno
 */
public class ViewReports extends HttpServlet 
{
    
    String page = "viewreports.jsp";

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        PrintWriter out = response.getWriter();
        
        String url = "jdbc:mysql://localhost:3306/transportmanagement";
        
        Connection con;
        ResultSet rs;
        
        response.setContentType("text/html");
        
        List dataList = new ArrayList();
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            
            con = DriverManager.getConnection(url, "root", "");
            
            String sql = "select * from tripreport";
            
            Statement st = con.createStatement();
            st.executeQuery(sql);
            
            rs = st.getResultSet();
            
            while(rs.next())
            {
                dataList.add(rs.getString("tripname"));
                dataList.add(rs.getString("ddate"));
                dataList.add(rs.getString("timeout"));
                dataList.add(rs.getString("rdate"));
                dataList.add(rs.getString("timein"));
                dataList.add(rs.getString("driverno"));
                dataList.add(rs.getString("journeydetails"));
                dataList.add(rs.getString("oildrawn"));
                dataList.add(rs.getString("fueldrawn"));
                dataList.add(rs.getString("receipts"));
                dataList.add(rs.getString("speedo"));
                dataList.add(rs.getString("kms"));
            }
            rs.close();
            
            st.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception is ;" + e);
        }
        request.setAttribute("data", dataList);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher(page);
        
        if(dispatcher != null)
        {
            dispatcher.forward(request, response);
        }
    }

}
