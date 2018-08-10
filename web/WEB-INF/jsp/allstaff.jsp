<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All Staff</title>
        <style>
            body {
                padding: 100px;
            }
        </style>
    </head>
    <body>
        <a href="/staff/register">New Staff Member</a>
        <h1>All Staff</h1>
        <table>
            <thead>
                <tr>
                    <th>Staff ID</th>
                    <th>Surname</th>
                    <th>Other Names</th>
                    <th>ID No.</th>
                    <th>Phone No.</th>
                    <th>Password</th>
                    <th>Email Address</th>
                    <th>Staff Role</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${staff}" var="staffMmbr">
                    <tr>
                        <td>${staffMmbr.staffId}</td>
                        <td>${staffMmbr.surname}</td>
                        <td>${staffMmbr.otherNames}</td>
                        <td>${staffMmbr.nationalId}</td>
                        <td>${staffMmbr.phoneNumber}</td>
                        <td>${staffMmbr.password}</td>
                        <td>${staffMmbr.emailAddress}</td>
                        <td>${staffMmbr.staffRole}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
