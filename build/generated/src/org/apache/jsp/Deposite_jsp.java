package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Deposite_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html>\n");
      out.write("     <script type=\"text/javascript\">\n");
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
      out.write("    <body bgcolor=\"#E6E6PF\" align=\"center\">\n");
      out.write("       <h1 style=\"color:#9370DB; text-align:center; padding-top: 80px\">deposite</h1>\n");
      out.write("        <FORM action=\"DepositeDBMS.jsp\" method=\"post\">\n");
      out.write("            <table border=\"5\" bgcolor=\"FFFAFA\" align=\"center\" width='70%' >\n");
      out.write("                <tr>\n");
      out.write("                    <td>Account Number</td>\n");
      out.write("                    <td><input type='text' name=\"accountno\"></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td>Reference</td>\n");
      out.write("                    <td><input type='text' name=\"ref\"></td>\n");
      out.write("                </tr>\\\n");
      out.write("                 <tr>\n");
      out.write("                    <td>date of transaction</td>\n");
      out.write("                    <td><input type='text' name=\"date\" id=\"datepicker\"></td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>Deposit Amount</td>\n");
      out.write("                    <td><input type='text' name=\"amount\"></td>\n");
      out.write("                </tr>\n");
      out.write("               \n");
      out.write("               \n");
      out.write("                 <tr>\n");
      out.write("                     <td><input type='submit' name=\"b1\" value=\"deposit\"></td>\n");
      out.write("                     <td><input type='reset' name=\"b2\" value=\"reset\"></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </FORM>\n");
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
