<%-- 
    Document   : viewreports
    Created on : 06-Aug-2018, 13:43:11
    Author     : Barno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%
    try
    {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
    }
    catch(ClassNotFoundException e)
    {
        e.printStackTrace();
    }
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/transportmanagement", "root", "");
    Statement st = null;
    ResultSet rs = null;
    %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <table border='1'>
            <tr>
            <th>Staff id</th>
             <th>Name</th>
              <th>Email</th>
            </tr>
            <%
                try
                {
                    st = con.createStatement();
                    String sql = "select * from staff";
                    rs = st.executeQuery(sql);
                    while(rs.next())
                    {
                        %>
                        <tr>
                            <td>
                                <%=rs.getString("STAFFID") %>
                            </td>
                            <td>
                                <%=rs.getString("NAME") %>
                            </td>
                            <td>
                                <%=rs.getString("EMAIL") %>
                            </td>
                        </tr>
                        <%
                    }
con.close();
                }
catch(Exception e)
{
e.printStackTrace();
}
%>
        </table>
    </body>
</html>
