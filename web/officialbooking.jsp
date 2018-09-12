<%-- 
    Document   : index
    Created on : Jul 18, 2018, 12:17:02 PM
    Author     : HP-
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Beans.Officialtrip"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Booking Form</title>
       <link rel="stylesheet" type="text/css" href="form.css" >
        
    </head>
    <body>
        <jsp:useBean id="officialtrip" scope="request" class="Beans.Officialtrip"></jsp:useBean>
        <div class="sidenav">
            <a href="officialhome.jsp">HOME</a>
         
            <a href="<%=request.getContextPath() %>/viewofficialtrips">VIEW OFFICIAL TRIPS</a>
        <a href="<%=request.getContextPath() %>/logout"><i class="fa fa-calendar" aria-hidden="true"></i>LOGOUT</a>
            
        </div>
        
        <div class="main">
            <h2 align="center"><font color="green" size="5" ><strong>FILL DETAILS TO BOOK OFFICIAL TRIP:</strong></font></h2>
            
        <form action = "<%=request.getContextPath() %>/OfficialBookingServlet" method="post"> 
            
             <div class="input-container">
                  <label style="background-color: green;
                   color: white;
                   width: 200px;
                   font-size: 15px;">PURPOSE</label>
           <input  class="input-field" type="text" name="purpose" required="true" maxlength="50" placeholder="purpose" value="<jsp:getProperty name="officialtrip" property="purpose"/>">
            </div>
            <div class="input-container">
                 <label style="background-color: green;
                   color: white;
                   width: 200px;
                   font-size: 15px;">DESTINATION</label>
                <input class="input-field" type="text" name="destination" maxlength="20" required="true" placeholder="destination" value="<jsp:getProperty name="officialtrip" property="destination"/>">
            </div>
            <div class="input-container">
                 <label style="background-color: green;
                   color: white;
                   width: 200px;
                   font-size: 15px;">DEPARTURE DATE</label>
                <input class="input-field" type="date" name="departuredate" required="true" placeholder="departure date" value="<jsp:getProperty name="officialtrip" property="departuredate"/>">
            </div>
            <div class="input-container">
                 <label style="background-color: green;
                   color: white;
                   width: 200px;
                   font-size: 15px;">RETURN DATE</label>
                <input class="input-field"  type="date" name="returndate" required="true" placeholder="return date" value="<jsp:getProperty name="officialtrip" property="returndate"/>">
            </div>
            <td><span style="color: red; font-size: 15px;"><%=(request.getAttribute("msg") == null ) ? "" : request.getAttribute("msg") %> </span></td>
           
            <div class="input-container">
                 <label style="background-color: green;
                   color: white;
                   width: 200px;
                   font-size: 15px;">PASSENGERS NUMBER</label>
                <input class="input-field"  type="number"  name="passCount" required="true" placeholder="passCount" value="<jsp:getProperty name="officialtrip" property="passCount"/>">
            </div>
           
           
        
        <input style="background-color: green;
                        color: white;
                        padding: 15px 20px;
                        border: none;
                        cursor: pointer;
                        width: 80%;
                        opacity: 0.9;
                        margin-left: 250px;" 
                type="submit" value="submit"/>

        
    </form>
        </div>
       
    </body>
</html>
