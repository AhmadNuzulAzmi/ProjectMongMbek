package org.apache.jsp.Login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class FormEditPendaftaran_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      mong.Pendaftaran pen = null;
      synchronized (_jspx_page_context) {
        pen = (mong.Pendaftaran) _jspx_page_context.getAttribute("pen", PageContext.PAGE_SCOPE);
        if (pen == null){
          pen = new mong.Pendaftaran();
          _jspx_page_context.setAttribute("pen", pen, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\n');
      mong.PendaftaranFacade pen1 = null;
      synchronized (_jspx_page_context) {
        pen1 = (mong.PendaftaranFacade) _jspx_page_context.getAttribute("pen1", PageContext.PAGE_SCOPE);
        if (pen1 == null){
          pen1 = new mong.PendaftaranFacade();
          _jspx_page_context.setAttribute("pen1", pen1, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\n');

    String IdPen = request.getParameter("idpen");
    if(IdPen != null){
        pen = pen1.getDataPendaftaranById(IdPen);
    

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
      out.write("        <form action=\"../EditPendaftaran\" method=\"post\">\n");
      out.write("    <center>\n");
      out.write("        <h1 align=\"center\"> Berhasil Ditambahkan </h1>\n");
      out.write("      <hr/>\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <td>ID Pendaftar</td>\n");
      out.write("                <td>:</td>\n");
      out.write("                <td>");
      out.print(pen.getId());
      out.write("</td>\n");
      out.write("            </tr> \n");
      out.write("                <input type=\"hidden\" name=\"id\" value=");
      out.print(pen.getId());
      out.write(">\n");
      out.write("            <tr>\n");
      out.write("                <td>Nama Pendaftar</td>\n");
      out.write("                <td>:</td>\n");
      out.write("                <td><input type=\"text\" name=\"nama\" value=");
      out.print(pen.getNamaPendaftar());
      out.write("></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Jenis Kelamin</td>\n");
      out.write("                <td>:</td>\n");
      out.write("                <td><select name=\"jk\">\n");
      out.write("                        <option value=\"Laki-laki\">Laki-laki</option>\n");
      out.write("                        <option value=\"Perempuan\"> Perempuan </option>\n");
      out.write("                        </select></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>No Hp Pendaftar</td>\n");
      out.write("                <td>:</td>\n");
      out.write("                <td><input type=\"text\" name=\"nohp\" value=");
      out.print(pen.getNohpPendaftar());
      out.write("></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Alamat Pendaftar</td>\n");
      out.write("                <td>:</td>\n");
      out.write("                <td><input type=\"text\" name=\"alamat\" value=");
      out.print(pen.getAlamat());
      out.write("></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Username</td>\n");
      out.write("                <td>:</td>\n");
      out.write("                <td><input type=\"text\" name=\"username\" value=");
      out.print(pen.getUsername());
      out.write("></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Password</td>\n");
      out.write("                <td>:</td>\n");
      out.write("                <td><input type=\"text\" name=\"password\" value=");
      out.print(pen.getPassword());
      out.write("></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"3\">\n");
      out.write("                    <input type=\"submit\" value=\"Kirim\">\n");
      out.write("                    <input type=\"reset\" value=\"Reset\">\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("            \n");
      out.write("        </table>\n");
      out.write("            </center>\n");
      out.write("        </form>\n");
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
