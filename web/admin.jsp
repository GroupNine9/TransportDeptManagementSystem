<%-- 
    Document   : admin
    Created on : Aug 31, 2018, 5:55:54 PM
    Author     : Grace
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
	<link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="admin.css">
        <link rel="stylesheet" type="text/css" href="C:\Users\Grace\Desktop\BootStrap\css\bootstrap.min">
        <link href="https://fonts.googleapis.com/css?family=Raleway:100,200,400,500,600" rel="stylesheet" type="text/css">
</head>
<body>
    
    <div class="main-section">

		<div class="dashbord">
			<div class="icon-section">
                            <a href="RegisterStaff.jsp" ><i class="fa fa-users" aria-hidden="true"></i></a><br>
				<font face="Comic sans MS" size="5">Register Staff</font>
			</div>
			<div class="detail-section">
				<a href="RegisterStaff.jsp" >More Info </a>
			</div>
		</div>

		<div class="dashbord">
			<div class="icon-section">
                            <a href="RegisterVehicle.jsp" ><i class="fa fa-bus" aria-hidden="true"></i></a><br>
				<font face="Comic sans MS" size="5">Register Vehicle</font>
			</div>
			<div class="detail-section">
				<a href="RegisterVehicle.jsp" >More Info </a>
			</div>
		</div>
				
		<div class="dashbord">
			<div class="icon-section">
                            <a href="Trips.jsp"><i class="fa fa-suitcase" aria-hidden="true"></i></a><br>
				<font face="Comic sans MS" size="5"> View Trips</font>
			</div>
			<div class="detail-section">
				<a href="Trips.jsp">More Info </a>
			</div>
		</div>

		<br>

		<div class="dashbord">
			<div class="icon-section">
                            <a href="<%=request.getContextPath()%>/ViewReports"><i class="fa fa-calendar" aria-hidden="true"></i></a><br>
				<font face="Comic sans MS" size="5">View Reports</font>
			</div>
			<div class="detail-section">
				<a href="reportpick.jsp">More Info </a>
			</div>
		</div>
		<div class="dashbord">
			<div class="icon-section">
                            <a href="DeleteVehicle.jsp"><i class="fa fa-bus" aria-hidden="true"></i></a><br>
				<font face="Comic sans MS" size="5">Delete Vehicles</font>
			</div>
			<div class="detail-section">
				<a href="DeleteVehicle.jsp">More Info </a>
			</div>
		</div>
		<div class="dashbord">
			<div class="icon-section">
                            <a href="DeleteStaff.jsp"><i class="fa fa-users" aria-hidden="true"></i></a><br>
				<font face="Comic sans MS" size="5">Delete Staff</font>
			</div>
			<div class="detail-section">
				<a href="DeleteStaff.jsp">More Info </a>
			</div>
                </div><br>
                <div class="dashbord">
			<div class="icon-section">
                            <a href="servicing.jsp"><i class="fa fa-bus" aria-hidden="true"></i></a><br>
				<font face="Comic sans MS" size="5">ASSIGN MECHANIC</font>
			</div>
			<div class="detail-section">
				<a href="servicing.jsp">More Info </a>
			</div>
		</div>
                <div class="dashbord">
			<div class="icon-section">
                            <a href="<%=request.getContextPath() %>/logout"><i class="fa fa-home" aria-hidden="true"></i></a><br>
				<font face="Comic sans MS" size="5">LOG OUT</font>
			</div>
			<div class="detail-section">
				<a href="<%=request.getContextPath() %>/logout">GO </a>
			</div>
		</div>
		
	</div>
</body>
</html>



