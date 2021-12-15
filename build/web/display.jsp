<%-- 
    Document   : display
    Created on : Nov 20, 2021, 5:42:08 PM
    Author     : IHAME
--%>

<%@page import="model.Citizeners"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="connectDB.utl"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Health View</title>
        <link rel="stylesheet" href="Assets/Style.css"/>
    </head>
    <body>
    <center><h1 style="color: greenyellow;background: whitesmoke">List Of All citizen with CheckUp</h1></center>
        
        <%
            List<Citizeners> citizen = new ArrayList<>();
            try {
                Connection con = utl.getConnection();
        
                //run query
                String query = "SELECT * FROM citizen";
                PreparedStatement pst = con.prepareStatement(query);
                ResultSet rs = pst.executeQuery();

                while (rs.next()) {
                Citizeners s = new Citizeners();
                s.setIdN(rs.getInt("idN"));
                s.setFname(rs.getString("fname"));
                s.setLname(rs.getString("lname"));
                s.setWeight(rs.getDouble("weight"));
                s.setBmi(rs.getDouble("bmi"));
                s.setHeight(rs.getDouble("height"));
                s.setBmitxt(rs.getString("bmitxt"));
                citizen.add(s);
                }
            } catch (SQLException e) {
                out.print("FAILURE");
                out.print(e.getMessage());
            }
        %>
        
    <center> 
        <table border="2" style="color: green; background-color: white">
            <tr>
                <th>ID</th>
                <th>Names(First && Last)</th>
                <th>Height</th>
                <th>Weight</th>
                <th>BMI</th>
                <th>Health Condition</th>
                <th>Action</th>
            </tr>
            <%for (Citizeners s: citizen) {%>
                <tr>
                    <td><% out.print(s.getIdN());%></td>
                    <td><% out.print(s.getFname() + " " + s.getLname());%></td>
                    <td><% out.print(s.getBmi());%></td>
                    <td><% out.print(s.getWeight());%></td>
                    <td><% out.print(s.getHeight());%></td>
                    <td><% out.print (s.getBmitxt());%></td>
                    <td>
                        <form action="delete.jsp" style="background-color: red">
                            <input name="idN" value="<% out.print(s.getIdN());%>" hidden />
                            <button style="color: red">Delete</button>
                        </form><br />
                        
<!--                            <a href="Edit?id=<% //out.print(s.getIdN());%>">Edit</a>-->
                    </td>
                </tr>
            <%}%>
        </table>
        <br />
        <span>
            <a href="form.jsp" style="color: greenyellow;background: whitesmoke">Register Another</a>
        </span>
    </center>    
    </body>
</html>
