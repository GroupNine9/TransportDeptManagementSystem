<%-- 
    Document   : ApprovedAcademicTrips
    Created on : Aug 6, 2018, 1:39:23 PM
    Author     : Grace
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="table2.css">
        <link rel="stylesheet" type="text/css" href="nav.css">
    </head>
    <div class="topnav">
            <a href="admin.jsp">HOME</a>
            <a href="<%=request.getContextPath() %>/logout"><i class="fa fa-calendar" aria-hidden="true"></i>LOGOUT</a>
        </div>
     <h2 align="center"><font color="green" size="5" ><strong>APPROVED ACADEMIC TRIPS</strong></font></h2>
    <body>
        <form method="get" action="<%=request.getContextPath()%>/ApprovalServelet">
            <sql:setDataSource
                var="myDS"
                driver="com.mysql.jdbc.Driver"
                url="jdbc:mysql://localhost:3306/transportmanagement"
                user ="root" password=""
                />
            <sql:query var="data" dataSource="${myDS}" >
                SELECT * FROM approvedacademictrips;
            </sql:query>
               
        <div style="overflow-x: auto;">
            <table class="tableaa">
                <tr>
                    <th><b>Trip Name</b></th>
                    <th><b>Vehicle Assigned</b></th>
                    <th><b>Driver Assigned</b></th>
                    <th><b>Driver Phone</b></th>
                </tr>
                <%int count = 1;%>
                <c:forEach var="i" items="${data.rows}" varStatus="status">

                    <tr>
                        <td>
                            <input type="hidden" value="${i.trip_Name}" name="TripId" />
                            <c:out value="${i.trip_Name}"/>
                        </td>
                        <td>
                            <input type="hidden" value="${i.VehicleAssigned}" name="TripName" />
                            <c:out value="${i.VehicleAssigned}"/>
                        </td>
                        <td> 
                            <input type="hidden" value="${i.driver_assigned}" name="Destination" />
                            <c:out value="${i.driver_assigned}"/>
                        </td>
                        <td>
                            <input type="hidden" value="${i.driverphone_No}" name="DepartureDate" />
                            <c:out value="${i.driverphone_No}"/> 
                        </td>
                                                       
                    </tr>
                    <% count++;%>
                </c:forEach>
        
    </body>
</html>
