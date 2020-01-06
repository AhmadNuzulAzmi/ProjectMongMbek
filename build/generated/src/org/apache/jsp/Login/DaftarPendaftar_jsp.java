package org.apache.jsp.Login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import mong.Pendaftaran;

public final class DaftarPendaftar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Bingkai/header.html", out, false);
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    ");
      mong.Pendaftaran sup = null;
      synchronized (_jspx_page_context) {
        sup = (mong.Pendaftaran) _jspx_page_context.getAttribute("sup", PageContext.PAGE_SCOPE);
        if (sup == null){
          sup = new mong.Pendaftaran();
          _jspx_page_context.setAttribute("sup", sup, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("    ");
      mong.PendaftaranFacade sup1 = null;
      synchronized (_jspx_page_context) {
        sup1 = (mong.PendaftaranFacade) _jspx_page_context.getAttribute("sup1", PageContext.PAGE_SCOPE);
        if (sup1 == null){
          sup1 = new mong.PendaftaranFacade();
          _jspx_page_context.setAttribute("sup1", sup1, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("    ");

    Pendaftaran[] dataPendaftaran = sup1.getDataPendaftaran();
    
    
      out.write("\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <h1>Daftar Pendaftar</h1>\n");
      out.write("        <hr/>\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <tr>\n");
      out.write("                <td>ID Pendaftar</td>\n");
      out.write("                <td>Nama Pendaftar</td>\n");
      out.write("                <td>Jenis Kelamin</td>\n");
      out.write("                <td>No Handpone</td>\n");
      out.write("                <td>Alamat</td>\n");
      out.write("                <td>Username</td>\n");
      out.write("                <td>Password</td>\n");
      out.write("                <td>Aksi</td>\n");
      out.write("            </tr>\n");
      out.write("            ");

                for(int i=0;i<dataPendaftaran.length;i++){
                    sup = dataPendaftaran[i];
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(sup.getId());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(sup.getNamaPendaftar());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(sup.getJkPendaftar());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(sup.getNohpPendaftar());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(sup.getAlamat());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(sup.getUsername());
      out.write("</td>\n");
      out.write("                <td>");
      out.print(sup.getPassword());
      out.write("</td>\n");
      out.write("                <td align=\"center\"><a href=FormEditPendaftaran.jsp?idpen=");
      out.print(sup.getId());
      out.write(">Edit</a> | <a href=../HapusPendaftar?idpen=");
      out.print(sup.getId());
      out.write(">Delete</a></td>\n");
      out.write("            </tr>        \n");
      out.write("                    ");

                }
      out.write("\n");
      out.write("        \n");
      out.write("        </table>\n");
      out.write("       </center>\n");
      out.write("    </body>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../Bingkai/Footer.html", out, false);
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
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
