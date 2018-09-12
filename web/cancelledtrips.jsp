<%-- 
    Document   : cancelledtrips
    Created on : 10-Sep-2018, 16:40:11
    Author     : paige
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %><!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="cancelled.css">
        <link rel="stylesheet" type="text/css" href="nav.css">
    </head>
    <div class="topnav">
            <a href="officialhome.jsp">HOME</a>
            <a href="<%=request.getContextPath() %>/logout"><i class="fa fa-calendar" aria-hidden="true"></i>LOGOUT</a>
        </div>
     <h2 align="center"><font color="green" size="5" ><strong>APPROVED OFFICIAL TRIPS</strong></font></h2>
    <body>
        <form method="get" action="<%=request.getContextPath()%>/ApprovalServelet">
            <sql:setDataSource
                var="myDS"
                driver="com.mysql.jdbc.Driver"
                url="jdbc:mysql://localhost:3306/transportmanagement"
                user ="root" password=""
                />
            <sql:query var="data" dataSource="${myDS}" >
                SELECT * FROM cancelledofficial;
            </sql:query>

        <div style="overflow-x: auto;">
            <table class="tableaa">
                <tr>
                    <th><b>TRIP_ID</b></th>
                    <th><b>PURPOSE</b></th>
                    <th><b>DESTINATION</b></th>
                    <th><b>DEPARTURE DATE</b></th>
                    <th><b>RETURN DATE</b></th>
                    <th><b>PASSENGERS</b></th>
                    <th><b>REASON FOR CANCEL</b></th>
                    
                </tr>
                <%int count = 1;%>
                <c:forEach var="i" items="${data.rows}" varStatus="status">

                    <tr>
                        <td>
                            <c:out value="${i.TripId}"/>
                        </td>
                        <td> 
                            <c:out value="${i.Purpose}"/>
                        </td>
                        <td> 
                            <c:out value="${i.Destination}"/>
                        </td>
                        <td> 
                            <c:out value="${i.Ddate}"/>
                        </td>
                        <td> 
                            <c:out value="${i.Rdate}"/>
                        </td>
                        <td> 
                            <c:out value="${i.Pass}"/>
                        </td>
                        <td>
                            <c:out value="${i.Reason}"/> 
                        </td>
                                                                               
                    </tr>
                    <% count++;%>
                </c:forEach>
        
    </body>
</html>
