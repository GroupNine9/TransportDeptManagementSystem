<%-- 
    Document   : Mechanic
    Created on : 04-Sep-2018, 06:42:12
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
        <div class="whole">
    <form action = "<%=request.getContextPath() %>/Mechanic1" method="post"> 
        <div class="main1">
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
           
           
        </div>
        <div class="main2" >
                <div class="input-container">
                 <label style="background-color: green;
                   color: white;
                   width: 30%;
                   height: 30px;
                   font-size: 18px;">REG NO.</label>
                   <input style="width: 100%;" type="text" name="reg" value="<jsp:getProperty name="task" property="reg"/>" >
            </div>
                <div class="input-container" style="margin-bottom: 90px;">
                 <label style="background-color: green;
                   color: white;
                   width: 30%;
                   height: 30px;
                   font-size: 18px;">MODEL</label>
                   <input style="width: 100%;" name="model" type="text" value="<jsp:getProperty name="task" property="model"/>">
            </div>
                <div class="input-container">
                 <label style="background-color: green;
                   color: white;
                   width: 30%;
                   height: 50px;
                   font-size: 18px;" >ITEMS CHECKLIST</label>
                <div style="float: left; 
                     margin-right: 90px;
                     margin-bottom: 50px;
                    ">
                    <input type="checkbox" id="chk1" name="items" value="<jsp:getProperty name="task" property="items"/>">Jack<br/>
                    <input type="checkbox" id="chk2" name="items" value="<jsp:getProperty name="task" property="items"/>">Jack Handle<br/>
                    <input type="checkbox" id="chk3" name="items" value="<jsp:getProperty name="task" property="items"/>">Spare Wheel<br/>
                    <input type="checkbox" id="chk4" name="items" value="<jsp:getProperty name="task" property="items"/>">Wheel Spanner<br/>
                    <input type="checkbox" id="chk5" name="items" value="<jsp:getProperty name="task" property="items"/>">Radio<br/>
                </div>
                <div style="float: right;">
                    <input type="checkbox" id="chk6" name="items" value="<jsp:getProperty name="task" property="items"/>">Radio Cassette<br/>
                    <input type="checkbox" id="chk7" name="items" value="<jsp:getProperty name="task" property="items"/>">Radio Antenna<br/>
                    <input type="checkbox" id="chk8" name="items" value="<jsp:getProperty name="task" property="items"/>">Radio Speaker<br/>
                    <input type="checkbox" id="chk9" name="items" value="<jsp:getProperty name="task" property="items"/>">Wheel Caps<br/>
                    <input type="checkbox" id="chk10" name="items" value="<jsp:getProperty name="task" property="items"/>">Mirrors<br/>
                </div>
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
        
        
             <input style="background-color: green; width:100%; height: 50px; color: white; " type="submit" value="NEXT"/>
       </form>
        </div>
    </body>
</html>
