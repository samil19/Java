<%-- 
    Document   : chart
    Created on : Nov 14, 2016, 5:59:28 PM
    Author     : Samil
--%>

<%@page import="dao.CorteDataAccess"%>
<%@page import="java.util.logging.Logger"%>
<%@page import="java.util.logging.Level"%>
<%@page import="java.sql.SQLException"%>
<%@page import="model.Corte"%>
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
        DefaultPieDataset data= new DefaultPieDataset();
        String sqle ="SELECT * FROM Corte";
            ResultSet rs = DBUtils.getPreparedStatement(sqle).executeQuery();
            while(rs.next()){
                Corte n= new Corte(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getString(5));
                ID=Integer.toString(rs.getInt(1));
                data.setValue(ID,rs.getInt(4));
            }
            
            
            JFreeChart grafico=ChartFactory.createPieChart("Cortes", data, true, true, true);

ChartUtilities.saveChartAsJPEG(new File("C:/Users/Samil/Documents/NetBeansProjects/CRUD_News/CRUD_News/Image/piechart.JPEG"), grafico, 500, 500);
} catch (Exception ex) {
            out.print(ex);
        }
            %>

  </body>
</html>
