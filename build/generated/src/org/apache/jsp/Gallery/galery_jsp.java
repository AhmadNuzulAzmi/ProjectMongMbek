package org.apache.jsp.Gallery;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class galery_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Bingkai/header.html", out, false);
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section>\n");
      out.write("            <section id=\"blog\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-md-9 clearfix\">\n");
      out.write("\t\t\t\t\t<ul class=\"blog-zone\">\n");
      out.write("\t\t\t\t\t    <li>\n");
      out.write("\t\t\t\t\t        <div class=\"blog-icon\">\n");
      out.write("\t\t\t\t\t        \t<i class=\"fa  fa-pencil\"></i>\n");
      out.write("\t\t\t\t\t        </div>\n");
      out.write("                                                \n");
      out.write("                                                 \n");
      out.write("\t\t\t\t\t        <div class=\"blog-box\">\n");
      out.write("\t\t\t\t\t        \t<img src=\"../images/sapi1.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t            \n");
      out.write("\t\t\t\t\t            <div class=\"blog-post-body clearfix\">\n");
      out.write("\t\t\t\t\t\t            <a href=\"\">\n");
      out.write("\t\t\t\t\t            \t\t<h2>Sapi Lari</h2>\n");
      out.write("\t\t\t\t\t\t            </a>\n");
      out.write("                                                        </li>\n");
      out.write("                                                        </ul>\n");
      out.write("                                                        \n");
      out.write("                                            <ul class=\"blog-zone\">\n");
      out.write("\t\t\t\t\t    <li>\n");
      out.write("\t\t\t\t\t        <div class=\"blog-icon\">\n");
      out.write("\t\t\t\t\t        \t<i class=\"fa  fa-pencil\"></i>\n");
      out.write("\t\t\t\t\t        </div>\n");
      out.write("\n");
      out.write("                                                        <div class=\"blog-box\">\n");
      out.write("\t\t\t\t\t        \t<img src=\"../images/sapi2.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t            \n");
      out.write("\t\t\t\t\t            <div class=\"blog-post-body clearfix\">\n");
      out.write("\t\t\t\t\t\t            <a href=\"\">\n");
      out.write("\t\t\t\t\t            \t\t<h2>Proses Pemotongan Sapi</h2>\n");
      out.write("\t\t\t\t\t\t            </a>\n");
      out.write("                                                    </li>\n");
      out.write("                                                    </ul>\n");
      out.write("                                    \n");
      out.write("                                    <ul class=\"blog-zone\">\n");
      out.write("\t\t\t\t\t    <li>\n");
      out.write("\t\t\t\t\t        <div class=\"blog-icon\">\n");
      out.write("\t\t\t\t\t        \t<i class=\"fa  fa-pencil\"></i>\n");
      out.write("\t\t\t\t\t        </div>\n");
      out.write("\n");
      out.write("                                                        <div class=\"blog-box\">\n");
      out.write("\t\t\t\t\t        \t<img src=\"../images/sapi3.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t            \n");
      out.write("\t\t\t\t\t            <div class=\"blog-post-body clearfix\">\n");
      out.write("\t\t\t\t\t\t            <a href=\"\">\n");
      out.write("\t\t\t\t\t            \t\t<h2>Potret Sapi yabg sedang makan </h2>\n");
      out.write("\t\t\t\t\t\t            </a>\n");
      out.write("                                                    </li>\n");
      out.write("                                                    </ul>\n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                    <ul class=\"blog-zone\">\n");
      out.write("\t\t\t\t\t    <li>\n");
      out.write("\t\t\t\t\t        <div class=\"blog-icon\">\n");
      out.write("\t\t\t\t\t        \t<i class=\"fa  fa-pencil\"></i>\n");
      out.write("\t\t\t\t\t        </div>\n");
      out.write("                                    <div class=\"blog-box\">\n");
      out.write("\t\t\t\t\t        \t<iframe src=\"https://www.youtube.com/embed/3C4T4k2aaFY\" frameborder=\"0\" allowfullscreen=\"\" width=\"100%\" height=\"400px\"></iframe>\n");
      out.write("\t\t\t\t\t            \n");
      out.write("\t\t\t\t\t            <div class=\"blog-post-body clearfix\">\n");
      out.write("\t\t\t\t\t            \t<a href=\"blog-single.html\">\n");
      out.write("\t\t\t\t\t            \t\t<h2>Youtube Pemberian Hewan Qurban Dari Laznaz </h2>\n");
      out.write("\t\t\t\t\t            \t</a>\n");
      out.write("                                                        </li>\n");
      out.write("                                                        </ul>\n");
      out.write("                                    \n");
      out.write("\t\t\t\t\t            \t\t<!-- End of /.blog-zone -->\n");
      out.write("        </section>\n");
      out.write("    </body>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Bingkai/Footer.html", out, false);
      out.write("\n");
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
