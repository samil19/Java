<%-- 
    Document   : chart
    Created on : Nov 14, 2016, 5:59:28 PM
    Author     : Samil
--%>

<%@page import="org.jfree.data.category.DefaultCategoryDataset"%>
<%@page import="dao.CorteDataAccess"%>
<%@page import="java.util.logging.Logger"%>
<%@page import="java.util.logging.Level"%>
<%@page import="java.sql.SQLException"%>
<%@page import="model.Transaccion"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="db.DBUtils"%>
<%@page import="java.util.LinkedList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.io.*"%>
<%@page import="org.jfree.chart.*"%>
<%@page import="org.jfree.chart.plot.*"%>
<%@page import="org.jfree.data.general.*"%>
<property name="java.target" value="1.6" />
<property name="java.source" value="1.6" />


        
        <%              
              try {
                  String ID;
        DefaultCategoryDataset data= new DefaultCategoryDataset();
        String sqle ="SELECT * FROM Transaccion";
            ResultSet rs = DBUtils.getPreparedStatement(sqle).executeQuery();
            while(rs.next()){
                Transaccion n= new Transaccion(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6));
                ID=Integer.toString(rs.getInt(1));
                data.setValue(rs.getInt(5), rs.getString(2), rs.getString(2)+"= "+rs.getInt(5));
            }
            
            
            JFreeChart grafico=ChartFactory.createBarChart("Transacciones", "Tipos de Transacciones", "Estadistica",data,PlotOrientation.VERTICAL, true,true,true);

ChartUtilities.saveChartAsJPEG(new File("C:/Users/Samil/Documents/NetBeansProjects/CRUD_News/CRUD_News/web/img/barchart.png"), grafico, 500, 500);
} catch (Exception ex) {
            out.print(ex);
        }
              String redirectURL = "http://localhost:8080/CRUD_News/index.html#featuresSection";
    response.sendRedirect(redirectURL);
            %>

  </body>
</html>
