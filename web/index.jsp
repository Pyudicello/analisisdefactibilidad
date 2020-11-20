<%-- 
    Document   : index
    Created on : 16/11/2020, 12:19:59
    Author     : palia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7" lang=""> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8" lang=""> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9" lang=""> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js" lang="es"> <!--<![endif]-->
    <head>
        
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title>Habilitaciones Comerciales</title>
        <meta name="description" content="">s
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Expires" content="0">
        <meta http-equiv="Last-Modified" content="0">
        <meta http-equiv="Cache-Control" content="no-cache, mustrevalidate">
        <meta http-equiv="Pragma" content="no-cache">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="css/estilos.css">

        <link rel="stylesheet" href="css/bootstrap-theme.min.css">
        <link rel="stylesheet" href="css/main.css">
        <link  rel="icon"   href="img/favicon.ico" type="image/png" />

    </head>
    <body>

        <header > 
            <div class="container-fluid">
                <div class="row" id="info">
                    <div class="col-md-1"></div>
                    <div class="col-md-4">
                        <nav class="navbar navbar-light bg-light">
                            <span class="navbar-text">
                                Tel. Lineas Rotativas: (02243) 459000
                            </span>
                        </nav>

                    </div>
                    <div class="col-md-6">
                        <nav class="navbar-left">
                            <span class="navbar-text">
                                Juan E. de la Fuente Nº 826 (7223) Gral. Belgrano / Buenos Aires / Argentina.
                            </span>
                        </nav>
                    </div>
                </div>
            </div>
        </header>
        <div class="container-fluid" >
            <div class="row" > 
                <div class="col-md-2" >

                    <ul class="nav nav-pills" >
                        <li>
                            <img src="img/logoGeneralBelgrano.PNG" id='imagen'  >
                        </li>
                    </ul>
                </div>
                <div class="col-md-3"></div>

                <div class='col-md-7'>
                    <ul class="nav navbar-nav">
                        <li class="nav-item">
                            <a class="nav-link" href="http://www.generalbelgrano.gob.ar/">Inicio</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="http://www.generalbelgrano.gob.ar/autoridades/">Autoridades</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="http://www.generalbelgrano.gob.ar/partido/">Partido</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="http://www.generalbelgrano.gob.ar/partido/">Gobierno Abierto</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="http://www.generalbelgrano.tur.ar/">Turismo</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="http://www.generalbelgrano.gob.ar/contacto/">Contacto</a>
                        </li>
                        <li>
                            <img src="img/ril.png" width="100px" height="40px">
                        </li>

                    </ul>
                </div>

            </div>
        </div>

        <div class="container-fluid" id="titulo">
            <div class="row" >
                <div class="col-md-3" style="margin-right: 50px">
                </div>
                <div style="display: flex" style="align-items: center" >
                    <svg id='tramite'  viewBox="0 0 16 16" class="bi bi-card-text" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                    <path fill-rule="evenodd" d="M14.5 3h-13a.5.5 0 0 0-.5.5v9a.5.5 0 0 0 .5.5h13a.5.5 0 0 0 .5-.5v-9a.5.5 0 0 0-.5-.5zm-13-1A1.5 1.5 0 0 0 0 3.5v9A1.5 1.5 0 0 0 1.5 14h13a1.5 1.5 0 0 0 1.5-1.5v-9A1.5 1.5 0 0 0 14.5 2h-13z"/>
                    <path fill-rule="evenodd" d="M3 5.5a.5.5 0 0 1 .5-.5h9a.5.5 0 0 1 0 1h-9a.5.5 0 0 1-.5-.5zM3 8a.5.5 0 0 1 .5-.5h9a.5.5 0 0 1 0 1h-9A.5.5 0 0 1 3 8zm0 2.5a.5.5 0 0 1 .5-.5h6a.5.5 0 0 1 0 1h-6a.5.5 0 0 1-.5-.5z"/>
                    </svg>
                    <div style="margin:15px 10px 20px 20px;  ">
                        <h3 id="analisis">Analísis de factibilidad</h3>
                    </div>
                </div>

            </div>   
        </div>
        <form method="post" action="resultado.jsp" name="enviar">
             <div class="container">
            <hr>
            
            
            <div class="row">
                <div class="col-md-3">
                    
                        
                    
                    <label id="tipoDoc" >Tipo Doc.</label>
                    <select name="tipoidentificacion" >
                        <option value="dni">DNI</option>
                        <option value="lc">L.C</option>
                        <option value="le">L.E</option>
                        <option value="ci">C.I</option>
                        <option value="pas">Pas</option>
                    </select>
                    
                </div>
                <div class="col-md-9">
                    <label  style="margin-right: 20px">Nro DNI</label>
                    <input type="number" id="dni" name="numeroDni" required="required" ><br>
                </div>

            </div>
            <div>
                    <label for="nombre" style="padding-right: 30px">Nombre y Apellido</label>
                    <input type="text"  name="nombre" style="margin-bottom: 20px" required="required"><br>
                    <label for="nombre" style="padding-right: 65px">Razon Social</label>
                    <input type="text"  name="razonSocial" style="margin-bottom: 20px" required="required"><br>
                    <label for="apellido" style="padding-right: 92px">Telefono</label>
                    <input type="number"  name="telefono" style="margin-bottom: 20px" required="required"><br>
                    <label for="" style="padding-right: 71px">CUIT/CUIL</label>
                    <input type="number"  name="cuit" style="margin-bottom: 20px" required="required"><br>

               
                
            </div>
            <div>
                
                <label id="etiquetaTipoTramite" >Tipo de tramite</label>
                <select name="tipoTramite" >
                    <option>Ampliacion de local</option>
                    <option>Anexo de Rubro</option>
                    <option>Cambio de Rubro</option>
                    <option>Habilitacion</option>
                    <option>Traslado de local</option>
                </select>
                
            </div>
            <div>
                
                <label id="etiquetaActividad">Actividad</label>
                <select name="actividad"  required style="margin-bottom: 20px">
                    <option>Actividades especializadas de construcción</option>
                    <option>Administración de fondos de jubilaciones y pensiones</option>
                    <option>Apicultura</option>
                    <option>Cría de ganado y producción de leche , lana y pelos</option>
                    <option>Confección de prendas de vestir</option>
                    <option>Cultivos agricolas</option>
                    <option>Cultivos de tabaco</option>
                    <option>Curtido y terminación de cueros</option>
                    <option>Edición de libros, folletos, partituras y otras publicaciones</option>
                    <option>Elaboración de alimentos preparados para animales</option>
                    <option>Elaboración de aceites y grasas de origen vegetal</option>
                    <option>Elaboración de azúcar</option>
                    <option>Elaboración de bebidas</option>
                    <option>Elaboración de combustible nuclear</option>
                    <option>Elaboración de fiambres y embutidos</option>>
                    <option>Elaboración de pastas alimenticias</option>
                    <option>Elaboración de productos alimenticios n.c.p.</option>
                    <option>Elaboración de productos de panadería</option>
                    <option>Elaboración de productos de tabaco</option>
                    <option>Elaboración de productos lácteos</option>
                    <option>Elaboración de pulpas, jaleas, dulces y mermeladas </option>
                    <option>Elaboración de vinos</option>
                    <option>Elaboración de yerba mate</option>
                    <option>Eliminación de desperdicios y aguas residuales, saneamiento y servicios similares</option>
                    <option>Enseñanza inicial y primaria</option>
                    <option>Enseñanza secundaria</option>
                    <option>Enseñanza superior y formación de posgrado</option>
                    <option>Enseñanza terciaria</option>
                    <option>Explotación de minas y canteras n.c.p.</option>
                    <option>Extracción de minerales de hierro</option>
                    <option>Extracción de minerales y concentrados de uranio y torio</option>
                    <option>Extracción de petróleo crudo y gas natural</option>
                    <option>Extracción de sal en salinas y de roca</option>
                    <option>Elaboración industrial de helados</option>
                    <option>Extracción y aglomeración de carbón </option>
                    <option>Fabricación de armas y municiones</option>
                    <option>Fabricación de calzado y de sus partes</option>
                    <option>Fabricación de cosméticos, perfumes y productos de higiene y tocador</option>
                    <option>Fabricación de hilados y tejidos; acabado de productos textiles</option>
                    <option>Fabricación de medicamentos de uso humano y productos farmacéuticos</option>
                    <option>Fabricación de papel y de productos de papel</option>
                    <option>Fabricación de productos de madera, corcho, paja y materiales trenzables</option>
                    <option>Fabricación de relojes </option>
                    <option>Fabricación de sustancias químicas básicas</option>
                    <option>Fabricación de tapices y alfombras</option>
                    <option>Fabricación de vidrio y productos de vidrio</option>
                    <option>Fundición de metales</option>
                    <option>Investigación y desarrollo experimental en el campo de las ciencias médicas</option>
                    <option>Mantenimiento y reparación de frenos</option>
                    <option>Mantenimiento y reparación de maquinaria de oficina, contabilidad e informática</option>
                    <option>Mantenimiento y reparación del motor</option>
                    <option>Molienda de trigo</option>
                    <option>Pesca y recolección de productos marinos</option>
                    <option>Pintura y trabajos de decoración</option>
                    <option>Pompas fúnebres y servicios conexos</option>
                    <option>Preparación y venta de comidas para llevar</option>
                    <option>Recolección, reducción y eliminación de desperdicios</option>
                    <option>Reparaciones eléctricas, del tablero e instrumental; reparación y recarga de baterías</option>
                    <option>Servicios agrícolas</option>
                    <option>Servicios de almacenamiento y depósito</option>
                    <option>Servicios de alojamiento en camping</option>
                    <option>Servicios de alojamiento por hora</option>
                    <option>Servicios de bibliotecas, archivos y museos y servicios culturales</option>
                    <option>Servicios de bolsas de Comercio </option>
                    <option>Servicios de consultores en equipo de informática </option>
                    <option>Servicios de correos</option>
                    <option>Servicios de la banca central </option>
                    <option>Servicios de limpieza de edificios</option>
                    <option>Servicios de maquinaria agrícola, excepto los de cosecha mecánica</option>
                    <option>Servicios de mudanza</option>
                    <option>Servicios de organizaciones religiosas</option>
                    <option>Servicios de peluquería y tratamientos de belleza</option>
                    <option>Servicios de publicidad</option>
                    <option>Servicios de radio y televisión </option>
                    <option>Servicios de salones de baile, discotecas y similares</option>
                    <option>Servicio de transporte escolar</option>
                    <option>Servicios financieros</option>
                    <option>Servicios minoristas de agencias de viajes</option>
                    <option>Servicios para la pesca</option>
                    <option>Servicios prestados por profesionales y técnicos, para la realización de prácticas deportivas</option>
                    <option>Servicios relacionados con la impresión</option>
                    <option>Servicios relacionados con la salud humana</option>
                    <option>Servicios jurídicos</option>
                    <option>Servicios veterinarios</option>
                    <option>Tapizado y retapizado </option>
                    <option>Venta al por mayor de alimentos</option>
                    <option>Venta al por mayor de artículos de iluminación </option>
                    <option>Venta al por mayor de bebidas alcohólicas</option>
                    <option>Venta al por mayor de libros, revistas y diarios </option>
                    <option>Venta al por menor de antigüedades</option>
                    <option>Venta al por menor de muebles usados</option>
                    <option>Venta al por menor en kioscos , polirrubros y comercios no especializados</option>
                    <option>Venta al por menor en minimercados con predominio de productos alimenticios y bebidas</option>
                    <option>Venta de autos, camionetas y utilitarios usados</option>
                    <option>Venta de vehículos automotores</option>
                    <option>Venta, mantenimiento y reparación de motocicletas y de sus partes, piezas y accesorios</option>


                </select> 
                
            </div>
            <div>
                
                    <label style="margin-right: 115px" >Calle</label>
                    <input type="text" id="labelCalle" name="calle" style="margin-bottom: 20px" required="required"><br>
                    
                
                <div class="row">
                    <div class="col-md-2">
                       
                        <label style="padding-right: 10px">Número</label>
                        <input type="number" name="numeroCalle" style="margin-bottom: 20px" id="input" required="required"><br>
                        
                    </div>
                    <div class="col-md-2">
                        
                            <label  style="padding-right: 10px">Piso</label>
                            <input type="number" name="piso" style="margin-bottom: 20px" id="input"><br> 
                        
                    </div>   
                    <div class="col-md-3">
                        
                        <label  style="padding-right: 10px">Departamento</label>
                        <input  type="text" name="dpto" style="margin-bottom: 20px" id="input"><br>
                        
                    </div>
                    
                   
                </div>
                
            </div>
            
            <button onclick="Habilitaciones/respuesta.jsp" type="submit" name="enviarDatos">Analizar factibilidad</button>
            
            
            
          

        </div>   
                
        </form>

        
        <%
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
            
            

  
        
        %>
        
        
        
        
            

    </body>
</html>
