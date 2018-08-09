<%-- 
    Document   : testhome
    Created on : Aug 7, 2018, 9:11:27 AM
    Author     : GraceTina
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="/resources/css/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="/resources/css/index.css">
        <title>Home</title>
    </head>
    <body>
        <div class="row" style="border-bottom: 1px solid #eee; height: 40px;">
            <div class="col-md-2">
                <p>${user.surName}</p>&nbsp;&nbsp;<p>${user.otherNames}</p>
            </div>
            <div class="col-md-2 col-md-offset-10">
                <a href="/logout">Log out</a>
            </div>
        </div>
    </body>
</html>
