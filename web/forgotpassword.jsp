<%-- 
    Document   : forgotpassword
    Created on : 04-Aug-2018, 08:15:15
    Author     : Barno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="style.css" >
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <div class="box" >
          <form method="post" action="<%=request.getContextPath() %>/ForgotPass" >
            <h3> Reset Password </h3>
            <div class="inputBox" >
            <input  name="EMAIL" placeholder="Email address" type="email" required autofocus >
            </div>
            <div class="inputBox" >
            <input name="PASSWORD" placeholder="New password" type="password" required autofocus >
            </div>
            <div class="inputBox" >
            <input name="confirm" placeholder="Confirm password" type="password" required autofocus >
            </div>
            <tr>
            <td><span style="color: red"><%=(request.getAttribute("msg") == null ) ? "" : request.getAttribute("msg") %> </span></td>
            <td>
                <br>
                <input name="recover-submit"  value="Reset" type="submit" >
          </form>
        </div>
    </body>   
</html>
