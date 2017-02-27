package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <title>FireBrand : Home</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap -->\n");
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
      out.write("    <link rel=\"icon\" type=\"image/png\" href=http://i64.tinypic.com/rsfvxg.png\"/> \n");
      out.write("    <!-- Google Fonts -->\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Roboto:400,300,100' rel='stylesheet' type='text/css'>     \n");
      out.write("   \n");
      out.write("    \n");
      out.write("\n");
      out.write("    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("  <!-- BEGAIN PRELOADER -->\n");
      out.write("  <div id=\"preloader\">\n");
      out.write("    <div id=\"status\">&nbsp;</div>\n");
      out.write("  </div>\n");
      out.write("  <!-- END PRELOADER -->\n");
      out.write("\n");
      out.write("  <!-- START HEADER SECTION -->\n");
      out.write("  <header id=\"headerArea\">\n");
      out.write("    <a href=\"#\" class=\"scrollToTop\"><i class=\"fa fa-angle-up\"></i></a>\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-lg-12 col-md-12 col-sm-12\">\n");
      out.write("        <div class=\"slider_area\">           \n");
      out.write("          <div class=\"menuarea\"> \n");
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
      out.write("                  ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("  </body>\n");
      out.write("</html>");
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Login}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("p");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("            \n");
          out.write("                <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
          out.write("                  <ul class=\"nav navbar-nav navbar-right custom_nav mobnav\" >\n");
          out.write("                    <li class=\"active\"><a href=\"#headerArea\">HOME</a></li>\n");
          out.write("                    <li><a href=\"http://localhost:8080/CRUD_News/chart.jsp?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getUserID()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Graficos</a></li>\n");
          out.write("                    <li><a href=\"/CRUD_News/allpost?id2=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getUserID()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Transacciones</a></li>\n");
          out.write("                    <li><a href=\"/CRUD_News/allcorte?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getUserID()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Corte</a></li>\n");
          out.write("                    <li><a href=\"/CRUD_News/index.html\">Log Off</a></li>\n");
          out.write("                    <li><a href=\"#priceList\">Donaciones</a></li>\n");
          out.write("                    <li><a href=\"#clients\">Contacto</a></li>\n");
          out.write("                  \n");
          out.write("                    \n");
          out.write("                  </ul>\n");
          out.write("                </div><!--/.nav-collapse -->\n");
          out.write("              </div>\n");
          out.write("            </div>\n");
          out.write("          </div>       \n");
          out.write("        </div>\n");
          out.write("      </div>  \n");
          out.write("    </div>      \n");
          out.write("  </header>\n");
          out.write("                    <br>\n");
          out.write("                    <br>\n");
          out.write("                    <br>\n");
          out.write("                    <br>\n");
          out.write("                    <br>\n");
          out.write("                    <br>\n");
          out.write("                    <br>\n");
          out.write("                    <h1>Hola ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getFirstName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(", bienvenido</h1>\n");
          out.write("   <!-- START FEATURES PRODUCT AREA -->\n");
          out.write("    <div class=\"features_productarea\">\n");
          out.write("      <div class=\"container\">\n");
          out.write("        <!-- START FIRST FEATURES PRODUCT -->\n");
          out.write("        <div class=\"row\">\n");
          out.write("          <div class=\"col-lg-6 col-md-6\">\n");
          out.write("            <div class=\"featprodcs_img wow fadeInLeft\">\n");
          out.write("              <h1>Corte</h1>\n");
          out.write("              <img class=\"img-responsive\" src=\"img/piechart");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getUserID()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(".png\" alt=\"img\">\n");
          out.write("            </div>\n");
          out.write("          </div>\n");
          out.write("          <div class=\"col-lg-6 col-md-6\">\n");
          out.write("            <div class=\"featprodcs_img wow fadeInRight\">\n");
          out.write("            <h1>Ingresos y Egresos</h1>\n");
          out.write("\n");
          out.write("                  <img class=\"img-responsive\" src=\"img/barchart");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getUserID()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(".png\" alt=\"img\">\n");
          out.write("                </div>\n");
          out.write("              </div>\n");
          out.write("              <a class=\"download_btn appdown_btn unique\" href=\"http://localhost:8080/CRUD_News/chart.jsp\">Generar Grafico</a>\n");
          out.write("              \n");
          out.write("            </div>\n");
          out.write("          </div>\n");
          out.write("        </div>\n");
          out.write("\n");
          out.write("    <!-- START FEATURES PRODUCT AREA -->\n");
          out.write("    <div class=\"features_productarea sample_appparea\">\n");
          out.write("      <div class=\"direction_icon\">\n");
          out.write("        <a id=\"secondTop\" class=\"dirc_up\" href=\"#\">\n");
          out.write("          <i class=\"fa fa-chevron-up\"></i>\n");
          out.write("        </a>\n");
          out.write("        <a id=\"secondBottom\" class=\"dirc_down\" href=\"#\">\n");
          out.write("          <i class=\"fa fa-chevron-down\"></i>\n");
          out.write("        </a>\n");
          out.write("      </div>\n");
          out.write("  <!-- START CLIENTS SECTION -->\n");
          out.write("  <section id=\"clients\">\n");
          out.write("    <div class=\"container\">\n");
          out.write("      <div class=\"row\">\n");
          out.write("        <div class=\"col-lg-12 col-md-12\">\n");
          out.write("          <div class=\"clients_area\">\n");
          out.write("            <h1>Valor de los principales minerales</h1>\n");
          out.write("           \n");
          out.write("            <iframe src=\"https://s.tradingview.com/goldprice/widgetembed/?symbol=TVC%3AGOLD&interval=D&hidesidetoolbar=0&symboledit=1&saveimage=1&toolbarbg=f5f5f5&watchlist=TVC%3AGOLD%1FTVC%3ASILVER%1FTVC%3APLATINUM%1FTVC%3APALLADIUM%1FTVC%3AGOLDSILVER%1FTVC%3AUSOIL%1FOANDA%3AEURUSD%1FFX_IDC%3AUSDJPY%1FINDEX%3AHUI%1FINDEX%3AXAU%1FCOINBASE%3ABTCUSD&details=1&studies=&hideideas=1&theme=White&style=1&timezone=America%2FNew_York&hideideasbutton=1&withdateranges=1&studies_overrides=%7B%7D&overrides=%7B%7D&enabled_features=%5B%5D&disabled_features=%5B%5D&locale=en&utm_source=goldprice.org&utm_medium=widget&utm_campaign=chart&utm_term=TVC%3AGOLD\" width=\"1200\" height=\"800\"></iframe>\n");
          out.write("          </div>\n");
          out.write("        </div>\n");
          out.write("      </div>\n");
          out.write("    </div>\n");
          out.write("  </section>\n");
          out.write("  <!-- END CLIENTS SECTION -->\n");
          out.write("  <!-- START FOOTER SECTION -->\n");
          out.write("  <footer id=\"footer\">\n");
          out.write("    <div class=\"container\">\n");
          out.write("      <div class=\"row\">\n");
          out.write("        <div class=\"col-lg-12 col-md-12\">\n");
          out.write("          <div class=\"footer_area\">\n");
          out.write("            <p>Designed By Francisco Samyl</p>\n");
          out.write("          </div>\n");
          out.write("        </div>\n");
          out.write("      </div>\n");
          out.write("    </div>\n");
          out.write("  </footer>\n");
          out.write("  <!-- END FOOTER SECTION -->\n");
          out.write("\n");
          out.write("  <!-- JQuery Files -->\n");
          out.write("\n");
          out.write("  <!-- Initialize jQuery Library -->\n");
          out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js\"></script>\n");
          out.write("  <!-- Google map -->\n");
          out.write("  <script src=\"https://maps.googleapis.com/maps/api/js\"></script>\n");
          out.write("  <script src=\"js/jquery.ui.map.js\"></script>  \n");
          out.write("  <!-- Skds slider -->\n");
          out.write("  <script src=\"js/skdslider.min.js\"></script>\n");
          out.write("  <!-- Bootstrap js  -->\n");
          out.write("  <script src=\"js/bootstrap.min.js\"></script>\n");
          out.write("  <!-- For smooth animatin  -->\n");
          out.write("  <script src=\"js/wow.min.js\"></script> \n");
          out.write("\n");
          out.write("  <!-- Custom js -->\n");
          out.write("  <script type=\"text/javascript\" src=\"js/custom.js\"></script>\n");
          out.write("    ");
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
