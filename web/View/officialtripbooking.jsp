<%-- 
    Document   : index
    Created on : Jul 18, 2018, 12:17:02 PM
    Author     : HP-
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="beans.Officialtrip"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Booking Form</title>
       
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
        
         <h1>BOOKING</h1>
        
            <jsp:useBean id="officialtrip" scope="request" class="beans.Officialtrip"></jsp:useBean>
        <form action = "<%=request.getContextPath() %>/OfficialTripBookingServlet" method="post"> 
                
            `<label>Destination</label><input type="text" name="destination" value="<jsp:getProperty name="officialtrip" property="destination"/>">
       
            <label>Departure Date</label><input type="text" name="departuredate" value="<jsp:getProperty name="officialtrip" property="departuredate"/>">
        
            <label>Return date</label><input type="text" name="returndate" value="<jsp:getProperty name="officialtrip" property="returndate"/>">
                    
            <label>No of Passengers</label><input type="text" name="passCount" value="<jsp:getProperty name="officialtrip" property="passCount"/>">

           <label>Duration</label><input type="text" name="duration" value="<jsp:getProperty name="officialtrip" property="duration"/>">
           
           <label>Purpose</label><input type="text" name="purpose" value="<jsp:getProperty name="officialtrip" property="purpose"/>">


        <input type="submit" value="submit"/>
        
    </form>
       
    </body>
</html>
