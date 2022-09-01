package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class DepositeDBMS_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <body>\n");
      out.write("        <h1> Deposite DBMS Page</h1>\n");
      out.write("        ");

            String accountno= request.getParameter("accountno");
            String ref= request.getParameter("ref");
            String date= request.getParameter("date");
            String transid=request.getParameter("transID");
            String amount=request.getParameter("amount");
            
            try
            {
                String viewquery="select * from transactionbank";
                Statement stmt=con.createStatement();
                 
                ResultSet rs=stmt.executeQuery(viewquery);
                int lastbal=0;
                while(rs.next())
                {
                    lastbal=rs.getInt(7);
                     
                }
                 
               
                 
                String cashdepquery="insert into transactionbank values(?,?,?,?,?,?,?);";
                PreparedStatement pst=con.prepareStatement(cashdepquery);
                
                
                //--------------------------------------------------------------
                        
                        
                String viewquerycustomer ="select * from "+accountno;
                Statement stmt2=con.createStatement();
                 
                ResultSet rs1=stmt2.executeQuery(viewquery);
                int lastbalcust=0;
                while(rs1.next())
                {
                    lastbalcust=rs1.getInt(7);
                     
                }
                 
               
                 
                String cashdepqueryincustomer = "insert into "+accountno+" values(?,?,?,?,?,?,?);";
                PreparedStatement pst1 = con.prepareStatement(cashdepqueryincustomer);
                
                
                pst1.setString(1, accountno);
                pst1.setString(2, ref);
                pst1.setString(3, date);
                pst1.setString(4, transid);
                pst1.setInt(5, Integer.parseInt(amount));
                pst1.setInt(6, 0);
                pst1.setInt(7,lastbalcust+Integer.parseInt(amount));
                       
                pst1.executeUpdate();
                out.println("Transaction Done.....Cash Deposited");
                
                
                
                
                
            }
            catch(Exception e)
                    {
                        out.println("Transaction Not Done"+e);
                    }
            
      out.write("\n");
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
