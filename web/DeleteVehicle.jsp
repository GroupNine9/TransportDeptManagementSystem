<%-- 
    Document   : DeleteStaff
    Created on : Sep 3, 2018, 6:28:36 AM
    Author     : Grace
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Beans.Staff"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Remove Vehicle</title>
        
        <link rel="stylesheet" type="text/css" href="form.css">
        <link rel="stylesheet" type="text/css" href="buttons.css">
        <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="C:\Users\Grace\Desktop\BootStrap\css\bootstrap.min">
        <link href="https://fonts.googleapis.com/css?family=Raleway:100,200,400,500,600" rel="stylesheet" type="text/css">        
    </head>
    <body>
        <jsp:useBean id="staff" scope="request" class="Beans.Staff"></jsp:useBean>
        
              
    <div class="sidenav">
        <a href="admin.jsp"><i class="fa fa-home" aria-hidden="true"></i>HOME</a><br>
        <a href="DeleteStaff.jsp"><i class="fa fa-users" aria-hidden="true"></i>DELETE STAFF</a><br>
        <a href="RegisterStaff.jsp"><i class="fa fa-bus" aria-hidden="true"></i>REGISTER STAFF</a><br>
        <a href="RegisterVehicle.jsp"><i class="fa fa-bus" aria-hidden="true"></i>REGISTER VEHICLE</a><br>
        <a href="reportpick.jsp"><i class="fa fa-calendar" aria-hidden="true"></i>VIEW REPORTS</a><br>
        <a href="Trips.jsp"><i class="fa fa-suitcase" aria-hidden="true"></i>VIEW TRIPS</a><br>
            
    </div>
        
        <div class="main">
            
        <font face="Comic sans MS" size="5">REMOVE VEHICLE</font>
        <form  action="<%=request.getContextPath() %>/DeleteServelet" method="post">
        <div class="input-container">           
            <label style="background-color: green;
                   color: white;
                   width: 120px;
                   font-size: 15px;">STAFF ID</label>
            <input class="input-field" type="text" placeholder="ENTER VEHICLE PLATE NUMBER" name="platenumber" value="<jsp:getProperty name="staff" property="phonenumber"/>"><br>
        </div>
        
        <div class="input-container">
             <label style="background-color: green;
                   color: white;
                   width: 120px;
                   font-size: 15px;">PASSWORD</label>
            <input class="input-field" type="password" placeholder="CONFIRM YOUR PASSWORD" name="password" value="<jsp:getProperty name="staff" property="role"/>"><br>
        </div>
        
       
        
        <div class="input-container">
            <input type="submit" class="btnred" value="REMOVE EMPLOYEE">
        </div>
        </form>
        </div>
           </body>
</html>
