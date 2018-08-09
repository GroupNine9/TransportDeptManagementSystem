<%-- 
    Document   : testreg
    Created on : Aug 7, 2018, 9:11:53 AM
    Author     : GraceTina
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
                        <td>E-mail Address :</td>
                        <td><input type="email" name="emailAddr" value="" required /></td>
                    </tr>
                    <tr>
                        <td>Password :</td>
                        <td><input type="password" name="password" value="" required /></td>
                    </tr>
                    <tr>
                        <td>Staff Role :</td>
                        <td><select name="role">
                                <option>Driver</option>
                                <option>Mechanic</option>
                                <option>Time Tabling Secretary</option>
                                <option>Transport Officer</option>
                                <option>Staff Official</option>
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
