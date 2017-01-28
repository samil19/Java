<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
 <head>
    <meta charset="UTF-8">
    <title>Edit Product</title>
 </head>
 <body>
 
    <jsp:include page="_header.jsp"></jsp:include>
   
 
    <h3 class="center-align">Edit Product</h3>
 
    <p style="color: red;">${errorString}</p>
 
    <c:if test="${not empty product}">
        
      <div class="container">
    <form class="  col s6" method="POST" action="doEditProduct">
      <div class="row">
        <div class="input-field col s2">
            <input type="hidden" name="code" value="${product.code}" />
         
          <h5>Código: <b>${product.code}</b></h5>
          
        </div>
        <div class="input-field col s5">
          <input id="last_name" type="text" class="validate" name="name" value="${product.name}" >
          <label for="last_name">Nombre</label>
        </div>
          <div class="input-field col s6">
          <input id="last_name" type="text" class="validate" name="price" value="${product.price}" >
          <label for="last_name">Precio</label>
        </div><br>
         </div>
            <button class="btn waves-effect waves-light deep-purple lighten-3" type="submit" value="Submit" >Actualizar
    <i class="material-icons right">send</i>
  </button>
                <a href="productList" class="waves-effect waves-light deep-purple lighten-3 btn"><i class="material-icons right">backspace</i>Cancelar</a>
             
          </form>
          </c:if>
          </div>

      </div>
    

 <br><br><br><br><br><br><br><br><br><br>
    <jsp:include page="_footer.jsp"></jsp:include>
 
 </body>
</html>