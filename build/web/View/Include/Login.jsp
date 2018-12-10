<%-- 
    Document   : Login
    Created on : 05-dic-2018, 20:36:09
    Author     : SOPORTE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio sesion</title>
        <style>
            body{
                margin-top: 15vh;
                background-color: #d4d4d4;
            }
            form{
                border-radius: 15px;
                border-top: 35px solid #000;
                margin: 10px auto;
                width: 350px;
                height: 315px;
                background: #d4d4d4;
                border-bottom: 22px solid #000;                
            }
            form label{
                display: block;
                color: white;
                background: #000;
                padding: 12px 0;
                text-align: center;
                font-size: 20px;
                font-weight: bold;
                font-family: cursive;
            }
            form input[type="text"],input[type="password"]{
                width: 230px;
                padding: 12px 40px;
                font-weight: bold;
                font-family: cursive;
                margin-top: 10px;
                
                margin-left: 18px;
                margin-bottom: 10px;
                border: 1px solid #000;
                text-transform: capitalize;
                -moz-transition: all 0.5s;
            }            
            form input[type="text"]{
                background: url("icons/user.png") 5px no-repeat;
            }
            form input[type="password"]{
                background: url("icons/pass.png") 5px no-repeat;
            }
            form input[type="text"]:focus,input[type="password"]:focus{
                border: 1px solid #333;
                background: none;
                width: 290px;
                padding: 12px 10px;
            }
            form input[type="submit"]{
                background: #000;
                color: white;
                display: inline-block;
                margin-left: 18px;
                margin-bottom: 10px;
                padding: 8px 20px;
                border: none;
                font-weight: bold;
                align-items: center;
            }
            form input[type="submit"]:hover{
                background: darkorange;
                cursor: pointer;
                align-items: center;   
               
            }
            
        </style>    
    </head>
    <body>
    
        <form action="<%=request.getContextPath()%>/IniciarSesion"method="post">
            
            <center><h1>Inicio Sesion</h1></center>
            <label>Nombre</label>
            <input type="text" name="usuario" placeholder="Digite su Usuario" required><br>
            <label>password</label>
            <input type="password" name="pass" placeholder="Digite su contraseña" required><br>
            <center><select name="selectrol">
                
                    <%
                        out.print("<option>" + request.getAttribute("C_IdTD") + "</option>");
                    %>
                    
                    <%/* //Bloque de Codigo para consultar el Tipo de Documento
                        ConexionSIGEP on = new ConexionSIGEP();
                        on.ObtenerConexion();
                        DaoPersona DPersona = new DaoPersona();
                        on.rt = DPersona.consultarDescripcionTD();
                            while (on.rt.next()) {
                                out.print("<option>" + on.rt.getString(1) + "</option>");
                            }
                        on.CerrarConexion();*/
                    %>
                    
                </select></center><br>
            <center><input type="submit" value="Inicio sesion"><br></center>
        </form>
    </body>
</html>

