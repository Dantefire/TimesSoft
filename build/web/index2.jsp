
<%@page contentType="text/html" pageEncoding="UTF-8" import="Util.Conexion"%>
<!DOCTYPE html>
<%@page import="Model.DaoUser "%>
<%@page import="Controller.Beans.User"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro Usuario</title>
        <link href="<%=request.getContextPath()%>/View/css/index2.css" rel="stylesheet" type="text/css"/>
        <script src="<%=request.getContextPath()%>/View/Js/3boton.js"></script>
    </head>
    <body>
    <center><h1 id="titulo">Sistema De Registro de Usuario - TimesSoft</h1></center>
        <form id="form1" name="form1" action="<%=request.getContextPath()%>/user.do" method="post">
                <fieldset>    
                <H1>Formulario Registro Usuario</H1>
                <br>
                <input type="hidden" name="txtOpcion" id="txtOpcion"/> 
                <Label>No Documento</Label><br>
<input title="Se necesita llenar este campo" type="text" name="idduser" value="<%if (request.getAttribute("Us_idd") != null) {%>${Us_idd}<%}%>" required><br>
               <br>
                <Label>Tipo de Documento</Label><br>
               <br>
                <select name="selettdoc">

                            <%
                                out.print("<option>" + request.getAttribute("Us_td") + "</option>");
                            %> 
                            <% //Bloque de Codigo para consultar el Tipo de Documento
                                Conexion cdoc = new Conexion();
                                cdoc.ObtenerConexion();
                                DaoUser Ddoc = new DaoUser();
                                cdoc.rt = Ddoc.consultarDescripcionTD();
                                while (cdoc.rt.next()) {
                                    out.print("<option>" + cdoc.rt.getString(1) + "</option>");
                                }
                                cdoc.CerrarConexion();
                            %> 

                        </select> 
                    <Label>Nombre</Label><br>
<input type="text" name="nombreuser" value="<%if (request.getAttribute("Us_nom") != null) {%>${Us_nom}<%}%>" required><br>
                    <br>
                     
                       <Label>Apellido</Label><br>
     <input type="text" name="apelliuser" value="<%if (request.getAttribute("Us_ape") != null) {%>${Us_ape}<%}%>" required><br>
                         <br>
                          <Label>Estado</Label><br>
<input type="text" name="estadouser" value="<%if (request.getAttribute("Us_es") != null) {%>${Us_es}<%}%>" required><br>
                         <br>
                         <Label>Email</Label><br>
<input type="text" name="emailuser" value="<%if (request.getAttribute("Us_em") != null) {%>${Us_em}<%}%>" required><br>
                         <br>
                         <Label>Rol</Label><br>
                         <br>
                         <select name="seletrol">

                           <%
                                out.print("<option>" + request.getAttribute("Us_rol") + "</option>");
                            %> 
                            <% //Bloque de Codigo para consultar el Tipo de Documento
                                Conexion crol = new Conexion();
                                crol.ObtenerConexion();
                                DaoUser Drol = new DaoUser();
                                crol.rt = Drol.consultarDescripcionRol();
                                while (crol.rt.next()) {
                                    out.print("<option>" + crol.rt.getString(1) + "</option>");
                                }
                                crol.CerrarConexion();
                            %> 

                        </select> 
                         <Label>Especialidad</Label><br>
                        <select name="seletesp">

                            <%
                                out.print("<option>" + request.getAttribute("Us_esp") + "</option>");
                            %> 
                            <% //Bloque de Codigo para consultar el Tipo de Documento
                                Conexion cesp = new Conexion();
                                cesp.ObtenerConexion();
                                DaoUser Desp = new DaoUser();
                                cesp.rt = Desp.consultarDescripcionESP();
                                while (cesp.rt.next()) {
                                    out.print("<option>" + cesp.rt.getString(1) + "</option>");
                                }
                                cesp.CerrarConexion();
                            %> 

                        </select>
                        <br>
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
                                <h2 id="ST"><a href="horario.jsp">Siguiente</a></h2> 
                                <h2 id="finsesion"><a href="index.jsp">Cerrar Sesion</a></h2>
                            </div>
    </body>
</html>
