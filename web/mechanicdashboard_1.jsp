<%-- 
    Document   : dashboard
    Created on : Aug 3, 2018, 12:27:00 PM
    Author     : GraceTina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script type="text/javascript" src="/resources/js/jquery-3.3.1.min.js"></script>
        <script type="text/javascript" src="/resources/js/tofficer.js"></script>
        <link rel="stylesheet" type="text/css" href="/resources/css/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="/resources/css/tofficer.css">

        <title>Mechanic | Home</title>
    </head>
    <body>
        <div class="sidenav">
            <a href="/view/assigned/tasks">Assigned Tasks</a>
            <a href="/maintenance">Report</a>
            


        </div>

        <div class="main">
            <div id="nav_draw" class="drawer">
                <a href="javascript:void(0)" class="closebtn" onclick="closeDrawer()">&times;</a>
                <a href="/edit/profile">Profile</a>
                <a href="/logout">Log out</a>
            </div>

            <h2></h2>
            <p></p>
            <span style="font-size:30px;cursor:pointer" onclick="openDrawer()">&#9776; mechanic</span>
        </div>
    </body>
</html>
