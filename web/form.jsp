<%-- 
    Document   : form
    Created on : Nov 20, 2021, 4:55:05 PM
    Author     : IHAME
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>IhameRegisterCitizen</title>
    </head>
    <body>
    <center>
        <span style="background-color: grey; font-family: segoe print; width: auto; font-size: 40px; color: #ffffff;">
            Nyirinkaya Hospital System Created By Ihame Gilbert 22758
        </span>
        
        <h2>
            Register Here Please 
        </h2>
        
        <form action="insert.jsp">
        
            <table>
                <tr>
                    <td>Identity No</td>
                    <td><input name="id" placeholder="Enter your Identity No" required="" /></td>
                </tr>
                <tr>
                    <td>First Name</td>
                    <td><input name="fname" placeholder="Enter your First Name" required=""/></td>
                </tr>
                <tr>
                    <td>Last Name</td>
                    <td><input name="lname" placeholder="Enter your Last Name" required=""/></td>
                </tr>
                <tr>
                    <td>Weight</td>
                    <td><input name="weight" placeholder="Enter your Weight" required=""/></td>
                </tr>
                <tr>
                    <td>Height</td>
                    <td><input name="height" placeholder="Enter your Height" required=""/></td>
                </tr>
                <tr>
                    <td></td>
                    <td colspan="2"><input type="submit" value="Save" /></td>
                </tr>
            </table>
            <a href="./display.jsp" style="color: greenyellow">check all Patient</a>
        </form>
    </center>
    </body>
</html>
