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
        <a href="/staff/register">New Staff Member</a>
        <h1>All Staff</h1>
        <table>
            <thead>
                <tr>
                    <th>Trip Name</th>
                    <th>Destination</th>
                    <th>Departure Date</th>
                    <th>Return Date</th>
                    <th>Duration</th>
                    <th>Passengers</th>
                    <th>Department</th>

                </tr>
            </thead>
 
            <tbody>
                <c:forEach items="${trip}" var="apptrip">
                    <tr>
                        <td>${apptrip.tripname}</td>
                        <td>${apptrip.destination}</td>
                        <td>${apptrip.departuredate}</td>
                        <td>${apptrip.returndate}</td>
                        <td>${apptrip.duration}</td>
                        <td>${apptrip.passengers}</td>
                        <td>${apptrip.department}</td>
                        
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
