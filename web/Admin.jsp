<%@page import="java.util.Date" %>
<html>
    
   <body bgcolor="#E6E6PF" align="center">
         WELCOME DEAR : 
        <%
            out.println(session.getAttribute("loginname"));
            out.println(session.getAttribute("accountno"));
            
            Date dt;
            dt=(Date)session.getAttribute("dat");
            out.println("<br>Last Access Time: "+dt);
                    
            dt=new Date();
            out.println("<br> Current Access Time "+dt);
            session.setAttribute("dat", dt);

        %>
        <h1>Admin</h1>
        <a href="CreateAccount.jsp">New Account</a><br>
        <a href="ViewCustomer.jsp">View Customer's</a><br>
        <a href="ViewStatement.jsp"> View Statement</a><br>
        <a href="Deposite.jsp">Deposite</a><br>
        <a href="Withdraw.jsp">Withdraw</a><br>
        <a href="Transaction.jsp">View Transaction</a><br>
    </body>
</html>
