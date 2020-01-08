package org.apache.jsp.Pesan;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class BerhasilQurban_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Bingkai/header.html", out, false);
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    ");
      qurban.Qurban qur = null;
      synchronized (_jspx_page_context) {
        qur = (qurban.Qurban) _jspx_page_context.getAttribute("qur", PageContext.PAGE_SCOPE);
        if (qur == null){
          qur = new qurban.Qurban();
          _jspx_page_context.setAttribute("qur", qur, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("    ");

      qur = (qurban.Qurban)request.getAttribute("dataQur");
    
      out.write("\n");
      out.write("    <body align=\"center\">\n");
      out.write("      <section id=\"main-content\">\n");
      out.write("      <section class=\"wrapper\">\n");
      out.write("    <center>\n");
      out.write("        <h1 align=\"center\"> Berikut Data Pesanan Anda </h1>\n");
      out.write("      <hr/>\n");
      out.write("      \n");
      out.write("      <!-- page start-->\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-sm-6\">\n");
      out.write("            <section class=\"panel\">\n");
      out.write("              <header class=\"panel-heading\">\n");
      out.write("                Basic Table\n");
      out.write("              </header>\n");
      out.write("              <table class=\"table\">\n");
      out.write("                <tbody>\n");
      out.write("                  <tr>\n");
      out.write("                    <td>Nama Pequrban</td>\n");
      out.write("                    <td> : </td>\n");
      out.write("                    <td>");
      out.print(qur.getNamaPequrban());
      out.write("</td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                    <td>Masjid</td>\n");
      out.write("                    <td> : </td>\n");
      out.write("                    <td>");
      out.print(qur.getMasjid());
      out.write("</td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                    <td>Kelompok</td>\n");
      out.write("                    <td> : </td>\n");
      out.write("                    <td>");
      out.print(qur.getKelompok());
      out.write("</td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                    <td>Harga</td>\n");
      out.write("                    <td> : </td>\n");
      out.write("                    <td>");
      out.print(qur.getHarga());
      out.write("</td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                    <td>Metode Pembayaran</td>\n");
      out.write("                    <td> : </td>\n");
      out.write("                    <td>");
      out.print(qur.getBayar());
      out.write("</td>\n");
      out.write("                  </tr>\n");
      out.write("                  <tr>\n");
      out.write("                      \n");
      out.write("                  </tr>\n");
      out.write("                </tbody>\n");
      out.write("              </table>\n");
      out.write("            </section>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </body>\n");
      out.write("    ");
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
