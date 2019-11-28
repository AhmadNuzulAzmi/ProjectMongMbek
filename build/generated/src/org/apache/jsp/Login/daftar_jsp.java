package org.apache.jsp.Login;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Bingkai/header.html", out, false);
      out.write("\n");
      out.write("        <title></title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section id=\"blog\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("        <div class=\"leave-comment\">\n");
      out.write("\t\t<h5>Silahkan Isi Data Dengan Baik dan Benar !</h5>\n");
      out.write("                <form class=\"form-horizontal\" role=\"form\" action=\"../Home/Home.jsp\">\n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t<label for=\"inputname\" class=\"col-sm-2 control-label\">Nama</label>\n");
      out.write("\t\t\t<div class=\"col-sm-10\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"inputname\" placeholder=\"Nama\" name=\"nama\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\t<!-- End of /.form-group -->\n");
      out.write("                                        \n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("\t\t\t<label for=\"inputname\" class=\"col-sm-2 control-label\">Jenis Kelamin</label>\n");
      out.write("                        <div class=\"col-sm-10\">\n");
      out.write("                            <div class=\"select-box\">\n");
      out.write("                                    <label for=\"select-box1\" class=\"label select-box1\"><span class=\"label-desc\"> Pilih Jenis Kelamin </span></label>\n");
      out.write("                                                <select id =\"select-box1\" class=\"select\">\n");
      out.write("                                                    <option value=\"lk\"> Laki-laki </option>\n");
      out.write("                                                    <option value=\"pr\"> Perempuan </option>\n");
      out.write("                                                </select>\n");
      out.write("                                </div>\n");
      out.write("                                             </div>\n");
      out.write("\t\t\t\t\t\t  \t</div>\t<!-- End of /.form-group -->\n");
      out.write("                                                        \n");
      out.write("\t\t\t\t\t\t  \t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t    \t<label for=\"inputwebsite\" class=\"col-sm-2 control-label\">No Hp</label>\n");
      out.write("\t\t\t\t\t\t\t    <div class=\"col-sm-10\">\n");
      out.write("\t\t\t\t\t\t\t      \t<input type=\"text\" class=\"form-control\" id=\"inputwebsite\" placeholder=\"No Hp\" name=\"nohp\">\n");
      out.write("\t\t\t\t\t\t\t    </div>\n");
      out.write("\t\t\t\t\t\t  \t</div>\t<!-- End of /.form-group -->\n");
      out.write("\t\t\t\t\t\t  \t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t    \t<label for=\"inputmessage\" class=\"col-sm-2 control-label\">Alamat</label>\n");
      out.write("\t\t\t\t\t\t\t    <div class=\"col-sm-10\">\n");
      out.write("                                                                <textarea class=\"form-control\" id=\"inputmessage\"  rows=\"3\" placeholder=\"Alamat\" name=\"alamat\"></textarea>\n");
      out.write("\t\t\t\t\t\t\t    </div>\n");
      out.write("\t\t\t\t\t\t  \t</div>\t<!-- End of /.form-group -->\n");
      out.write("                                                        <div class=\"form-group\">\n");
      out.write("                                                        <label for=\"inputwebsite\" class=\"col-sm-2 control-label\">Username</label>\n");
      out.write("\t\t\t\t\t\t\t    <div class=\"col-sm-10\">\n");
      out.write("                                                                <input type=\"text\" class=\"form-control\" id=\"inputwebsite\" placeholder=\"Username\" name=\"usrname\">\n");
      out.write("\t\t\t\t\t\t\t    </div>\n");
      out.write("\t\t\t\t\t\t  \t</div>\t<!-- End of /.form-group -->\n");
      out.write("                                                        <div class=\"form-group\">\n");
      out.write("                                                        <label for=\"inputwebsite\" class=\"col-sm-2 control-label\">Password</label>\n");
      out.write("\t\t\t\t\t\t\t    <div class=\"col-sm-10\">\n");
      out.write("                                                                <input type=\"text\" class=\"form-control\" id=\"inputwebsite\" placeholder=\"Password\" name=\"password\">\n");
      out.write("\t\t\t\t\t\t\t    </div>\n");
      out.write("\t\t\t\t\t\t  \t</div>\t<!-- End of /.form-group -->\n");
      out.write("\t\t\t\t\t\t  \t\t\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t    \t<div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("\t\t\t\t\t\t      \t\t<button type=\"submit\" class=\"btn btn-primary\">Daftar </button>\n");
      out.write("\t\t\t\t\t\t    \t</div>\n");
      out.write("                                                        </div>\t<!-- End of /.form-group -->\n");
      out.write("                                                        \n");
      out.write("\t\t\t\t\t\t</form>\t<!-- End of /.form-horizontal -->\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("    </body>\n");
      out.write("     ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Bingkai/Footer.html", out, false);
      out.write("\n");
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
}
