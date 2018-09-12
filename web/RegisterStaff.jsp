
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Beans.Staff"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Worker</title>
        
        <link rel="stylesheet" type="text/css" href="form.css">
                <link rel="stylesheet" type="text/css" href="nav.css">
        <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="C:\Users\Grace\Desktop\BootStrap\css\bootstrap.min">
        <link href="https://fonts.googleapis.com/css?family=Raleway:100,200,400,500,600" rel="stylesheet" type="text/css">        
    </head>
    <body>
        <jsp:useBean id="staff" scope="request" class="Beans.Staff"></jsp:useBean>
        
              
   <div class="sidenav">
        <a href="admin.jsp"><i class="fa fa-home" aria-hidden="true"></i>HOME</a><br>
        <a href="DeleteStaff.jsp"><i class="fa fa-users" aria-hidden="true"></i>DELETE STAFF</a><br>
        <a href="DeleteVehicle.jsp"><i class="fa fa-bus" aria-hidden="true"></i>DELETE VEHICLE</a><br>
        <a href="RegisterVehicle.jsp"><i class="fa fa-bus" aria-hidden="true"></i>REGISTER VEHICLE</a><br>
        <a href="reportpick.jsp"><i class="fa fa-calendar" aria-hidden="true"></i>VIEW REPORTS</a><br>
        <a href="Trips.jsp"><i class="fa fa-suitcase" aria-hidden="true"></i>VIEW TRIPS</a><br>
    </div>
        
        <div class="main">
            
            <font face="Comic sans MS" size="5">REGISTER EMPLOYEE</p>

        <form  action="<%=request.getContextPath() %>/RegisterStaffServelet" method="post">
            
        <div class="input-container">
            <label style="background-color: green;
                   color: white;
                   width: 120px;
                   font-size: 15px;">STAFF ID</label>
            <input class="input-field" type="text" placeholder="STAFF ID" name="staffid" maxlength="14" required="true" value="<jsp:getProperty name="staff" property="staffid"/>"><br>
        </div>
        
        <div class="input-container">            
            <label style="background-color: green;
                   color: white;
                   width: 120px;
                   font-size: 15px;">NAME</label>
            <input class="input-field" type="text" placeholder="NAME" name="name" maxlength="30" required="true" value="<jsp:getProperty name="staff" property="name"/>"><br>
        </div>
        
        <div class="input-container">
            <label style="background-color: green;
                   color: white;
                   width: 120px;
                   font-size: 15px;">E-MAIL</label>
            <input class="input-field" type="email" placeholder="E-MAIL" name="email" required="true" value="<jsp:getProperty name="staff" property="email"/>"><br>
        </div>
        
        <div class="input-container">
            <label style="background-color: green;
                   color: white;
                   width: 120px;
                   font-size: 15px;">ID NO</label>
            <input class="input-field" type="number" maxlength="8"  placeholder="ID NUMBER" name="idnumber" required="true" value="<jsp:getProperty name="staff" property="idnumber"/>"><br>
        </div>
        
        <div class="input-container">           
            <label style="background-color: green;
                   color: white;
                   width: 120px;
                   font-size: 15px;">PHONE NO</label>
                   <input class="input-field" type="tel"  maxlength="10" minlength="10" title="Correct telephone format" required="true" placeholder="PHONE NUMBER" name="phonenumber" value="<jsp:getProperty name="staff" property="phonenumber"/>"><br>
                   
        </div>
        
        <div class="input-container">
             <label style="background-color: green;
                   color: white;
                   width: 120px;
                   font-size: 15px;">ROLE</label>
             <select class="input-field" name="role" value="<jsp:getProperty name="staff" property="role"/>">ROLE
                 <option value="Driver">Driver</option>
                 <option value="School Official">School Official</option>
                 <option value="Booking Officer">Booking Officer</option>
                 <option value="Mechanic">Mechanic</option>
                 <option value="Driver">Driver</option>
             </select>
        </div>
        
        <div class="input-container">
            <label style="background-color: green;
                   color: white;
                   width: 120px;
                   font-size: 20px;">PASSWORD</label>
            <input class="input-field" type="password" pattern=".{6,}" title="Six or more characters" placeholder="PASSWORD" required="true" name="password" value="<jsp:getProperty name="staff" property="password"/>"><br><br>
        </div>
        
        <div class="input-container">
            <input type="submit" class="btn" value="ADD EMPLOYEE">
        </div>
        </form>
        </div>
           </body>
</html>
