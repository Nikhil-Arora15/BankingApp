<%@include file="DBCON.jsp" %>
<html>
   
    <body>
        <h1>Check Page</h1>
       <%
            String role = request.getParameter("role");
            String accountnumber = request.getParameter("accountno");
            String upass = request.getParameter("password");
            
            try {
                String viewquery = "select * from account";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(viewquery);
                String loginname="";
                int count=0,c=0;
                
                while(rs.next()) {
                    if(role.equalsIgnoreCase(rs.getString(7)) && accountnumber.equalsIgnoreCase(rs.getString(1)) && upass.equals(rs.getString(8))) {
                        
                        count++;
                        loginname=rs.getString(2);
                         break;
                    }
                   
                }
                    if(count>0)
                    {
                        session.setAttribute("accountno", accountnumber);
                        session.setAttribute("loginname", loginname);
                        session.setAttribute("loginpassword", upass);
                        
                        if(role.equalsIgnoreCase("ADMIN"))
                        {
                            response.sendRedirect("Admin.jsp");
                        }
                        else
                        {
                            response.sendRedirect("CustomerLogin.jsp");
                        }
                        //out.println("login success");
                        //response.sendRedirect("Success.jsp");
                    }
                    else {
                       
                        if(c<3)
                        {
                             c++;
                        out.println("NO OF Attempts: "+c);
                       RequestDispatcher dis=request.getRequestDispatcher("Login.jsp");
                        dis.include(request, response);
                        out.println("try again");
                        }
                       
                            c=0;
                            out.println("maximum attempts Exceed....TRY AGIN LATER");
                     
                       
                    }
                    
                
            } catch(Exception e) {
                out.println(e);
            }
            
//            if(userid.equalsIgnoreCase("sparsh@soprasteria.com") && username.equalsIgnoreCase("sparsh") && password.equals("123")) {
//                response.sendRedirect("Success.jsp");
//            } else {
//                RequestDispatcher disp = request.getRequestDispatcher("Login.jsp");
//                disp.include(request, response);
//                out.println("<br>Invalid username or password");
//            }
        %>
            
    </body>
</html>