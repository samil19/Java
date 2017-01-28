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
        <title>All Posts</title>
    </head>
    <body>
        <div style="width: 1200px; margin-left: auto; margin-right: auto;">
            <table cellpadding="10">
                <tr>
                    <th>Transaccion ID</th>
                    <th>Tipo de Transaccion</th>
                    <th>Tipo de Pago</th>
                    <th>Nickname</th>
                    <th>Monto</th>
                    <th>Comentario</th>
                    <th></th>
                </tr>
                <c:forEach items="${AllPost}" var="p">
                    <tr>
                        <td>${p.getTransaccionID()}</td>
                        <td>${p.getTipoTransaccion()}</td>
                        <td>${p.getTipoPago()}</td>
                        <td>${p.getNickname()}</td>
                        <td>${p.getMonto()}</td>
                        <td>${p.getComentario()}</td>
                        <td>
                            <a href="edit?id=${p.getTransaccionID()}">Edit</a>
                            <a href="delete?id=${p.getTransaccionID()}">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
                    <td>
                            <button type="button"><a href="/CRUD_News/Transaccion/AddNew.html">Add New</button>
                            <button type="button"><a href="/CRUD_News/index.html">Go home</button>
                        </td>
            </table>
        </div>
    </body>
</html>
