<%-- 
    Document   : ManagerEditPost
    Created on : Aug 8, 2015, 11:10:38 PM
    Author     : Thang
--%>

<%@page import="dao.TransaccionDataAccess"%>
<%@page import="model.Transaccion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            int TransaccionID = Integer.parseInt(request.getParameter("TransaccionID"));
            String TipoTransaccion = request.getParameter("TipoTransaccion");
            String TipoPago = request.getParameter("TipoPago");
            String Nickname = request.getParameter("Nickname");
            int Monto = Integer.parseInt(request.getParameter("Monto"));
            String Comentario = request.getParameter("Comentario");
            java.sql.Date Fecha = java.sql.Date.valueOf( request.getParameter("Fecha") );
            
            TransaccionDataAccess da = new TransaccionDataAccess();
            da.edit(TransaccionID, TipoTransaccion, TipoPago, Nickname, Monto, Comentario, Fecha);
            
            response.sendRedirect("/CRUD_News/allpost");
        %>
    </body>
</html>
