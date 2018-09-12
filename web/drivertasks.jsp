<%-- 
    Document   : drivertasks
    Created on : 07-Sep-2018, 18:06:05
    Author     : paige
--%>

<%@page language="java" import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type=text/css href="table.css" >
        <link rel="stylesheet" type=text/css href="form.css" >
        <link rel="stylesheet" type=text/css href="nav.css" >

    </head>
    <div class="topnav">
            <a href="driverdashboard.jsp">HOME</a>
            <a href="<%=request.getContextPath() %>/logout"><i class="fa fa-calendar" aria-hidden="true"></i>LOGOUT</a>
        </div>
        <h2 align="center"><font color="green" ><strong>ACADEMIC TRIPS</strong></font></h2>
    <body>
                 
         <form method="get" action="<%=request.getContextPath() %>/threedetails">
        <sql:setDataSource
            var="myDS"
            driver="com.mysql.jdbc.Driver"
            url="jdbc:mysql://localhost:3306/transportmanagement"
            user ="root" password=""
            />
        <sql:query var="data" dataSource="${myDS}" >
            select * from assignedtask;
        </sql:query>

            <div style="overflow-x: auto;">
                <table class="table">
                    <tr>
                      <th></th>
                      <th>VEHICLE ASSIGNED</th>
                      <th>DRIVER ASSIGNED</th>
                      <th>TRIP NAME</th>
                      <th>DEPARTURE DATE</th>
                      <th>RETURN DATE</th>
                      <th>DESTINATION</th>
                      <th></th>
                    </tr>
                    
                    <%int count = 1;%>
                    <c:forEach var="i" items="${data.rows}" varStatus="status">

                        <tr>
                            <td>
                                <input type="hidden" value="${i.TripId}" name="tripid" />
                                <c:out value="${i.TripId}"/>
                            </td>
                            <td>
                                 <input type="hidden" value="${i.vehicleassigned}" name="vehicle" />
                                 <c:out value="${i.vehicleassigned}"/>
                        </td>
                        <td> 
                            <input type="hidden" value="${i.driverassigned}" name="driver" />
                        <c:out value="${i.driverassigned}"/>
                        </td>
                        <td>
                            <input type="hidden" value="${i.tripname}" name="tripname" />
                        <c:out value="${i.tripname}"/> 
                        </td>
                        <td>
                            <input type="hidden" value="${i.departuredate}" name="ddate" />
                        <c:out value="${i.departuredate}"/> 
                        </td>
                        <td>
                            <input type="hidden" value="${i.returndate}" name="rdate" />
                        <c:out value="${i.returndate}"/> 
                        </td>
                        <td> 
                            <input type="hidden" value="${i.destination}" name="destination" />
                        <c:out value="${i.destination}"/> 
                        </td>
                        
                        <td>
                            <button class="tblbtnaa" name="fillreport" value="${i.tripname}" >Fill Reports</button>
                        </td>             
                        </tr>
                        <% count++;%>
                    </c:forEach>
                </table>
            </div>
         </form>
    </body>
</html>
