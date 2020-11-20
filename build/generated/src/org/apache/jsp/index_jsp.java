package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!doctype html>\n");
      out.write("<!--[if lt IE 7]>      <html class=\"no-js lt-ie9 lt-ie8 lt-ie7\" lang=\"\"> <![endif]-->\n");
      out.write("<!--[if IE 7]>         <html class=\"no-js lt-ie9 lt-ie8\" lang=\"\"> <![endif]-->\n");
      out.write("<!--[if IE 8]>         <html class=\"no-js lt-ie9\" lang=\"\"> <![endif]-->\n");
      out.write("<!--[if gt IE 8]><!--> <html class=\"no-js\" lang=\"es\"> <!--<![endif]-->\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
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
      out.write("                                Juan E. de la Fuente Nº 826 (7223) Gral. Belgrano / Buenos Aires / Argentina.\n");
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
      out.write("                <div style=\"display: flex\" style=\"align-items: center\" >\n");
      out.write("                    <svg id='tramite'  viewBox=\"0 0 16 16\" class=\"bi bi-card-text\" fill=\"currentColor\" xmlns=\"http://www.w3.org/2000/svg\">\n");
      out.write("                    <path fill-rule=\"evenodd\" d=\"M14.5 3h-13a.5.5 0 0 0-.5.5v9a.5.5 0 0 0 .5.5h13a.5.5 0 0 0 .5-.5v-9a.5.5 0 0 0-.5-.5zm-13-1A1.5 1.5 0 0 0 0 3.5v9A1.5 1.5 0 0 0 1.5 14h13a1.5 1.5 0 0 0 1.5-1.5v-9A1.5 1.5 0 0 0 14.5 2h-13z\"/>\n");
      out.write("                    <path fill-rule=\"evenodd\" d=\"M3 5.5a.5.5 0 0 1 .5-.5h9a.5.5 0 0 1 0 1h-9a.5.5 0 0 1-.5-.5zM3 8a.5.5 0 0 1 .5-.5h9a.5.5 0 0 1 0 1h-9A.5.5 0 0 1 3 8zm0 2.5a.5.5 0 0 1 .5-.5h6a.5.5 0 0 1 0 1h-6a.5.5 0 0 1-.5-.5z\"/>\n");
      out.write("                    </svg>\n");
      out.write("                    <div style=\"margin:15px 10px 20px 20px;  \">\n");
      out.write("                        <h3 id=\"analisis\">Analísis de factibilidad</h3>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>   \n");
      out.write("        </div>\n");
      out.write("        <form method=\"post\" action=\"resultado.jsp\" name=\"enviar\">\n");
      out.write("             <div class=\"container\">\n");
      out.write("            <hr>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    \n");
      out.write("                        \n");
      out.write("                    \n");
      out.write("                    <label id=\"tipoDoc\" >Tipo Doc.</label>\n");
      out.write("                    <select name=\"tipoidentificacion\" >\n");
      out.write("                        <option value=\"dni\">DNI</option>\n");
      out.write("                        <option value=\"lc\">L.C</option>\n");
      out.write("                        <option value=\"le\">L.E</option>\n");
      out.write("                        <option value=\"ci\">C.I</option>\n");
      out.write("                        <option value=\"pas\">Pas</option>\n");
      out.write("                    </select>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-9\">\n");
      out.write("                    <label  style=\"margin-right: 20px\">Nro DNI</label>\n");
      out.write("                    <input type=\"number\" id=\"dni\" name=\"numeroDni\" required=\"required\" ><br>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                    <label for=\"nombre\" style=\"padding-right: 30px\">Nombre y Apellido</label>\n");
      out.write("                    <input type=\"text\"  name=\"nombre\" style=\"margin-bottom: 20px\" required=\"required\"><br>\n");
      out.write("                    <label for=\"nombre\" style=\"padding-right: 65px\">Razon Social</label>\n");
      out.write("                    <input type=\"text\"  name=\"razonSocial\" style=\"margin-bottom: 20px\" required=\"required\"><br>\n");
      out.write("                    <label for=\"apellido\" style=\"padding-right: 92px\">Telefono</label>\n");
      out.write("                    <input type=\"number\"  name=\"telefono\" style=\"margin-bottom: 20px\" required=\"required\"><br>\n");
      out.write("                    <label for=\"\" style=\"padding-right: 71px\">CUIT/CUIL</label>\n");
      out.write("                    <input type=\"number\"  name=\"cuit\" style=\"margin-bottom: 20px\" required=\"required\"><br>\n");
      out.write("\n");
      out.write("               \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                \n");
      out.write("                <label id=\"etiquetaTipoTramite\" >Tipo de tramite</label>\n");
      out.write("                <select name=\"tipoTramite\" >\n");
      out.write("                    <option>Ampliacion de local</option>\n");
      out.write("                    <option>Anexo de Rubro</option>\n");
      out.write("                    <option>Cambio de Rubro</option>\n");
      out.write("                    <option>Habilitacion</option>\n");
      out.write("                    <option>Traslado de local</option>\n");
      out.write("                </select>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                \n");
      out.write("                <label id=\"etiquetaActividad\">Actividad</label>\n");
      out.write("                <select name=\"actividad\"  required style=\"margin-bottom: 20px\">\n");
      out.write("                    <option>Actividades especializadas de construcción</option>\n");
      out.write("                    <option>Administración de fondos de jubilaciones y pensiones</option>\n");
      out.write("                    <option>Apicultura</option>\n");
      out.write("                    <option>Cría de ganado y producción de leche , lana y pelos</option>\n");
      out.write("                    <option>Confección de prendas de vestir</option>\n");
      out.write("                    <option>Cultivos agricolas</option>\n");
      out.write("                    <option>Cultivo de tabaco</option>\n");
      out.write("                    <option>Curtido y terminación de cueros</option>\n");
      out.write("                    <option>Edición de libros, folletos, partituras y otras publicaciones</option>\n");
      out.write("                    <option>Elaboración de alimentos preparados para animales</option>\n");
      out.write("                    <option>Elaboración de aceites y grasas de origen vegetal</option>\n");
      out.write("                    <option>Elaboración de azúcar</option>\n");
      out.write("                    <option>Elaboración de bebidas</option>\n");
      out.write("                    <option>Elaboración de combustible nuclear</option>\n");
      out.write("                    <option>Elaboración de fiambres y embutidos</option>>\n");
      out.write("                    <option>Elaboración de pastas alimenticias</option>\n");
      out.write("                    <option>Elaboración de productos alimenticios n.c.p.</option>\n");
      out.write("                    <option>Elaboración de productos de panadería</option>\n");
      out.write("                    <option>Elaboración de productos de tabaco</option>\n");
      out.write("                    <option>Elaboración de productos lácteos</option>\n");
      out.write("                    <option>Elaboración de pulpas, jaleas, dulces y mermeladas </option>\n");
      out.write("                    <option>Elaboración de vinos</option>\n");
      out.write("                    <option>Elaboración de yerba mate</option>\n");
      out.write("                    <option>Eliminación de desperdicios y aguas residuales, saneamiento y servicios similares</option>\n");
      out.write("                    <option>Enseñanza inicial y primaria</option>\n");
      out.write("                    <option>Enseñanza secundaria</option>\n");
      out.write("                    <option>Enseñanza superior y formación de posgrado</option>\n");
      out.write("                    <option>Enseñanza terciaria</option>\n");
      out.write("                    <option>Explotación de minas y canteras n.c.p.</option>\n");
      out.write("                    <option>Extracción de minerales de hierro</option>\n");
      out.write("                    <option>Extracción de minerales y concentrados de uranio y torio</option>\n");
      out.write("                    <option>Extracción de petróleo crudo y gas natural</option>\n");
      out.write("                    <option>Extracción de sal en salinas y de roca</option>\n");
      out.write("                    <option>Elaboración industrial de helados</option>\n");
      out.write("                    <option>Extracción y aglomeración de carbón </option>\n");
      out.write("                    <option>Fabricación de armas y municiones</option>\n");
      out.write("                    <option>Fabricación de calzado y de sus partes</option>\n");
      out.write("                    <option>Fabricación de cosméticos, perfumes y productos de higiene y tocador</option>\n");
      out.write("                    <option>Fabricación de hilados y tejidos; acabado de productos textiles</option>\n");
      out.write("                    <option>Fabricación de medicamentos de uso humano y productos farmacéuticos</option>\n");
      out.write("                    <option>Fabricación de papel y de productos de papel</option>\n");
      out.write("                    <option>Fabricación de productos de madera, corcho, paja y materiales trenzables</option>\n");
      out.write("                    <option>Fabricación de relojes </option>\n");
      out.write("                    <option>Fabricación de sustancias químicas básicas</option>\n");
      out.write("                    <option>Fabricación de tapices y alfombras</option>\n");
      out.write("                    <option>Fabricación de vidrio y productos de vidrio</option>\n");
      out.write("                    <option>Fundición de metales</option>\n");
      out.write("                    <option>Investigación y desarrollo experimental en el campo de las ciencias médicas</option>\n");
      out.write("                    <option>Mantenimiento y reparación de frenos</option>\n");
      out.write("                    <option>Mantenimiento y reparación de maquinaria de oficina, contabilidad e informática</option>\n");
      out.write("                    <option>Mantenimiento y reparación del motor</option>\n");
      out.write("                    <option>Molienda de trigo</option>\n");
      out.write("                    <option>Pesca y recolección de productos marinos</option>\n");
      out.write("                    <option>Pintura y trabajos de decoración</option>\n");
      out.write("                    <option>Pompas fúnebres y servicios conexos</option>\n");
      out.write("                    <option>Preparación y venta de comidas para llevar</option>\n");
      out.write("                    <option>Recolección, reducción y eliminación de desperdicios</option>\n");
      out.write("                    <option>Reparaciones eléctricas, del tablero e instrumental; reparación y recarga de baterías</option>\n");
      out.write("                    <option>Servicios agrícolas</option>\n");
      out.write("                    <option>Servicios de almacenamiento y depósito</option>\n");
      out.write("                    <option>Servicios de alojamiento en camping</option>\n");
      out.write("                    <option>Servicios de alojamiento por hora</option>\n");
      out.write("                    <option>Servicios de bibliotecas, archivos y museos y servicios culturales</option>\n");
      out.write("                    <option>Servicios de bolsas de Comercio </option>\n");
      out.write("                    <option>Servicios de consultores en equipo de informática </option>\n");
      out.write("                    <option>Servicios de correos</option>\n");
      out.write("                    <option>Servicios de la banca central </option>\n");
      out.write("                    <option>Servicios de limpieza de edificios</option>\n");
      out.write("                    <option>Servicios de maquinaria agrícola, excepto los de cosecha mecánica</option>\n");
      out.write("                    <option>Servicios de mudanza</option>\n");
      out.write("                    <option>Servicios de organizaciones religiosas</option>\n");
      out.write("                    <option>Servicios de peluquería y tratamientos de belleza</option>\n");
      out.write("                    <option>Servicios de publicidad</option>\n");
      out.write("                    <option>Servicios de radio y televisión </option>\n");
      out.write("                    <option>Servicios de salones de baile, discotecas y similares</option>\n");
      out.write("                    <option>Servicio de transporte escolar</option>\n");
      out.write("                    <option>Servicios financieros</option>\n");
      out.write("                    <option>Servicios minoristas de agencias de viajes</option>\n");
      out.write("                    <option>Servicios para la pesca</option>\n");
      out.write("                    <option>Servicios prestados por profesionales y técnicos, para la realización de prácticas deportivas</option>\n");
      out.write("                    <option>Servicios relacionados con la impresión</option>\n");
      out.write("                    <option>Servicios relacionados con la salud humana</option>\n");
      out.write("                    <option>Servicios jurídicos</option>\n");
      out.write("                    <option>Servicios veterinarios</option>\n");
      out.write("                    <option>Tapizado y retapizado </option>\n");
      out.write("                    <option>Venta al por mayor de alimentos</option>\n");
      out.write("                    <option>Venta al por mayor de artículos de iluminación </option>\n");
      out.write("                    <option>Venta al por mayor de bebidas alcohólicas</option>\n");
      out.write("                    <option>Venta al por mayor de libros, revistas y diarios </option>\n");
      out.write("                    <option>Venta al por menor de antigüedades</option>\n");
      out.write("                    <option>Venta al por menor de muebles usados</option>\n");
      out.write("                    <option>Venta al por menor en kioscos , polirrubros y comercios no especializados</option>\n");
      out.write("                    <option>Venta al por menor en minimercados con predominio de productos alimenticios y bebidas</option>\n");
      out.write("                    <option>Venta de autos, camionetas y utilitarios usados</option>\n");
      out.write("                    <option>Venta de vehículos automotores</option>\n");
      out.write("                    <option>Venta, mantenimiento y reparación de motocicletas y de sus partes, piezas y accesorios</option>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </select> \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                \n");
      out.write("                    <label style=\"margin-right: 115px\" >Calle</label>\n");
      out.write("                    <input type=\"text\" id=\"labelCalle\" name=\"calle\" style=\"margin-bottom: 20px\" required=\"required\"><br>\n");
      out.write("                    \n");
      out.write("                \n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-2\">\n");
      out.write("                       \n");
      out.write("                        <label style=\"padding-right: 10px\">Número</label>\n");
      out.write("                        <input type=\"number\" name=\"numeroCalle\" style=\"margin-bottom: 20px\" id=\"input\" required=\"required\"><br>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-2\">\n");
      out.write("                        \n");
      out.write("                            <label  style=\"padding-right: 10px\">Piso</label>\n");
      out.write("                            <input type=\"number\" name=\"piso\" style=\"margin-bottom: 20px\" id=\"input\"><br> \n");
      out.write("                        \n");
      out.write("                    </div>   \n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("                        \n");
      out.write("                        <label  style=\"padding-right: 10px\">Departamento</label>\n");
      out.write("                        <input  type=\"text\" name=\"dpto\" style=\"margin-bottom: 20px\" id=\"input\"><br>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                   \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <button onclick=\"Habilitaciones/respuesta.jsp\" type=\"submit\" name=\"enviarDatos\">Analizar factibilidad</button>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("          \n");
      out.write("\n");
      out.write("        </div>   \n");
      out.write("                \n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        ");

            if (request.getParameter("enviarDatos") != null) {
                    String nombre= request.getParameter("nombre");
                    String dni = request.getParameter("numeroDni");
                    String razonSocial = request.getParameter("razonSocial");
                    String telefono = request.getParameter("telefono");
                    String cuit= request.getParameter("cuit");
                    String tipoTramite = request.getParameter("tipoTramite");
                    String actividad=  request.getParameter("actividad");
                    
                    String calle= request.getParameter("calle");
                    String numeroCalle = request.getParameter("numeroCalle");
                    String piso = request.getParameter("piso");
                    String dpto = request.getParameter("dpto");
                }
            
            

  
        
        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("            \n");
      out.write("\n");
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
