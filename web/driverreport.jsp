<%-- 
    Document   : index
    Created on : Jul 18, 2018, 12:17:02 PM
    Author     : HP-
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Driver Report</title>
       <link rel="stylesheet" type="text/css" href="form.css" >
       <link rel="stylesheet" type="text/css" href="servicerequest.css">
       <link rel="stylesheet" type="text/css" href="nav.css">
    </head>
    <body>
       
        <div class="topnav">
            <a href="driverdashboard.jsp">HOME</a>
            <a href="<%=request.getContextPath() %>/logout"><i class="fa fa-calendar" aria-hidden="true"></i>LOGOUT</a>
        </div>
    <h2 align="center"><font color="green" ><strong>FILL TRIP REPORT:</strong></font></h2>
        
        <div style="margin-left: 50px;">
           
        <form action = "<%=request.getContextPath() %>/DriverReportServlet" method="post"> 
            
            <div class="input-container" style="margin-left: 70px; width: 900px;">
                 <label style="background-color: green;
                   color: white;
                   width: 200px;
                   font-size: 15px;">TIME OUT</label>
            <input  class="input-field" type="time" name="timeout" required value="">
            </div>
            
           <div class="input-container" style="margin-left: 70px; width: 900px;">
                <label style="background-color: green;
                   color: white;
                   width: 200px;
                   font-size: 15px;">TIME IN</label>
                <input  class="input-field" type="time" name="timein" required value="">
            </div>
            
            <div class="input-container" style="margin-left: 70px; width: 900px;">
                <label style="background-color: green;
                   color: white;
                   width: 200px;
                   font-size: 15px;">NO OF DRIVERS</label>
                <input class="input-field" type="number" name="driverno"  required="true"value="">
            </div>
            
            <div class="input-container" style="margin-left: 70px; width: 900px;">
                 <label style="background-color: green;
                   color: white;
                   width: 200px;
                   font-size: 15px;">JOURNEY DETAILS</label>
                <textarea class="textarea"  placeholder="" name="journeydetails" required="true" value=""></textarea>
            </div>
            
            <div class="input-container" style="margin-left: 70px; width: 900px;">
                 <label style="background-color: green;
                   color: white;
                   width: 200px;
                   font-size: 15px;">OIL DRAWN(Ltrs)</label>
            <input class="input-field"  type="number" name="oildrawn" required value="">
            </div>
            
            <div class="input-container" style="margin-left: 70px; width: 900px;">
                 <label style="background-color: green;
                   color: white;
                   width: 200px;
                   font-size: 15px;">FUEL DRAWN(Ltrs)</label>
            <input class="input-field"  type="number" name="fueldrawn" required value="">
            </div>
            
             <div class="input-container" style="margin-left: 70px; width: 900px;">
                  <label style="background-color: green;
                   color: white;
                   width: 200px;
                   font-size: 15px;">RECEIPTS OF FUEL BOUGHT IN CASH</label>
                 <textarea class="textarea" placeholder="" name="receipts" required="true" value=""></textarea>
            </div>    
            
            <div class="input-container" style="margin-left: 70px; width: 900px;">
                 <label style="background-color: green;
                   color: white;
                   width: 200px;
                   font-size: 15px;">SPEEDO READING AFTER JOURNEY</label>
              <input  class="input-field" type="number" name="speedo" required value="">
            </div>
            
             <div class="input-container" style="margin-left: 70px; width: 900px;">
                  <label style="background-color: green;
                   color: white;
                   width: 200px;
                   font-size: 15px;">KILOMETERS OF JOURNEY</label>
                <input  class="input-field" type="number" name="kms" required value="">
            </div>
            
        
        <input style="width: 70%; margin-left: 70px;" class="btn" type="submit" value="submit"/>
          
       
        <input type="hidden" value="<%= request.getAttribute("ddate")%>" name="ddate" />
        <input type="hidden" value="<%= request.getAttribute("rdate")%>" name="rdate" />
        <input type="hidden" value="<%= request.getAttribute("name")%>" name="tname" />
        
    </form>
        </div>
       
    </body>
</html>
