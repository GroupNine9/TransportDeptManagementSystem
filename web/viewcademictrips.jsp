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
        <link rel="stylesheet" type=text/css href="table.css" >
        <link rel="stylesheet" type=text/css href="form.css" >
    </head>
    <body >
        
    <center>
         <div class="sidenav">
             <a href="BOOKINGHOME.jsp">HOME</a>
            <a href="booking.jsp">ACADEMIC BOOKING</a>
           
        </div>
        <table class="table">
            <tr>
                <th>VEHICLE ASSIGNED</th>
              <th>TRIP NAME</th>
              
              <th>DRIVER PHONE NO</th>
              <th>DRIVER ASSIGNED</th>
              
              
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
                    
                    
                    
                </tr>
                <%
            }
%>

        </table>
    </center>
    </body>
</html>
