package org.apache.jsp.All1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class daftar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.html", out, false);
      out.write("\n");
      out.write("        <title></title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section id=\"blog\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("        <div class=\"leave-comment\">\n");
      out.write("\t\t\t\t\t\t<h5>LEAVE A COMMENT</h5>\n");
      out.write("\t\t\t\t\t\t<form class=\"form-horizontal\" role=\"form\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t    \t<label for=\"inputname\" class=\"col-sm-2 control-label\">Name</label>\n");
      out.write("\t\t\t\t\t\t\t    <div class=\"col-sm-10\">\n");
      out.write("\t\t\t\t\t\t\t      \t<input type=\"text\" class=\"form-control\" id=\"inputname\" placeholder=\"Name\">\n");
      out.write("\t\t\t\t\t\t\t    </div>\n");
      out.write("\t\t\t\t\t\t  \t</div>\t<!-- End of /.form-group -->\n");
      out.write("\t\t\t\t\t\t  \t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t    \t<label for=\"inputEmail\" class=\"col-sm-2 control-label\">Email</label>\n");
      out.write("\t\t\t\t\t\t\t    <div class=\"col-sm-10\">\n");
      out.write("\t\t\t\t\t\t\t      \t<input type=\"email\" class=\"form-control\" id=\"inputEmail\" placeholder=\"Email\">\n");
      out.write("\t\t\t\t\t\t\t    </div>\n");
      out.write("\t\t\t\t\t\t  \t</div>\t<!-- End of /.form-group -->\n");
      out.write("\t\t\t\t\t\t  \t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t    \t<label for=\"inputwebsite\" class=\"col-sm-2 control-label\">Website</label>\n");
      out.write("\t\t\t\t\t\t\t    <div class=\"col-sm-10\">\n");
      out.write("\t\t\t\t\t\t\t      \t<input type=\"text\" class=\"form-control\" id=\"inputwebsite\" placeholder=\"Website\">\n");
      out.write("\t\t\t\t\t\t\t    </div>\n");
      out.write("\t\t\t\t\t\t  \t</div>\t<!-- End of /.form-group -->\n");
      out.write("\t\t\t\t\t\t  \t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t    \t<label for=\"inputmessage\" class=\"col-sm-2 control-label\">Message</label>\n");
      out.write("\t\t\t\t\t\t\t    <div class=\"col-sm-10\">\n");
      out.write("\t\t\t\t\t\t\t      \t<textarea class=\"form-control\" id=\"inputmessage\"  rows=\"3\"></textarea>\n");
      out.write("\t\t\t\t\t\t\t    </div>\n");
      out.write("\t\t\t\t\t\t  \t</div>\t<!-- End of /.form-group -->\n");
      out.write("\t\t\t\t\t\t  \t\t\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t    \t<div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("\t\t\t\t\t\t      \t\t<button type=\"submit\" class=\"btn btn-primary\">Send</button>\n");
      out.write("\t\t\t\t\t\t    \t</div>\n");
      out.write("\t\t\t\t\t\t  \t</div>\t<!-- End of /.form-group -->\n");
      out.write("\t\t\t\t\t\t</form>\t<!-- End of /.form-horizontal -->\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("    </body>\n");
      out.write("     ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.html", out, false);
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
