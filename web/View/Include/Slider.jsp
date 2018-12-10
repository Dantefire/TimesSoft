<%-- 
    Document   : Slider
    Created on : 05-dic-2018, 18:19:15
    Author     : SOPORTE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <link rel="stylesheet" href="vistas/css/slider.css">
  <link rel="stylesheet" href="../css/Slider.css">
  <title>Document</title>
  <style>
      
.slider{
    width: 90%;
    margin: auto;
    overflow: hidden;
    
}

.slider ul{
    display: flex;
    padding: 0;
    width: 400%;

    animation: cambio 15s infinite alternate;
}

.slider li{
  width: 100%;
  /*height: 90%*/
  margin-top: 0.05%;
  list-style: none;
}

.slider img{
  width: 100%;
  height: 70%;
}

@keyframes cambio {
    0%{ margin-left: 0;}
    20%{ margin-left: 0;}

    40%{ margin-left: -100%;}
    60%{ margin-left: -100%;}

    80%{ margin-left: -200%;}
    100%{ margin-left: -200%;}
}
  </style>
</head>
<body>
  <div class="slider">
    <ul>
      <li><img src="<%=request.getContextPath()%>/View//Images/1.JPG"></li>
      <li><img src="<%=request.getContextPath()%>/View//Images/2.JPG"</li>
      <li><img src="<%=request.getContextPath()%>/View/Images/3.jpg"></li>
      <li><img src="<%=request.getContextPath()%>/View/Images/4.jpg"></li>
    </ul>
  </div>
</body>
</html>
