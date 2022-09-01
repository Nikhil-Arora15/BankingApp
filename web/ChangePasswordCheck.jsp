<%@include file="DBCON.jsp" %>
<html>
    
   <body bgcolor="#E6E6PF" align="center">
        <h1>CheckPassword check Page</h1>
         WELCOME DEAR : 
        <%
            out.println(session.getAttribute("loginname"));
            out.println(session.getAttribute("accountno"));

        %>
        <%
        
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
            
        %>
    </body>
</html>
