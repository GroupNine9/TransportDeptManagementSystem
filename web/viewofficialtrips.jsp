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
        <link rel="stylesheet" type="text/css" href="table.css" >
        <link rel="stylesheet" type=text/css href="form.css" >
    </head>
    <body >
        
    <center>
           <div class="sidenav">
                 <a href="officialhome.jsp">HOME</a>
             <a href="officialbooking.jsp">OFFICIAL BOOKING</a>
            
          
        </div>
            
        <table class="table">
            <tr>
              <th>VEHICLE ASSIGNED</th>
              <th>DRIVER ASSIGNED</th>
              <th>DRIVER PHONE</th>
              <th>PURPOSE</th>
             
              
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
