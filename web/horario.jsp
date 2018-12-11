
<%@page contentType="text/html" pageEncoding="UTF-8" import="Util.Conexion"%>
<!DOCTYPE html>
<%@page import="Model.DaoUser "%>
<%@page import="Controller.Beans.User"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro Horario</title>
        <link href="<%=request.getContextPath()%>/View/css/horario.css" rel="stylesheet" type="text/css"/>
        <script src="<%=request.getContextPath()%>/View/Js/3boton.js"></script>
    </head>
    <body>
        <center><h1 id="titulo">Sistema De Registro de Horario - TimesSoft</h1></center>
        <form id="form2" name="form2" action="<%=request.getContextPath()%>" method="post">
                <fieldset>    
                <H1>Formulario Registro Horario</H1>
                <br>
                <input type="hidden" name="txtOpcion" id="txtOpcion"/> 
                <Label>No Ficha</Label><br>
<input title="Se necesita llenar este campo" type="text" name="idduser" value="<%if (request.getAttribute("Us_idd") != null) {%>${Us_idd}<%}%>" required><br>
               <br>
                <Label>Sede</Label><br>
<input type="text" name="tduser" value="<%if (request.getAttribute("Us_td") != null) {%>${Us_td}<%}%>" required><br>
               <br>
                    <Label>Hora Inicio</Label><br>
<input type="text" name="nombreuser" value="<%if (request.getAttribute("Us_nom") != null) {%>${Us_nom}<%}%>" required><br>
                    <br>
                     
                       <Label>Hora Fin</Label><br>
     <input type="text" name="apelliuser" value="<%if (request.getAttribute("Us_ape") != null) {%>${Us_ape}<%}%>" required><br>
                         <br>
                          <Label>No Documento</Label><br>
<input type="text" name="estadouser" value="<%if (request.getAttribute("Us_es") != null) {%>${Us_es}<%}%>" required><br>
                         <br>
                         <Label>Dia</Label><br>
<input type="text" name="emailuser" value="<%if (request.getAttribute("Us_em") != null) {%>${Us_em}<%}%>" required><br>
                         <br>
                         <Label>Competencia</Label><br>
<input type="text" name="roluser" value="<%if (request.getAttribute("Us_rol") != null) {%>${Us_rol}<%}%>" required><br>
                        <br>
                        <center><input id="btnRegistrar" type="button" value="Registrar" onclick="opcionInsertar();"/>
                        <input id="btnConsultar" type="button" value="Consultar" onclick="opcionConsultar();"/>
                        <input id="btnModificar" type="button" value="Modificar" onclick="opcionModificar();" />   </center>
                        
                        <section hidden>
                            <span id="sessionUsuario" css="position:absolute; top:-1000px;">${sessionScope.variable}</span>
                        </section>
                          <% if (request.getAttribute("mensaje") != null) {%>

                            ${mensaje}
                            <%}%>
                             </fieldset>
                 
                        </form>
                            <div botones>
                                <h2 id="finsesion"><a href="index.jsp">Cerrar Sesion</a></h2>
                            </div>
    </body>
</html>
