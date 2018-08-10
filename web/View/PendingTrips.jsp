
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="Model.MyDb"%>
<%@page import="beans.Trip"%>
<!DOCTYPE html>
<html>
<head>
        <link rel="stylesheet" type="text/css" href="table.css">
        <h2 align="center"><font color="green" ><strong>TRIPS</strong></font></h2>
</head>
<body>
    <div style="overflow-x: auto;">
    <table class="table">
                <tr >
                 <th><b>TRIP ID</b></th>
                 <th><b>DEPARTURE DATE</b></th>
                 <th><b>RETURN DATE</b></th>
                 <th><b>PASSENGER COUNT</b></th>
                 <th><b>DURATION</b></th>
                 <th><b>DESTINATION</b></th>
                 <th><b>PASSWORD</b></th>
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
    </div>
</body>
</html>