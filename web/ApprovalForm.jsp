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
        <th>TRIP NAME</th>
        <td><%= request.getAttribute("tripname")%></td>
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
      </tr><tr>
        <th>DEPARTMENT</th>
        <td><%= request.getAttribute("department")%></td>
      </tr>
    </table>
   </div>
    <div class="approvesection">
        <form method="post" action="<%=request.getContextPath() %>/ApprovedAcademicUpdate">
            <h2>ASSIGN DRIVER & VEHICLE:</h2>
       <div class="dropdowndriver">
<%         
        String query = "select * from staff where role='Driver'";
        Statement st = db.con.createStatement();
        ResultSet rs = st.executeQuery(query); 
%>
        
        <p>Select Driver
            
            <select name="DriverName">
            <%
                while(rs.next())
                {
                String name = rs.getString("NAME"); 
            %>
                 <option value="<%=name %>"><%=name %></option>
            <%
            }
            %>
            </select>
       </p>
        </div>
            <div class="dropdownvehicle">
<%
        String query2 = "select * from vehicles ";
        Statement st2 = db.con.createStatement();
        ResultSet rs2 = st2.executeQuery(query2); 
%>
        <p>Select Vehicle

            <select name="Vehicle">
            <%
                while(rs2.next())
                {
                String platenumber = rs2.getString("PLATENUMBER"); 
            %>
                <option value="<%=platenumber %>"><%=platenumber %></option>
                            <%
                }
            %>
            </select>
            </p>
        </div>
        <input class="btnsmallac" type="submit" value="APPROVE TRIP"/>
        
        <input type="hidden" value="<%=request.getAttribute("tripname")%>" name="TripName" />

        </form>
    </div>
               
</html>
