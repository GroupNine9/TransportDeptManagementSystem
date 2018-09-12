<%-- 
    Document   : newmechanic
    Created on : 08-Sep-2018, 09:26:57
    Author     : paige
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="Model.MyDb"%>

<% MyDb db = new MyDb(); db.getCon();%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="form.css">
        <link rel="stylesheet" type="text/css" href="table.css">
    </head>
    
   <div class ="DetailSection">
    <h2>SERVICE WANTED DETAIL:</h2>
    <table class="table2">
      <tr>
        <th>DATE IN</th>
        <td><%= request.getAttribute("datein")%></td>
      </tr>
      <tr>
        <th>SERVICES WANTED</th>
        <td><%= request.getAttribute("services")%></td>
      </tr>
      <tr>
        <th>PARTS TO REPAIR</th>
        <td><%= request.getAttribute("repairparts")%></td>
      </tr>
      <tr>
        <th>DRIVER CONTACT</th>
        <td><%= request.getAttribute("contact")%></td>
      </tr>
     
    </table>
   </div>
    <div class="approvesection">
        <form method="post" action="<%=request.getContextPath() %>/AssignMechanicApproval">
            <h2>ASSIGN MECHANIC:</h2>
       <div class="dropdowndriver">
<%         
        String query = "select * from staff where role='Mechanic'";
        Statement st = db.con.createStatement();
        ResultSet rs = st.executeQuery(query); 
%>
        
        <p>Select Mechanic
            
            <select name="MechanicName">
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
       
        <input class="btnsmallac" type="submit" value="ASSIGN MECHANIC"/>
        <button class="btnsmallbackac">BACK</button>
        
        <input type="hidden" value="<%=request.getAttribute("contact")%>" name="contactPrsn" />

        </form>
    </div>
               
</html>

