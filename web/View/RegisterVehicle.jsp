<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="beans.Vehicle"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Vehicle</title>
        <link rel="stylesheet" type="text/css" href="form.css">

    </head>
    <body>
        <jsp:useBean id="vehicle" scope="request" class="beans.Vehicle"></jsp:useBean>
    <div class="sidenav">
        <a href="mgtr.jsp">HOME</a>
        <a href="RegisterStaff.jsp">REGISTER WORKER</a>
        <a href="Trips.jsp">VIEW TRIPS</a>
    </div>
        
        <div class="main">
            
        <p class="header">REGISTER VEHICLE</p>
        
        <form  action="<%=request.getContextPath() %>/RegisterVehicleServelet" method="post">
            <div class="input-container">
            <i class="fa fa-user icon"></i>
            <input class="input-field" type="text" placeholder="VEHICLE ID" name="vehicleid" value="<jsp:getProperty name="vehicle" property="vehicleid"/>"><br>
            </div>
            <div class="input-container">
            <i class="fa fa-user icon"></i>
            <input class="input-field" type="text" placeholder="PLATE NUMBER" name="platenumber" value="<jsp:getProperty name="vehicle" property="platenumber"/>"><br>
            </div>
            <div class="input-container">
            <i class="fa fa-user icon"></i>
            <input class="input-field" type="text" name="model" placeholder="MODEL" value="<jsp:getProperty name="vehicle" property="model"/>"><br>
            </div>
            <div class="input-container">
            <i class="fa fa-user icon"></i>
            <input class="input-field" type="text" placeholder="CAPACITY" name="capacity" value="<jsp:getProperty name="vehicle" property="capacity"/>"><br>
            </div>
            <div class="input-container">
            <i class="fa fa-user icon"></i>
            <input class="input-field" type="text" placeholder="TYPE" name="type" value="<jsp:getProperty name="vehicle" property="type"/>"><br>
            </div>
            <div class="input-container">
            <i class="fa fa-user icon"></i>
            <input class="input-field" type="text" placeholder="STATUS" name="status" value="<jsp:getProperty name="vehicle" property="status"/>"><br>
            </div>          
            <input type="submit" class="btn" value="ADD VEHICLE">
        </form>
    </body>
</html>
