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

        <title>Administrator | Home</title>
    </head>
    <body>
        <div class="sidenav">
            <a href="#about">Reports</a>
            <a href="#services">Trips</a>
            <a href="#clients">Staff</a>
            <a href="#contact">Vehicle</a>
        </div>

        <div class="main">
            <div id="nav_draw" class="drawer">
                <a href="javascript:void(0)" class="closebtn" onclick="closeDrawer()">&times;</a>
                <a href="#">Profile</a>
                <a href="/logout">Log out</a>
            </div>
            <div class="row">
                <div class="col-md-4">
                    
                </div>
                <div class="col-md-4 col-md-offset-8">
                    <span>${user.surName} ${user.otherNames}</span>
                </div>
            </div>
            <span style="font-size:30px;cursor:pointer" onclick="openDrawer()">&#9776; open</span>
        </div>
    </body>
</html>