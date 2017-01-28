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
        <title>Edit</title>
    </head>
    <body>
        <h1>Edit News</h1>
        <div style="width: 900px; margin-left: auto; margin-right: auto">
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
