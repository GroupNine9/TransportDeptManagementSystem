<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Driver| Assigned trips</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" media="screen" href="/resources/css/bootstrap/css/bootstrap.min.css" />
        <link rel="stylesheet" type="text/css" href="/resources/css/main.css">
        <script type="text/javascript" src="/resources/js/jquery-3.3.1.min.js"></script>
        <script type="text/javascript" src="/resources/css/bootstrap/js/bootstrap.min.js"></script>
        <script type="text/javascript" src="/resources/js/main.js"></script>
    </head>
    <body>
        <nav class="navbar navbar-default navbar-fixed-top">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a href="#" class="navbar-brand">Transport Department</a>
                </div>
                <div class="collapse navbar-collapse">
                    <ul class="nav navbar-nav navbar-right">
                        <li>
                            <a href="/logout" class="navbar-link">Logout</a>
                        </li>
                    </ul>
                </div>
            </div>

        </nav>
        <table border="0" style="position: absolute; top: 100px;">
            <tbody>
                <tr>
                    <td>Destination</td>
                    <td>${assign.destination}</td>
                </tr>
                <tr>
                    <td>Trip Name</td>
                    <td>${assign.tripName}</td>
                </tr>
                <tr>
                    <td>Return Date</td>
                    <td>${assign.returnDate}</td>
                </tr>
                <tr>
                    <td>Duration</td>
                    <td>${assign.duration}</td>
                </tr>
                <tr>
                    <td>Passengers</td>
                    <td>${assign.passengers}</td>
                </tr>
                <tr>
                    <td>Departure Date.</td>
                    <td>${assign.departureDate}</td>
                </tr>
                <tr>
                    <td>Department</td>
                    <td>${assign.department}</td>
                </tr>
                <tr>
                    <td>Vehicle Assigned</td>
                    <td>${assign.vehicleAssigned}</td>
                </tr>
                <tr>
                    <td>Driver Assigned</td>
                    <td>${assign.driverAssigned}</td>
                </tr>
                <tr>
                    <td>Driver Phone Number</td>
                    <td>${assign.phoneNo}</td>
                </tr>
            </tbody>
        </table>

    </body>
</html>