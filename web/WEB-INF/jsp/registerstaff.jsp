<%-- 
    Document   : registerstaff
    Created on : Jul 23, 2018, 8:21:05 AM
    Author     : GraceTina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register | Staff</title>
        <style>
            body {
                padding: 100px;
            }
        </style>
    </head>
    <body>
        <form name="regStaff" action="" method="POST">
            <table>
                <tbody>
                    <tr>
                        <td>Surname :</td>
                        <td><input type="text" name="surName" value="" required /></td>
                    </tr>
                    <tr>
                        <td>Other Names :</td>
                        <td><input type="text" name="otherNames" value="" required /></td>
                    </tr>
                    <tr>
                        <td>National ID :</td>
                        <td><input type="text" name="nationalId" value="" required /></td>
                    </tr>
                    <tr>
                        <td>Phone No. :</td>
                        <td><input type="text" name="phoneNo" value="" required /></td>
                    </tr>
                    <tr>
                        <td>E-mail Address :</td>
                        <td><input type="email" name="emailAddr" value="" required /></td>
                    </tr>
                    <tr>
                        <td>Password :</td>
                        <td><input type="password" name="password" value="" required /></td>
                    </tr>
                    <tr>
                        <td>Staff Role :</td>
                        <td><select name="staffRole">
                                <option>driver</option>
                                <option>mechanic</option>
                                <option>booking officer</option>
                                <option>transport officer</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td><input type="submit" name="submitBtn" value="SUBMIT" /></td>
                    </tr>
                </tbody>
            </table>

        </form>
    </body>
</html>
