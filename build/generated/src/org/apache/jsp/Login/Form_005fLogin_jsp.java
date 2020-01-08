package org.apache.jsp.Login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Form_005fLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Login/Form_Login.html");
  }

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
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Bingkai/header.html", out, false);
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center style=\"background-color: #a6f77b\">\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\" />\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("        <title>MongMbek</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <div id=\"card\">\r\n");
      out.write("            <div id=\"card-content\">\r\n");
      out.write("                <div id=\"card-title\">\r\n");
      out.write("                    <h2>LOGIN</h2>\r\n");
      out.write("                    <div class=\"underline-title\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <form method=\"post\" class=\"form\" action=\"Cek_Login.jsp\">\r\n");
      out.write("                    <label for=\"user-email\" style=\"padding-top:13px\">\r\n");
      out.write("                        &nbsp;Username\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <input id=\"user-email\" class=\"form-content\"  name=\"username\" autocomplete=\"on\" required />\r\n");
      out.write("                    <div class=\"form-border\"></div>\r\n");
      out.write("                    <label for=\"user-password\" style=\"padding-top:22px\">&nbsp;Password\r\n");
      out.write("                    </label>\r\n");
      out.write("                    <input id=\"user-password\" class=\"form-content\" type=\"password\" name=\"password\" required />\r\n");
      out.write("                    <div class=\"form-border\"></div>\r\n");
      out.write("                    \r\n");
      out.write("                    <input id=\"submit-btn\" type=\"submit\" name=\"submit\" value=\"LOGIN\" />\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("    </center>   \n");
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
