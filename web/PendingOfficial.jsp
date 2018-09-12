<%@page language="java" import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<html>
 
<head>
     <link rel="stylesheet" type="text/css" href="table.css">
     <link rel="stylesheet" type="text/css" href="form_1.css">
     <link rel="stylesheet" type="text/css" href="nav.css">
     <link rel="stylesheet" type="text/css" href="buttons.css">


</head>
 <div class="topnav">
            <a href="admin.jsp">HOME</a>
            <a href="<%=request.getContextPath() %>/logout"><i class="fa fa-calendar" aria-hidden="true"></i>LOGOUT</a>
        </div>
     <h2 align="center"><font color="green" size="5" ><strong>OFFICIAL TRIPS</strong></font></h2>

<body>
     <form method="get" action="<%=request.getContextPath() %>/OfficialApprovalServelet">
    <sql:setDataSource
        var="myDS"
        driver="com.mysql.jdbc.Driver"
        url="jdbc:mysql://localhost:3306/transportmanagement"
        user ="root" password=""
        />
    <sql:query var="data" dataSource="${myDS}" >
               SELECT * FROM pendingofficial;
    </sql:query>
   
    <div style="overflow-x: auto;">
        <table class="table">
            <tr>
            <th><b>PURPOSE</b></th>
            <th><b>DESTINATION</b></th>
            <th><b>DEPARTURE DATE</b></th>
            <th><b>RETURN DATE</b></th>
            <th><b>PASSENGERS</b></th>
            <th><b></b></th>
            </tr>
            <%int count = 1;%>
            <c:forEach var="i" items="${data.rows}" varStatus="status">
              
              <tr>
                <td>
                    <input type="hidden" value="${i.Puropse}" name="Purpose" />
                    <c:out value="${i.Purpose}"/>
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
                    <button class="tblbtna" type="submit" name="approve" value="${i.TripId}" >APPROVE</button>
                    <button class="tblcancel" name="cancel" value="${i.TripId}" >CANCEL</button>
                </td>
              </tr>
              <% count++; %>
            </c:forEach>
        </table>
      </div>
   
    </form>
  </body>
</html>
