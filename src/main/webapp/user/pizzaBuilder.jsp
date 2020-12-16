<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<body>
<p>Hello ${sessionScope.USERNAME}</p>

<table>
    <tr>
        <td>Username</td>
        <td>${requestScope.user.username}</td>
    </tr>
</table>


<h1>Select all users that are eating the pizza</h1>
<form action="/PizzaBuilder/user/buildPizza" method="post">

    <c:forEach var="user" items="${requestScope.usersList}" >
        <input type="checkbox"
        id="${user.username}"
        name="users[]"
        value="${user.username}"
        <c:if test="${requestScope.user.username == user.username}">checked</c:if>
        <label for="${user.username}"> ${user.username}</label><br>
    </c:forEach>
    <input type="submit" value="Build Pizza">

</form>
</body>
</html>