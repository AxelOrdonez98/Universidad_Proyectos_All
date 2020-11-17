<?php
error_reporting(E_ALL ^ E_NOTICE);
$sucursal = $_GET["ed_sucursal"];
include("conxnbd.php");
$conn = conectarbd();
if($conn->connect_error){
    die("<br>fallo el intento de conexion a la base de datos". $conn->connect_error."<br>");
}
echo "<br>Conexion exitosa a la base de datos<br>";

$sql_ins = "INSERT INTO sucursal (idsucursal,nombre) VALUES (NULL,'". $sucursal ."')";

if($conn->query($sql_ins)===TRUE){
    $last_id = $conn->insert_id;
    echo "<br><br>El nuevo registro se inserto correctamente con el ID: ".$last_id."<br>";
}else{
    echo "<br>Error: ".$sql_ins."<br>".$conn->error."<br>";
}
?>
<br><br><a href="index.php">Regresar a la pagina inicial</a>