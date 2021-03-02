<?php
    $server="den1.mysql2.gear.host";
    $usuario="freedbs";
    $contra="Nb2v!!0XTA67";
    $db="freedbs";
    
    $conn = new mysqli($server, $usuario, $contra, $db);
    if ($conn->connect_error) {
        die("La coneccion a la base de datos fallo: " . $conn->connect_error);
    }
?>