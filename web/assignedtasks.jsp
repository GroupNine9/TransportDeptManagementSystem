<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All Staff</title>
        <style>
            body {
                padding: 100px;
            }
        </style>
    </head>
    <body>
        <a href="/view/assigned/tasks">Assigned Tasks</a>
        <h1>All Staff</h1>
        <table>
            <thead>
                <tr>
                    <th>Vehicle Id</th>
                    <th>Date In</th>
                    <th>Service Wanted</th>
                    <th>Part to Repair</th>
                    <th>Contact Person</th>
                    <th>Staff Id</th>
                   
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${services}" var="service">
                    <tr>
                        <td>${service.vehicleId}</td>
                        <td>${service.dateIn}</td>
                        <td>${service.serviceWanted}</td>
                        <td>${service.partRepair}</td>
                        <td>${service.contactPrsn}</td>
                        <td>${service.staffId}</td>
                        
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
