<%@page language="java" import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<html>

    <head>
        <link rel="stylesheet" type="text/css" href="buttons.css">
        <link rel="stylesheet" type="text/css" href="table.css">
        <link rel="stylesheet" type="text/css" href="form_1.css">
        <link rel="stylesheet" type="text/css" href="nav.css">
                

</head>

<div class="topnav">
            <a href="admin.jsp">HOME</a>
            <a href="<%=request.getContextPath() %>/logout"><i class="fa fa-calendar" aria-hidden="true"></i>LOGOUT</a>
        </div>
    <h2 align="center"><font color="green" ><strong>ACADEMIC TRIPS</strong></font></h2>

<body>
    <form method="get" action="<%=request.getContextPath()%>/ApprovalServelet">
        <sql:setDataSource
            var="myDS"
            driver="com.mysql.jdbc.Driver"
            url="jdbc:mysql://localhost:3306/transportmanagement"
            user ="root" password=""
            />
        <sql:query var="data" dataSource="${myDS}" >
            SELECT * FROM pendingacademic;
        </sql:query>

        <div style="overflow-x: auto;">
            <table class="table">
                <tr>

                    <th><b> </b></th>
                    <th><b>Trip Name</b></th>
                    <th><b>Destination</b></th>
                    <th><b>Departure Date</b></th>
                    <th><b>Return Date</b></th>
                    <th><b>Passenger Number</b></th>
                    <th><b>Department</b></th>
                    <th><b>Select</b></th>

                </tr>
                <%int count = 1;%>
                <c:forEach var="i" items="${data.rows}" varStatus="status">

                    <tr>
                        <td>
                            <input type="hidden" value="${i.TripId}" name="TripId" />
                            <c:out value="${i.TripId}"/>
                        </td>
                        <td>
                            <input type="hidden" value="${i.TripName}" name="TripName" />
                            <c:out value="${i.TripName}"/>
                        </td>
                        <td> 
                            <input type="hidden" value="${i.Destination}" name="Destination" />
                            <c:out value="${i.Destination}"/>
                        </td>
                        <td>
                            <input type="hidden" value="${i.DepartureDate}" name="DepartureDate" />
                            <c:out value="${i.DepartureDate}"/> 
                        </td>
                        <td>
                            <input type="hidden" value="${i.ReturnDate}" name="ReturnDate" />
                            <c:out value="${i.ReturnDate}"/> 
                        </td>
                        
                        <td> 
                            <input type="hidden" value="${i.PassengerNumber}" name="PassengerNumber" />
                            <c:out value="${i.PassengerNumber}"/> 
                        </td>
                        <td>
                            <input type="hidden" value="${i.Department}" name="Department" />
                            <c:out value="${i.Department}"/> 
                        </td>
                        <td>
                            <button class="tblbtnaa" name="approve" value="${i.TripId}" >APPROVE</button>
                        </td>             
                    </tr>
                    <% count++;%>
                </c:forEach>
            </table>
        </div>

    </form>
</body>
</html>
