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


<h1>Find Nearby Pizza Places</h1>
<form action="/PizzaBuilder/user/nearbyPlaces" method="post">
    <p>Zip Code: </p>
    <input type="text" name="zipcode" maxlength="5">
    <p>Radius(miles): </p>
    <input type="text" name="radius" maxlength="5">
    <INPUT TYPE="SUBMIT" VALUE="Find Pizza Places">
</form>

<c:if test="${requestScope.nearbyPlaces.size()= 0}">
    <table>
        <tr><td>Name</td><td>Address</td><td>Phone</td><td>Website</td></tr>
        <c:forEach var="place" items="${requestScope.nearbyPlaces}">
            <tr>
                <td>${place.name}</td>
                <td>${place.address}</td>
                <td>${place.phone}</td>
                <td>${place.website}</td>
            </tr>
        </c:forEach>


    </table>

</c:if>
<c:if test="${requestScope.nearbyPlaces.size() == 0}">
    <p>No pizza places matching the request could be found</p>
</c:if>

<br>
<a href="pizzaBuilder.jsp">Build another pizza</a>

</body>
</html>