<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<!DOCTYPE html>
<html>
 <head>
    <meta charset="UTF-8">
    <title>Product List</title>
 </head>
 <body>
 
    <jsp:include page="_header.jsp"></jsp:include>
    
 <div class="container">
     <h3 class="center-align">Product List</h3><br>
    
    <p style="color: red;">${errorString}</p>
 <a href="createProduct" class=" btn-floating btn-large waves-effect waves-light deep-purple lighten-3"><i class="material-icons">add</i></a>
 <table class="striped" border="1" cellpadding="5" cellspacing="1" >
       <thead>
          <tr>
          <th>Code</th>
          <th>Name</th>
          <th>Price</th>
          <th>Edit</th>
          <th>Delete</th>
           </tr>
       </thead>
         <tbody>
       <c:forEach items="${productList}" var="product" >
          <tr>
             <td>${product.code}</td>
             <td>${product.name}</td>
             <td>$${product.price}</td>
             <td>
                <a href="editProduct?code=${product.code}"><i class="material-icons deep-purple-text text-lighten-3">mode_edit</i></a>
             </td>
             <td>
                <a href="deleteProduct?code=${product.code}"><i class="material-icons deep-purple-text text-lighten-3">delete</i></a>
             </td>
          </tr>
       </c:forEach>
          </tbody>
    </table>
 
    
    </div>
 <br><br><br>
    <jsp:include page="_footer.jsp"></jsp:include>
 
 </body>
</html>