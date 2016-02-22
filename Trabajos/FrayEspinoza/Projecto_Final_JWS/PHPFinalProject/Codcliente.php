<!DOCTYPE html>
<?php
  $lista = null;
  if($_REQUEST){
    $codigo = $_REQUEST["codigo"];
    $lista = obtenerLista($codigo);
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
              Codigo:
              <input type="text" name="codigo" /><br/><br/>
              <input type="submit" value="Consultar" /><br/><br/>      
            </form>
            <?php if($lista){?>

                <table border="1">

                  <tr>
                    <th>CODIGO</th>
                    <th>PATERNO</th>
                    <th>MATERNO</th>
                    <th>NOMBRE</th>
                    <th>DNI</th>
                    <th>CIUDAD</th>
                    <th>DIRECCION</th>
                    <th>TELEFONO</th>
                    <th>EMAIL</th>
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
                    <td><?php echo $rec->DNI ?></td>
                    <td><?php echo $rec->CIUDAD ?></td>
                    <td><?php echo $rec->DIRECCION ?></td>
                    <td><?php echo $rec->TELEFONO ?></td>
                    <td><?php echo $rec->EMAIL ?></td>
                  </tr>
                  <?php } ?>

                </table>

            <?php } ?>
    </body>
</html>
<?php
function obtenerLista($codigo){
  $servicio = "http://localhost:8080/WSFinalProject/WSMath?WSDL";
  $parametros = array(); 
  $parametros["codigo"] = $codigo;
  $soapClient = new SoapClient($servicio, $parametros);
  $objeto = $soapClient->getCodclient($parametros);
  
  print_r($objeto);
  
  return $objeto->return;
}
?>