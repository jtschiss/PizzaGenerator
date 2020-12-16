<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>

<FORM ACTION="/PizzaBuilder/signup" METHOD="POST">
    <TABLE>
        <TR><TD>User name: <INPUT TYPE="TEXT" NAME="username">
        <TR><TD>Password: <INPUT TYPE="password" NAME="password1">
        <TR><TD>Confirm Password: <INPUT TYPE="password" NAME="password2">
        <TR><TH><INPUT TYPE="SUBMIT" VALUE="Sign Up">
    </TABLE>
</FORM>

<p>${requestScope.confirmation}</p>

</body>
</html>