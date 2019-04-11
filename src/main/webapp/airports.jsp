<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: marcin
  Date: 10/04/19
  Time: 22:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="servlet02">
    <div>
        <label for="departureAirport">Departure Airport:</label>
        <select id="departureAirport" name="departureAirport">
            <c:forEach items="${airports}" var="airport">
                <option value="${airport.name}">${airport.name}</option>
            </c:forEach>
        </select>
    </div>

    <div>
        <label for="arrivalAirport">Arrival Airport:</label>
        <select id="arrivalAirport" name="arrivalAirport">
            <c:forEach items="${airports}" var="airport">
                <option value="${airport.name}">${airport.name}</option>
            </c:forEach>
        </select>
    </div>

    <div>
        <label for="startTime">Start time:</label>
        <input type="datetime-local" id="startTime" name="startTime"/>
    </div>

    <div>
        <label for="flightLength">Flight length:</label>
        <input type="number" id="flightLength" name="flightLength" min="0" step="1"/>
    </div>

    <div>
        <label for="price">Price:</label>
        <input type="number" id="price" name="price" min="0" step="0.01"/>
    </div>

    <button type="submit">send</button>
</form>


</body>
</html>
