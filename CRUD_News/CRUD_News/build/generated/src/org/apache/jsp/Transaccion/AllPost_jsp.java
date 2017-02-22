package org.apache.jsp.Transaccion;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AllPost_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <!-- Bootstrap -->\r\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- Slick slider css -->\r\n");
      out.write("    <link href=\"css/skdslider.css\" rel=\"stylesheet\">\r\n");
      out.write("    <!-- Font awesome css -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\r\n");
      out.write("    <!-- smooth animate css file -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/animate.css\"> \r\n");
      out.write("    <!-- Main style css -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\r\n");
      out.write("    <!-- Favicon -->\r\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" href=http://i64.tinypic.com/rsfvxg.png\"/> \r\n");
      out.write("    <!-- Google Fonts -->\r\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Roboto:400,300,100' rel='stylesheet' type='text/css'>  \r\n");
      out.write("    \r\n");
      out.write("        <title>All Posts</title>\r\n");
      out.write("        <div class=\"menuarea\"> \r\n");
      out.write("            <div class=\"navbar navbar-default navbar-fixed-top\" role=\"navigation\">\r\n");
      out.write("              <div class=\"container\">\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("                  <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\r\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                  </button>\r\n");
      out.write("                  <!-- For Text Logo -->\r\n");
      out.write("                 <a class=\"navbar-brand logo\" href=\"#\"><span>Fire</span>Brand</a>\r\n");
      out.write("                 <!-- For Img Logo -->\r\n");
      out.write("                  <!--  <a class=\"navbar-brand logo\" href=\"#\"><img src=\"img/logo.png\" alt=\"logo\"></a> -->\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"navbar\" class=\"navbar-collapse collapse\">\r\n");
      out.write("                  <ul class=\"nav navbar-nav navbar-right custom_nav mobnav\" >\r\n");
      out.write("                    <li><a href=\"/CRUD_News/index.html\">HOME</a></li>\r\n");
      out.write("                    <li><a href=\"/CRUD_News/index.html#featuresSection\">Graficos </a></li>\r\n");
      out.write("                    <li><a href=\"/CRUD_News/allpost\">Transacciones</a></li>\r\n");
      out.write("                    <li><a href=\"/CRUD_News/allcorte\">Corte</a></li>\r\n");
      out.write("                    <li><a href=\"/CRUD_News/allcorteinfo\">Informacion de los Cortes</a></li>\r\n");
      out.write("                    <li><a href=\"/CRUD_News/index.html#priceList\">Donaciones</a></li>\r\n");
      out.write("                    <li><a href=\"/CRUD_News/index.html#clients\">Contacto</a></li>\r\n");
      out.write("                  </ul>\r\n");
      out.write("                </div><!--/.nav-collapse -->\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body background=\"slider/asfalt.png\">\r\n");
      out.write("        <style>\r\n");
      out.write("            body{\r\n");
      out.write("                background-image: url(\"slider/asfalt.png\")\r\n");
      out.write("            }\r\n");
      out.write("            .form-style-5 {\r\n");
      out.write("           max-width: 810px;\r\n");
      out.write("    padding: 10px 20px;\r\n");
      out.write("    background: #f4f7f8;\r\n");
      out.write("    margin: 10px auto;\r\n");
      out.write("    padding: 20px;\r\n");
      out.write("    background: #f4f7f8;\r\n");
      out.write("    border-radius: 8px;\r\n");
      out.write("    font-family: Georgia, \"Times New Roman\", Times, serif;\r\n");
      out.write("            }\r\n");
      out.write("    .navbar-default {\r\n");
      out.write("    background-color: black;\r\n");
      out.write("    border-color: black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("        </style>\r\n");
      out.write("        <br>\r\n");
      out.write("        <br>\r\n");
      out.write("        <br>\r\n");
      out.write("        <br>\r\n");
      out.write("        <br>\r\n");
      out.write("        \r\n");
      out.write("       <div class=\"form-style-5\">\r\n");
      out.write("            <table cellpadding=\"10\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>Numero de Transaccion</th>\r\n");
      out.write("                    <th>Tipo de Transaccion</th>\r\n");
      out.write("                    <th>Tipo \"/n\"de Pago</th>\r\n");
      out.write("                    <th>Nickname</th>\r\n");
      out.write("                    <th>Monto</th>\r\n");
      out.write("                    <th>Comentario</th>\r\n");
      out.write("                    <th>Fecha</th>\r\n");
      out.write("                    <th>Direccion</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    <td>\r\n");
      out.write("                            <button type=\"button\"><a href=\"/CRUD_News/Transaccion/AddNew.html\">Add New</button>\r\n");
      out.write("                        </td>\r\n");
      out.write("            </table>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${AllPost}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("p");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                    <tr>\r\n");
          out.write("                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getTransaccionID()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getTipoTransaccion()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getTipoPago()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getNickname()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getMonto()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getComentario()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getFecha()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                        <td><div style=\"height:120px; overflow:hidden;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getDireccion()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</div></td>\r\n");
          out.write("                        \r\n");
          out.write("                        <td>\r\n");
          out.write("                             <button type=\"button\"><a href=\"edit?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getTransaccionID()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Edit</a></button>\r\n");
          out.write("                             <br>\r\n");
          out.write("                             <br>\r\n");
          out.write("                             <button type=\"button\"><a href=\"delete?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getTransaccionID()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Delete</a></button>\r\n");
          out.write("                        </td>\r\n");
          out.write("                    </tr>\r\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
