
<%@page contentType="text/html" language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css" >
    </head>
    <body>
        <tr>
                    <td><span style="color: red"><%=(request.getAttribute("errMessage") == null ) ? "" : request.getAttribute("errMessage") %> </span></td>
                </tr>
        <div class="box" >
            <h2>Egerton Transport System</h2>
            <form action="<%=request.getContextPath() %>/Login" method="post">
                <div class="inputBox">
                    <input type="text" name="NAME" required="" >
                    <label>Name</label>
                </div>
                <div class="inputBox">
                    <input type="password" name="PASSWORD" required="" >
                    <label>Password </label>
                </div>
                <input type="submit" name="login" value="Login" >
                <br>
                <input type="checkbox" style="margin: 20px 30px;" >Remember me
                <a href="a" style="text-decoration: none; float: right; color: white; margin-right: 34px; margin-top: 26px;">Forgot Password? </a>
                 
            </form>
        </div>
  
        </body>
</html>
