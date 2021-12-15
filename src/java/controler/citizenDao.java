package controler;

import connectDB.utl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import javax.servlet.http.HttpServletRequest;
import model.Citizeners;

/**
 *
 * @author Ole
 */
public class citizenDao {

    public static void update(Citizeners ct) throws SQLException {
        try (Connection con = utl.getConnection()) {
            String QUERY =
                    "UPDATE citizen"
                    + " fname = ?, lname = ?, weight = ?, height = ?"
                    + " WHERE id = ?";
            PreparedStatement pstmnt = con.prepareStatement(QUERY);
            pstmnt.setString(1, ct.getFname());
            pstmnt.setString(2, ct.getLname());
            pstmnt.setInt(3, (int) ct.getWeight());
            pstmnt.setInt(4, (int) ct.getHeight());
            pstmnt.setInt(5, ct.getIdN());
            pstmnt.execute();
        } catch(SQLException e) {
            throw e;
        }
    }
    
//     private Citizeners getFormStudent(HttpServletRequest request) {
//        Citizeners student = new Citizeners();
//        student.setIdN(request.getParameter("id"));
//        student.setFname(request.getParameter("first-name"));
//        student.setLname(request.getParameter("last-name"));
//        student.setWeight(request.getParameter("gender"));
//        student.setHeight(request.getParameter("height"));
//
//        String dobStr = request.getParameter("dob");
//        try {
//            student.setDob(LocalDate.parse(dobStr));
//        } catch(DateTimeParseException e) {
//            e.printStackTrace();
//        }
//        return student;
//    }

    

}
