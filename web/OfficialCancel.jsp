<%-- 
    Document   : ApprovalForm
    Created on : Aug 6, 2018, 3:43:05 PM
    Author     : Grace
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="Model.MyDb"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% MyDb db = new MyDb(); db.getCon();%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="form.css">
        <link rel="stylesheet" type="text/css" href="table.css">
        <link rel="stylesheet" type="text/css" href="buttons.css">
    </head>
    <div class ="DetailSection">
    <h2>TRIP DETAILS:</h2>
    <table class="table2">
      <tr>
        <th>TRIP PURPOSE</th>
        <td><%= request.getAttribute("purpose")%></td>
      </tr>
      <tr>
        <th>DESTINATION</th>
        <td><%= request.getAttribute("destination")%></td>
      </tr>
      <tr>
        <th>DEPARTURE DATE</th>
        <td><%= request.getAttribute("departuredate")%></td>
      </tr>
      <tr>
        <th>RETURN DATE</th>
        <td><%= request.getAttribute("returndate")%></td>
      </tr>
      <tr>
        <th>DURATION</th>
        <td><%= request.getAttribute("duration")%></td>
      </tr>
      <tr>
        <th>PASSENGERS</th>
        <td><%= request.getAttribute("passengernumber")%></td>
      </tr>
      
    </table>
   </div>
    <form method="post" action="<%=request.getContextPath()%>/OfficialCancelServelet">
      <div class="approvesection">
          <p>Insert reason for cancellation below:</p>
                <textarea class="textarea" name="reason"></textarea>      
                <input type="submit"  class="btnsmallcancel"  value="CANCEL TRIP"/>
                <input type="hidden" value="<%= request.getAttribute("purpose")%>" name="purpose" />
                <input type="hidden" value="<%= request.getAttribute("id")%>" name="id" />
                <input type="hidden" value="<%= request.getAttribute("destination")%>" name="destination" />
                <input type="hidden" value="<%= request.getAttribute("departuredate")%>" name="ddate" />
                <input type="hidden" value="<%= request.getAttribute("returndate")%>" name="rdate" />
                <input type="hidden" value="<%= request.getAttribute("duration")%>" name="duration" />
                <input type="hidden" value="<%= request.getAttribute("passengernumber")%>" name="pass" />


      </div>
    </form>        
</html>
