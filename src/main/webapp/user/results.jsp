<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<body>
<p>Hello ${sessionScope.USERNAME}</p>


<h1>Your pizza</h1>

<c:forEach var="topping" items="${requestScope.pizza.toppings}" >
    <p>${topping.topping}</p>
</c:forEach>

<br>
<a href="pizzaBuilder.jsp">Build another pizza</a>

</body>
</html>