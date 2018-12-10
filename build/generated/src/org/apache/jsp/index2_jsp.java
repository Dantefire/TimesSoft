package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Util.Conexion;
import Model.DaoUser;
import Controller.Beans.User;

public final class index2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"");
      out.print(request.getContextPath());
      out.write("/View/css/index2.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"");
      out.print(request.getContextPath());
      out.write("/View/Js/3boton.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center><h1 id=\"titulo\">Sistema De Registro de Usuario - Horario - TimesSoft</h1></center>\n");
      out.write("        <form id=\"form1\" name=\"form1\" action=\"");
      out.print(request.getContextPath());
      out.write("/user.do\" method=\"post\">\n");
      out.write("                <fieldset>    \n");
      out.write("                <H1>Formulario Registro Usuario</H1>\n");
      out.write("                <br>\n");
      out.write("                <input type=\"hidden\" name=\"txtOpcion\" id=\"txtOpcion\"/> \n");
      out.write("                <Label>No Documento</Label><br>\n");
      out.write("<input title=\"Se necesita llenar este campo\" type=\"text\" name=\"idduser\" value=\"");
if (request.getAttribute("Us_idd") != null) {
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Us_idd}", java.lang.String.class, (PageContext)_jspx_page_context, null));
}
      out.write("\" required><br>\n");
      out.write("               <br>\n");
      out.write("                <Label>Tipo de Documento</Label><br>\n");
      out.write("               <br>\n");
      out.write("                <select name=\"selettdoc\">\n");
      out.write("\n");
      out.write("                            ");

                                out.print("<option>" + request.getAttribute("Us_td") + "</option>");
                            
      out.write(" \n");
      out.write("                            ");
 //Bloque de Codigo para consultar el Tipo de Documento
                                Conexion cdoc = new Conexion();
                                cdoc.ObtenerConexion();
                                DaoUser Ddoc = new DaoUser();
                                cdoc.rt = Ddoc.consultarDescripcionTD();
                                while (cdoc.rt.next()) {
                                    out.print("<option>" + cdoc.rt.getString(1) + "</option>");
                                }
                                cdoc.CerrarConexion();
                            
      out.write(" \n");
      out.write("\n");
      out.write("                        </select> \n");
      out.write("                    <Label>Nombre</Label><br>\n");
      out.write("<input type=\"text\" name=\"nombreuser\" value=\"");
if (request.getAttribute("Us_nom") != null) {
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Us_nom}", java.lang.String.class, (PageContext)_jspx_page_context, null));
}
      out.write("\" required><br>\n");
      out.write("                    <br>\n");
      out.write("                     \n");
      out.write("                       <Label>Apellido</Label><br>\n");
      out.write("     <input type=\"text\" name=\"apelliuser\" value=\"");
if (request.getAttribute("Us_ape") != null) {
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Us_ape}", java.lang.String.class, (PageContext)_jspx_page_context, null));
}
      out.write("\" required><br>\n");
      out.write("                         <br>\n");
      out.write("                          <Label>Estado</Label><br>\n");
      out.write("<input type=\"text\" name=\"estadouser\" value=\"");
if (request.getAttribute("Us_es") != null) {
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Us_es}", java.lang.String.class, (PageContext)_jspx_page_context, null));
}
      out.write("\" required><br>\n");
      out.write("                         <br>\n");
      out.write("                         <Label>Email</Label><br>\n");
      out.write("<input type=\"text\" name=\"emailuser\" value=\"");
if (request.getAttribute("Us_em") != null) {
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Us_em}", java.lang.String.class, (PageContext)_jspx_page_context, null));
}
      out.write("\" required><br>\n");
      out.write("                         <br>\n");
      out.write("                         <Label>Rol</Label><br>\n");
      out.write("                         <br>\n");
      out.write("                         <select name=\"seletrol\">\n");
      out.write("\n");
      out.write("                           ");

                                out.print("<option>" + request.getAttribute("Us_rol") + "</option>");
                            
      out.write(" \n");
      out.write("                            ");
 //Bloque de Codigo para consultar el Tipo de Documento
                                Conexion crol = new Conexion();
                                crol.ObtenerConexion();
                                DaoUser Drol = new DaoUser();
                                crol.rt = Drol.consultarDescripcionRol();
                                while (crol.rt.next()) {
                                    out.print("<option>" + crol.rt.getString(1) + "</option>");
                                }
                                crol.CerrarConexion();
                            
      out.write(" \n");
      out.write("\n");
      out.write("                        </select> \n");
      out.write("                         <Label>Especialidad</Label><br>\n");
      out.write("                        <select name=\"seletesp\">\n");
      out.write("\n");
      out.write("                            ");

                                out.print("<option>" + request.getAttribute("Us_esp") + "</option>");
                            
      out.write(" \n");
      out.write("                            ");
 //Bloque de Codigo para consultar el Tipo de Documento
                                Conexion cesp = new Conexion();
                                cesp.ObtenerConexion();
                                DaoUser Desp = new DaoUser();
                                cesp.rt = Desp.consultarDescripcionESP();
                                while (cesp.rt.next()) {
                                    out.print("<option>" + cesp.rt.getString(1) + "</option>");
                                }
                                cesp.CerrarConexion();
                            
      out.write(" \n");
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                        <br>\n");
      out.write("                        <br>\n");
      out.write("                        <center><input id=\"btnRegistrar\" type=\"button\" value=\"Registrar\" onclick=\"opcionInsertar();\"/>\n");
      out.write("                        <input id=\"btnConsultar\" type=\"button\" value=\"Consultar\" onclick=\"opcionConsultar();\"/>\n");
      out.write("                        <input id=\"btnModificar\" type=\"button\" value=\"Modificar\" onclick=\"opcionModificar();\" />   </center>\n");
      out.write("\n");
      out.write("                        <section hidden>\n");
      out.write("                            <span id=\"sessionUsuario\" css=\"position:absolute; top:-1000px;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.variable}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                        </section>\n");
      out.write("                             \n");
      out.write("                          ");
 if (request.getAttribute("mensaje") != null) {
      out.write("\n");
      out.write("\n");
      out.write("                            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensaje}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("                             </fieldset>\n");
      out.write("                 \n");
      out.write("                        </form>\n");
      out.write("        <!--<form id=\"form2\" name=\"form2\" action=\"");
      out.print(request.getContextPath());
      out.write("\" method=\"post\">\n");
      out.write("                <fieldset>    \n");
      out.write("                <H1>Formulario Registro Horario</H1>\n");
      out.write("                <br>\n");
      out.write("                <input type=\"hidden\" name=\"txtOpcion\" id=\"txtOpcion\"/> \n");
      out.write("                <Label>Ficha</Label><br>\n");
      out.write("<input title=\"Se necesita llenar este campo\" type=\"text\" name=\"idduser\" value=\"");
if (request.getAttribute("Us_idd") != null) {
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Us_idd}", java.lang.String.class, (PageContext)_jspx_page_context, null));
}
      out.write("\" required><br>\n");
      out.write("               <br>\n");
      out.write("                <Label>Sede</Label><br>\n");
      out.write("<input type=\"text\" name=\"tduser\" value=\"");
if (request.getAttribute("Us_td") != null) {
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Us_td}", java.lang.String.class, (PageContext)_jspx_page_context, null));
}
      out.write("\" required><br>\n");
      out.write("               <br>\n");
      out.write("                    <Label>Hora Inicio</Label><br>\n");
      out.write("<input type=\"text\" name=\"nombreuser\" value=\"");
if (request.getAttribute("Us_nom") != null) {
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Us_nom}", java.lang.String.class, (PageContext)_jspx_page_context, null));
}
      out.write("\" required><br>\n");
      out.write("                    <br>\n");
      out.write("                     \n");
      out.write("                       <Label>Hora Fin</Label><br>\n");
      out.write("     <input type=\"text\" name=\"apelliuser\" value=\"");
if (request.getAttribute("Us_ape") != null) {
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Us_ape}", java.lang.String.class, (PageContext)_jspx_page_context, null));
}
      out.write("\" required><br>\n");
      out.write("                         <br>\n");
      out.write("                          <Label>No Documento</Label><br>\n");
      out.write("<input type=\"text\" name=\"estadouser\" value=\"");
if (request.getAttribute("Us_es") != null) {
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Us_es}", java.lang.String.class, (PageContext)_jspx_page_context, null));
}
      out.write("\" required><br>\n");
      out.write("                         <br>\n");
      out.write("                         <Label>Dia</Label><br>\n");
      out.write("<input type=\"text\" name=\"emailuser\" value=\"");
if (request.getAttribute("Us_em") != null) {
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Us_em}", java.lang.String.class, (PageContext)_jspx_page_context, null));
}
      out.write("\" required><br>\n");
      out.write("                         <br>\n");
      out.write("                         <Label>Competencia</Label><br>\n");
      out.write("<input type=\"text\" name=\"roluser\" value=\"");
if (request.getAttribute("Us_rol") != null) {
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Us_rol}", java.lang.String.class, (PageContext)_jspx_page_context, null));
}
      out.write("\" required><br>\n");
      out.write("                        <br>\n");
      out.write("                        <center><input id=\"btnRegistrar\" type=\"button\" value=\"Registrar\" onclick=\"opcionInsertar();\"/>\n");
      out.write("                        <input id=\"btnConsultar\" type=\"button\" value=\"Consultar\" onclick=\"opcionConsultar();\"/>\n");
      out.write("                        <input id=\"btnModificar\" type=\"button\" value=\"Modificar\" onclick=\"opcionModificar();\" />   </center>\n");
      out.write("                        <br><br><br><br><br><br><br>\n");
      out.write("                        <section hidden>\n");
      out.write("                            <span id=\"sessionUsuario\" css=\"position:absolute; top:-1000px;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.variable}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                        </section>\n");
      out.write("                             \n");
      out.write("                          ");
 if (request.getAttribute("mensaje") != null) {
      out.write("\n");
      out.write("\n");
      out.write("                            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensaje}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("                             </fieldset>\n");
      out.write("                 \n");
      out.write("                        </form>-->\n");
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
