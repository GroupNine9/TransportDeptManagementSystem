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
        <a href="RegisterStaff.jsp">REGISTER STAFF</a>
        <a href="RegisterVehicle.jsp">REGISTER VEHICLE</a>
        <a href="admin.jsp">HOME</a>
        
        </div>
        
        <div class="main">
            <p class="text">PICK AN OPTION:<p>
      
                <a href="<%=request.getContextPath() %>/ViewReport">
                <input type="button"  class="btn"  value="MECHANIC REPORTS" />
                </a><br><br><br>
               
                <a href="<%=request.getContextPath() %>/ViewReports">
                <input type="button"  class="btn"  value="DRIVER REPORTS" />
                </a>
                      
        </div>
    </body>
</html>
