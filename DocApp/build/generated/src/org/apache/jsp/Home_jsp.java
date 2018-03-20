package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("             <title> Doctors Appointment </title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/basic-template.css\" rel=\"stylesheet\"/>\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    <style>\n");
      out.write("    /* Remove the navbar's default margin-bottom and rounded borders */ \n");
      out.write("    .navbar {\n");
      out.write("      margin-bottom: 0;\n");
      out.write("      border-radius: 0;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    /* Set height of the grid so .sidenav can be 100% (adjust as needed) */\n");
      out.write("    .row.content {height: 450px}\n");
      out.write("    \n");
      out.write("    /* Set gray background color and 100% height */\n");
      out.write("    .sidenav {\n");
      out.write("      padding-top: 20px;\n");
      out.write("      background-color:#f1f1f1;\n");
      out.write("      height: 100%;\n");
      out.write("    }\n");
      out.write("    img{\n");
      out.write("        width: 100px;\n");
      out.write("        height:50px;\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("    h2{\n");
      out.write("        max-width:200%;\n");
      out.write("        max-height:200%;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("  </style>\n");
      out.write("  <link rel=\"shortcut icon\" type=\"image/jpg\" href=\"img/favicon.jpg\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-inverse\"> \n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("        <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("        <span class=\"icon-bar\"></span>                        \n");
      out.write("        </button>\n");
      out.write("        <a class=\"navbar-brand\" href=\"#\" ></a>\n");
      out.write("        <img src=\"img/logo.png\">\n");
      out.write("    </div>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("        <li class=\"active\"><a href=\"#\">Home</a></li>\n");
      out.write("        <li><a href=\"About Us.html\">About Us</a></li>\n");
      out.write("        <li><a href=\"Branches.jsp\">Branches</a></li>\n");
      out.write("        <li><a href=\"Contact Us.jsp\">Contact Us</a></li>\n");
      out.write("        <li><a href=\"#\">Patient's Registration</a></li>\n");
      out.write("      </ul>\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("        <li><a href=\"#\"><span class=\"glyphicon glyphicon-log-in\"></span> Doctor's Login</a></li>\n");
      out.write("                </ul>\n");
      out.write("                 <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("        <li><a href=\"#\"><span class=\"glyphicon glyphicon-log-in\"></span> Patient's Login</a></li>\n");
      out.write("                 </ul>\n");
      out.write("     </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <title> Doctors Appointment </title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/basic-template.css\" rel=\"stylesheet\"/>\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("   <style>\n");
      out.write("    /* Remove the navbar's default margin-bottom and rounded borders */ \n");
      out.write("   \n");
      out.write("    /* Set height of the grid so .sidenav can be 100% (adjust as needed) */\n");
      out.write("    .row.content {height: 450px}\n");
      out.write("    \n");
      out.write("    /* Set gray background color and 100% height */\n");
      out.write("    .sidenav {\n");
      out.write("      padding-top: 20px;\n");
      out.write("      background-color:#f1f1f1;\n");
      out.write("      height: 100%;\n");
      out.write("    }\n");
      out.write("    img{\n");
      out.write("        width: 100px;\n");
      out.write("        height:50px;\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("    h2{\n");
      out.write("        max-width:200%;\n");
      out.write("        max-height:200%;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    /* Set black background color, white text and some padding */\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    /* On small screens, set height to 'auto' for sidenav and grid */\n");
      out.write("    @media screen and (max-width: 767px) {\n");
      out.write("      .sidenav {\n");
      out.write("        height: auto;\n");
      out.write("        padding: 15px;\n");
      out.write("      }\n");
      out.write("      .row.content {height:auto;} \n");
      out.write("    }\n");
      out.write("    \n");
      out.write("  </style>\n");
      out.write("  <link rel=\"shortcut icon\" type=\"image/jpg\" href=\"img/favicon.jpg\">\n");
      out.write("    </head>\n");
      out.write("        \n");
      out.write("<div class=\"container-fluid text-center\">    \n");
      out.write("  <div class=\"row content\">\n");
      out.write("    <div class=\"col-sm-2 sidenav\">\n");
      out.write("        <h2> <img src=\"img/hospital.jpg\"></h2>\n");
      out.write("      <p><b>Stay Healthy Hospital</b></p><br><p>One of the prominent names for hospitals all over India and we are growing and expanding all over the world.With best class machines and a team of well professional doctors let us <br><b>\"STAY HEALTHY\"</b><br>together...</p>\n");
      out.write("    </div>\n");
      out.write("      <div class=\"col-sm-8 text-left\"> \n");
      out.write("      <h1>STAY HEALTHY HOSPITALS</h1>\n");
      out.write("      <p><b><marquee> stay healthy </marquee> </b></p>\n");
      out.write("      <hr>\n");
      out.write("      <h3>Test</h3>\n");
      out.write("      <p>test</p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-2 sidenav\">\n");
      out.write("      <div class=\"well\">\n");
      out.write("        <p>ADS</p>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"well\">\n");
      out.write("        <p>ADS</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write(" ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("          <link rel=\"shortcut icon\" type=\"image/jpg\" href=\"img/favicon.jpg\">\n");
      out.write("         <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write(" <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/basic-template.css\" rel=\"stylesheet\"/>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("             footer {\n");
      out.write("        position: fixed;\n");
      out.write("        left:0;\n");
      out.write("        bottom:0;\n");
      out.write("        width:100%;\n");
      out.write("        background-color: #555;\n");
      out.write("        color: white;\n");
      out.write("        padding: 4px;\n");
      out.write("    }\n");
      out.write("        </style>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("<footer class=\"container-fluid text-center\">\n");
      out.write("  <p> @Copyright by DocApp 2018 </p>\n");
      out.write("</footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write('\n');
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
