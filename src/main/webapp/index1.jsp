<%--
  Created by IntelliJ IDEA.
  User: marcin
  Date: 08/04/19
  Time: 20:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>Wybrany autor ${empty param.author? 'brak' : param.author}</p>
</body>
</html>
