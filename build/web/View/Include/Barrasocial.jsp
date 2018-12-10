<%-- 
    Document   : Barrasocial
    Created on : 05-dic-2018, 18:17:51
    Author     : SOPORTE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.10/css/all.css" integrity="sha384-+d0P83n9kaQMCwj8F4RJB66tzIwOKmrdb46+porD/OvrJ+37WqIM7UoBtwHO6Nlg" crossorigin="anonymous">
	<link rel="stylesheet" type="text/css" href="vistas/css/fonts.css">
	<link rel="stylesheet" type="text/css" href="vistas/css/barrasocial.css">
	<link rel="stylesheet" type="text/css" href="../css/fonts.css">
	<link rel="stylesheet" type="text/css" href="../css/Barrasocial.css">

	<title></title>
        
        <style>
            .social {
	position: fixed; 
	top: 300px;
	z-index: 2000;
}

	.social ul {
		list-style: none;
	}

	.social ul li a {
		display: inline-block;
		color:#fff;
		background: #000;
		padding: 10px 15px;
		text-decoration: none;
		-webkit-transition:all 500ms ease;
		-o-transition:all 500ms ease;
		transition:all 500ms ease;
	}

	.social ul li .icon-Sofia {background:#3b5998;}
	.social ul li .icon- {background: #00abf0;}
	.social ul li .icon- {background: #d95232;}
	.social ul li .icon-Sena {background: #ae181f;}
	.social ul li .icon-BlackBoard {background: #666666;}

	.social ul li a:hover {
		background: #000;
		padding: 15px 30px;
	}

	@media screen and (max-width:800px ) {
		.social{
			display: none;
		}
	}
        </style>
</head>
<body>
	<div class="social">
			<ul>
				<li><a href="http://electricidadelectronicaytelecomu.blogspot.com.co/" target="_blank" class="icon-Sena"></a></li>
				<li><a href="http://oferta.senasofiaplus.edu.co/sofia-oferta/" target="_blank" class="icon-Sofia"></a></li>
				<li><a href="https://senaintro.blackboard.com/webapps/portal/execute/tabs/tabAction?tab_tab_group_id=_547_1" target="_blank" class="icon-BlackBoard"></a></li>
			</ul>
	</div>

</body>
</html>
