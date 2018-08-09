<%-- 
    Document   : changepassword
    Created on : 04-Aug-2018, 13:53:32
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
        <h2>Change password</h2>
        <form method="post" action="<%=request.getContextPath() %>/ChangePassword" >
             <div class="inputBox" >
            <input  placeholder="Current password" name="currentpassword" type="password" required autofocus >
            </div>
              <div class="inputBox" >
            <input name="newpassword" placeholder="New password" type="password" required autofocus >
            </div>
              <div class="inputBox" >
            <input name="confirmpassword" placeholder="Confirm password" type="password" required autofocus >
            </div>
              <br>
            <input name="submit"  value="Reset" type="submit" >
        </form>
        </div>
    </body>
</html>
