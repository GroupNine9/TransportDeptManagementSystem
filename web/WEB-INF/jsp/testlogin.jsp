<%-- 
    Document   : index
    Created on : Aug 1, 2018, 9:48:32 PM
    Author     : GraceTina
--%>

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
        <div class="ui-top">

        </div>
        <div class="ui-body">
            <div class="ui-form-container">
                <a href="/register"> register </a>
                <form method="POST" action="/login">
                    <div class="input-group input-group-lg">
                        <span class="input-group-addon"><span class="glyphicon glyphicon-envelope"></span></span>
                        <input type="email" name="emailAddr" class="form-control input-sm" placeholder="e-mail address">
                    </div>
                    <div class="input-group input-group-lg">
                        <span class="input-group-addon"><span class="glyphicon glyphicon-asterisk"></span></span>
                        <input type="password" name="pwd" class="form-control input-sm" placeholder="password">
                    </div>
                    <div class="input-group input-group-lg" style="width:100%">
                        <input type="submit" value="Log In" class="btn btn-default btn-lg" style="width:100%">
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>
