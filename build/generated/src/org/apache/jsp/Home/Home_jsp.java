package org.apache.jsp.Home;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("     ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Bingkai/header.html", out, false);
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- SLIDER Start\n");
      out.write("    ================================================== -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<section id=\"slider-area\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-md-12\">\n");
      out.write("\t\t\t\t\t<div id=\"slider\" class=\"nivoSlider\">\n");
      out.write("\t\t\t\t    \t<img src=\"../images/SAPI1.png\" alt=\"\" />\n");
      out.write("\t\t\t\t    \t<img src=\"../images/Sapi2.png\" alt=\"\"/>\n");
      out.write("\t\t\t\t    \t<img src=\"../images/qo1.png\" alt=\"\" />\n");
      out.write("\t\t\t\t\t</div>\t<!-- End of /.nivoslider -->\n");
      out.write("\t\t\t\t</div>\t<!-- End of /.col-md-12 -->\n");
      out.write("\t\t\t</div>\t<!-- End of /.row -->\n");
      out.write("\t\t</div>\t<!-- End of /.container -->\n");
      out.write("\t</section> <!-- End of Section -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t<!-- FEATURES Start\n");
      out.write("    ================================================== -->\n");
      out.write("\n");
      out.write("\t<!-- <section id=\"features\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t\t\t<div class=\"block\">\n");
      out.write("\t\t\t\t\t\t<div class=\"media\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"pull-left\" href=\"#\">\n");
      out.write("\t\t\t\t\t\t    \t<i class=\"fa fa-ambulance\"></i>\n");
      out.write("\t\t\t\t\t\t  \t</div>\n");
      out.write("\t\t\t\t\t\t  \t<div class=\"media-body\">\n");
      out.write("\t\t\t\t\t\t    \t<h4 class=\"media-heading\">Free Shipping</h4>\n");
      out.write("\t\t\t\t\t\t    \t<p>Lorem ipsum dolor sit amet, consectetur.</p>\n");
      out.write("\t\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t\t\t<div class=\"block\">\n");
      out.write("\t\t\t\t\t\t<div class=\"media\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"pull-left\" href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\" fa fa-foursquare\"></i>\n");
      out.write("\t\t\t\t\t\t  \t</div>\n");
      out.write("\t\t\t\t\t\t  \t<div class=\"media-body\">\n");
      out.write("\t\t\t\t\t\t    \t<h4 class=\"media-heading\">Media heading</h4>\n");
      out.write("\t\t\t\t\t\t    \t<p>Lorem ipsum dolor sit amet, consectetur.</p>\n");
      out.write("\t\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t\t\t<div class=\"block\">\n");
      out.write("\t\t\t\t\t\t<div class=\"media\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"pull-left\" href=\"#\">\n");
      out.write("\t\t\t\t\t\t    \t<i class=\" fa fa-phone\"></i>\n");
      out.write("\t\t\t\t\t\t  \t</div>\n");
      out.write("\t\t\t\t\t\t  \t<div class=\"media-body\">\n");
      out.write("\t\t\t\t\t\t    \t<h4 class=\"media-heading\">Call Us</h4>\n");
      out.write("\t\t\t\t\t\t    \t<p>Lorem ipsum dolor sit amet, consectetur.</p>\n");
      out.write("\t\t\t\t\t\t  </div>\t<!-- End of /.media-body -->\n");
      out.write("\t\t\t\t\t\t</div>\t<!-- End of /.media -->\n");
      out.write("\t\t\t\t\t</div>\t<!-- End of /.block -->\n");
      out.write("\t\t\t\t</div> <!-- End of /.col-md-4 -->\n");
      out.write("\t\t\t</div>\t<!-- End of /.row -->\n");
      out.write("\t\t</div>\t<!-- End of /.container -->\n");
      out.write("\t</section>\t<!-- End of section --> \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- CATAGORIE Start\n");
      out.write("    ================================================== -->\n");
      out.write("\n");
      out.write("\t<section id=\"catagorie\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-md-12\">\n");
      out.write("\t\t\t\t\t<div class=\"block\">\n");
      out.write("\t\t\t\t\t\t<div class=\"block-heading\">\n");
      out.write("\t\t\t\t\t\t\t<h2> JENIS IBADAH QURBAN</h2>\n");
      out.write("\t\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<center>\n");
      out.write("\t\t\t\t\t\t  \t<div class=\"col-sm-6 col-md-4\">\n");
      out.write("\t\t\t\t\t\t\t    <div class=\"thumbnail\">\n");
      out.write("\t\t\t\t\t\t\t    \t<a class=\"catagotie-head\" href=\"blog-single.html\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"../images/s2.png\"  alt=\"...\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h3> Qurban </h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t      \t<div class=\"caption\">\n");
      out.write("\t\t\t\t\t\t\t        \t<p> Mari BerQurban </p>\n");
      out.write("\t\t\t\t\t\t\t      \t</div>\t<!-- End of /.caption -->\n");
      out.write("\t\t\t\t\t\t\t    </div>\t<!-- End of /.thumbnail -->\n");
      out.write("\t\t\t\t\t\t  \t</div>\t<!-- End of /.col-sm-6 col-md-4 -->\n");
      out.write("\t\t\t\t\t\t  </center>\n");
      out.write("\t\t\t\t\t\t  \t<div class=\"col-sm-6 col-md-4\">\n");
      out.write("\t\t\t\t\t\t\t    <div class=\"thumbnail\">\n");
      out.write("\t\t\t\t\t\t\t    \t<a class=\"catagotie-head\" href=\"blog-single.html\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!-- <img src=\"images/category-image-2.jpg\" alt=\"...\"> -->\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!-- <h3>Miscellaneous</h3>\t -->\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t      \t<div class=\"caption\">\n");
      out.write("\t\t\t\t\t\t\t        \t<!-- <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Iste, aut, esse, laborum placeat id illo a expedita aperiam...</p>\n");
      out.write("\t\t\t\t\t\t\t        \t<p> -->\n");
      out.write("\t\t\t\t\t\t\t        \t<!-- \t<a href=\"blog-single.html\" class=\"btn btn-default btn-transparent\" role=\"button\">\n");
      out.write("\t\t\t\t\t\t\t        \t\t\t<span>Check Items</span>\n");
      out.write("\t\t\t\t\t\t\t        \t\t</a> -->\n");
      out.write("\t\t\t\t\t\t\t        \t<!-- </p> -->\n");
      out.write("\t\t\t\t\t\t\t      \t</div>\t<!-- End of /.caption -->\n");
      out.write("\t\t\t\t\t\t\t    </div>\t<!-- End of /.thumbnail -->\n");
      out.write("\t\t\t\t\t\t  \t</div>\t<!-- End of /.col-sm-6 col-md-4 -->\n");
      out.write("\t\t\t\t\t\t  \t<center>\n");
      out.write("\t\t\t\t\t\t  \t<div class=\"col-sm-6 col-md-4\">\n");
      out.write("\t\t\t\t\t\t\t    <div class=\"thumbnail\">\n");
      out.write("\t\t\t\t\t\t\t    \t<a class=\"catagotie-head\" href=\"blog-single.html\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"../images/k4.png\" alt=\"...\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h3> Aqiqah </h3>\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t      \t<div class=\"caption\">\n");
      out.write("\t\t\t\t\t\t\t\t        <p> Mari BerAqiqah </p>\n");
      out.write("\t\t\t\t\t\t\t\t    </div>\t<!-- End of /.caption -->\n");
      out.write("\t\t\t\t\t\t\t    </div>\t<!-- End of /.thumbnail -->\n");
      out.write("\t\t\t\t\t\t  \t</div>\t<!-- End of /.col-sm-6 col-md-4 -->\n");
      out.write("\t\t\t\t\t\t</div>\t<!-- End of /.row -->\n");
      out.write("\t\t\t\t\t</center>\n");
      out.write("\t\t\t\t\t</div>\t<!-- End of /.block --> \n");
      out.write("\t\t\t\t</div>\t<!-- End of /.col-md-12 -->\n");
      out.write("\t\t\t</div>\t<!-- End of /.row -->\n");
      out.write("\t\t</div>\t<!-- End of /.container -->\n");
      out.write("\t</section>\t<!-- End of Section -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t\t<!-- PRODUCTS Start\n");
      out.write("    ================================================== -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\t<!-- CALL TO ACTION Start\n");
      out.write("    ================================================== -->\n");
      out.write("\n");
      out.write("\t<section id=\"call-to-area\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-md-12\">\n");
      out.write("\t\t\t\t\t<div class=\"block\">\n");
      out.write("\t\t\t\t\t\t<div class=\"block-heading\">\n");
      out.write("\t\t\t\t\t\t\t<h2> Didukung Oleh </h2>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\t<!-- End of /.block -->\n");
      out.write("\t\t\t\t\t<div id=\"owl-example\" class=\"owl-carousel\">\n");
      out.write("\t\t\t\t\t\t<div> </div>\n");
      out.write("\t\t\t\t\t\t<div> </div>\n");
      out.write("\t\t\t\t\t\t<div> <img src=\"../images/laz.png\" alt=\"\"></div>\n");
      out.write("<!--\t\t\t\t\t\t<div> <img src=\"images/company-4.png\" alt=\"\"></div>\n");
      out.write("\t\t\t\t\t\t<div> <img src=\"images/company-5.png\" alt=\"\"></div>\n");
      out.write("\t\t\t\t\t\t<div> <img src=\"images/company-6.png\" alt=\"\"></div>\n");
      out.write("\t\t\t\t\t\t<div> <img src=\"images/company-8.png\" alt=\"\"></div>\n");
      out.write("\t\t\t\t\t\t<div> <img src=\"images/company-9.png\" alt=\"\"></div>\n");
      out.write("\t\t\t\t\t</div>\t End of /.Owl-Slider -->\n");
      out.write("\t\t\t\t</div>\t<!-- End of /.col-md-12 -->\n");
      out.write("\t\t\t</div> <!-- End Of /.Row -->\n");
      out.write("\t\t</div> <!-- End Of /.Container -->\n");
      out.write("\t</section>\t<!-- End of Section -->\n");
      out.write("    </body>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Bingkai/Footer.html", out, false);
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
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
