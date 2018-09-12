<%-- 
    Document   : index
    Created on : Jul 18, 2018, 12:17:02 PM
    Author     : HP-
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Beans.Book"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Booking Form</title>
       <link rel="stylesheet" type="text/css" href="form.css" >
        
    </head>
    <body>
        <jsp:useBean id="book" scope="request" class="Beans.Book"></jsp:useBean>
        <div class="sidenav">
            <a href="BOOKINGHOME.jsp">HOME</a>
         
            <a href="<%=request.getContextPath() %>/viewacademictrips">VIEW ACADEMIC TRIPS</a>
            <a href="<%=request.getContextPath() %>/logout"><i class="fa fa-calendar" aria-hidden="true"></i>LOGOUT</a>
            
        </div>
        
        <div class="main">
            <p class="header">FILL DETAILS TO BOOK ACADEMIC TRIP:</p>
            
        <form action = "<%=request.getContextPath() %>/BookingServlet" method="post"> 
            <div class="input-container">
                <label style="background-color: green;
                   color: white;
                   width: 120px;
                   font-size: 15px;">DESTINATION</label>
                <input class="input-field" type="text" name="destination" maxlength="20" required="true" placeholder="destination" value="<jsp:getProperty name="book" property="destination"/>">
            </div>
            <div class="input-container">
                <label style="background-color: green;
                   color: white;
                   width: 120px;
                   font-size: 15px;">DEPARTURE DATE</label>
            <input class="input-field" type="date" name="departuredate" required placeholder="departure date" value="<jsp:getProperty name="book" property="departuredate"/>">
            </div>
            <div class="input-container">
                <label style="background-color: green;
                   color: white;
                   width: 120px;
                   font-size: 15px;">RETURN DATE</label>
            <input class="input-field"  type="date" name="returndate" required placeholder="return date" value="<jsp:getProperty name="book" property="returndate"/>">
            </div>
            <td><span style="color: red; font-size: 15px;"><%=(request.getAttribute("msg") == null ) ? "" : request.getAttribute("msg") %> </span></td>
            <div class="input-container">
                <label style="background-color: green;
                   color: white;
                   width: 120px;
                   font-size: 15px;">PASSENGERS</label>
                <input class="input-field"  type="number" name="passCount" required="true" placeholder="passCount" value="<jsp:getProperty name="book" property="passCount"/>">
            </div>
            
            <div class="input-container">
                <label style="background-color: green;
                   color: white;
                   width: 120px;
                   font-size: 15px;">DEPARTMENT</label>
           <input  class="input-field" type="text" name="department" maxlength="20" required="true" placeholder="department" value="<jsp:getProperty name="book" property="department"/>">
            </div>
            <div class="input-container">
                <label style="background-color: green;
                   color: white;
                   width: 120px;
                   font-size: 15px;">TRIP NAME</label>
                <input  class="input-field" type="text" name="tripName" required="true" placeholder="tripName" maxlength="20" value="<jsp:getProperty name="book" property="tripName"/>">
            </div>
            
        
        <input style=" background-color: green;
                        color: white;
                        padding: 15px 20px;
                        border: none;
                        cursor: pointer;
                        width: 76%;
                        opacity: 0.9;
                        margin-left: 250px;" 
               type="submit" value="submit"/>
            
        
    </form>
        </div>
       
    </body>
</html>
