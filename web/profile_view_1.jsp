<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Mechanic | View Profile</title>
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
                    <td>First Name</td>
                    <td>${mech.firstName}</td>
                </tr>
                <tr>
                    <td>Last Name</td>
                    <td>${mech.lastName}</td>
                </tr>
                <tr>
                    <td>Other Names</td>
                    <td>${mech.otherNames}</td>
                </tr>
                <tr>
                    <td>National ID</td>
                    <td>${mech.nationalId}</td>
                </tr>
                <tr>
                    <td>Email Address</td>
                    <td>${mech.emailAddr}</td>
                </tr>
                <tr>
                    <td>Phone No.</td>
                    <td>${mech.phoneNo}</td>
                </tr>
                <tr>
                    <td>Gender</td>
                    <td>${mech.gender}</td>
                </tr>
            </tbody>
        </table>

    </body>
</html>