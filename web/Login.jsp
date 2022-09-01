
<html>
    <body bgcolor="#E6E6PB" align="center">
        <h1 style="color:#9370DB; text-align:center; padding-top: 80px">
    <body bgcolor="yellow">
        <h1>login page</h1>
        <form action="Check.jsp" method="post">
            Select Role<select name="role">
                <option> Admin </option>
                <option> Customer </option>
            </select><br>
            Enter Account Number <input type="text" name="accountno"><br>
            Enter Password <input type="text" name="password"><br>
            <a href="map.jsp"> Visit Branch</a><br>
            <a href="ForgetPassword.jsp">Forget Password</a><br>
            <input type="submit" name="b1" value="Login">
            <input type="reset" name="b2" value="RESET">
           
        </form>
    </body>
</html>
