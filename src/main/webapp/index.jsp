<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h1>Pizza Builder</h1>
<% if (!request.isUserInRole("user")) { %>
    <a href="/PizzaBuilder/user/login">Log In</a>
    <a href="signup.jsp">Sign Up</a>
<% } else { %>
    <p>Hello ${sessionScope.USERNAME}</p>
    <a href="/PizzaBuilder/user/profile">View Profile</a>
    <a href="/PizzaBuilder/user/forwardUsers">Build Pizza</a>
<% } %>
</body>
</html>
