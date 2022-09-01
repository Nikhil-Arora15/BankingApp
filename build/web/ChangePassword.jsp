<html>
    
   <body bgcolor="#E6E6PF" align="center">
         WELCOME DEAR : 
        <%
            out.println(session.getAttribute("loginname"));
            out.println(session.getAttribute("accountno"));

        %>
        <h1>change password  Page</h1>
        
        <form action="ChangePasswordCheck.jsp" method="post">
            ENTER old PASSWORD <input type="text" name="oldpass"> <br>
            ENTER new PASSWORD <input type="text" name="newpass"> <br>
            confirm PASSWORD <input type="text" name="cnpass"> <br>
            <input type="submit" name="b1"value="change">
            
            
        </form>
    </body>
</html>
