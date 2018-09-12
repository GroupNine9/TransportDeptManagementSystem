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
            <th>Vehicle Id</th>
            <th>Date In</th>
            <th>Service Wanted</th>
            <th>Part to Repair</th>
            <th>Contact Person</th>
            <th>Staff Id</th>
        </nav>
        <table border="0" style="position: absolute; top: 100px;">
            <tbody>
                <tr>
                    <td>Vehicle Id</td>
                    <td>${task.vehicleId}</td>
                </tr>
                <tr>
                    <td>Date In</td>
                    <td>${task.dateIn}</td>
                </tr>
                <tr>
                    <td>Service Wanted</td>
                    <td>${task.serviceWanted}</td>
                </tr>
                <tr>
                    <td>Part to Repair</td>
                    <td>${task.partRepair}</td>
                </tr>
                <tr>
                    <td>Contact Person</td>
                    <td>${task.contactPrsn}</td>
                </tr>
                <tr>
                    <td>Departure Date.</td>
                    <td>${assign.departureDate}</td>
                </tr>
                <tr>
                    <td>Mechanic</td>
                    <td>${task.staffId}</td>
                </tr>
            </tbody>
        </table>

    </body>
</html>