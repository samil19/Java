package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.jfree.data.category.DefaultCategoryDataset;
import dao.CorteDataAccess;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.sql.SQLException;
import model.Transaccion;
import java.sql.ResultSet;
import db.DBUtils;
import java.util.LinkedList;
import java.util.List;
import java.io.*;
import org.jfree.chart.*;
import org.jfree.chart.plot.*;
import org.jfree.data.general.*;

public final class barras_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<property name=\"java.target\" value=\"1.6\" />\n");
      out.write("<property name=\"java.source\" value=\"1.6\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("        ");
              
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
            
      out.write("\n");
      out.write("\n");
      out.write("  </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
