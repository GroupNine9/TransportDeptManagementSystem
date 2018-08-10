<%-- 
    Document   : ApprovalForm
    Created on : Aug 6, 2018, 3:43:05 PM
    Author     : Grace
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="Model.MyDb"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="form.css">
    </head>
    <body>
        <form>
<%
        try {
        MyDb db = new MyDb();
        db.getCon();
        String query = "select * from staff ";
        String query2 = "select * from vehicles ";
        
        Statement st = db.con.createStatement();
        ResultSet rs = st.executeQuery(query); 
       
%>
      
        <p>Select Name 
            <select>
            <%
            while(rs.next())
            {
            String fname = rs.getString("NAME"); 
            %>
            <option value="<%=fname %>"><%=fname %></option>
            <%
            }
            %>
            </select>
        </p>
<%
            }
            catch(Exception sqe)
            { 
            out.println(sqe);
            }
%>
<%
        try {
        MyDb db = new MyDb();
        db.getCon();
        String query2 = "select * from vehicles ";
        
        Statement st = db.con.createStatement();
        ResultSet rs = st.executeQuery(query2); 
       
%>
        <p>Select Vehicle :
            <select>
            <%
            while(rs.next())
            {
            String fname = rs.getString("PLATENUMBER"); 
            %>
            <option value="<%=fname %>"><%=fname %></option>
            <%
            }
            %>
            </select>
        </p>
<%
            }
            catch(Exception sqe)
            { 
            out.println(sqe);
            }
%>
            <input class="btn" type="submit" value="APPROVE TRIP"/>
        </form>
    </body>
</html>
