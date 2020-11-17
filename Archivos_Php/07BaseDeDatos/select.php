<?php
error_reporting(E_ALL ^ E_NOTICE);
include_once("conxnbd.php");
$conn = conectarbd();
if($conn->connect_error){
    die("<br>fallo el intento de conexion a la base de datos". $conn->connect_error."<br>");
}
$sql_sel = "SELECT * FROM sucursal ORDER BY nombre";
$resultset = $conn->query($sql_sel);
echo '<select id ="sucursal2" name="cmbSucursal">\n';
echo '<option value="">Seleciona una sucursal</option>\n';
while($linea = $resultset->fetch_assoc()){
    $nombre = utf8_encode($linea["nombre"]);
    echo "<option value='".$nombre."'>".$nombre."</option>\n";
}
echo "</select>\n"
?>