<%-- 
    Document   : insert
    Created on : Nov 20, 2021, 4:40:15 PM
    Author     : IHAME
--%>

<%@page import="connectDB.utl"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1></h1>
    </body>
</html>
<%
    String ids = request.getParameter("id");
    int id = Integer.parseInt(ids);
    String fname = request.getParameter("fname");
    String lname = request.getParameter("lname");
    String weights = request.getParameter("weight");
    Double weight = Double.parseDouble(weights);
    String heights = request.getParameter("height");
    Double height = Double.parseDouble(heights);
    //double heightsqr = height*height;
    double bmi = weight/(height*height);
    String bmitxt = null;
    if (bmi < 18.5){
        bmitxt = "Under Weight";
    }
    else if (bmi >= 18.5 && bmi < 25){
        bmitxt = "Normal";
    }
    else if (bmi >= 25 && bmi < 30){
        bmitxt = "Over Weight";
    }
    else{
        bmitxt ="Obese";
    }
    //out.print("<br />ID:" + id   +"<br />FNAME:" +  fname +"<br />LNAME:" + lname +"<br />Weight:" + weight +"<br />Height:" + height +"<br>Height sqr: "+ height +"<br />BMI:" + bmi+"<br />BMI Txt IS " + bmitxt );
    
    try {
                Connection con = utl.getConnection();

                //run query
                String query = "INSERT INTO citizen(idN, fname, lname, weight, height, bmi, bmitxt) VALUES (?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setInt(1, id);
                pst.setString(2, fname);
                pst.setString(3, lname);
                pst.setDouble(4, weight);
                pst.setDouble(5, bmi);
                pst.setDouble(6, height);
                pst.setString(7, bmitxt);
                pst.execute();
                out.print("SUCCESS");
                response.sendRedirect("display.jsp");
            } catch(SQLException e) {
                out.print("FAILURE");
                out.print(e.getMessage());
            }  
%>