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
              <input type="text" name="nombre" /><br/><br/>
              <input type="submit" value="Consultar" /><br/><br/>      
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
                    <td><?php echo $rec->CODIGO ?></td>
                    <td><?php echo $rec->PATERNO ?></td>
                    <td><?php echo $rec->MATERNO ?></td>
                    <td><?php echo $rec->NOMBRE ?></td>
                  </tr>
                  <?php } ?>

                </table>

            <?php } ?>
    </body>
</html>
<?php
function obtenerLista($nombre){
  $servicio = "http://localhost:8080/WSFinalProject/WSMath?WSDL";
  $parametros = array(); 
  $parametros["nombre"] = $nombre;
  $soapClient = new SoapClient($servicio, $parametros);
  $objeto = $soapClient->getClientes($parametros);
  
  print_r($objeto);
  
  return $objeto->return;
}

?>