<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<body>
<h1>Your Liked Toppings</h1>
<form action="/PizzaBuilder/updateLikedToppings" method="post">

        <c:forEach var="topping" items="${requestScope.allToppings}" >
            <input type="checkbox"
                   id="${topping}"
                   name="toppings[]"
                   value="${topping}"
                   <c:forEach var="likedTopping" items="${requestScope.likedToppings}">
                       <c:if test="${likedTopping == topping}">checked</c:if>
                   </c:forEach>
            <label for="${topping}"> ${topping}</label><br>
        </c:forEach>
        <input type="submit" value="Update Liked Toppings">

</form>

<p><a href="../index.jsp">back to home page</a> </p>

</body>
</html>