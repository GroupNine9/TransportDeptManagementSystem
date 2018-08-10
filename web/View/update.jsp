<%-- 
    Document   : update
    Created on : 06-Aug-2018, 12:47:42
    Author     : Barno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <center>
    <body>
         <tr>
            <td><span style="color: black"><%=(request.getAttribute("msg") == null ) ? "" : request.getAttribute("msg") %> </span></td>
         <h3>You can login <a href="login.jsp"  target="_parent" style="color: green;"> Here </a> </h3>
            <tr>
    </body>
        </center>
</html>
