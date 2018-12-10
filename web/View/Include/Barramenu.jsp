<%-- 
    Document   : Barramenu
    Created on : 05-dic-2018, 18:11:52
    Author     : SOPORTE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
        * {
	margin:0;
	padding:0;
	-webkit-box-sizing: border-box;
	-moz-box-sizing: border-box;
	box-sizing: border-box;
}

header {
	width:100%;
}

.navegacion {
	width:90%;
	margin:0px auto;
	background: #000;
	border-bottom-left-radius: 10px;
	border-bottom-right-radius: 10px;
}
.navegacion ul{
	list-style: none;
}
.menu_bar {
	display:none;
}
.menu{

}
.menu li {
	position: relative;
	display: inline-block;
}
.menu li span {
	margin-right:10px;
}
.menu li a:hover {
	color: #CE7D35;
	transition: all .3s;
}
.menu > li > a{
	display: block;
	padding: 15px 25px;
	color: #fff;
	font-family: 'Open sans';
	text-decoration: none;
	text-align: right;
}
/* Submenu*/
.submenu{
	position: absolute;
	background: rgba(0, 10, 0, 0.4);
	width: 120%;
	visibility: hidden;
	opacity: 0;
	transition: opacity 1.5s;
}
.submenu li a{
	display: block;
	padding: 15px;
	color: #fff;
	font-family: 'Open sans';
	text-decoration: none;
}
.menu li:hover .submenu{
	visibility: visible;
	opacity: 1;
}
section {
	padding:20px;
}

@media screen and (max-width:800px ) {
	.navegacion {
		width:50%;
		height:100%;
		left:-100%;
		margin:0;
		position: absolute;
		z-index: 1;
	}

	.menu li {
		display:block;
		float:none;
		border-bottom:1px solid rgba(255,255,255, 0.3);
	}

	.menu_bar {
		display:block;
		width:100%;
		background:#ccc;
	}

	.menu_bar .bt-menu {
		display:block;
		padding:20px;
		background:rgba(255, 255, 255, 0.1);
		color:#fff;
		text-decoration:none;
		font-weight: bold;
		font-size:25px;
		-webkit-box-sizing:border-box;
		-moz-box-sizing:border-box;
		box-sizing:border-box;
	}

	.menu_bar span {
		float:right;
		font-size:40px;
	}
	.menu li:hover .submenu{
	visibility: visible;
	opacity: 1;
	position: relative;
	width: 100%;
        }
            
            
        </style>
	<title></title>
                <link href="/../css/Barramenu.css" rel="stylesheet" type="text/css"/>
		<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.10/css/all.css" integrity="sha384-+d0P83n9kaQMCwj8F4RJB66tzIwOKmrdb46+porD/OvrJ+37WqIM7UoBtwHO6Nlg" crossorigin="anonymous">
		<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">

</head>
	<body>
		<header>
			<div class="menu_bar">
				<a href="#" class="bt-menu"><span class="fas fa-bars"></span>Menu</a>
			</div>

			<nav class="navegacion">
				<ul class="menu">
					<li><a href="#"><span class="icon-house"></span> TimesSoft</a>
					<!--	<ul class="submenu">
							<li><a href="#">Servicio #1</a></li>
							<li><a href="#">Servicio #1</a></li>
							<li><a href="#">Servicio #1</a></li>
                                                 -->
					</li>
                                <!--
					<li><a href="#"><span class="icon-suitcase"></span>Trabajos</a></li>
					<li><a href="#"><span class="icon-rocket"></span>Proyectos</a></li>
					<li><a href="#"><span class="icon-earth"></span>Servicios</a></li>
					<li><a href="#"><span class="icon-mail"></span>Contactos</a></li>-->
				</ul>
			</nav>
		</header>
	<script src="http://code.jquery.com/jquery-latest.js"></script>
	<script src="vistas/js/Barramenujs.js"></script>
	</body>
</html>
