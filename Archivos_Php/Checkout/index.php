<html>

<head>
    <meta charset='utf-8'>
    <title>Checkout</title>
    <style>
    form {
        margin: 0 auto;
        text-align: center;
        width: 400px;
    }
    </style>
</head>
<body>
    <form action="tabla.php" method="get" enctype="text/plain" name="frmUsuarios">
        <div>
            <br><br>
            <h2>Buscar empleados por region.</h2>
            <label for="region">Regiones:</label>
            <?php
                error_reporting(E_ALL ^ E_NOTICE);
                include_once("coneccion.php");
                $conn = conectarbd();
                if($conn->connect_error){
                    die("<br>fallo el intento de conexion a la base de datos". $conn->connect_error."<br>");
                }
                $sql_sel = "SELECT * FROM employees ORDER BY City";
                $resultset = $conn->query($sql_sel);
                echo '<select id ="region" name="cmbSucursal">\n';
                echo '<option value="">Seleciona una region</option>\n';
                while($linea = $resultset->fetch_assoc()){
                    $i = 0;
                    $nombre = utf8_encode($linea["City"]);
                    $aux[] = $nombre;
                    if ($aux == $linea["City"]){
                    } else {
                        echo "<option value='".$nombre."'>".$nombre."</option>\n";
                    }
                }
                echo "</select>\n"
            ?>
            <br /> <br />
            <input type="submit" name="btn_entrar" value="Buscar" />
            <br /> <br />
        </div>
    </form>
</body>
</html>