<%-- 
    Document   : BOOKINGHOME
    Created on : 17-Aug-2018, 09:46:48
    Author     : paige
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="admin.css"
        <link rel="stylesheet" type="text/css" href="nav.css">
        <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="admin.css">
        <link rel="stylesheet" type="text/css" href="C:\Users\Grace\Desktop\BootStrap\css\bootstrap.min">
        <link href="https://fonts.googleapis.com/css?family=Raleway:100,200,400,500,600" rel="stylesheet" type="text/css">
    </head>
    
       <body>
    
       <div class="main-section">

		<div class="dashbord">
			<div class="icon-section">
                             <a href="<%=request.getContextPath() %>/MechanicTaskReport"><i class="fa fa-users" aria-hidden="true"></i></a><br>
				<font face="Comic sans MS" size="5">FILL MECHANIC REPORT</font>
			</div>
			<div class="detail-section">
				<a href="<%=request.getContextPath() %>/MechanicTaskReport">More Info </a>
			</div>
		</div>

						
		<div class="dashbord">
			<div class="icon-section">
                            <a href="<%=request.getContextPath() %>/viewmechanictask"><i class="fa fa-suitcase" aria-hidden="true"></i></a><br>
				<font face="Comic sans MS" size="5"> VIEW TASKS</font>
			</div>
			<div class="detail-section">
				 <a href="<%=request.getContextPath() %>/viewmechanictask">More Info </a>
			</div>
		</div>
           <br>
           
           <div class="dashbord">
			<div class="icon-section">
                           <a href="<%=request.getContextPath() %>/logout"><i class="fa fa-home" aria-hidden="true"></i></a><br>
				<font face="Comic sans MS" size="5"> LOG OUT</font>
			</div>
			<div class="detail-section">
				<a href="<%=request.getContextPath() %>/logout">GO</a>
			</div>
		</div>

		
		</div>
		
	
</body>
</html>
