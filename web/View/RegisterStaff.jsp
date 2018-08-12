
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="beans.Staff"%>
  


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Worker</title>
        <link rel="stylesheet" type="text/css" href="form.css">
    </head>
    <body>
        <jsp:useBean id="staff" scope="request" class="beans.Staff"></jsp:useBean>
       <div class="sidenav">
        <a href="managementback.jsp">HOME</a>
        <a href="RegisterVehicle.jsp">REGISTER VEHICLE</a>
        <a href="Trips.jsp">VIEW TRIPS</a>
    </div>
        <div class="main">
        <p class="header">REGISTER EMPLOYEE</p>

        <form  action="<%=request.getContextPath() %>/RegisterStaffServelet" method="post">
            
        <div class="input-container">
            <i class="fa fa-user icon"></i>
            <input class="input-field" type="text" placeholder="STAFF ID" name="staffid" value="<jsp:getProperty name="staff" property="staffid"/>"><br>
        </div>
        
        <div class="input-container">            
            <i class="fa fa-user icon"></i>
            <input class="input-field" type="text" placeholder="NAME" name="name" value="<jsp:getProperty name="staff" property="name"/>"><br>
        </div>
        
        <div class="input-container">
            <i class="fa fa-user icon"></i>
            <input class="input-field" type="text" placeholder="E-MAIL" name="email" value="<jsp:getProperty name="staff" property="email"/>"><br>
        </div>
        
        <div class="input-container">
            <i class="fa fa-user icon"></i>
            <input class="input-field" type="text" placeholder="ID NUMBER" name="idnumber" value="<jsp:getProperty name="staff" property="idnumber"/>"><br>
        </div>
        
        <div class="input-container">           
            <i class="fa fa-user icon"></i>
            <input class="input-field" type="text" placeholder="PHONE NUMBER" name="phonenumber" value="<jsp:getProperty name="staff" property="phonenumber"/>"><br>
        </div>
        
        <div class="input-container">
             <i class="fa fa-user icon"></i>
            <input class="input-field" type="text" placeholder="ROLE" name="role" value="<jsp:getProperty name="staff" property="role"/>"><br>
        </div>
        
        <div class="input-container">
            <i class="fa fa-user icon"></i>
            <input class="input-field" type="text" placeholder="PASSWORD" name="password" value="<jsp:getProperty name="staff" property="password"/>"><br><br>
        </div>
            <input type="submit" class="btn" onclick="move()" value="ADD EMPLOYEE">
        </form>
        </div>
        <div class="w3-light-grey">
            <div id="myBar" class="cont" style="height:24px;width:1%;color:red"></div>
       </div>

<script>
function move() {
    var elem = RegisterStaff.getElementById("myBar"); 
    var width = 1;
    var id = setInterval(frame, 10);
    function frame() {
        if (width >= 100) {
            clearInterval(id);
        } else {
            width++; 
            elem.style.width = width + '%'; 
        }
    }
}
</script>
    </body>
</html>
