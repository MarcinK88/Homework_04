<%--
  Created by IntelliJ IDEA.
  User: marcin
  Date: 08/04/19
  Time: 20:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach begin="2" end="10" step="2" var="iterator">
    ${iterator}<br/>
</c:forEach>

</body>
</html>
