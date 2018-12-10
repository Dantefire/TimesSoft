<%-- 
    Document   : Contenido
    Created on : 05-dic-2018, 18:18:53
    Author     : SOPORTE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <link rel="stylesheet" href="vistas/css/contenido.css">
  <link rel="stylesheet" href="../css/contenido.css">
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.2.0/css/all.css" integrity="sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ" crossorigin="anonymous">
  <title>Document</title>
  <style>
      /*lOGIN*/
*{
	-webkit-box-sizing:border-box;
	-moz-box-sizing:border-box;
	box-sizing:border-box;
	font-family: Open Sans,sans-serif;
}

.login{
    width: 90%;
    margin: auto;
    overflow: hidden;
    position: relative;
    /*border: 1px solid green;*/
}

.login ul{
	/*border: 1px solid green;*/
    padding: 0;
}

.login li{
  width: 100%;
  list-style: none;
  /*border: 1px solid green; */
}

.login img{
  width: 100%;
  height: 90%;
  /*border: 1px solid green;*/
}
h1{
	position: absolute;
    top: 30%;
    left: 10%;
	/*border: 1px solid red;*/
	font-size: 7vw;
}
h2{
	position: absolute;
    top: 65%;
    left: 10%;
	/*border: 1px solid red;*/
	font-size: 2vw;
	background-color: #000;
	color: #fff;
	width: 16%;
	height: 6.5%;
	text-align: center;
	font-family: arial;
}
h2:hover{
	text-decoration: underline;
	opacity: 0.9;
}
/*-------------------------------------------------------------------*/
/*FINAL*/
.piedepagina{
	position: relative;
	width: 100%;
	border-top: 3px solid #E4DCDC;
	border-bottom: 3px solid #E4DCDC;
	height: 43vh;
	background-color:#E4DCDC;
}
#titulo{
	position: absolute;
	width: 29%;
	text-align: center;
	top: 10%;
	/*border: 1px solid black;*/
}
.social1{
	/*border: 1px solid black;*/
	width: 20%;
	position: absolute;
	left: 28%;
	top: 10%;
}
.social1 img{
	width: 13vw;
}

.fab, .fas{
	font-size: 2.5vw;
}
.contacto{
	/*border:1px solid red;*/
	top: 10%;
	left: 55%;
	position: absolute;	
	font-size: 1.5vw;
	width: 25%;
	list-style: none;


}
#texto{
	font-size: 1vw;
	margin: 0%;
}
.logo{
	left: 73%;
	text-align: center;
	width: 25%;
	position: absolute;
	/*border: 1px solid red;*/
	top: 20%;
}
.logo img{
	width: 50%;
	height: 25vh;
}
a{
	text-decoration: none;
}
.espacio{
	border-top: 1px solid #f0e4e4
}
  </style>
</head>
<body>
  <div class="login">
  	<div>
  		<h1>Iniciar Sesion</h1>
                <a href="<%=request.getContextPath()%>/View/Include/Login.jsp"><h2>Clic Aqui </h2></a>
  	</div>
    <ul>
      <li><img src="<%=request.getContextPath()%>/View/Images/5.jpg"/></li>
    </ul>
  </div>
  <div class="piedepagina">
  	<div id="titulo">
  		<p>TimesSoft</p>
  		<p>Control en grande</p>
  	</div>
  	<div class="social1">
		<ul>
			<i class="fab fa-facebook"></i>
			<i class="fab fa-twitter"></i>
			<i class="fab fa-instagram"></i>
			<i class="fas fa-envelope"></i>
		</ul>
		<a href="https://www.google.com/maps/place/Bogot%C3%A1/@4.6486259,-74.2478939,11z/data=!3m1!4b1!4m5!3m4!1s0x8e3f9bfd2da6cb29:0x239d635520a33914!8m2!3d4.7109886!4d-74.072092" target="_blank"><img id="social" src="<%=request.getContextPath()%>/View/Images/6.png"></a>
  	</div>
  	<div class="contacto">
  		<h3>
  			!Contactenos¡
  		</h3>
  		<br>
  		<p id="texto"><a href="">Inserte Telefono</a></p>
  		<p id="texto"><a href="">Inserte Celular</a></p>
  		<p id="texto"><a href="">Inserte Celular</a></p>
  		<br>
  		<p id="texto"><a href="">direcion</a></p>
  		<p id="texto"><a href="">direcion</a></p>
  		<p id="texto"><a href="">direcion</a></p>
  	</div>
  	<div class="logo">
  		<img src="<%=request.getContextPath()%>/View/Images/7.png">
  	</div>
  </div>
  <div class="espacio">
  	<br>
  </div>
</body>
</html>
