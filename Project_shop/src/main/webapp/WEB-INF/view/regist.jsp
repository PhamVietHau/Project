<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 01/15/23
  Time: 2:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Regist</title>
    <script src="https://kit.fontawesome.com/ff8e40a58b.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

</head>
<body>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.3/dist/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

    <form:form modelAttribute="user" action="addUser" method="get">
        <div class="row mb-3">
            <label for="inputName" class="col-sm-2 col-form-label">Name</label>
            <div class="col-sm-10">
                <form:input type="text" class="form-control" id="inputName" path="userName"/>
            </div>
        </div>
        <div class="row mb-3">
            <label for="inputName" class="col-sm-2 col-form-label">Password</label>
            <div class="col-sm-10">
                <form:input type="password" class="form-control" id="inputName" path="password"/>
            </div>
        </div>
        <div class="row mb-3">
            <label for="inputName" class="col-sm-2 col-form-label">Email</label>
            <div class="col-sm-10">
                <form:input type="email" class="form-control" id="inputEmail" path="email"/>
            </div>
        </div>
        <div class="row mb-3" hidden >
            <label for="inputName" class="col-sm-2 col-form-label">role</label>
            <div class="col-sm-10">
                <form:input type="hidden"  class="form-control" id="inputName" path="role" value="2"/>
            </div>
        </div>



        <button type="submit" class="btn btn-primary">Đăng Ký</button>
    </form:form>
</body>
</html>
