<%-- 
    Document   : Cargapantalla
    Created on : 05-dic-2018, 18:18:34
    Author     : SOPORTE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
	<link rel="stylesheet" href="../css/Cargapantalla.css">
	<link rel="stylesheet" href="vistas/css/Cargapantalla.css">
  <title>Document</title>
  <style>
      
      *,*::after, *::before{
  margin: 0;
  padding: 0;
  -webkit-box-sizing: border-box;
  -moz-box-sizing: border-box;
  box-sizing: border-box;
}

#contenedor_carga{
  background-color: rgba(250, 240, 245, 0.9);
  width: 100%;
  height: 100%;
  position: fixed;
  -webkit-transition: all 1s ease;
  -o-transition: all 1s ease;
  transition: all 1s ease;
  z-index: 10000;
}

#carga{
  border: 15px solid #ccc;
  border-top-color:#000;
  border-top-style: groove;
  height: 100px;
  width: 100px;
  border-radius: 100%;

  position: absolute;
  top: 0;
  left: 0;
  bottom: 0;
  right: 0;
  margin: auto;
  -webkit-animation-name: girar 1.5s linear infinite;
  -o-animation-name: girar 1.5s linear infinite;
  animation: girar 1.5s linear infinite;

}

@keyframes girar{
  from { transform: rotate(0deg);}
  to { transform: rotate(360deg);}
}
  </style>
</head>
<body>
  <div id="contenedor_carga">
    <div id="carga">

    </div>
  </div>
  <script>
  	window.onload = function(){
  		var contenedor = document.getElementById('contenedor_carga')

  		contenedor.style.visibility= 'hidden';
  		contenedor.style.opacity = '0';
  	}
  </script>
</body>

</html>
