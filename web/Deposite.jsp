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
       <h1 style="color:#9370DB; text-align:center; padding-top: 80px">deposite</h1>
        <FORM action="DepositeDBMS.jsp" method="post">
            <table border="5" bgcolor="FFFAFA" align="center" width='70%' >
                <tr>
                    <td>Account Number</td>
                    <td><input type='text' name="accountno"></td>
                </tr>
                 <tr>
                    <td>Reference</td>
                    <td><input type='text' name="ref"></td>
                </tr>\
                 <tr>
                    <td>date of transaction</td>
                    <td><input type='text' name="date" id="datepicker"></td>
                </tr>

                
                <tr>
                    <td>Deposit Amount</td>
                    <td><input type='text' name="amount"></td>
                </tr>
               
               
                 <tr>
                     <td><input type='submit' name="b1" value="deposit"></td>
                     <td><input type='reset' name="b2" value="reset"></td>
                </tr>
            </table>
        </FORM>
    </body>
</html>
