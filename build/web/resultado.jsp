<%-- 
    Document   : respuesta
    Created on : 16/11/2020, 12:21:01
    Author     : palia
--%>

<%@page import="clases.Ubicacion"%>
<%@page import="clases.Conexion"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.nio.charset.Charset"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7" lang=""> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8" lang=""> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9" lang=""> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js" lang="es"> <!--<![endif]-->
    <head>
        
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title>Habilitaciones Comerciales</title>
        <meta name="description" content="">
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
                                Juan E. de la Fuente Nº 826  (7223) Gral. Belgrano / Buenos Aires / Argentina.
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
                <div style="display: flex" style="align-items: center">
                    <svg id='tramite'  viewBox="0 0 16 16" class="bi bi-card-text" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
                    <path fill-rule="evenodd" d="M14.5 3h-13a.5.5 0 0 0-.5.5v9a.5.5 0 0 0 .5.5h13a.5.5 0 0 0 .5-.5v-9a.5.5 0 0 0-.5-.5zm-13-1A1.5 1.5 0 0 0 0 3.5v9A1.5 1.5 0 0 0 1.5 14h13a1.5 1.5 0 0 0 1.5-1.5v-9A1.5 1.5 0 0 0 14.5 2h-13z"/>
                    <path fill-rule="evenodd" d="M3 5.5a.5.5 0 0 1 .5-.5h9a.5.5 0 0 1 0 1h-9a.5.5 0 0 1-.5-.5zM3 8a.5.5 0 0 1 .5-.5h9a.5.5 0 0 1 0 1h-9A.5.5 0 0 1 3 8zm0 2.5a.5.5 0 0 1 .5-.5h6a.5.5 0 0 1 0 1h-6a.5.5 0 0 1-.5-.5z"/>
                    </svg>
                    <div style="margin:15px 0 20px 20px;  ">
                        <h3 style="font-family: monospace" style="font-weight: bold">Analísis de factibilidad</h3>
                    </div>
                </div>
<% 

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
            %>

           
            </div>  


        </div>

        <div class="container-fluid">
            <h2 id="respuesta">
                Respuesta
            </h2>
            <div class="container-fluid" id="informacions">
                <h4>Nombre y Apellido: <%=nombre%></h4>
                <h4>DNI: <%=dni%></h4>
                <h4>RazonSocial: <%=razonSocial%></h4>
                <h4>CUIT/CUIL: <%=cuit%></h4> 
                <h4>Telefono: <%=telefono%></h4> 
            </div>
            
            
            <hr>

            <table class="table table-bordered">
                <tr>
                    <td style="background-color: greenyellow">Tramite</td>
                    <td style="background-color: greenyellow">Actividad</td>
                    <td style="background-color: greenyellow">Calle</td>
                    <td style="background-color: greenyellow">N°</td>
                    <td style="background-color: greenyellow">Dpto</td>
                    <td style="background-color: greenyellow">Piso</td>
                    <td style="background-color: greenyellow">Resultado</td>
                </tr>
                <tr>
                   <td><%=tipoTramite%></td>
                   <td>
                     <%=s%> 
                   </td>
                   <td><%=calle%></td>
                   <td><%=numeroCalle%></td>
                   <td><%=dpto%></td>
                   <td><%=piso%></td>
                   <td style="background-color: yellow">
                      <%
                          
                          try{
                            Class.forName("com.mysql.jdbc.Driver");
                            Conexion con= new Conexion();
                            PreparedStatement ps= con.conectar().prepareStatement("Select calle, zona from ubicacion where calle='"+ calle+"'");
                            ResultSet rs = ps.executeQuery();
                            String bdCalle=null;
                            int bdZona= 0;
                            
                            if(rs.next()){
                               bdCalle = rs.getString("calle");
                               bdZona = rs.getInt("zona"); 
                               Ubicacion ubicacion = new Ubicacion(bdCalle, bdZona);
                               out.print(ubicacion.analizar(actividad, bdZona));
                               
                            }else{
                               out.print("Calle no encontradada");
                            }
                            
                            
                          
                          }catch(NullPointerException e){
                              
                              out.print("Error");
                              
                          }
                          
                          
                      %> 
                   </td> 
                </tr>
            </table>
                   
                   
            <hr>
            <div class="container-fluid" style="margin-left: 400px">
                <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d51796.45485998656!2d-58.52865548555612!3d-35.7685363813178!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x9597f11ea29beac7%3A0xb19bea23651398c0!2sGral.%20Belgrano%2C%20Provincia%20de%20Buenos%20Aires!5e0!3m2!1ses-419!2sar!4v1605642493339!5m2!1ses-419!2sar" width="400" height="300" frameborder="0" style="border:0;" allowfullscreen="" aria-hidden="false" tabindex="0"></iframe>
            </div>
            
            
            
            
        </div>




    </body>

</body>
</html>