<%-- 
    Document   : ApprovalForm
    Created on : Aug 6, 2018, 3:43:05 PM
    Author     : Grace
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="form.css">
        <link rel="stylesheet" type="text/css" href="table.css">
    </head>
    
   <div class ="DetailSection">
    <h2>TRIP DETAILS:</h2>
    <table class="table2">
      <tr>
        <th>TRIP PURPOSE</th>
        <td><%= request.getAttribute("purpose")%></td>
      </tr>
      <tr>
        <th>DESTINATION</th>
        <td><%= request.getAttribute("destination")%></td>
      </tr>
      <tr>
        <th>DEPARTURE DATE</th>
        <td><%= request.getAttribute("departuredate")%></td>
      </tr>
      <tr>
        <th>RETURN DATE</th>
        <td><%= request.getAttribute("returndate")%></td>
      </tr>
      <tr>
        <th>DURATION</th>
        <td><%= request.getAttribute("duration")%></td>
      </tr>
      <tr>
        <th>PASSENGERS</th>
        <td><%= request.getAttribute("passengernumber")%></td>
      </tr>
      
    </table>
   </div>
    <div class="approvesection">
       
        <a href="OfficialApprove.jsp">
                <input type="button"  class="btnsmall"  value="APPROVE" name="pendingacademic" />
        </a><br><br><br>
        <a href="OfficialCancel.jsp">
                <input type="button"  class="btnsmallcancel"  value="CANCEL" name="pendingacademic" />
        </a><br><br><br>
        <a href="PendingOfficial.jsp">
                <input type="button"  class="btnsmall3"  value="BACK" name="pendingacademic" />
        </a><br><br><br>

        </form>
    </div>
               
</html>
