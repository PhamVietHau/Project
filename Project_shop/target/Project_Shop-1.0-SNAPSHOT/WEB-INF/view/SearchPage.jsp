<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 01/26/23
  Time: 8:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search</title>
    <style>
        a{
            text-decoration: none;

        }

        .card-deck a:hover{
            text-decoration: none;
        }

        img{
            max-width: 100%;
        }

        .carousel-inner .top-70{
            top: 70%;
        }

        .padding-rl-7px{
            padding: 0 7px;
        }

        .padding-7px{
            padding: 7px;
        }

        .container{
            width: 100%;
            padding-right: 15px;
            padding-left: 15px;
            margin-right: auto;
            margin-left: auto;
        }





        *{
            box-sizing: border-box;
        }
        body{
            color: grey;
        }
        #sidebar{
            width: 20%;
            padding: 10px;
            margin: 0;
            float: left;
        }
        #products{
            width: 80%;
            padding: 10px;
            margin: 0;
            float: right;
        }
        ul{
            list-style: none;
            padding: 5px;
        }
        li a{
            color: darkgray;
            text-decoration: none;
        }
        li a:hover{
            text-decoration: none;
            color: darksalmon;
        }
        .fa-circle{
            font-size: 20px;
        }
        #red{
            color: #e94545d7;
        }
        #teal{
            color: rgb(69, 129, 129);
        }
        #blue{
            color: #0000ff;
        }
        .card{
            width: 250px;
            display: inline-block;
            height: 300px;
        }
        .card-img-top{
            width: 250px;
            height: 210px;
        }
        .card-body p{
            margin: 2px;
        }
        .card-body{
            padding: 0;
            padding-left: 2px;
        }
        .filter{
            display: none;
            padding: 0;
            margin: 0;
        }

        @media(min-width:991px){
            .navbar-nav{
                margin-left: 35%;
            }
            .nav-item{
                padding-left: 20px;
            }
            .card{
                width: 190px;
                display: inline-block;
                height: 300px;
            }
            .card-img-top{
                width: 188px;
                height: 210px;
            }
            #mobile-filter{
                display: none;
            }
        }
        @media(min-width:768px) and (max-width:991px){
            .navbar-nav{
                margin-left: 20%;
            }
            .nav-item{
                padding-left: 10px;
            }
            .card{
                width: 230px;
                display: inline-block;
                height: 300px;
                margin-bottom: 10px;
            }
            .card-img-top{
                width: 230px;
                height: 210px;
            }
            #mobile-filter{
                display: none;
            }
        }
        @media(min-width:568px) and (max-width:767px){
            .navbar-nav{
                margin-left: 20%;
            }
            .nav-item{
                padding-left: 10px;
            }
            .card{
                width: 205px;
                display: inline-block;
                height: 300px;
                margin-bottom: 10px;
            }
            .card-img-top{
                width: 203px;
                height: 210px;
            }
            .fa-circle{
                font-size: 15px;
            }
            #mobile-filter{
                display: none;
            }
        }
        @media(max-width:567px){
            .navbar-nav{
                margin-left: 0%;
            }
            .nav-item{
                padding-left: 10px;
            }
            #sidebar{
                width: 100%;
                padding: 10px;
                margin: 0;
                float: left;
            }
            #products{
                width: 100%;
                padding: 5px;
                margin: 0;
                float: right;
            }
            .card{
                width: 230px;
                display: inline-block;
                height: 300px;
                margin-bottom: 10px;
                margin-top: 10px;
            }
            .card-img-top{
                width: 230px;
                height: 210px;
            }
            .list-group-item{
                padding: 3px;
            }
            .offset-1{
                margin-left: 8%;
            }
            .filter{
                display: block;
                margin-left: 70%;
                margin-top: 2%;
            }
            #sidebar{
                display: none;
            }
            #mobile-filter{
                padding: 10px;
            }
        }
    </style>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

    <script src="https://kit.fontawesome.com/ff8e40a58b.js" crossorigin="anonymous"></script>



</head>
<body style="overflow-x: hidden">
<%--<nav class="navbar navbar-expand-sm navbar-light bg-white border-bottom">--%>
<%--    <a class="navbar-brand ml-2 font-weight-bold" href="#">FORCEPAUSED</a>--%>
<%--    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor" aria-controls="navbarColor" aria-expanded="false" aria-label="Toggle navigation">--%>
<%--        <span class="navbar-toggler-icon"></span>--%>
<%--    </button>--%>
<%--    <div class="collapse navbar-collapse" id="navbarColor">--%>
<%--        <ul class="navbar-nav">--%>
<%--            <li class="nav-item"><a class="nav-link" href="#">Women's</a> </li>--%>
<%--            <li class="nav-item"><a class="nav-link" href="#">Men's</a> </li>--%>
<%--            <li class="nav-item "><a class="nav-link" href="#">Home</a> </li>--%>
<%--            <li class="nav-item "><a class="nav-link" href="#">Sale</a> </li>--%>
<%--        </ul>--%>
<%--    </div>--%>
<%--    </div>--%>
<%--</nav>--%>
<%--<div class="filter">--%>
<%--    <button class="btn btn-default" type="button" data-toggle="collapse" data-target="#mobile-filter" aria-expanded="false" aria-controls="mobile-filter">Filters<span class="fa fa-filter pl-1"></span></button>--%>
<%--</div>--%>
<%--<div id="mobile-filter">--%>
<%--    <div>--%>
<%--        <h6 class="p-1 border-bottom">Home Furniture</h6>--%>
<%--        <ul>--%>
<%--            <li><a href="#">Áo</a></li>--%>
<%--            <li><a href="#">Quần</a></li>--%>
<%--        </ul>--%>
<%--    </div>--%>
<%--    <div>--%>
<%--        <h6 class="p-1 border-bottom">Tìm theo: </h6>--%>
<%--        <p class="mb-2">Size</p>--%>
<%--        <ul class="list-group">--%>
<%--            <li class="list-group-item list-group-item-action mb-2 rounded"><a href="#">--%>
<%--                <span class="fa fa-circle pr-1" ></span>XS--%>
<%--            </a></li>--%>
<%--            <li class="list-group-item list-group-item-action mb-2 rounded"><a href="#">--%>
<%--                <span class="fa fa-circle pr-1" ></span>S--%>
<%--            </a></li>--%>
<%--            <li class="list-group-item list-group-item-action mb-2 rounded"><a href="#">--%>
<%--                <span class="fa fa-circle pr-1" ></span>M--%>
<%--            </a></li>--%>
<%--            <li class="list-group-item list-group-item-action mb-2 rounded"><a href="#">--%>
<%--                <span class="fa fa-circle pr-1" ></span>L--%>
<%--            </a></li>--%>
<%--            <li class="list-group-item list-group-item-action mb-2 rounded"><a href="#">--%>
<%--                <span class="fa fa-circle pr-1" ></span>XL--%>
<%--            </a></li>--%>
<%--            <li class="list-group-item list-group-item-action mb-2 rounded"><a href="#">--%>
<%--                <span class="fa fa-circle pr-1" ></span>XXL--%>
<%--            </a></li>--%>
<%--        </ul>--%>
<%--    </div>--%>

<%--</div>--%>
<%--<section id="sidebar">--%>
<%--    <div>--%>
<%--        <h6 class="p-1 border-bottom">Home Furniture</h6>--%>
<%--        <ul>--%>
<%--            <li><a href="#">Living</a></li>--%>
<%--            <li><a href="#">Dining</a></li>--%>
<%--            <li><a href="#">Office</a></li>--%>
<%--            <li><a href="#">Bedroom</a></li>--%>
<%--            <li><a href="#">Kitchen</a></li>--%>
<%--        </ul>--%>
<%--    </div>--%>
<%--    <div>--%>
<%--        <h6 class="p-1 border-bottom">Tìm theo: </h6>--%>
<%--        <p class="mb-2">Size</p>--%>
<%--        <ul class="list-group">--%>
<%--            <li class="list-group-item list-group-item-action mb-2 rounded"><a href="#">--%>
<%--                <span class="fa fa-circle pr-1" ></span>XS--%>
<%--            </a></li>--%>
<%--            <li class="list-group-item list-group-item-action mb-2 rounded"><a href="#">--%>
<%--                <span class="fa fa-circle pr-1" ></span>S--%>
<%--            </a></li>--%>
<%--            <li class="list-group-item list-group-item-action mb-2 rounded"><a href="#">--%>
<%--                <span class="fa fa-circle pr-1" ></span>M--%>
<%--            </a></li>--%>
<%--            <li class="list-group-item list-group-item-action mb-2 rounded"><a href="#">--%>
<%--                <span class="fa fa-circle pr-1" ></span>L--%>
<%--            </a></li>--%>
<%--            <li class="list-group-item list-group-item-action mb-2 rounded"><a href="#">--%>
<%--                <span class="fa fa-circle pr-1" ></span>XL--%>
<%--            </a></li>--%>
<%--            <li class="list-group-item list-group-item-action mb-2 rounded"><a href="#">--%>
<%--                <span class="fa fa-circle pr-1" ></span>XXL--%>
<%--            </a></li>--%>
<%--        </ul>--%>
<%--    </div>--%>
<%--        <h6>Type</h6>--%>
<%--        <form class="ml-md-2">--%>
<%--            <div class="form-inline border rounded p-sm-2 my-2">--%>
<%--                <input type="radio" name="type" id="boring">--%>
<%--                <label for="boring" class="pl-1 pt-sm-0 pt-1">Boring</label>--%>
<%--            </div>--%>
<%--            <div class="form-inline border rounded p-sm-2 my-2">--%>
<%--                <input type="radio" name="type" id="ugly">--%>
<%--                <label for="ugly" class="pl-1 pt-sm-0 pt-1">Ugly</label>--%>
<%--            </div>--%>
<%--            <div class="form-inline border rounded p-md-2 p-sm-1">--%>
<%--                <input type="radio" name="type" id="notugly">--%>
<%--                <label for="notugly" class="pl-1 pt-sm-0 pt-1">Not Ugly</label>--%>
<%--            </div>--%>
<%--        </form>--%>
<%--    </div>--%>
<%--</section>--%>
<%--<section id="products">--%>
<%--    <div class="container">--%>
<%--        <div class="row">--%>
<%--            <div class="col-lg-3 col-sm-4 col-11 offset-sm-0 offset-1">--%>
<%--                <div class="card">--%>
<%--                    <img class="card-img-top" src="https://images.pexels.com/photos/963486/pexels-photo-963486.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500" alt="Card image cap">--%>
<%--                    <div class="card-body">--%>
<%--                        <p class="card-text">Wooden chair with legs</p>--%>
<%--                        <p>$90</p>--%>
<%--                        <span class="fa fa-circle" ></span>--%>

<%--                    </div>--%>
<%--                </div>--%>
<%--            </div>--%>

<%--            <div class="col-lg-3 col-sm-4 offset-lg-0 offset-sm-2 col-11 offset-1">--%>
<%--                <div class="card">--%>
<%--                    <img class="card-img-top" src="https://images.pexels.com/photos/3773571/pexels-photo-3773571.png?auto=compress&cs=tinysrgb&dpr=1&w=500" alt="Card image cap">--%>
<%--                    <div class="card-body">--%>
<%--                        <p class="card-text">Modern Dining Table</p>--%>
<%--                        <p>$740</p>--%>
<%--                        <span class="fa fa-circle"></span>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--            </div>--%>


<%--        </div>--%>
<%--    </div>--%>
<%--</section>--%>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.3/dist/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>

<div class="card-deck" style="padding: 0 10%;">
    <c:forEach var="i" items="${products}">
        <a href="product/product_detail?id=${i.id}" style="color: black;">
            <div class="col-md" >
                <div class="view overlay zoom">
                    <img src="${i.image}" class="img-fluid " alt="smaple image">
                </div>
                <div class="top-content">
                    <h5>${i.name}</h5>
                    <p class="dollar"><span class="in-dollar">₫</span><span>${i.price.price}</span></p>
                    <div class="white">
                        <a href="#" class="btn btn-primary" ><i class="fa fa-cart-plus" aria-hidden="true"></i> Thêm vào giỏ</a>
                        <div class="clearfix"></div>
                    </div>
                </div>
            </div>
        </a>
    </c:forEach>
</div>

</body>
</html>
