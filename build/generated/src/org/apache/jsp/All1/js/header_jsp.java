package org.apache.jsp.All1.js;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("\t<title>Food Code Proudly Presents By Themexpert</title>\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\">\n");
      out.write("\n");
      out.write("\t<!-- Fonts -->\n");
      out.write("\t<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700' rel='stylesheet' type='text/css'>\n");
      out.write("\t<link href='http://fonts.googleapis.com/css?family=Yanone+Kaffeesatz:400,700' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("\t<!-- Css -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/nivo-slider.css\" type=\"text/css\" />\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/owl.carousel.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/owl.theme.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/responsive.css\">\n");
      out.write("\n");
      out.write("\t<!-- jS -->\n");
      out.write("\t<script src=\"js/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\t<script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\t<script src=\"js/jquery.nivo.slider.js\" type=\"text/javascript\"></script>\n");
      out.write("\t<script src=\"js/owl.carousel.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\t<script src=\"js/jquery.nicescroll.js\"></script>\n");
      out.write("\t<script src=\"js/jquery.scrollUp.min.js\"></script>\n");
      out.write("\t<script src=\"js/main.js\" type=\"text/javascript\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <section id=\"top\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-md-7\">\n");
      out.write("\t\t\t\t\t<p class=\"contact-action\"><i class=\"fa fa-phone-square\"></i>IN CASE OF ANY QUESTIONS, CALL THIS NUMBER: <strong>+565 975 658</strong></p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-3 clearfix\">\n");
      out.write("\t\t\t\t\t<ul class=\"login-cart\">\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<a data-toggle=\"modal\" data-target=\"#myModal\" href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-user\"></i>\n");
      out.write("\t\t\t\t\t\t\t\tLogin\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cart dropdown\">\n");
      out.write("\t\t\t\t\t\t  \t\t<a data-toggle=\"dropdown\" href=\"#\"><i class=\"fa fa-shopping-cart\"></i>Cart(1)</a>\n");
      out.write("\t\t\t\t\t  \t\t\t<div class=\"dropdown-menu dropup\">\n");
      out.write("\t\t\t\t\t  \t\t\t\t<span class=\"caret\"></span>\n");
      out.write("\t\t\t\t\t\t  \t\t\t<ul class=\"media-list\">\n");
      out.write("\t\t\t\t\t\t\t\t  \t\t<li class=\"media\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    <img class=\"pull-left\" src=\"images/product-item.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t    <div class=\"media-body\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t      \t<h6>Italian Sauce\n");
      out.write("\t\t\t\t\t\t\t\t    \t\t\t\t<span>$250</span>\n");
      out.write("\t\t\t\t\t\t\t\t    \t\t\t</h6>\n");
      out.write("\t\t\t\t\t\t\t\t    \t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t  \t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t<button class=\"btn btn-primary btn-sm\">Checkout</button>\n");
      out.write("\t\t\t\t\t\t\t    </div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-2\">\n");
      out.write("\t\t\t\t\t<div class=\"search-box\">\n");
      out.write("\t\t\t\t\t\t<div class=\"input-group\">\n");
      out.write("\t\t\t\t\t    \t<input placeholder=\"Search Here\" type=\"text\" class=\"form-control\">\n");
      out.write("\t\t\t\t\t      \t<span class=\"input-group-btn\">\n");
      out.write("\t\t\t\t\t        \t<button class=\"btn btn-default\" type=\"button\"></button>\n");
      out.write("\t\t\t\t\t      \t</span>\n");
      out.write("\t\t\t\t\t    </div><!-- /.input-group -->\n");
      out.write("\t\t\t\t\t</div><!-- /.search-box -->\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div> <!-- End Of /.row -->\n");
      out.write("\t\t</div>\t<!-- End Of /.Container -->\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t<!-- MODAL Start\n");
      out.write("    \t================================================== -->\n");
      out.write("\n");
      out.write("\t\t<div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\n");
      out.write("\t\t\t<div class=\"modal-dialog\">\n");
      out.write("\t\t    \t<div class=\"modal-content\">\n");
      out.write("\t\t    \t\t<div class=\"modal-header\">\n");
      out.write("\t\t        \t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n");
      out.write("\t\t        \t\t<h4 class=\"modal-title\" id=\"myModalLabel\">Introduce Yourself</h4>\n");
      out.write("\t\t      \t\t</div>\n");
      out.write("\t\t\t      \t<div class=\"modal-body clearfix\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<form action=\"#\" method=\"post\" id=\"create-account_form\" class=\"std\">\n");
      out.write("\t\t\t\t\t\t\t<fieldset>\n");
      out.write("\t\t\t\t\t\t\t\t<h3>Create your account</h3>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form_content clearfix\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4>Enter your e-mail address to create an account.</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"text\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label for=\"email_create\">E-mail address</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input placeholder=\"E-mail address\"  type=\"text\" id=\"email_create\" name=\"email_create\" value=\"\" class=\"account_input\">\n");
      out.write("\t\t\t\t\t                    </span>\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"submit\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button class=\"btn btn-primary\">Create Your Account</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</fieldset>\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t      \t\t<form action=\"\" method=\"post\" id=\"login_form\" class=\"std\">\n");
      out.write("\t\t\t\t\t\t\t<fieldset>\n");
      out.write("\t\t\t\t\t\t\t\t<h3>Already registered?</h3>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form_content clearfix\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"text\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"email\">E-mail address</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span><input placeholder=\"E-mail address\" type=\"text\" id=\"email\" name=\"email\" value=\"\" class=\"account_input\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"text\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"passwd\">Password</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<span><input placeholder=\"Password\" type=\"password\" id=\"passwd\" name=\"passwd\" value=\"\" class=\"account_input\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"lost_password\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#popab-password-reset\" class=\"popab-password-link\">Forgot your password?</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"submit\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<button class=\"btn btn-success\">Log in</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</fieldset>\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t      \t</div>\n");
      out.write("\t\t\t      \t<div class=\"modal-footer\">\n");
      out.write("\t\t\t        \t<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("\t\t\t      \t</div>\n");
      out.write("\t\t    \t</div>\n");
      out.write("\t\t  \t</div>\n");
      out.write("\t\t</div>\t\n");
      out.write("\t</section>  <!-- End of /Section -->\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- LOGO Start\n");
      out.write("    ================================================== -->\n");
      out.write("\t\n");
      out.write("\t<header>\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-md-12\">\n");
      out.write("\t\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t\t<img src=\"images/logo.png\" alt=\"logo\">\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t</div>\t<!-- End of /.col-md-12 -->\n");
      out.write("\t\t\t</div>\t<!-- End of /.row -->\n");
      out.write("\t\t</div>\t<!-- End of /.container -->\n");
      out.write("\t</header> <!-- End of /Header -->\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- MENU Start\n");
      out.write("    ================================================== -->\n");
      out.write("\n");
      out.write("\t<nav class=\"navbar navbar-default\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t    <div class=\"navbar-header\">\n");
      out.write("\t\t      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("\t\t        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\t\t        <span class=\"icon-bar\"></span>\n");
      out.write("\t\t        <span class=\"icon-bar\"></span>\n");
      out.write("\t\t        <span class=\"icon-bar\"></span>\n");
      out.write("\t\t      </button>\n");
      out.write("\t\t    </div> <!-- End of /.navbar-header -->\n");
      out.write("\n");
      out.write("\t\t    <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("\t\t      \t<ul class=\"nav navbar-nav nav-main\">\n");
      out.write("\t\t        \t<li class=\"active\"><a href=\"#\">HOME</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"products.html\">GALERI</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"blog.html\">HUKUM QURBAN</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"blog-single.html\">DAFTAR PEQURBAN</a></li>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t   <li><a  href=\"#\">Action</a></li>\n");
      out.write("\t\t\t\t\t\t    <li><a  href=\"#\">Another action</a></li>\n");
      out.write("\t\t\t\t\t\t    <li><a  href=\"#\">Something else here</a></li>\n");
      out.write("\t\t\t\t\t\t    <li><a  href=\"#\">Separated link</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</li> <!-- End of /.dropdown -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t        </ul> <!-- End of /.nav-main -->\n");
      out.write("\t\t    </div>\t<!-- /.navbar-collapse -->\n");
      out.write("\t\t</div>\t<!-- /.container-fluid -->\n");
      out.write("\t</nav>\t<!-- End of /.nav -->\n");
      out.write("    </body>\n");
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
