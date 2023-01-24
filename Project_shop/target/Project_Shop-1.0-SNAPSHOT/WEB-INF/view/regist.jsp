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
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <style>
        .gradient-custom-3 {
            /* fallback for old browsers */
            background: #84fab0;

            /* Chrome 10-25, Safari 5.1-6 */
            background: -webkit-linear-gradient(to right, rgba(132, 250, 176, 0.5), rgba(143, 211, 244, 0.5));

            /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
            background: linear-gradient(to right, rgba(132, 250, 176, 0.5), rgba(143, 211, 244, 0.5))
        }
        .gradient-custom-4 {
            /* fallback for old browsers */
            background: #84fab0;

            /* Chrome 10-25, Safari 5.1-6 */
            background: -webkit-linear-gradient(to right, rgba(132, 250, 176, 1), rgba(143, 211, 244, 1));

            /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
            background: linear-gradient(to right, rgba(132, 250, 176, 1), rgba(143, 211, 244, 1))
        }
    </style>
</head>
<body>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.3/dist/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>


<%--        <div class="row mb-3">--%>
<%--            <label for="inputName" class="col-sm-2 col-form-label">Name</label>--%>
<%--            <div class="col-sm-10">--%>
<%--                <form:input type="text" class="form-control" id="inputName" path="userName"/>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--        <div class="row mb-3">--%>
<%--            <label for="inputName" class="col-sm-2 col-form-label">Password</label>--%>
<%--            <div class="col-sm-10">--%>
<%--                <form:input type="password" class="form-control" id="inputName" path="password"/>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--        <div class="row mb-3">--%>
<%--            <label for="inputName" class="col-sm-2 col-form-label">Email</label>--%>
<%--            <div class="col-sm-10">--%>
<%--                <form:input type="email" class="form-control" id="inputEmail" path="email"/>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--        <div class="row mb-3" hidden >--%>
<%--            <label for="inputName" class="col-sm-2 col-form-label">enable</label>--%>
<%--            <div class="col-sm-10">--%>
<%--                <form:input type="hidden"  class="form-control" id="inputEnable" path="enable" value="1"/>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--        <div class="row mb-3" hidden >--%>
<%--            <label for="inputName" class="col-sm-2 col-form-label">role</label>--%>
<%--            <div class="col-sm-10">--%>
<%--                <form:input type="hidden"  class="form-control" id="inputEnable" path="role.id" value="2"/>--%>
<%--            </div>--%>
<%--        </div>--%>


        <section class="vh-100 bg-image"
                 style="background-image: url('https://mdbcdn.b-cdn.net/img/Photos/new-templates/search-box/img4.webp');">
            <div class="mask d-flex align-items-center h-100 gradient-custom-3">
                <div class="container h-100">
                    <div class="row d-flex justify-content-center align-items-center h-100">
                        <div class="col-12 col-md-9 col-lg-7 col-xl-6">
                            <div class="card" style="border-radius: 15px;">
                                <div class="card-body p-5">
                                    <h2 class="text-uppercase text-center mb-5">Tạo Tài Khoản</h2>

                                    <form:form action="addUser" modelAttribute="user" method="get">

                                        <div class="form-outline mb-4">
                                            <label class="form-label" for="form3Example1cg">Tên Tài Khoản</label>
                                            <form:input type="text" id="form3Example1cg" class="form-control form-control-lg"  path="userName"/>
                                        </div>

                                        <div class="form-outline mb-4">
                                            <label class="form-label" for="form3Example3cg">Email</label>
                                            <form:input type="email" id="form3Example3cg" class="form-control form-control-lg"  path="email" />
                                        </div>

                                        <div class="form-outline mb-4">
                                            <label class="form-label" for="form3Example4cg">Mật khẩu</label>
                                            <form:input type="password" id="form3Example4cg" class="form-control form-control-lg" name=""  path="password" />
                                        </div>
                                        <div class="form-outline mb-4">
                                            <form:input type="hidden" id="form3Example4cg" class="form-control form-control-lg" name=""  path="enable" value="1" />

                                        </div>
                                        <div class="form-outline mb-4">
                                            <form:input type="hidden" id="form3Example4cg" class="form-control form-control-lg" name=""  path="role.id" value="2" />

                                        </div>

                                        <div class="d-flex justify-content-center">
                                            <button type="submit"
                                                    class="btn btn-success btn-block btn-lg gradient-custom-4 text-body">Đăng ký</button>
                                        </div>

                                        <p class="text-center text-muted mt-5 mb-0">Đã có tài khoản? <a href="user"
                                                                                                                class="fw-bold text-body"><u>Đăng Nhập</u></a></p>

                                    </form:form>

                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>

</body>
</html>
