<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<!DOCTYPE html>
<html>
 <head>
    <meta charset="UTF-8">
    <title>Create Product</title>
 </head>
 <body>
 
    <jsp:include page="_header.jsp"></jsp:include>
    
    
    <h3 class="center-align">Create Product</h3>
    <div class="container">
    <p style="color: red;">${errorString}</p>
     

    
      <div class="container">
    <form class="  col s8" method="POST" action="doCreateProduct">
      <div class="row">
        <div class="input-field col s4">
          <input id="first_name" type="text" class="validate" name="code" value="${product.code}">
          <label for="first_name">Codigo</label>
        </div>
        <div class="input-field col s8">
          <input id="last_name" type="text" class="validate" name="name" value="${product.name}" >
          <label for="last_name">Nombre</label>
        </div>
          <div class="input-field col s5">
          <input id="last_name" type="text" class="validate" value="${product.price}" >
          <label for="last_name">Precio</label>
        </div><br>
         </div>
            <button class="btn waves-effect waves-light deep-purple lighten-3" type="submit" value="Submit" >Crear
    <i class="material-icons right">send</i>
  </button>
                <a href="productList" class="waves-effect waves-light deep-purple lighten-3 btn"><i class="material-icons right">backspace</i>Cancelar</a>
             
          </form>
          </div>

      </div>
    </div>
    <br><br
        <br><br>
    <br><br>
    <br><br>
    <br><br>
    <br>
    
    <jsp:include page="_footer.jsp"></jsp:include>
    
 </body>
</html>