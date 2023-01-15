<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 01/14/23
  Time: 3:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin</title>
</head>
<body>
    <h1>Admin</h1>
    <form  action="j_spring_security_logout" method="post">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
        <input class="dropdown-item" type="submit" value="Logout" />
    </form>
</body>
</html>
