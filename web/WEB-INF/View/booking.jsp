<%-- 
    Document   : index
    Created on : Jul 18, 2018, 12:17:02 PM
    Author     : HP-
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="beans.Book"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Booking Form</title>
    </head>
    <body>
        
         <h1>BOOKING</h1>
        <pre>
            <jsp:useBean id="book" scope="request" class="beans.Book"></jsp:useBean>
        <form action="booking.java" method="post"> 
                
 <label>Destination</label>              <input type="text" name="destination"/>
       
<label> Departure Date</label>                 <input type="text" name="departuredate"/>
        
<label>Return date</label>                   <input type="text" name="returndate"/>
        
<label>No of Passengers</label>             <input type="text" name="passCount"/>

<label>Duration</label>             <input type="text" name="duration"/>


        <input type="submit" value="submit"/>
        
    </form>
        </pre>
    </body>
</html>
