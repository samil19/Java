<%-- 
    Document   : logueado
    Created on : Jan 29, 2017, 1:27:23 PM
    Author     : Samil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="icon" type="image/png" href=http://i64.tinypic.com/rsfvxg.png"/> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Soy samil</h1>
        <c:forEach items="${logueado}" var="p">
                    <tr>
                        <h1>${p.getUserID()}</h1>
                        <h1>${p.getLoginName()}</h1>
                        <h1>${p.getPasswordHash()}</h1>
                        <h1>${p.getFirstName()}</h1>
                        <h1>${p.getLastName()}</h1>
                        <h1>${p.getEmail()}</h1>
        
                    </tr>
                </c:forEach>
    </body>
</html>
