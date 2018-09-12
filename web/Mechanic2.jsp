<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Beans.Task"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mechanic report</title>
        <link rel="stylesheet" type="text/css" href="form.css" >
        <link rel="stylesheet" type="text/css" href="nav.css" >
        <link rel="stylesheet" type="text/css" href="mechanic.css" >
    </head>
     <div class="topnav">
            <a href="mechanicdashboard.jsp">HOME</a>
            <a href="<%=request.getContextPath() %>/logout"><i class="fa fa-calendar" aria-hidden="true"></i>LOGOUT</a>
        </div>
    <h2 align="center"><font color="green" ><strong>FILL MECHANIC REPORT</strong></font></h2>
    <body>
        <jsp:useBean id="task" scope="request" class="Beans.Task"></jsp:useBean>
        <div class="whole">
    <form action = "<%=request.getContextPath() %>/MechanicTaskReport" method="post"> 
            <div style="width: 100%;">
                <label  style="background-color: green;
                   color: white;
                   width: 15%;
                   height: 50px;
                   font-size: 18px;">PARTS REQUISITION</label><br>
                   <table style="width: 83%;"> 
                       <thead>
                           <tr>
                               <th style="width: 10px;">ITEM</th>
                            <th>REQUISITION NO.</th>
                            <th>ISSUE NOTE NO.</th>
                            <th>DATE</th>
                            <th>COST</th>
                           </tr>
                       </thead>
                       <tbody>
                           <tr>
                               <td><input type="text" value="1"></td>
                               <td><input type="text" name="parts" value="<jsp:getProperty name="task" property="parts"/>"></td>
                               <td><input type="text" name="parts" value="<jsp:getProperty name="task" property="parts"/>"></td>
                               <td><input type="date" name="parts" value="<jsp:getProperty name="task" property="parts"/>"></td>
                               <td><input type="text" name="parts" value="<jsp:getProperty name="task" property="parts"/>"></td>
                           </tr>
                           <tr>
                               <td><input type="text" value="2"></td>
                               <td><input type="text" name="parts" value="<jsp:getProperty name="task" property="parts"/>"></td>
                               <td><input type="text" name="parts" value="<jsp:getProperty name="task" property="parts"/>"></td>
                               <td><input type="date" name="parts" value="<jsp:getProperty name="task" property="parts"/>"></td>
                               <td><input type="text" name="parts" value="<jsp:getProperty name="task" property="parts"/>"></td>
                           </tr>
                           <tr>
                               <td><input type="text" value="3"></td>
                               <td><input type="text" name="parts" value="<jsp:getProperty name="task" property="parts"/>"></td>
                               <td><input type="text" name="parts" value="<jsp:getProperty name="task" property="parts"/>"></td>
                               <td><input type="date" name="parts" value="<jsp:getProperty name="task" property="parts"/>"></td>
                               <td><input type="text" name="parts" value="<jsp:getProperty name="task" property="parts"/>"></td>
                           </tr>
                           <tr>
                               <td><input type="text" value="4"></td>
                               <td><input type="text" name="parts" value="<jsp:getProperty name="task" property="parts"/>"></td>
                               <td><input type="text" name="parts" value="<jsp:getProperty name="task" property="parts"/>"></td>
                               <td><input type="date" name="parts" value="<jsp:getProperty name="task" property="parts"/>"></td>
                               <td><input type="text" name="parts" value="<jsp:getProperty name="task" property="parts"/>"></td>
                           </tr>
                           <tr>
                               <td><input type="text" value="5"></td>
                               <td><input type="text" name="parts" value="<jsp:getProperty name="task" property="parts"/>"></td>
                               <td><input type="text" name="parts" value="<jsp:getProperty name="task" property="parts"/>"></td>
                               <td><input type="date" name="parts" value="<jsp:getProperty name="task" property="parts"/>"></td>
                               <td><input type="text" name="parts" value="<jsp:getProperty name="task" property="parts"/>"></td>
                           </tr>
                          
                       </tbody>
                   
                   </table>
            </div>
            
            <div style="width: 100%;">
                <label style="background-color: green;
                   color: white;
                   width: 15%;
                   height: 50px;
                   font-size: 18px;" >SUMMARY OF LABOUR</label><br>
                   
                   <table  style="width: 30%;"> 
                       
                        <thead>
                           <tr>
                            <th>TASK</th>
                            <th>AMOUNT</th>
                            
                           </tr>
                       </thead>
                       <tbody>
                           <tr>
                               <td><label>LABOUR HOURS</label> </td>
                               <td><input type="text" name="summary" value="<jsp:getProperty name="task" property="summary"/>"></td>
                               
                           </tr>
                           <tr>
                               <td><label>GAS WELDING</label> </td>
                               <td><input type="text" name="summary" value="<jsp:getProperty name="task" property="summary"/>"></td>
                               
                           </tr>
                           <tr>
                               <td><label>WHEEL BALANCING</label> </td>
                               <td><input type="text" name="summary" value="<jsp:getProperty name="task" property="summary"/>"></td>
                               
                           </tr>
                           <tr>
                               <td><label>PAINT</label> </td>
                               <td><input type="text" name="summary" value="<jsp:getProperty name="task" property="summary"/>"></td>
                              
                           </tr>
                           <tr>
                               <td><label>TOTAL</label> </td>
                               <td><input type="text" name="summary" value="<jsp:getProperty name="task" property="summary"/>"></td>
                              
                           </tr>
                          
                       </tbody>
                   
                   
                   </table>
            </div>
            <input style="background-color: green; width:100%; height: 50px; color: white" type="submit" value="SUBMIT"/>

        </form>
        </div>
    </body></html>