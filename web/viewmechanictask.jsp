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
        <link rel="stylesheet" type=text/css href="mechanic.css" >
        <link rel="stylesheet" type=text/css href="form_1.css" >
        <link rel="stylesheet" type=text/css href="nav.css" >

    </head>
    <div class="topnav">
            <a href="mechanicdashboard.jsp">HOME</a>
            <a href="<%=request.getContextPath() %>/logout"><i class="fa fa-calendar" aria-hidden="true"></i>LOGOUT</a>
        </div>
    <h2 align="center"><font color="green" ><strong>MECHANIC TASKS</strong></font></h2>
    <body >
             <div style="overflow-x: auto;">
        <table class="table">
            <tr>
                <th>VEHICLE ASSIGNED ID</th>
                <th>EXPECTED DATE IN</th>
                <th>SERVICES REQUESTED</th>
                <th>PARTS TO REPAIR</th>
                <th>DRIVER CONTACT</th>
                <th>MECHANIC CONTACT</th>
                <th>MECHANIC NAME</th>
             
            </tr>
            <%Iterator itr; %>
            <% List data = (List)request.getAttribute("data");
            for(itr = data.iterator();
                    itr.hasNext();
                   
                    ) 
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
                   
                    
                </tr>
                <%
            }
%>

        </table>
             </div>
    </body>
</html>
