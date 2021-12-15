<%-- 
    Document   : delete
    Created on : Nov 20, 2021, 8:20:26 PM
    Author     : IHAME
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Statement"%>
<%@page import="connectDB.utl"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<% 
String id = request.getParameter("idN");
        try {
            Connection con = utl.getConnection();
        
            //String query = "INSERT INTO student(id, first_name, last_name, sem) VALUES (?, ?, ?, ?)";
            String query = "DELETE FROM citizen WHERE idN = '"+id+"' ";
            Statement st = con.createStatement();
            st.executeUpdate(query);
            out.print("Sucess");
            response.sendRedirect("display.jsp");
        } catch (SQLException e) {
            out.print("FAILURE");
            out.print(e.getMessage());
        }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1></h1>
    </body>
</html>
