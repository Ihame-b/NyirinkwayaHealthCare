package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class form_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>IhameRegisterCitizen</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <span style=\"background-color: grey; font-family: segoe print; width: auto; font-size: 40px; color: #ffffff;\">\n");
      out.write("            Nyirinkaya Hospital System Created By Ihame Gilbert 22758\n");
      out.write("        </span>\n");
      out.write("        \n");
      out.write("        <h2>\n");
      out.write("            Register Here Please \n");
      out.write("        </h2>\n");
      out.write("        \n");
      out.write("        <form action=\"insert.jsp\">\n");
      out.write("        \n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Identity No</td>\n");
      out.write("                    <td><input name=\"id\" placeholder=\"Enter your Identity No\" required=\"\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>First Name</td>\n");
      out.write("                    <td><input name=\"fname\" placeholder=\"Enter your First Name\" required=\"\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Last Name</td>\n");
      out.write("                    <td><input name=\"lname\" placeholder=\"Enter your Last Name\" required=\"\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Weight</td>\n");
      out.write("                    <td><input name=\"weight\" placeholder=\"Enter your Weight\" required=\"\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Height</td>\n");
      out.write("                    <td><input name=\"height\" placeholder=\"Enter your Height\" required=\"\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td colspan=\"2\"><input type=\"submit\" value=\"Save\" /></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <a href=\"./display.jsp\" style=\"color: greenyellow\">check all Patient</a>\n");
      out.write("        </form>\n");
      out.write("    </center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
