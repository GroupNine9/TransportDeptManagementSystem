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
             <a href="View/RegisterStaff.jsp">REGISTER STAFF</a>
        <a href="View/RegisterVehicle.jsp">REGISTER VEHICLE</a>
        <a href="View/managementback.jsp">HOME</a>
        <a href="View/Trips.jsp">VIEW REPORTS</a>
        <a href="View/Trips.jsp">ASSIGN TASKS</a>
        </div>
        
        <div class="main">
            <p class="text">PICK AN OPTION:<p>
      
                <a href="PendingAcademicTrips.jsp">
                <input type="button"  class="btn"  value="PENDING ACADEMIC TRIPS" name="pendingacademic" />
                </a><br><br><br>
                <a href="PendingOfficialTrips.jsp">
                <input type="button"  class="btn"  value="PENDING OFFICIAL TRIPS" name="pendingacademic" />
                </a><br><br><br>
                <a href="ApprovedAcademicTrips.jsp">
                <input type="button"  class="btn"  value="APPROVED ACADEMIC TRIPS" name="pendingacademic" />
                </a><br><br><br>
                <a href="ApprovedOfficialTrips.jsp">
                <input type="button"  class="btn"  value="APPROVED OFFICIAL TRIPS" name="pendingacademic" />
                </a>
                      
        </div>
    </body>
</html>
