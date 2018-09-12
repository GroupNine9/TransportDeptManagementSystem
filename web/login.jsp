
<%@page contentType="text/html" language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css" >
    </head>
    <img src="image.jpeg" width="1350" height="280"  style="position:relative; top: 10px; left: 10px; z-index: 1;" >
    <img src="logo.png" width="330" height="260"  style="position:absolute; top: 25px; left: 25px; z-index: 2;">
    <body >
        <div class="box" style="z-index: 1;">
            <h2>Egerton Transport System</h2>
            <form action="<%=request.getContextPath() %>/Login" method="post" name="sampleform" >
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
                <input type="submit" name="login" value="Login"  >
                <br>
                <a href="forgotpassword.jsp" style="text-decoration: none; float: right; color: white; margin-right: 34px; margin-top: 26px;">Forgot Password? </a>
                
            </form>
        </div>
  
    </body>
</html>
