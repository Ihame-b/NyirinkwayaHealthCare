//package controler;
//
//import java.io.IOException;
//import java.sql.SQLException;
//import java.time.LocalDate;
//import java.time.Period;
//import java.time.format.DateTimeParseException;
//import java.util.HashMap;
//import java.util.Map;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// *
// * @author Ole
// */
//@WebServlet(name = "registrationServlet", urlPatterns = {"/register/*"})
//public class RegistrationServlet extends HttpServlet {
//
//    private Map<String, String> errors;
//
//    /**
//     * Handles the HTTP <code>GET</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        try {
//            String pathInfo = request.getPathInfo();
//            System.out.println("GET... Path Info: " + pathInfo);
//
//            if ("/delete".equals(pathInfo)) {
//                String id = request.getParameter("id");
//                StudentDao.delete(id);
//                response.sendRedirect("/AUCARegistrationApp/student-list.jsp");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            response.sendRedirect("/AUCARegistrationApp/student-registration.jsp");
//        }
//    }
//
//    /**
//     * Handles the HTTP <code>POST</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        String pathInfo = request.getPathInfo();
//
//        Student student = getFormStudent(request);
//        try {
//            if (isStudentValid(student)) {
//                if (pathInfo == null) {
//                    if (StudentDao.findById(student.getId()) != null) {
//                        throw new IllegalArgumentException("Another student already possesses the same ID ("+ student.getId() +")");
//                    }
//                    StudentDao.create(student);
//                    response.sendRedirect("/AUCARegistrationApp/student-list.jsp");
//                } else if ("/update".equals(pathInfo)){
//                    if (StudentDao.findById(student.getId()) == null) {
//                        throw new IllegalArgumentException("The student with ID ("+ student.getId() +") does not exist");
//                    }
//                    StudentDao.update(student);
//                    response.sendRedirect("/AUCARegistrationApp/student-list.jsp");
//                }
//            }
//        } catch(SQLException | IllegalArgumentException e) {
//            e.printStackTrace();
//            request.getSession().setAttribute("editStudent", student);
//            errors.put("global", e.getMessage());
//            request.getSession().setAttribute("errors", errors);
//            response.sendRedirect("/AUCARegistrationApp/student-registration.jsp");
//        }
//    }
//
//    private Student getFormStudent(HttpServletRequest request) {
//        Student student = new Student();
//        student.setId(request.getParameter("id"));
//        student.setFirstName(request.getParameter("first-name"));
//        student.setLastName(request.getParameter("last-name"));
//        student.setGender(request.getParameter("gender"));
//
//        String dobStr = request.getParameter("dob");
//        try {
//            student.setDob(LocalDate.parse(dobStr));
//        } catch(DateTimeParseException e) {
//            e.printStackTrace();
//        }
//        return student;
//    }
//
//    private Boolean isStudentValid(Student student) {
//        errors = new HashMap<>();
//        if (!student.getId().matches("[0-9]{5}")) {
//            errors.put("id", "ID must be exactly 5 digits");
//        }
//
//        if (!student.getFirstName().matches("[A-Za-z]+")) {
//            errors.put("first-name", "Name contains invalid characters");
//        }
//
//        if (!student.getLastName().matches("[A-Za-z]+")) {
//            errors.put("last-name", "Name contains invalid characters");
//        }
//
//        if (student.getDob() != null) {
//            if (student.getDob().isEqual(LocalDate.now()) || student.getDob().isAfter(LocalDate.now())) {
//                errors.put("dob", "Date must be in the past");
//            } else if (Period.between(student.getDob(), LocalDate.now()).getYears() < 18) {
//                errors.put("dob", "Minimum age is 18 years");
//            }
//        }
//
//        if (errors.isEmpty()) {
//            return true;
//        }
//
//        throw new IllegalArgumentException("One or more fields contain errors");
//    }
//
//}
