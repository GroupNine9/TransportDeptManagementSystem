
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Beans.Staff"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Worker</title>
        
        <link rel="stylesheet" type="text/css" href="servicerequest.css">
        <link rel="stylesheet" type="text/css" href="nav.css">
        <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="C:\Users\Grace\Desktop\BootStrap\css\bootstrap.min">
        <link href="https://fonts.googleapis.com/css?family=Raleway:100,200,400,500,600" rel="stylesheet" type="text/css">        
    </head>
    <body>
        
        <form method="post" action="<%=request.getContextPath() %>/ServiceRequest">       
                <div class="topnav">
                        <a href="driverdashboard.jsp">HOME</a>
                        <a href="<%=request.getContextPath() %>/logout">LOGOUT</a>
                    </div>
                 <h2 align="center"><font color="green" size="5" ><strong>FILL DETAILS TO REQUEST FOR SERVICING:</strong></font></h2>

                    <div class="mainarea">

                    <div class="input-container">
                        <div style="width: 25%;">PLATE NUMBER</div> <input class="input-field" type="text"  name="vehicleid" ><br>
                    </div>
                    <div class="input-container">            
                        <div style="width: 25%;"> DATE IN</div> <input class="input-field" type="date" name="datein" ><br>
                    </div>
                    <div class="input-container">           
                        <div style="width: 25%;"> DRIVER CONTACT</div> <input class="input-field" type="text" name="contact"  ><br>
                    </div>
                    <div class="input-container">
                        <div style="width: 25%;">SERVICES WANTED</div> <textarea class="textarea" placeholder="" name="services" value="name"></textarea><br>
                    </div>

                    <div class="input-container">
                        <div style="width: 25%;">PARTS TO REPAIR</div> <textarea class="textarea" placeholder="" name="repairparts" value=""></textarea><br>
                    </div>



                    <div class="input-container">
                        <input type="submit" class="btn" value="SUBMIT REQUEST">
                    </div>
        
                </div>
                 </form>
           </body>
</html>
