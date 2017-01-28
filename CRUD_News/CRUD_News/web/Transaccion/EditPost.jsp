<%-- 
    Document   : EditPost
    Created on : Aug 8, 2015, 11:08:34 PM
    Author     : Thang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- Slick slider css -->
    <link href="css/skdslider.css" rel="stylesheet">
    <!-- Font awesome css -->
    <link rel="stylesheet" href="css/font-awesome.min.css">
    <!-- smooth animate css file -->
    <link rel="stylesheet" href="css/animate.css"> 
    <!-- Main style css -->
    <link rel="stylesheet" href="style.css">
    <!-- Favicon -->
    <link rel="shortcut icon" type="image/png" href="img/favicon.png"/>
    <!-- Google Fonts -->
    <link href='http://fonts.googleapis.com/css?family=Roboto:400,300,100' rel='stylesheet' type='text/css'>  
    
        <title>All Posts</title>
        <div class="menuarea"> 
            <div class="navbar navbar-default navbar-fixed-top" role="navigation">
              <div class="container">
                <div class="navbar-header">
                  <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                  </button>
                  <!-- For Text Logo -->
                 <a class="navbar-brand logo" href="#"><span>Fire</span>Brand</a>
                 <!-- For Img Logo -->
                  <!--  <a class="navbar-brand logo" href="#"><img src="img/logo.png" alt="logo"></a> -->
                </div>
                <div id="navbar" class="navbar-collapse collapse">
                  <ul class="nav navbar-nav navbar-right custom_nav mobnav" >
                    <li><a href="/CRUD_News/index.html">HOME</a></li>
                    <li><a href="/CRUD_News/index.html#featuresSection">Graficos </a></li>
                    <li><a href="/CRUD_News/allpost">Transacciones</a></li>
                    <li><a href="/CRUD_News/allcorte">Corte</a></li>
                    <li><a href="/CRUD_News/allcorteinfo">Informacion de los Cortes</a></li>
                    <li><a href="/CRUD_News/index.html#priceList">Donaciones</a></li>
                    <li><a href="/CRUD_News/index.html#clients">Contacto</a></li>
                  </ul>
                </div><!--/.nav-collapse -->
              </div>
            </div>
          </div>
    </head>
    <body background="slider/asfalt.png">
        <style>
            body{
                background-image: url("slider/asfalt.png")
            }
            .form-style-5 {
           max-width: 750px;
    padding: 10px 20px;
    background: #f4f7f8;
    margin: 10px auto;
    padding: 20px;
    background: #f4f7f8;
    border-radius: 8px;
    font-family: Georgia, "Times New Roman", Times, serif;
    .navbar-default {
    background-color: black;
    border-color: black;
}
            }
            
            

        </style>
        <br>
        <br>
        <br>
        
        <h1>Editar Transaccion</h1>
         <div class="form-style-5">
            <c:forEach items="${getNewsById}" var="p">
                <form action="Transaccion/JSP/ManagerEditPost.jsp" method="post">
                    <input type="hidden" name="TransaccionID" value="${p.getTransaccionID()}">
                    TipoTransaccion:<br>
                    <input type="text" value="${p.getTipoTransaccion()}" name="TipoTransaccion" style="width: 200px"><br>
                    TipoPago<br>
                    <input type="text" value="${p.getTipoPago()}" name="TipoPago" style="width: 200px"><br>
                    Nickname:<br>
                    <input type="text" value="${p.getNickname()}" name="Nickname" style="width: 200px"><br>
                    Monto:<br>
                    <input type="text" value="${p.getMonto()}" name="Monto" style="width: 200px"><br>
                    Comentario:<br>
                    <textarea name="Comentario" style="width: 400px; height: 200px">${p.getComentario()}</textarea><br>
                    
                    <input type="submit" value="Submit">
                </form>
            </c:forEach>

        </div>
    </body>
</html>
