<%-- 
    Document   : AllPost
    Created on : Aug 8, 2015, 10:44:55 PM
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
    <link rel="icon" type="image/png" href=http://i64.tinypic.com/rsfvxg.png"/> 
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
           max-width: 810px;
    padding: 10px 20px;
    background: #f4f7f8;
    margin: 10px auto;
    padding: 20px;
    background: #f4f7f8;
    border-radius: 8px;
    font-family: Georgia, "Times New Roman", Times, serif;
            }
    .navbar-default {
    background-color: black;
    border-color: black;
}

            
            

            
            

        </style>
        <br>
        <br>
        <br>
        <br>
        <br>
        
       <div class="form-style-5">
            <table cellpadding="10">
                <tr>
                    <th>Numero de Transaccion</th>
                    <th>Tipo de Transaccion</th>
                    <th>Tipo de&nbspPago</th>
                    <th>Nickname</th>
                    <th>Monto</th>
                    <th>Comentario</th>
                    <th>Fecha</th>
                    <th>Direccion</th>
                </tr>
                <c:forEach items="${AllPost}" var="p">
                    <tr>
                        <td>${p.getTransaccionID()}</td>
                        <td>${p.getTipoTransaccion()}</td>
                        <td>${p.getTipoPago()}</td>
                        <td>${p.getNickname()}</td>
                        <td>${p.getMonto()}</td>
                        <td>${p.getComentario()}</td>
                        <td>${p.getFecha()}</td>
                        <td><div style="height:120px; overflow:hidden;">${p.getDireccion()}</div></td>
                        
                        <td>
                             <button type="button"><a href="edit?id=${p.getTransaccionID()}">Edit</a></button>
                             <br>
                             <br>
                             <button type="button"><a href="delete?id=${p.getTransaccionID()}">Delete</a></button>
                        </td>
                    </tr>
                </c:forEach>
                    <td>
                            <button type="button"><a href="/CRUD_News/Transaccion/AddNew.html">Add New</button>
                        </td>
            </table>
        </div>
    </body>
</html>
