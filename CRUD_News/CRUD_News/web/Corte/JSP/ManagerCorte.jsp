<%-- 
    Document   : ManagerCorte
    Created on : Nov 10, 2016, 12:58:31 AM
    Author     : Samil
--%>

<%@page import="dao.CorteDataAccess"%>
<%@page import="model.Corte"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            String Nickname = request.getParameter("Nickname");
            int CorteID = Integer.parseInt(request.getParameter("CorteID"));
            CorteDataAccess da = new CorteDataAccess();
            da.corte(CorteID, Nickname);
            
            response.sendRedirect("/CRUD_News/allcorte");
        %>
    </body>
</html>
