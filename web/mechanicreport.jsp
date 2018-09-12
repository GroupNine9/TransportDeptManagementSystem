<%-- 
    Document   : mechanicreport
    Created on : 08-Aug-2018, 09:33:15
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
            <a href="mechanicdashboard.jsp">HOME</a>
            <a href="<%=request.getContextPath() %>/logout"><i class="fa fa-calendar" aria-hidden="true"></i>LOGOUT</a>
        </div>
    <h2 align="center"><font color="green" ><strong>MECHANIC REPORTS</strong></font></h2>
    <body >
    <center>
        <table class ="tablem" border='1'>
            <tr>
                <th>Work Instructions</th>
                <th>Additional Repair</th>
                <th>Work Done</th>
                <th>Defects</th>
                <th>Item Name</th>
                <th>Requisition Number </th>
                <th>Issue Note Number</th>
                <th>Date</th>
                <th>Cost</th>
                <th>Model</th>
                <th>Plate Number</th>
                <th>Labour Hours Cost</th>
                <th>Gas Welding Cost</th>
                <th>Wheel Balance Cost</th>
                <th>Paint Cost</th>
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
                    <td> <%=itr.next() %> </td>
                    <td> <%=itr.next() %> </td>
                    <td> <%=itr.next() %> </td>
                </tr>
                <%
            }
%>
        </table>
    </center>
    </body>
</html>


