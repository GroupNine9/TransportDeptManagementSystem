<%-- 
    Document   : Mech
    Created on : 11-Sep-2018, 11:49:55
    Author     : paige
--%>

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
        <form action = "<%=request.getContextPath() %>/MechanicTaskReport" method="post"> 
            <div class="input-container">
                <label style="background-color: green;
                   color: white;
                   width: 30%;
                   height: 50px;
                   font-size: 18px;">WORK INSTRUCTIONS</label>
                <textarea class="textarea" name="instructions" value="<jsp:getProperty name="task" property="instructions"/>" ></textarea>
            </div>
             <div class="input-container">
                <label style="background-color: green;
                   color: white;
                   width: 30%;
                   height: 50px;
                   font-size: 18px;">ADDITIONAL REPAIRS</label>
                <textarea class="textarea" name="additionals" value="<jsp:getProperty name="task" property="additionals"/>"></textarea>
            </div>
             <div class="input-container">
                 <label style="background-color: green;
                   color: white;
                   width: 30%;
                   height: 50px;
                   font-size: 18px;">WORK DONE</label>
                <textarea class="textarea" name="work" value="<jsp:getProperty name="task" property="work"/>" ></textarea>
             </div>
    
                <div class="input-container">
                 <label style="background-color: green;
                   color: white;
                   width: 30%;
                   height: 50px;
                   font-size: 18px;">PLATE NO.</label>
                   <input style="width: 60%;" type="text" maxlength="8"name="reg" value="<jsp:getProperty name="task" property="reg"/>" >
            </div>
                <div class="input-container" style="margin-bottom: 90px;">
                 <label style="background-color: green;
                   color: white;
                   width: 30%;
                   height: 50px;
                   font-size: 18px;">MODEL</label>
                   <input style="width: 60%;" name="model" type="text" value="<jsp:getProperty name="task" property="model"/>">
            </div>

                
            <div class="input-container">
                 <label style="background-color: green;
                   color: white;
                   width: 30%;
                   height: 50px;
                   font-size: 18px;">DEFECTS NOTED</label>
                <textarea class="textarea" name="defects" value="<jsp:getProperty name="task" property="defects"/>" ></textarea>
            </div>
               
            </div>
            
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
                               <td><input type="text"  name="item" value="<jsp:getProperty name="task" property="item"/>"></td>
                               <td><input type="text" name="reqno" value="<jsp:getProperty name="task" property="reqno"/>"></td>
                               <td><input type="text" name="noteno" value="<jsp:getProperty name="task" property="noteno"/>"></td>
                               <td><input type="date" name="date" value="<jsp:getProperty name="task" property="date"/>"></td>
                               <td><input type="number" name="cost" value="<jsp:getProperty name="task" property="cost"/>"></td>
                           </tr>
                           <tr>
                               <td><input type="text"  name="item" value="<jsp:getProperty name="task" property="item"/>"></td>
                               <td><input type="text" name="reqno" value="<jsp:getProperty name="task" property="reqno"/>"></td>
                               <td><input type="text" name="noteno" value="<jsp:getProperty name="task" property="noteno"/>"></td>
                               <td><input type="date" name="date" value="<jsp:getProperty name="task" property="date"/>"></td>
                               <td><input type="number" name="cost" value="<jsp:getProperty name="task" property="cost"/>"></td>
                           </tr>
                           <tr>
                               <td><input type="text"  name="item" value="<jsp:getProperty name="task" property="item"/>"></td>
                               <td><input type="text" name="reqno" value="<jsp:getProperty name="task" property="reqno"/>"></td>
                               <td><input type="text" name="noteno" value="<jsp:getProperty name="task" property="noteno"/>"></td>
                               <td><input type="date" name="date" value="<jsp:getProperty name="task" property="date"/>"></td>
                               <td><input type="number" name="cost" value="<jsp:getProperty name="task" property="cost"/>"></td>
                           </tr>
                           <tr>
                               <td><input type="text"  name="item" value="<jsp:getProperty name="task" property="item"/>"></td>
                               <td><input type="text" name="reqno" value="<jsp:getProperty name="task" property="reqno"/>"></td>
                               <td><input type="text" name="noteno" value="<jsp:getProperty name="task" property="noteno"/>"></td>
                               <td><input type="date" name="date" value="<jsp:getProperty name="task" property="date"/>"></td>
                               <td><input type="number" name="cost" value="<jsp:getProperty name="task" property="cost"/>"></td>
                           </tr>
                           <tr>
                               <td><input type="text" name="item" value="<jsp:getProperty name="task" property="item"/>"></td>
                               <td><input type="text" name="reqno" value="<jsp:getProperty name="task" property="reqno"/>"></td>
                               <td><input type="text" name="noteno" value="<jsp:getProperty name="task" property="noteno"/>"></td>
                               <td><input type="date" name="date" value="<jsp:getProperty name="task" property="date"/>"></td>
                               <td><input type="number" name="cost" value="<jsp:getProperty name="task" property="cost"/>"></td>
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
                               <td><input type="number" name="labourhourscost" value="<jsp:getProperty name="task" property="labourhourscost"/>"></td>
                               
                           </tr>
                           <tr>
                               <td><label>GAS WELDING</label> </td>
                               <td><input type="number" name="gasweldingcost" value="<jsp:getProperty name="task" property="gasweldingcost"/>"></td>
                               
                           </tr>
                           <tr>
                               <td><label>WHEEL BALANCING</label> </td>
                               <td><input type="number" name="wheelbalancecost" value="<jsp:getProperty name="task" property="wheelbalancecost"/>"></td>
                               
                           </tr>
                           <tr>
                               <td><label>PAINT</label> </td>
                               <td><input type="number" name="paintcost" value="<jsp:getProperty name="task" property="paintcost"/>"></td>
                              
                           </tr>
                           <tr>
                               <td><label>TOTAL</label> </td>
                               <td><input type="text" ></td>
                              
                           </tr>
                          
                       </tbody>
                   
                   
                   </table>
            </div>
            <input style="background-color: green; width:100%; height: 50px; color: white" type="submit" value="SUBMIT"/>


       </form>
    </body>
</html>
