<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Beans.Vehicle"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Vehicle</title>
        <link rel="stylesheet" type="text/css" href="form.css">
        <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="C:\Users\Grace\Desktop\BootStrap\css\bootstrap.min">
        <link href="https://fonts.googleapis.com/css?family=Raleway:100,200,400,500,600" rel="stylesheet" type="text/css">
    </head>
    <body>
        <jsp:useBean id="vehicle" scope="request" class="Beans.Vehicle"></jsp:useBean>
    <div class="sidenav">
        <a href="admin.jsp"><i class="fa fa-home" aria-hidden="true"></i>HOME</a><br>
        <a href="DeleteStaff.jsp"><i class="fa fa-users" aria-hidden="true"></i>DELETE STAFF</a><br>
        <a href="DeleteVehicle.jsp"><i class="fa fa-bus" aria-hidden="true"></i>DELETE VEHICLE</a><br>
        <a href="RegisterStaff.jsp"><i class="fa fa-bus" aria-hidden="true"></i>REGISTER STAFF</a><br>
        <a href="reportpick.jsp"><i class="fa fa-calendar" aria-hidden="true"></i>VIEW REPORTS</a><br>
        <a href="Trips.jsp"><i class="fa fa-suitcase" aria-hidden="true"></i>VIEW TRIPS</a><br>
    </div>
        
        <div class="main">
            
        <p class="header">REGISTER VEHICLE</p>
        
        <form  action="<%=request.getContextPath() %>/RegisterVehicleServelet" method="post">
            <div class="input-container">
             <label style="background-color: green;
                   color: white;
                   width: 120px;
                   font-size: 15px;">ID</label>
            <input class="input-field" type="text" maxlength="5" placeholder="VEHICLE ID" name="vehicleid" value="<jsp:getProperty name="vehicle" property="vehicleid"/>"><br>
            </div>
            <div class="input-container">
             <label style="background-color: green;
                   color: white;
                   width: 120px;
                   font-size: 15px;">PLATE NO</label>
            <input class="input-field" type="text" placeholder="PLATE NUMBER" maxlength="8"  name="platenumber" value="<jsp:getProperty name="vehicle" property="platenumber"/>"><br>
            </div>
            <div class="input-container">
             <label style="background-color: green;
                   color: white;
                   width: 120px;
                   font-size: 15px;">MODEL</label>
            <input class="input-field" type="text" name="model" placeholder="MODEL" maxlength="15" value="<jsp:getProperty name="vehicle" property="model"/>"><br>
            </div>
            <div class="input-container">
             <label style="background-color: green;
                   color: white;
                   width: 120px;
                   font-size: 15px;">CAPACITY</label>
            <input class="input-field" type="number" placeholder="CAPACITY" name="capacity" value="<jsp:getProperty name="vehicle" property="capacity"/>"><br>
            </div>
            <div class="input-container">
             <label style="background-color: green;
                   color: white;
                   width: 120px;
                   font-size: 15px;">TYPE</label>
            <input class="input-field" type="text" placeholder="TYPE" name="type" maxlength="15" value="<jsp:getProperty name="vehicle" property="type"/>"><br>
            </div>
            <div class="input-container">
                        
            <div class="input-container">
            <input type="submit" class="btn" value="ADD VEHICLE">
            </div>
            </form>
         </div>
    </body>
</html>
