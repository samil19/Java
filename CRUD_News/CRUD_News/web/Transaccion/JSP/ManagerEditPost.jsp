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
            double Monto = Integer.parseInt(request.getParameter("Monto"));
            String Comentario = request.getParameter("Comentario");
            java.sql.Date Fecha = java.sql.Date.valueOf( request.getParameter("Fecha") );
            String Drieccion = request.getParameter("Direccion");
            double Latitud = Double.parseDouble(request.getParameter("Latitud"));
            double Longitud = Double.parseDouble(request.getParameter("Longitud"));
            
            TransaccionDataAccess da = new TransaccionDataAccess();
            da.edit(TransaccionID, TipoTransaccion, TipoPago, Nickname, Monto, Comentario, Fecha, Direccion, Latitud, Longitud);
            
            response.sendRedirect("/CRUD_News/allpost");
        %>
    </body>
</html>
