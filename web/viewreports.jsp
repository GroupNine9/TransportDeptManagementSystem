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
        <link rel="stylesheet" href="table.css" >
    </head>
    <body >
    <center>
        <table border='1'>
            <tr>
              <td>Destination</td>
              <td>Fuel drawn</td>
              <td>Receipt number</td>
              <td>Time in</td>
              <td>Time out</td>
              <td>KM of journey</td>
              <td>Speed reading</td>
              <td>Services acquired</td>
              <td>Driver's number</td>
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
                </tr>
                <%
            }
%>

        </table>
    </center>
    </body>
</html>
