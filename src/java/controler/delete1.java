/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import connectDB.utl;
import java.io.IOException;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Caleb
 */
public class delete1 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        try {
            Connection con = utl.getConnection();
            String query = "DELETE FROM citizen WHERE idN = '"+id+"' ";
            Statement st = con.createStatement();
            st.executeUpdate(query);
            out.print("Sucess");
            response.sendRedirect("display.jsp");
        } catch (SQLException e) {
            out.print("FAILURE");
            out.print(e.getMessage());
        }
    }

  

}
