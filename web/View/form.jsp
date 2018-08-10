
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="Model.MyDb"%>
<%@page import="beans.Trip"%>
<h2 align="center"><font color="green" ><strong>TRIPS</strong></font></h2>
<table align="center" cellpadding="4" cellspacing="4" border="1" >

   <tr>
    <td><b>TRIP ID</b></td>
    <td><b>DEPARTURE DATE</b></td>
    <td><b>RETURN DATE</b></td>
    <td><b>PASSENGER COUNT</b></td>
    <td><b>DURATION</b></td>
    <td><b>DESTINATION</b></td>
    <td><b>PASSWORD</b></td>

   </tr>
<%
try {
        MyDb db = new MyDb();
        db.getCon();
        String query = "select * from staff ";
        Statement stmt = db.con.createStatement();
        ResultSet resultSet = stmt.executeQuery(query);

        while (resultSet.next())
        {
%>
            <tr>
            <td><%=resultSet.getString("STAFFID")%></td>
            <td><%=resultSet.getString("NAME")%></td>            
            <td><%=resultSet.getString("EMAIL")%></td>
            <td><%=resultSet.getString("IDNUMBER")%></td>
            <td><%=resultSet.getString("PHONENUMBER")%></td>
            <td><%=resultSet.getString("ROLE")%></td>
            <td><%=resultSet.getString("PASSWORD")%></td>
            </tr>
<%
        }
    }
catch (Exception e) 
    {
        e.printStackTrace();
    }
%>

</table>