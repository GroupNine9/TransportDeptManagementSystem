<%-- 
    Document   : approvedreports
    Created on : Aug 3, 2018, 3:25:37 PM
    Author     : GraceTina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="/resources/css/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="/resources/css/index.css">
        <title>JSP Page</title>
    </head>
    <body class="container" style="padding: 100px">
        <div class="ui-top">

        </div>
        <div class="ui-body">
            <div class="ui-form-container">>

                <form>
                    <div class="input-group input-group-lg">
                        <span class="input-group-addon"><span class="glyphicon glyphicon-road"></span></span>
                        <input type="text" class="form-control input-sm" placeholder="vehicle Id">
                    </div>
                    <div class="input-group input-group-lg">
                        <span class="input-group-addon"><span class="glyphicon glyphicon-calendar"></span></span>
                        <input type="text"  class="form-control input-sm" placeholder="date in">
                    </div>

                    <div class="input-group input-group-lg">
                        <span class="input-group-addon"><span class="glyphicon glyphicon-certificate"></span></span>
                        <input type="text" class="form-control input-sm" placeholder="service wanted">
                    </div>
                    <div class="input-group input-group-lg">
                        <span class="input-group-addon"><span class="glyphicon glyphicon-bookmark"></span></span>
                        <input type="text" class="form-control input-sm" placeholder="part to repair">
                    </div>
                    <div class="input-group input-group-lg">
                        <span class="input-group-addon"><span class="glyphicon glyphicon-user"></span></span>
                        <input type="text"  class="form-control input-sm" placeholder="contact person">
                    </div>


                    <div class="input-group input-group-lg" style="width:100%">
                        <input type="submit" value="Submit" class="btn btn-default btn-lg" style="width:100%">
                    </div>
                    <div class="input-group input-group-lg" style="width:100%">
                        <input type="reset" value="reset" class="btn btn-default btn-lg" style="width:100%">
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>
