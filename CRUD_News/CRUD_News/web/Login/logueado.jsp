<%-- 
    Document   : logueado
    Created on : Jan 29, 2017, 1:27:23 PM
    Author     : Samil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:forEach items="${loguear}" var="p">
                    <tr>
                        <td>${p.getMensaje()}</td>
                    </tr>
                </c:forEach>
    </body>
</html>
