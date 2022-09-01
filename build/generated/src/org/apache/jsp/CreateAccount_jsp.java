package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CreateAccount_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<link rel=\"stylesheet\" href=\"http://code.jquery.com/ui/1.9.1/themes/base/jquery-ui.css\" />\n");
      out.write("<script src=\"http://code.jquery.com/jquery-1.8.2.js\"></script>\n");
      out.write("<script src=\"http://code.jquery.com/ui/1.9.1/jquery-ui.js\"></script>\n");
      out.write("<html>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        $(function() {\n");
      out.write("        var date = new Date();\n");
      out.write("        var currentMonth = date.getMonth();\n");
      out.write("        var currentDate = date.getDate();\n");
      out.write("        var currentYear = date.getFullYear();\n");
      out.write("        $('#datepicker').datepicker({\n");
      out.write("        maxDate: new Date(currentYear, currentMonth, currentDate)\n");
      out.write("        });\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("     <body bgcolor=\"#E6E6PB\">\n");
      out.write("        <h1 style=\"color:#9370DB; text-align:center; padding-top: 80px\">\n");
      out.write("            \n");
      out.write(" \n");
      out.write("        <h1>Create Account page</h1><br>\n");
      out.write("        <form action=\"CreateAccountDBMS.jsp\" method=\"post\">\n");
      out.write("            <table border=\"5\" bgcolor=\"FFFAFA\" align=\"center\" width='70%' >\n");
      out.write("<!--                <tr>\n");
      out.write("                    <td>Account Number</td>\n");
      out.write("                    <td><input type=\"text\" name=\"accno\"></td>\n");
      out.write("                </tr>-->\n");
      out.write("                <tr>\n");
      out.write("                    <td>Customer Name</td>\n");
      out.write("                    <td><input type=\"text\" name=\"name\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Gender</td>\n");
      out.write("                    <td><select name=\"gender\">\n");
      out.write("                            <option>Male</option>\n");
      out.write("                            <option>Female</option>\n");
      out.write("                        </select></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>DOB</td>\n");
      out.write("                    <td><input type=\"text\" name=\"DOB\" id=\"datepicker\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Address</td>\n");
      out.write("                    <td><input type=\"text\" name=\"address\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Contact Number</td>\n");
      out.write("                    <td><input type=\"text\" name=\"contactno\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Password</td>\n");
      out.write("                    <td><input type=\"text\" name=\"password\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Security Question</td>\n");
      out.write("                    <td><select name=\"sques\">\n");
      out.write("                            <option>First Car</option>\n");
      out.write("                            <option>First Bank</option>\n");
      out.write("                            <option>First School</option>\n");
      out.write("                            <option>First Job</option>\n");
      out.write("                        </select></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Answer</td>\n");
      out.write("                    <td><input type=\"text\" name=\"answer\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"submit\" name=\"b1\" value=\"create\"></td>\n");
      out.write("                    <td><input type=\"reset\" name=\"b2\" value=\"reset\"></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>    \n");
      out.write("    </body>\n");
      out.write("</html>");
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
