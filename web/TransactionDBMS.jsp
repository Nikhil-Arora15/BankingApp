<%@include file="DBCON.jsp" %>
<%@include file="Transaction.jsp" %>
<html>
    <body>
        <h1>Transaction DBMS</h1>
        <%
            String choice=request.getParameter("choice");
            String st=request.getParameter("txt1");
            try
            {
                String viewquery="";
                if(choice.equalsIgnoreCase("all"))
                {
                    viewquery="select * from transactionbank";
                }
                else if(choice.equalsIgnoreCase("accno"))
                {
                    viewquery="select * from transactionbank where accountno='"+st+"'";
                }
                 else if(choice.equalsIgnoreCase("tid"))
                {
                    viewquery="select * from transactionbank where transid ='"+st+"'";
                }
                 else if(choice.equalsIgnoreCase("date"))
                {
                    viewquery="select * from transactionbank where dotrans='"+st+"'";
                }
                Statement stmt=con.createStatement();
                    ResultSet rs=stmt.executeQuery(viewquery);
                    
                while(rs.next())
                {
                    out.println(" "+rs.getString(1));
                    out.println(" "+rs.getString(2));
                    out.println(" "+rs.getString(3));
                    out.println(" "+rs.getString(4));
                    out.println(" "+rs.getInt(5));
                    out.println(" "+rs.getInt(6));
                    out.println(" "+rs.getInt(7));
                    
                    out.println(" <br> ");
                    
                    
                    
                }
            }
                catch(Exception e)
                        {
                        out.println(e);
                        }
        %>
    </body>
</html>
