<!DOCTYPE html>
<?php

if($_REQUEST){
  
  $num1 = $_REQUEST["num1"];
  $num2 = $_REQUEST["num2"];
  
  $suma = calcularSuma($num1, $num2);
  
}


?>

<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
  <head>
    <meta charset="UTF-8">
    <title></title>
  </head>
  <body>
    
    <h1>SUMA</h1>
    <form>
      Número 1:
      <input type="text" name="num1" /><br/>
      Número 1:
      <input type="text" name="num2" /><br/>
      <input type="submit" value="Sumar" />
    </form>
    
    <?php
      if(isset($suma)){
        echo "<p>$num1 + $num2 = $suma</p>";
      }
    
    ?>
    
  </body>
</html>

<?php

function calcularSuma($num1, $num2){
  $servicio = "http://localhost:8080/WSApp1/WSMath?WSDL";
  $parametros = array(); 
  $parametros["num1"] = $num1;
  $parametros["num2"] = $num2;
  $soapClient = new SoapClient($servicio, $parametros);
  $objeto = $soapClient->sumar($parametros);
  
  print_r($objeto);
  
  return $objeto->return;
}


?>