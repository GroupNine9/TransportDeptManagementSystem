<%-- 
    Document   : maint
    Created on : Jul 30, 2018, 12:11:47 PM
    Author     : GraceTina
--%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>transport Page</title>
    </head>
    <body>
        <table border="1">
            <thead>
                <tr>
                    <th>Department</th>
                    <th>Odometer Number</th>
                    <th>Fuel</th>
                    <th>Engine Number</th> 
                    <th>Service</th>
                    <th>Vehicle Condition</th>
                    <th>Model</th>
                    <th>Date In</th>
                    <th>Promised Date</th>
                    <th>Contact Person</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${maintenance}" var="maintForm">
                    <tr>
                        <td>${maintForm.dept}</td>
                        <td>${maintForm.odometer}</td>
                        <td>${maintForm.fuel}</td>
                        <td>${maintForm.engine}</td>
                        <td>${maintForm.service}</td>
                        <td>${maintForm.condition}</td>
                        <td>${maintForm.model}</td>
                        <td>${maintForm.datein}</td>
                        <td>${maintForm.promiseddate}</td>
                        <td>${maintForm.person}</td>
                    </tr>
                </c:forEach>

            </tbody>
        </table>

    </body>
</html>
