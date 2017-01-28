<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>   

<!--Import Google Icon Font-->
      <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

      <!--Import materialize.css-->
      <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>
     
      <!--Let browser know website is optimized for mobile-->
      <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    </head>

    <body>
 <nav>
    <div class="nav-wrapper  deep-purple lighten-3" style="padding-left:5px;padding-right: 5px;">
        <a href="#!" class="brand-logo-container"><img  src="images/logo-lproducts.png"  height="60"></a>
      <ul class="right hide-on-med-and-down">
        <li><a href="${pageContext.request.contextPath}/home">
<i class="material-icons left">home</i>home</a></li>
        <li> <a href="${pageContext.request.contextPath}/productList"><i class="material-icons right">view_module</i>Productos</a></li>
        <li> <a href="${pageContext.request.contextPath}/userInfo"><i class="material-icons right">accessibility</i>Info User</a></li>
        
        <li>Welcome: <b>${loginedUser.userName}</b></li>
      </ul>
    </div>
  </nav>
 
   
   <!--Import jQuery before materialize.js-->
      <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
      <script type="text/javascript" src="js/materialize.min.js"></script>