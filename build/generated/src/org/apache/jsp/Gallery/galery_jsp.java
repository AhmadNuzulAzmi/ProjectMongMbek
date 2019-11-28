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
      out.write("\t\t\t\t\t            \t<div class=\"blog-post-tag\">\n");
      out.write("\t\t\t\t\t\t            \t<div class=\"block\">\n");
      out.write("\t\t\t\t\t\t            \t\t<i class=\"fa fa-clock-o\"></i>\n");
      out.write("\t\t\t\t\t\t            \t\t<p>12 Jan,2014</p>\n");
      out.write("\t\t\t\t\t\t            \t</div>\n");
      out.write("\t\t\t\t\t\t            \t<div class=\"block\">\n");
      out.write("\t\t\t\t\t\t            \t\t<i class=\"fa fa-user\"></i>\n");
      out.write("\t\t\t\t\t\t            \t\t<p>Admin</p>\n");
      out.write("\t\t\t\t\t\t            \t</div>\n");
      out.write("\t\t\t\t\t\t            \t<div class=\"block\">\n");
      out.write("\t\t\t\t\t\t            \t\t<i class=\"fa fa-tags\"></i>\n");
      out.write("\t\t\t\t\t\t            \t\t<p>\n");
      out.write("\t\t\t\t\t\t            \t\t\t<a href=\"\">Food Culture</a>,\n");
      out.write("\t\t\t\t\t\t            \t\t\t<a href=\"\">Green Items</a>\n");
      out.write("\t\t\t\t\t\t            \t\t</p>\n");
      out.write("\t\t\t\t\t\t            \t</div>\n");
      out.write("\t\t\t\t\t\t            \t<div class=\"block\">\n");
      out.write("\t\t\t\t\t\t            \t\t<i class=\"fa fa-comments\"></i>\n");
      out.write("\t\t\t\t\t\t            \t\t<p>3 Comments</p>\n");
      out.write("\t\t\t\t\t\t            \t</div>\n");
      out.write("\t\t\t\t\t\t            </div>\n");
      out.write("\t\t\t\t\t\t            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Possimus, nostrum inventore debitis accusantium natus praesentium enim sequi culpa provident dignissimos veniam deserunt voluptatibus fugit delectus pariatur numquam optio quidem illo. Obcaecati, placeat, enim accusantium sunt inventore sed dolorum molestiae ab consequuntur voluptatem dolor necessitatibus reprehenderit adipisci explicabo hic quibusdam pariatur!</p>\n");
      out.write("\t\t\t\t\t\t            <p>Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren sed diam voluptua.</p>\n");
      out.write("\t\t\t\t\t\t            \n");
      out.write("\t\t\t\t\t\t            <blockquote>\n");
      out.write("\t\t\t\t\t                    <p>Lorem ipsum dolor sit amet, in pri offendit ocurreret. Vix sumo ferri an. pfs adodio fugit delenit ut qui. Omittam suscipiantur ex  vel,ex audiam  intellegat gfIn labitur discere eos, nam an feugiat voluptua.</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"block-qoute-by\">\n");
      out.write("\t\t\t\t\t                        - John Doe , Author\n");
      out.write("\t\t\t\t\t                    </div>\n");
      out.write("\t\t\t\t\t                </blockquote>\n");
      out.write("\t\t\t\t\t                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Unde expedita neque excepturi iste cumque! Dolorem, ipsum, totam, culpa ullam dolores qui possimus corrupti suscipit recusandae quam magnam quis eaque incidunt!</p>\n");
      out.write("\t\t\t\t\t            </div>\n");
      out.write("\t\t\t\t\t        </div>\n");
      out.write("\t\t\t\t\t    </li>\n");
      out.write("\t\t\t\t\t</ul>\t<!-- End of /.blog-zone -->\n");
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
