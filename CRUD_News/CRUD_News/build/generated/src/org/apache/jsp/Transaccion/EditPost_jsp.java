package org.apache.jsp.Transaccion;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class EditPost_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- Slick slider css -->\n");
      out.write("    <link href=\"css/skdslider.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- Font awesome css -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\n");
      out.write("    <!-- smooth animate css file -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/animate.css\"> \n");
      out.write("    <!-- Main style css -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("    <!-- Favicon -->\n");
      out.write("    <link rel=\"shortcut icon\" type=\"image/png\" href=\"img/favicon.png\"/>\n");
      out.write("    <!-- Google Fonts -->\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Roboto:400,300,100' rel='stylesheet' type='text/css'>  \n");
      out.write("    \n");
      out.write("        <title>All Posts</title>\n");
      out.write("        <div class=\"menuarea\"> \n");
      out.write("            <div class=\"navbar navbar-default navbar-fixed-top\" role=\"navigation\">\n");
      out.write("              <div class=\"container\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                  <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                  </button>\n");
      out.write("                  <!-- For Text Logo -->\n");
      out.write("                 <a class=\"navbar-brand logo\" href=\"#\"><span>Fire</span>Brand</a>\n");
      out.write("                 <!-- For Img Logo -->\n");
      out.write("                  <!--  <a class=\"navbar-brand logo\" href=\"#\"><img src=\"img/logo.png\" alt=\"logo\"></a> -->\n");
      out.write("                </div>\n");
      out.write("                <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("                  <ul class=\"nav navbar-nav navbar-right custom_nav mobnav\" >\n");
      out.write("                    <li><a href=\"/CRUD_News/index.html\">HOME</a></li>\n");
      out.write("                    <li><a href=\"/CRUD_News/index.html#featuresSection\">Graficos </a></li>\n");
      out.write("                    <li><a href=\"/CRUD_News/allpost\">Transacciones</a></li>\n");
      out.write("                    <li><a href=\"/CRUD_News/allcorte\">Corte</a></li>\n");
      out.write("                    <li><a href=\"/CRUD_News/allcorteinfo\">Informacion de los Cortes</a></li>\n");
      out.write("                    <li><a href=\"/CRUD_News/index.html#priceList\">Donaciones</a></li>\n");
      out.write("                    <li><a href=\"/CRUD_News/index.html#clients\">Contacto</a></li>\n");
      out.write("                  </ul>\n");
      out.write("                </div><!--/.nav-collapse -->\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"slider/asfalt.png\">\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-image: url(\"slider/asfalt.png\")\n");
      out.write("            }\n");
      out.write("            .form-style-5 {\n");
      out.write("           max-width: 750px;\n");
      out.write("    padding: 10px 20px;\n");
      out.write("    background: #f4f7f8;\n");
      out.write("    margin: 10px auto;\n");
      out.write("    padding: 20px;\n");
      out.write("    background: #f4f7f8;\n");
      out.write("    border-radius: 8px;\n");
      out.write("    font-family: Georgia, \"Times New Roman\", Times, serif;\n");
      out.write("    .navbar-default {\n");
      out.write("    background-color: black;\n");
      out.write("    border-color: black;\n");
      out.write("}\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        <h1>Editar Transaccion</h1>\n");
      out.write("         <div class=\"form-style-5\">\n");
      out.write("            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${getNewsById}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("p");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                <form action=\"Transaccion/JSP/ManagerEditPost.jsp\" method=\"post\">\n");
          out.write("                    <input type=\"hidden\" name=\"TransaccionID\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getTransaccionID()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                    TipoTransaccion:<br>\n");
          out.write("                    <input type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getTipoTransaccion()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" name=\"TipoTransaccion\" style=\"width: 200px\"><br>\n");
          out.write("                    TipoPago<br>\n");
          out.write("                    <input type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getTipoPago()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" name=\"TipoPago\" style=\"width: 200px\"><br>\n");
          out.write("                    Nickname:<br>\n");
          out.write("                    <input type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getNickname()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" name=\"Nickname\" style=\"width: 200px\"><br>\n");
          out.write("                    Monto:<br>\n");
          out.write("                    <input type=\"text\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getMonto()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" name=\"Monto\" style=\"width: 200px\"><br>\n");
          out.write("                    Comentario:<br>\n");
          out.write("                    <textarea name=\"Comentario\" style=\"width: 400px; height: 200px\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getComentario()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</textarea><br>\n");
          out.write("                    \n");
          out.write("                    <input type=\"submit\" value=\"Submit\">\n");
          out.write("                </form>\n");
          out.write("            ");
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