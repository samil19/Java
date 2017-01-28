<%-- 
    Document   : ManagerAddNew
    Created on : Aug 8, 2015, 10:38:33 PM
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
            
            
            Transaccion n = new Transaccion( TransaccionID, TipoTransaccion, TipoPago, Nickname, Monto, Comentario);
            TransaccionDataAccess da = new TransaccionDataAccess();
            da.addNew(n);
            
            response.sendRedirect("/CRUD_News/allpost");
        %>
        
    </body>
</html>
