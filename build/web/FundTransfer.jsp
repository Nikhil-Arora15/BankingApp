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
    <body bgcolor="#E6E6PF" align="center">
        <h1 style="color:#9370DB; text-align:center; padding-top: 80px">Fund Transfer</h1>
        <%
            out.println(session.getAttribute("loginname"));
            out.println(session.getAttribute("accountno"));

        %>
        <FORM action="FundTransferDBMS.jsp" method="post">
            <table border="5" bgcolor="FFFAFA" align="center" width='70%' >
                
               
                <tr>
                    <td>Account to</td>
                    <td><input type='text' name="accountto"></td>
                </tr>
                <tr>
                    <td>date</td>
                    <td><input type='text' name="date" id="datepicker"></td>
                </tr>
<!--                <tr>
                    <td>Trasaction ID</td>
                    <td><input type='text' name="transID"></td>
                </tr>-->
                <tr>
                    <td>amount</td>
                    <td><input type='text' name="amount"></td>
                </tr>
                 <tr>
                     <td><input type='submit' name="b1" value="transfer amount"></td>
                     <td><input type='reset' name="b2" value="reset"></td>
                </tr>
            </table>
        </FORM>
    </body>
</html>
