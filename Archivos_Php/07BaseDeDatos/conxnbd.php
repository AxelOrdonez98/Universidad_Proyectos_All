<?php

function conectarbd(){
    $servername="localhost";
    $username="root";
    $pass="4Pesos";
    $dbname="tienda";

    $conxn = new mysqli($servername,$username,$pass,$dbname);
    return $conxn;
}

?>