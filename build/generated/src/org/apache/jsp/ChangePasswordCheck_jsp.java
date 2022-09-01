package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class ChangePasswordCheck_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

Connection con;
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/DBCON.jsp");
  }

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

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                String connectionURL="jdbc:mysql://localhost:3306/soprabanking";
                String dbuser="root";
                String dbpass="root";
                con=DriverManager.getConnection(connectionURL, dbuser,dbpass);
                out.println("connected");
            }
            catch(Exception e)
                    {
                        out.println("Connection Failed");
                    }
        
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("   <body bgcolor=\"#E6E6PF\" align=\"center\">\n");
      out.write("        <h1>CheckPassword check Page</h1>\n");
      out.write("         WELCOME DEAR : \n");
      out.write("        ");

            out.println(session.getAttribute("loginname"));
            out.println(session.getAttribute("accountno"));

        
      out.write("\n");
      out.write("        ");

        
            String s1oldpass=request.getParameter("oldpass");
            String s1newpass=request.getParameter("newpass");
            String s1cnpass=request.getParameter("cnpass");
//            out.println(s1oldpass);
//             out.println(s1newpass);
//              out.println(s1cnpass);
            
            try
            {
                if(s1newpass.equals(s1cnpass))
                {
                    if(session.getAttribute("loginpassword").equals(s1oldpass))
                    {
                        try
                        {
                            String updatepassquery="update account set password='"+s1newpass+"' where accno='"+session.getAttribute("accountno") +"'";
                            PreparedStatement pst=con.prepareStatement(updatepassquery);
                            pst.executeUpdate();
                            out.println("Dear "+session.getAttribute("loginname") +"password changed..<br>");
                            
                            session.invalidate();
                            
                            response.setHeader("Cache-Control", "no-store");
                             response.setHeader("Pragma", "no-cache");
                              response.setHeader("Expires", "0");
                            
                            out.println("<a href=Login.jsp>Login Again</a>");
                        }
                        catch(Exception e)
                        {
                            out.println("<br> Paswword not change"+e);
                        }
                    }
                    else
                    {
                        out.println("<br> old password  not match" );
                    }
                }
                else
                {
                    out.println("<br> old pass and new pass not match" );
                }
            }
            catch(Exception e)
            {
                out.println(e);
            }
            
        
      out.write("\n");
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
