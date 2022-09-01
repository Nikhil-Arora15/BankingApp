<link rel="stylesheet" href="http://code.jquery.com/ui/1.9.1/themes/base/jquery-ui.css" />
<script src="http://code.jquery.com/jquery-1.8.2.js"></script>
<script src="http://code.jquery.com/ui/1.9.1/jquery-ui.js"></script>
<html>
    <script type="text/javascript">
        $(function() {
        var date = new Date();
        var currentMonth = date.getMonth();
        var currentDate = date.getDate();
        var currentYear = date.getFullYear();
        $('#datepicker').datepicker({
        maxDate: new Date(currentYear, currentMonth, currentDate)
        });
        });
    </script>
     <body bgcolor="#E6E6PB">
        <h1 style="color:#9370DB; text-align:center; padding-top: 80px">
            
 
        <h1>Create Account page</h1><br>
        <form action="CreateAccountDBMS.jsp" method="post">
            <table border="5" bgcolor="FFFAFA" align="center" width='70%' >
<!--                <tr>
                    <td>Account Number</td>
                    <td><input type="text" name="accno"></td>
                </tr>-->
                <tr>
                    <td>Customer Name</td>
                    <td><input type="text" name="name"></td>
                </tr>
                <tr>
                    <td>Gender</td>
                    <td><select name="gender">
                            <option>Male</option>
                            <option>Female</option>
                        </select></td>
                </tr>
                <tr>
                    <td>DOB</td>
                    <td><input type="text" name="DOB" id="datepicker"></td>
                </tr>
                <tr>
                    <td>Address</td>
                    <td><input type="text" name="address"></td>
                </tr>
                <tr>
                    <td>Contact Number</td>
                    <td><input type="text" name="contactno"></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="text" name="password"></td>
                </tr>
                <tr>
                    <td>Security Question</td>
                    <td><select name="sques">
                            <option>First Car</option>
                            <option>First Bank</option>
                            <option>First School</option>
                            <option>First Job</option>
                        </select></td>
                </tr>
                <tr>
                    <td>Answer</td>
                    <td><input type="text" name="answer"></td>
                </tr>
                <tr>
                    <td><input type="submit" name="b1" value="create"></td>
                    <td><input type="reset" name="b2" value="reset"></td>
                </tr>
            </table>
        </form>    
    </body>
</html>