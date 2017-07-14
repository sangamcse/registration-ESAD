package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/admin/header.jsp");
    _jspx_dependants.add("/admin/script.jsp");
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
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <title>ESAD</title>\n");
      out.write("    <link href=\"http://www.mnnit.ac.in/templates/favourite/favicon.ico\" rel=\"shortcut icon\" type=\"image/vnd.microsoft.icon\" />\n");
      out.write("    \n");
      out.write("    <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core CSS     -->\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("    <!-- Animation library for notifications   -->\n");
      out.write("    <link href=\"css/animate.min.css\" rel=\"stylesheet\"/>\n");
      out.write("\n");
      out.write("    <!--  Light Bootstrap Table core CSS    -->\n");
      out.write("    <link href=\"css/light-bootstrap-dashboard.css\" rel=\"stylesheet\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!--  CSS for Demo Purpose, don't include it in your project     -->\n");
      out.write("    <link href=\"css/demo.css\" rel=\"stylesheet\" />\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <!--     Fonts and icons     -->\n");
      out.write("    <link href=\"http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Roboto:400,700,300' rel='stylesheet' type='text/css'>\n");
      out.write("    <link href=\"css/pe-icon-7-stroke.css\" rel=\"stylesheet\" />");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    <section id=\"course\">\n");
      out.write("    <div class=\"wrapper\">\n");
      out.write("    <div class=\"sidebar\" data-color=\"azure\" data-image=\"img/sidebar-5.jpg\">\n");
      out.write("\n");
      out.write("    <!--   you can change the color of the sidebar using: data-color=\"blue | azure | green | orange | red | purple\" -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    \t<div class=\"sidebar-wrapper\">\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <a href=\"dashboard.jsp\" class=\"simple-text\">\n");
      out.write("                    HOME\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <ul class=\"nav\">\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"dashboard.jsp\">\n");
      out.write("                        <i class=\"pe-7s-graph\"></i>\n");
      out.write("                        <p>Dashboard</p>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"user.jsp\">\n");
      out.write("                        <i class=\"pe-7s-user\"></i>\n");
      out.write("                        <p>User Profile</p>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"table.jsp\">\n");
      out.write("                        <i class=\"pe-7s-note2\"></i>\n");
      out.write("                        <p>User List</p>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                \n");
      out.write("               <li class=\"active\">\n");
      out.write("                    <a href=\"update.jsp\">\n");
      out.write("                        <i class=\"pe-7s-science\"></i>\n");
      out.write("                        <p>Update Record</p>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("               \n");
      out.write("            \n");
      out.write("\t\t\t\t\n");
      out.write("            </ul>\n");
      out.write("    \t</div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"main-panel\">\n");
      out.write("\t\t<nav class=\"navbar navbar-default navbar-fixed\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#navigation-example-2\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <a class=\"navbar-brand\" >User</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"collapse navbar-collapse\">\n");
      out.write("                    \n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <li>\n");
      out.write("                           <a href=\"dashboard.jsp\">\n");
      out.write("                               <p>Account</p>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                       \n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"../Logout.jsp\">\n");
      out.write("                                <p>Log out</p>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("\t\t\t\t\t\t<li class=\"separator hidden-lg hidden-md\"></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("<div class=\"row\">\n");
      out.write("<div class=\"col-md-11\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"panel-group\" id=\"accordion\" role=\"tablist\" aria-multiselectable=\"true\">\n");
      out.write("  <div class=\"panel panel-danger\">\n");
      out.write("    <div class=\"panel-heading\" role=\"tab\" id=\"headingOne\">\n");
      out.write("      <div class=\"col-md-6 \">\n");
      out.write("          ");
 
                    String a=session.getAttribute("UserName").toString();
                    
                    
                    Class.forName("com.mysql.jdbc.Driver");
                    	
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3326/sis","root","");
                    Statement st=con.createStatement();

                    ResultSet rs = st.executeQuery("SELECT * FROM xyz WHERE email='"+a+"'");
                    
      out.write("\n");
      out.write("                ");

                        try{
                                Class.forName("com.mysql.jdbc.Driver");	
                                
                                String sql="select *  from xyz";
                                rs=st.executeQuery(sql);
                                out.println("<table class='table table-bordered'>");	
                                while(rs.next())
                                {
                                        String email=rs.getString(16);
                                        out.println("<tr><td>"+email+"</td>");
                                        out.println("<td>"+rs.getString(1)+"</td>");
                                        out.println("<td>"+rs.getString(2)+"</td>");
                                        out.println("<td>"+rs.getString(3)+"</td>");
                                        out.println("<td>"+rs.getString(4)+"</td>");
                                        out.println("<td>"+rs.getString(5)+"</td>");
                                        out.println("<td>"+rs.getString(6)+"</td>");
                                        out.println("<td>"+rs.getString(7)+"</td>");
                                        out.println("<td>"+rs.getString(8)+"</td>");
                                        out.println("<td>"+rs.getString(9)+"</td>");
                                        out.println("<td>"+rs.getString(10)+"</td>");
                                        out.println("<td>"+rs.getString(11)+"</td>");
                                        out.println("<td>"+rs.getString(12)+"</td>");
                                        out.println("<td>"+rs.getString(13)+"</td>");
                                        out.println("<td>"+rs.getString(14)+"</td>");
                                        out.println("<td>"+rs.getString(15)+"</td>");
                                        out.println("<td>"+rs.getString(17)+"</td>");
                                        out.println("<td>"+rs.getString(18)+"</td>");
                                        out.println("<td>"+rs.getString(19)+"</td>");
                
      out.write("\n");
      out.write("                                        <td>\n");
      out.write("                                        <a href=\"record_update_1.jsp?email=");
      out.print(email );
      out.write("\" ><span class=\"glyphicon glyphicon-pencil\"></span>\n");
      out.write("                </a>\n");
      out.write("                                        </td>\n");
      out.write("                                        ");

                                        out.println("</tr>");		
                                }	
                                out.println("</table>");
                        }catch(Exception e)
                        {
                                out.println(e.toString());
                        }

                
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("      \n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("    <!--   Core JS Files   -->\n");
      out.write("    <script src=\"js/jquery-1.10.2.js\" type=\"text/javascript\"></script>\n");
      out.write("\t<script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("\t<!--  Checkbox, Radio & Switch Plugins -->\n");
      out.write("\t<script src=\"js/bootstrap-checkbox-radio-switch.js\"></script>\n");
      out.write("\n");
      out.write("\t<!--  Charts Plugin -->\n");
      out.write("\t<script src=\"js/chartist.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!--  Notifications Plugin    -->\n");
      out.write("    <script src=\"js/bootstrap-notify.js\"></script>\n");
      out.write("\n");
      out.write("   \n");
      out.write("\n");
      out.write("    <!-- Light Bootstrap Table Core javascript and methods for Demo purpose -->\n");
      out.write("\t<script src=\"js/light-bootstrap-dashboard.js\"></script>\n");
      out.write("\n");
      out.write("\t<!-- Light Bootstrap Table DEMO methods, don't include it in your project! -->\n");
      out.write("\t<script src=\"js/demo.js\"></script>\n");
      out.write("\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("    \t$(document).ready(function(){\n");
      out.write("\n");
      out.write("        \tdemo.initChartist();\n");
      out.write("\n");
      out.write("        \t$.notify({\n");
      out.write("            \ticon: 'pe-7s-gift',\n");
      out.write("            \tmessage: \"Welcome to <b>ESAD Dashboard</b> - a beautiful Place for every developer.\"\n");
      out.write("    <!--@BY shrey01-->\n");
      out.write("            },{\n");
      out.write("                type: 'info',\n");
      out.write("                timer: 4000\n");
      out.write("            });\n");
      out.write("\n");
      out.write("    \t});\n");
      out.write("\t</script>");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("    \n");
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
