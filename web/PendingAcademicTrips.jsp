
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java" import="java.util.*" %>
<html>
<body> 
    <jsp:useBean id="staff" scope="request" class="beans.Trip"></jsp:useBean>

<table border="1" width="303">
<tr>
<td width="119"><b>TRIP NAME</b></td>
<td width="168"><b>DESTINATION</b></td>
<td width="119"><b>DEPARTURE DATE</b></td>
<td width="168"><b>RETURN DATE</b></td>
<td width="168"><b>DURATION</b></td>
<td width="168"><b>PASSENGERS</b></td>
<td width="168"><b>DEPARTMENT</b></td>
</tr>
<%
 List tripdata= (List)request.getAttribute("tripdata");
 Iterator itr = tripdata.iterator();
while(itr.hasNext())
{
%>
<tr>
<td width="119"><%=itr.next()%></td>
<td width="168"><%=itr.next()%></td> 
<td width="168"><%=itr.next()%></td>
<td width="168"><%=itr.next()%></td>
<td width="168"><%=itr.next()%></td>
<td width="168"><%=itr.next()%></td>
<td width="168"><%=itr.next()%></td>

</tr>
<%}%>
</table>
</body>
</html>