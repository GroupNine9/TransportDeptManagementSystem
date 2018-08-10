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
    </head>
    <body >
    <center>
        <table border='1'>
            <tr>
            <td>Department</td>
            <td>Odometer number</td>
            <td>Fuel</td>
            <td>Model</td>
            <td>Engine number</td>
            <td>Service</td>
            <td>Vehicle condition</td>
            <td>Date in</td>
            <td>Promised date</td>
            <td>Contact person</td>
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
                </tr>
                <%
            }
%>
        </table>
    </center>
    </body>
</html>


