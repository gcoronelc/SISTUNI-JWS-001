<!DOCTYPE html>
<?php

  $lista = null;
  if($_REQUEST){
    $nombre = $_REQUEST["nombre"];
    $lista = obtenerLista($nombre);
  }

?>
<html>
  <head>
    <meta charset="UTF-8">
    <title></title>
  </head>
  <body>
    <h1>CLIENTES</h1>
    <form>
      Nombre:
      <input type="text" name="nombre" /><br/>
      <input type="submit" value="Consultar" />      
    </form>
    
    <?php if($lista){?>
    
    <table border="1">
      
      <tr>
        <th>CODIGO</th>
        <th>PATERNO</th>
        <th>MATERNO</th>
        <th>NOMBRE</th>
      </tr>
      
      <?php 
        for($i = 0; $i < count($lista); $i++ ) { 
          $rec = $lista[$i];
      ?>
      <tr>
        <td><?php echo $rec->codigo ?></td>
        <td><?php echo $rec->paterno ?></td>
        <td><?php echo $rec->materno ?></td>
        <td><?php echo $rec->nombre ?></td>
      </tr>
      <?php } ?>
      
    </table>
    
    <?php } ?>
    
  </body>
</html>

<?php
function obtenerLista($nombre){
  $servicio = "http://localhost:8080/WSApp1/WSMath?WSDL";
  $parametros = array(); 
  $parametros["nombre"] = $nombre;
  $soapClient = new SoapClient($servicio, $parametros);
  $objeto = $soapClient->getClientes($parametros);
  
  print_r($objeto);
  
  return $objeto->return;
}

?>
