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
        <link rel="shortcut icon" type="image/x-icon" href="img/yessss.png" />
        
        <link rel="icon" type="image/png" href=http://i64.tinypic.com/rsfvxg.png"/> 
        
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- Slick slider css -->
    <link href="css/skdslider.css" rel="stylesheet">
    <!-- Font awesome css -->
    <!-- smooth animate css file -->
    <link rel="stylesheet" href="css/animate.css"> 
    <!-- Main style css -->
    <link rel="stylesheet" href="style.css">
    <!-- Favicon -->
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
            
            #map {
            height: 500px;
            width: 100%;
        }
         .controls {
            margin-top: 10px;
            border: 1px solid transparent;
            border-radius: 2px 0 0 2px;
            box-sizing: border-box;
            -moz-box-sizing: border-box;
            height: 32px;
            outline: none;
            box-shadow: 0 2px 6px rgba(0, 0, 0, 0.3);
        }

        #pac-input {
            background-color: #fff;
            font-family: Roboto;
            font-size: 15px;
            font-weight: 300;
            margin-left: 12px;
            padding: 0 11px 0 13px;
            text-overflow: ellipsis;
            width: 300px;
        }

            #pac-input:focus {
                border-color: #4d90fe;
            }

        .pac-container {
            font-family: Roboto;
        }
        
        #type-selector {
            color: #fff;
            background-color: #4d90fe;
            padding: 5px 11px 0px 11px;
        }

            #type-selector label {
                font-family: Roboto;
                font-size: 13px;
                font-weight: 300;
            }
            
            
            
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
                    
                    Tipo de Transaccion<br>
                
               <select name="TipoTransaccion" style="width: 200px" required>
   <option value="Egreso">Egreso</option> 
   <option value="Ingreso">Ingreso</option> 
</select>
                
                <br>
                Tipo de Pago<br>
                
                <select name="TipoPago" style="width: 200px" required>
   <option value="Efectivo">Efectivo</option> 
   <option value="Tarjeta">Tarjeta</option>
   <option value="Paypal">Paypal</option> 
   <option value="Bitcoin">Bitcoin</option>
   <option value="Transferencia Bancaria">Transferencia Bancaria</option> 
   <option value="Cheque">Cheque</option>
   <option value="Intercambio">Intercambio</option> 
   <option value="Otro">Otro</option>
</select>
                <br>
                    
                    Nickname:<br>
                    <input type="text" value="${p.getNickname()}" name="Nickname" style="width: 200px"><br>
                    Monto:<br>
                    <input type="text" value="${p.getMonto()}" name="Monto" style="width: 200px"><br>
                    Comentario:<br>
                    <textarea name="Comentario" style="width: 400px; height: 200px">${p.getComentario()}</textarea><br>
                    Fecha:<br>
                    <input type="date" value="${p.getFecha()}" name="Fecha" style="width: 200px"><br>
                    
                    <input type="hidden" name="Latitud" id="Latitud" value="${p.getLatitud()}" required>
                
                <input type="hidden" name="Longitud" id="Longitud" value="${p.getLongitud()}" required>
                    
                    
                    
                    <input id="pac-input" class="controls" type="text" name="Direccion"
                       placeholder="Enter a location" value="${p.getDireccion()}" required>

    <div id="type-selector" class="controls">
        <input type="radio" name="type" id="changetype-all" checked="checked">
        <label for="changetype-all">All</label>

        <input type="radio" name="type" id="changetype-establishment">
        <label for="changetype-establishment">Establishments</label>

        <input type="radio" name="type" id="changetype-address">
        <label for="changetype-address">Addresses</label>
    </div>
        
        <div id="map"></div>

    <script>
    function initMap() {
        var map = new google.maps.Map(document.getElementById('map'), {
            center: { lat: 18.4723789, lng: -69.9729824 },
            zoom: 13
        });

        var input = (
        document.getElementById('pac-input'));

        var types = document.getElementById('type-selector');
        map.controls[google.maps.ControlPosition.TOP_LEFT].push(input);
        map.controls[google.maps.ControlPosition.TOP_LEFT].push(types);

        var autocomplete = new google.maps.places.Autocomplete(input);
        autocomplete.bindTo('bounds', map);

        var infowindow = new google.maps.InfoWindow();
        var marker = new google.maps.Marker({draggable: true,
            map: map,
            anchorPoint: new google.maps.Point(0, -29)
        });

        google.maps.event.addListener(marker, 'dragend', function (event) {
            document.getElementById("Latitud").value = this.getPosition().lat();
            document.getElementById("Longitud").value = this.getPosition().lng();
        });

        autocomplete.addListener('place_changed', function () {
            infowindow.close();
            marker.setVisible(false);
            var place = autocomplete.getPlace();
            if (!place.geometry) {
                window.alert("Autocomplete's returned place contains no geometry");
                return;
            }


            if (place.geometry.viewport) {
                map.fitBounds(place.geometry.viewport);
            } else {
                map.setCenter(place.geometry.location);
                map.setZoom(17);
            }
            marker.setIcon(({
                url: place.icon,
                size: new google.maps.Size(71, 71),
                origin: new google.maps.Point(0, 0),
                anchor: new google.maps.Point(17, 34),
                scaledSize: new google.maps.Size(35, 35)
            }));
            marker.setPosition(place.geometry.location);
            marker.setVisible(true);

            var address = '';
            if (place.address_components) {
                address = [
                  (place.address_components[0] && place.address_components[0].short_name || ''),
                  (place.address_components[1] && place.address_components[1].short_name || ''),
                  (place.address_components[2] && place.address_components[2].short_name || '')
                ].join(' ');
            }


            infowindow.setContent('<div><strong>' + place.name + '</strong><br>' + address);
            infowindow.open(map, marker);
});
            // Sets a listener on a radio button to change the filter type on Places
            // Autocomplete.
            function setupClickListener(id, types) {
                var radioButton = document.getElementById(id);
                radioButton.addEventListener('click', function() {
                    autocomplete.setTypes(types);
                });
            }



            setupClickListener('changetype-all', []);
            setupClickListener('changetype-address', ['address']);
            setupClickListener('changetype-establishment', ['establishment']);
            setupClickListener('changetype-geocode', ['geocode']);



        }


    </script>
    <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDLov3DZ5oTZUglO6OQ_-pDvIMZ_FsIJ_8&libraries=places&callback=initMap"
            async defer></script>
                    
                    
                    
                    
                    <input type="submit" value="Submit">
                </form>
            </c:forEach>

        </div>
    </body>
</html>
