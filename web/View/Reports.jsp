<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trips</title>
         <link rel="stylesheet" type="text/css" href="form.css">
    </head>
    <body>
        <div class="sidenav">
            
            <a href="View/Trips.jsp">HOME</a>
            <a href="View/RegisterStaff.jsp">REGISTER STAFF</a>
            <a href="View/RegisterVehicle.jsp">REGISTER VEHICLE</a>
            <a href="View/Trips.jsp">VIEW TRIPS</a>
            <a href="View/Trips.jsp">ASSIGN TASKS</a>
        
        </div>
        
        <div class="main">
            <p class="text">PICK AN OPTION:<p>
      
                <a href="PendingAcademicTrips.jsp">
                <input type="button"  class="btn"  value="DRIVER REPORTS" name="pendingacademic" />
                </a><br><br><br>
                <a href="PendingOfficialTrips.jsp">
                <input type="button"  class="btn"  value="MECHANIC REPORTS" name="pendingacademic" />
                </a><br><br><br>
                                    
        </div>
    </body>
</html>
