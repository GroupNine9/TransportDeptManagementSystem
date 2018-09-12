<%-- 
    Document   : servicing
    Created on : 08-Sep-2018, 09:06:07
    Author     : paige
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java" import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<html>

    <head>
        <link rel="stylesheet" type="text/css" href="table.css">
        <link rel="stylesheet" type="text/css" href="form_1.css">


    <h2 align="center"><font color="green" ><strong>ASSIGN MECHANIC</strong></font></h2>
</head>
<body>
    <form method="get" action="<%= request.getContextPath() %>/AssignMechanic">
        <sql:setDataSource
            var="myDS"
            driver="com.mysql.jdbc.Driver"
            url="jdbc:mysql://localhost:3306/transportmanagement"
            user ="root" password=""
            />
        <sql:query var="data" dataSource="${myDS}" >
            SELECT * FROM servicereport;
        </sql:query>

        <div style="overflow-x: auto;">
            <table class="table">
                <tr>

                    <th><b>Vehicle Id</b></th>
                    <th><b>Date In</b></th>
                    <th><b>Services Wanted</b></th>
                    <th><b>Parts To Repair</b></th>
                    <th><b>Driver Contact</b></th>
                    <th><b></b></th>

                </tr>
                <%int count = 1;%>
                <c:forEach var="i" items="${data.rows}" varStatus="status">

                    <tr>
                        <td>
                            <input type="hidden" value="${i.vehicleId}" name="vehicleid" />
                            <c:out value="${i.vehicleId}"/>
                        </td>
                        <td>
                            <input type="hidden" value="${i.dateIn}" name="datein" />
                            <c:out value="${i.dateIn}"/>
                        </td>
                        <td> 
                            <input type="hidden" value="${i.serviceWanted}" name="services" />
                            <c:out value="${i.serviceWanted}"/>
                        </td>
                        <td>
                            <input type="hidden" value="${i.partRepair}" name="repairparts" />
                            <c:out value="${i.partRepair}"/> 
                        </td>
                        <td>
                            <input type="hidden" value="${i.contactPrsn}" name="contact" />
                            <c:out value="${i.contactPrsn}"/> 
                        </td>
                        
                        <td>
                            <button class="tblbtnaa" name="assign" value="${i.vehicleid}" >ASSIGN</button>
                        </td>             
                    </tr>
                    <% count++;%>
                </c:forEach>
            </table>
        </div>

    </form>
</body>
</html>

