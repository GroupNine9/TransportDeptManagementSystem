<%-- 
    Document   : viewreports
    Created on : 06-Aug-2018, 13:43:11
    Author     : Barno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" type=text/css href="report.css" >
        <link rel="stylesheet" type=text/css href="form_1.css" >
         <link rel="stylesheet" type=text/css href="nav.css" >
       
    </head>
    <div class="topnav">
            <a href="admin.jsp">HOME</a>
            <a href="<%=request.getContextPath() %>/logout"><i class="fa fa-calendar" aria-hidden="true"></i>LOGOUT</a>
        </div>
    <h2 align="center"><font color="green" ><strong>DRIVER REPORTS</strong></font></h2>
    <body >
        <div style="overflow-x: auto;">
        <table class="tablem" border='1'>
            <tr>
                <th>Trip Name</th>
              <th>Departure Date</th>
              <th>Time Out</th>
              <th>Return Date</th>
              <th>Time In</th>
              <th>Number Of Drivers</th>
              <th>Journey Details</th>
              <th>Oil Drawn</t>
              <th>Fuel Drawn</th>
              <th>Receipts</th>
              <th>Speed Reading</th>
              <th>KMs Of Journey</th>
            </tr>
            <%Iterator itr; %>
            <% List data = (List)request.getAttribute("data");
            for(itr = data.iterator();
                    itr.hasNext();) 
            {
                %> 
             
                <tr>
                    <td> <%=itr.next() %> </td>
                    <td> <%=itr.next() %> </td>
                    <td> <%=itr.next() %> </td>
                    <td> <%=itr.next() %> </td>
                    <td> <%=itr.next() %> </td>
                    <td> <%=itr.next() %> </td>
                    <td> <%=itr.next() %> </td>
                    <td> <%=itr.next() %> </td>
                    <td> <%=itr.next() %> </td>
                    <td> <%=itr.next() %> </td>
                    <td> <%=itr.next() %> </td>
                    <td> <%=itr.next() %> </td>
                </tr>
                <%
            }
%>

        </table>
        </div>
    </body>
</html>
