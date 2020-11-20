package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import clases.Ubicacion;
import clases.Conexion;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.nio.charset.Charset;

public final class resultado_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<!--[if lt IE 7]>      <html class=\"no-js lt-ie9 lt-ie8 lt-ie7\" lang=\"\"> <![endif]-->\n");
      out.write("<!--[if IE 7]>         <html class=\"no-js lt-ie9 lt-ie8\" lang=\"\"> <![endif]-->\n");
      out.write("<!--[if IE 8]>         <html class=\"no-js lt-ie9\" lang=\"\"> <![endif]-->\n");
      out.write("<!--[if gt IE 8]><!--> <html class=\"no-js\" lang=\"es\"> <!--<![endif]-->\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("        <title>Habilitaciones Comerciales</title>\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta http-equiv=\"Expires\" content=\"0\">\n");
      out.write("        <meta http-equiv=\"Last-Modified\" content=\"0\">\n");
      out.write("        <meta http-equiv=\"Cache-Control\" content=\"no-cache, mustrevalidate\">\n");
      out.write("        <meta http-equiv=\"Pragma\" content=\"no-cache\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/estilos.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap-theme.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/main.css\">\n");
      out.write("        <link  rel=\"icon\"   href=\"img/favicon.ico\" type=\"image/png\" />\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <header > \n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row\" id=\"info\">\n");
      out.write("                    <div class=\"col-md-1\"></div>\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <nav class=\"navbar navbar-light bg-light\">\n");
      out.write("                            <span class=\"navbar-text\">\n");
      out.write("                                Tel. Lineas Rotativas: (02243) 459000\n");
      out.write("                            </span>\n");
      out.write("                        </nav>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <nav class=\"navbar-left\">\n");
      out.write("                            <span class=\"navbar-text\">\n");
      out.write("                                Juan E. de la Fuente Nº 826  (7223) Gral. Belgrano / Buenos Aires / Argentina.\n");
      out.write("                            </span>\n");
      out.write("                        </nav>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <div class=\"container-fluid\" >\n");
      out.write("            <div class=\"row\" > \n");
      out.write("                <div class=\"col-md-2\" >\n");
      out.write("\n");
      out.write("                    <ul class=\"nav nav-pills\" >\n");
      out.write("                        <li>\n");
      out.write("                            <img src=\"img/logoGeneralBelgrano.PNG\" id='imagen'  >\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\"></div>\n");
      out.write("\n");
      out.write("                <div class='col-md-7'>\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"http://www.generalbelgrano.gob.ar/\">Inicio</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"http://www.generalbelgrano.gob.ar/autoridades/\">Autoridades</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"http://www.generalbelgrano.gob.ar/partido/\">Partido</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"http://www.generalbelgrano.gob.ar/partido/\">Gobierno Abierto</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"http://www.generalbelgrano.tur.ar/\">Turismo</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"http://www.generalbelgrano.gob.ar/contacto/\">Contacto</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <img src=\"img/ril.png\" width=\"100px\" height=\"40px\">\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid\" id=\"titulo\">\n");
      out.write("            <div class=\"row\" >\n");
      out.write("                <div class=\"col-md-3\" style=\"margin-right: 50px\">\n");
      out.write("                </div>\n");
      out.write("                <div style=\"display: flex\" style=\"align-items: center\">\n");
      out.write("                    <svg id='tramite'  viewBox=\"0 0 16 16\" class=\"bi bi-card-text\" fill=\"currentColor\" xmlns=\"http://www.w3.org/2000/svg\">\n");
      out.write("                    <path fill-rule=\"evenodd\" d=\"M14.5 3h-13a.5.5 0 0 0-.5.5v9a.5.5 0 0 0 .5.5h13a.5.5 0 0 0 .5-.5v-9a.5.5 0 0 0-.5-.5zm-13-1A1.5 1.5 0 0 0 0 3.5v9A1.5 1.5 0 0 0 1.5 14h13a1.5 1.5 0 0 0 1.5-1.5v-9A1.5 1.5 0 0 0 14.5 2h-13z\"/>\n");
      out.write("                    <path fill-rule=\"evenodd\" d=\"M3 5.5a.5.5 0 0 1 .5-.5h9a.5.5 0 0 1 0 1h-9a.5.5 0 0 1-.5-.5zM3 8a.5.5 0 0 1 .5-.5h9a.5.5 0 0 1 0 1h-9A.5.5 0 0 1 3 8zm0 2.5a.5.5 0 0 1 .5-.5h6a.5.5 0 0 1 0 1h-6a.5.5 0 0 1-.5-.5z\"/>\n");
      out.write("                    </svg>\n");
      out.write("                    <div style=\"margin:15px 0 20px 20px;  \">\n");
      out.write("                        <h3 style=\"font-family: monospace\" style=\"font-weight: bold\">Analísis de factibilidad</h3>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
 

                String nombre= request.getParameter("nombre");
                    String dni = request.getParameter("numeroDni");
                    String razonSocial = request.getParameter("razonSocial");
                    String telefono = request.getParameter("telefono");
                    String cuit= request.getParameter("cuit");
                    String tipoTramite = request.getParameter("tipoTramite");
                    String actividad=  request.getParameter("actividad");
                    String s = new String(actividad.getBytes(),"UTF-8");
                    String calle= request.getParameter("calle");
                    String numeroCalle = request.getParameter("numeroCalle");
                    String piso = request.getParameter("piso");
                    String dpto = request.getParameter("dpto");
            
      out.write("\n");
      out.write("\n");
      out.write("           \n");
      out.write("            </div>  \n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <h2 id=\"respuesta\">\n");
      out.write("                Respuesta\n");
      out.write("            </h2>\n");
      out.write("            <div class=\"container-fluid\" id=\"informacions\">\n");
      out.write("                <h4>Nombre y Apellido: ");
      out.print(nombre);
      out.write("</h4>\n");
      out.write("                <h4>DNI: ");
      out.print(dni);
      out.write("</h4>\n");
      out.write("                <h4>RazonSocial: ");
      out.print(razonSocial);
      out.write("</h4>\n");
      out.write("                <h4>CUIT/CUIL: ");
      out.print(cuit);
      out.write("</h4> \n");
      out.write("                <h4>Telefono: ");
      out.print(telefono);
      out.write("</h4> \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <hr>\n");
      out.write("\n");
      out.write("            <table class=\"table table-bordered\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>Tramite</td>\n");
      out.write("                    <td>Actividad</td>\n");
      out.write("                    <td>Calle</td>\n");
      out.write("                    <td>N°</td>\n");
      out.write("                    <td>Dpto</td>\n");
      out.write("                    <td>Piso</td>\n");
      out.write("                    <td>Resultado</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                   <td>");
      out.print(tipoTramite);
      out.write("</td>\n");
      out.write("                   <td>\n");
      out.write("                     ");
      out.print(s);
      out.write(" \n");
      out.write("                   </td>\n");
      out.write("                   <td>");
      out.print(calle);
      out.write("</td>\n");
      out.write("                   <td>");
      out.print(numeroCalle);
      out.write("</td>\n");
      out.write("                   <td>");
      out.print(dpto);
      out.write("</td>\n");
      out.write("                   <td>");
      out.print(piso);
      out.write("</td>\n");
      out.write("                   <td>\n");
      out.write("                      ");

                          
                          try{
                            Conexion con= new Conexion();
                            PreparedStatement ps= con.conectar().prepareStatement("Select calle, zona from ubicacion where 'calle'="+ calle);
                            ResultSet rs = ps.executeQuery();
                            String bdCalle = rs.getString("calle");
                            String bdZona = rs.getString("zona");
                            Ubicacion ubicacion = new Ubicacion(bdCalle, bdZona);
                            ubicacion.analizar(actividad, bdZona);
                          
                          }catch(NullPointerException e){
                              out.print("Calle no encontrada");
                          }
                          
                          
                      
      out.write(" \n");
      out.write("                   </td> \n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <hr>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</body>\n");
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
