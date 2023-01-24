<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 1/17/2023
  Time: 1:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Chi tiết</title>

    <style>
        body {
            font-family: 'open sans';
            overflow-x: hidden; }

        img {
            max-width: 100%; }

        .preview {
            display: -webkit-box;
            display: -webkit-flex;
            display: -ms-flexbox;
            display: flex;
            -webkit-box-orient: vertical;
            -webkit-box-direction: normal;
            -webkit-flex-direction: column;
            -ms-flex-direction: column;
            flex-direction: column; }
        @media screen and (max-width: 996px) {
            .preview {
                margin-bottom: 20px; } }

        .preview-pic {
            -webkit-box-flex: 1;
            -webkit-flex-grow: 1;
            -ms-flex-positive: 1;
            flex-grow: 1; }

        .preview-thumbnail.nav-tabs {
            border: none;
            margin-top: 15px; }
        .preview-thumbnail.nav-tabs li {
            width: 18%;
            margin-right: 2.5%; }
        .preview-thumbnail.nav-tabs li img {
            max-width: 100%;
            display: block; }
        .preview-thumbnail.nav-tabs li a {
            padding: 0;
            margin: 0; }
        .preview-thumbnail.nav-tabs li:last-of-type {
            margin-right: 0; }

        .tab-content {
            overflow: hidden; }
        .tab-content img {
            width: 100%;
            -webkit-animation-name: opacity;
            animation-name: opacity;
            -webkit-animation-duration: .3s;
            animation-duration: .3s; }

        .card {
            margin-top: 50px;
            background: #eee;
            padding: 3em;
            line-height: 1.5em; }

        @media screen and (min-width: 997px) {
            .wrapper {
                display: -webkit-box;
                display: -webkit-flex;
                display: -ms-flexbox;
                display: flex; } }

        .details {
            display: -webkit-box;
            display: -webkit-flex;
            display: -ms-flexbox;
            display: flex;
            -webkit-box-orient: vertical;
            -webkit-box-direction: normal;
            -webkit-flex-direction: column;
            -ms-flex-direction: column;
            flex-direction: column; }

        .colors {
            -webkit-box-flex: 1;
            -webkit-flex-grow: 1;
            -ms-flex-positive: 1;
            flex-grow: 1; }

        .product-title, .price, .sizes, .colors {
            text-transform: UPPERCASE;
            font-weight: bold; }

        .checked, .price span {
            color: #ff9f1a; }

        .product-title, .rating, .product-description, .price, .vote, .sizes {
            margin-bottom: 15px; }

        .product-title {
            margin-top: 0; }

        .size {
            margin-right: 10px; }
        .size:first-of-type {
            margin-left: 40px; }

        .color {
            display: inline-block;
            vertical-align: middle;
            margin-right: 10px;
            height: 2em;
            width: 2em;
            border-radius: 2px; }
        .color:first-of-type {
            margin-left: 20px; }

        .add-to-cart, .like {
            background: #ff9f1a;
            padding: 1.2em 1.5em;
            border: none;
            text-transform: UPPERCASE;
            font-weight: bold;
            color: #fff;
            -webkit-transition: background .3s ease;
            transition: background .3s ease; }
        .add-to-cart:hover, .like:hover {
            background: #b36800;
            color: #fff; }

        .not-available {
            text-align: center;
            line-height: 2em; }
        .not-available:before {
            font-family: fontawesome;
            content: "\f00d";
            color: #fff; }

        .orange {
            background: #ff9f1a; }

        .green {
            background: #85ad00; }

        .blue {
            background: #0076ad; }

        .black {
            background: black; }
        .white {
            background: white; }
        .red {
            background: red; }



        .tooltip-inner {
            padding: 1.3em; }

        @-webkit-keyframes opacity {
            0% {
                opacity: 0;
                -webkit-transform: scale(3);
                transform: scale(3); }
            100% {
                opacity: 1;
                -webkit-transform: scale(1);
                transform: scale(1); } }

        @keyframes opacity {
            0% {
                opacity: 0;
                -webkit-transform: scale(3);
                transform: scale(3); }
            100% {
                opacity: 1;
                -webkit-transform: scale(1);
                transform: scale(1); } }
    </style>

    <meta name="viewport" content="width=device-width, initial-scale=1">


    <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
    <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:400,700" rel="stylesheet">

</head>

<body>
<h1>hello</h1>
<%--<div class="container">--%>
<%--    <div class="card">--%>
<%--        <div class="container-fliud">--%>
<%--            <div class="wrapper row">--%>
<%--                <div class="preview col-md-6">--%>

<%--                    <div class="preview-pic tab-content">--%>
<%--                        <div class="tab-pane active" id="pic-1"><img src="${product.image}" /></div>--%>
<%--                        <div class="tab-pane" id="pic-2"><img src="http://placekitten.com/400/252" /></div>--%>
<%--                        <div class="tab-pane" id="pic-3"><img src="http://placekitten.com/400/252" /></div>--%>
<%--                        <div class="tab-pane" id="pic-4"><img src="http://placekitten.com/400/252" /></div>--%>
<%--                        <div class="tab-pane" id="pic-5"><img src="http://placekitten.com/400/252" /></div>--%>
<%--                    </div>--%>

<%--                </div>--%>
<%--                <div class="details col-md-6">--%>
<%--                    <h3 class="product-title">${product.name}</h3>--%>
<%--                    <div class="rating">--%>
<%--                        <div class="stars">--%>
<%--                            <span class="fa fa-star checked"></span>--%>
<%--                            <span class="fa fa-star checked"></span>--%>
<%--                            <span class="fa fa-star checked"></span>--%>
<%--                            <span class="fa fa-star"></span>--%>
<%--                            <span class="fa fa-star"></span>--%>
<%--                        </div>--%>
<%--                        <span class="review-no">41 reviews</span>--%>
<%--                    </div>--%>
<%--                    <p class="product-description">Thông tin</p>--%>
<%--                    <h4 class="price">Giá thành: <span>${product.price.price}</span></h4>--%>
<%--                    <h5 class="sizes">sizes:--%>

<%--                        <span class="size" data-toggle="tooltip" title="small">s</span>--%>
<%--                        <span class="size" data-toggle="tooltip" title="medium">m</span>--%>
<%--                        <span class="size" data-toggle="tooltip" title="large">l</span>--%>
<%--                        <span class="size" data-toggle="tooltip" title="xtra large">xl</span>--%>
<%--                    </h5>--%>
<%--                    <h5 class="colors">Chọn màu:--%>
<%--                        <c:forEach var="i" items="${product.amountList}">--%>
<%--                            <span class="color ${i.color}"></span>--%>
<%--                        </c:forEach>--%>
<%--                    </h5>--%>
<%--                    <div class="action">--%>
<%--                        <a href=""><button class="add-to-cart btn btn-default" type="button">add to cart</button></a>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</div>--%>
<%--        <p>${product.id}</p>--%>
<%--        <p>${product.name}</p>--%>
<%--    <img src="${product.image}" alt="">--%>
<%--    <p>${product.productType.name}</p>--%>

</body>
</html>

