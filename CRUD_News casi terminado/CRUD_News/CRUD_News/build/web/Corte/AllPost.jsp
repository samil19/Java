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
                    <th>Corte ID</th>
                    <th>Cantidad Egresos</th>
                    <th>Cantidad Ingresos</th>
                    <th>Corte</th>
                    <th>Nickname</th>
                    <th></th>
                    <th></th>
                </tr>
                <c:forEach items="${AllPost}" var="p">
                    <tr>
                        <td>${p.getCorteID()}</td>
                        <td>${p.getCantidadEgresos()}</td>
                        <td>${p.getCantidadIngresos()}</td>
                        <td>${p.getCorte()}</td>
                        <td>${p.getNickname()}</td>
                        
                        <td>
                            
                            
                        </td>
                    </tr>
                </c:forEach>
                    <td>
                            <button type="button"><a href="/CRUD_News/Corte/AddNew.html">Add New</button>
                            <button type="button"><a href="/CRUD_News/index.html">Go home</button>
                        </td>
            </table>
        </div>
    </body>
</html>
