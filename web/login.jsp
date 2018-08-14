
<%@page contentType="text/html" language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css" >
    </head>
    <body background="http://4.bp.blogspot.com/-PxaRO0MVqWk/TdPrHO4MiQI/AAAAAAAAACs/0rW6HkrvJYw/s1600/egerton2.jpg">
        <div class="box" >
            <h2>Egerton Transport System</h2>
            <form action="<%=request.getContextPath() %>/Login" method="post" >
                <div class="inputBox">
                    <input type="text" name="STAFFID" required="" >
                    <label>STAFF ID</label>
                </div>
                <div class="inputBox">
                    <input type="password" name="PASSWORD" required="" >
                    <label>PASSWORD </label>
                </div>
                 <tr>
                 <td><span style="color: red"><%=(request.getAttribute("errMessage") == null ) ? "" : request.getAttribute("errMessage") %> </span></td>
                </tr>
                <br>
                <input type="submit" name="login" value="Login" >
                <br>
                <div>
                <input type="checkbox"  value="scales"style=" margin: 20px 30px; ">
                <label for="scales" style=" color: white" >Remember me </label>
                </div>
                <a href="forgotpassword.jsp" style="text-decoration: none; float: right; color: white; margin-right: 34px; margin-top: 26px;">Forgot Password? </a>
                 
            </form>
        </div>
  
    </body>
</html>
