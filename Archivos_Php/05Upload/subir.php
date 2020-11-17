<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Subir</title>
</head>
<body>
    <div id="wrapper">
        <header>
            <h1>Subir archivo</h1>
        </header>
        <div id="container">
            <?php
                foreach($_FILES["flnombre"] as $clave => $valor) {
                    echo "<p> Propiedad: $clave --- Valor: $valor </p>";
                }
                if($_FILES["flnombre"]["type"] == "text/plain"){
                    $archivo = $_FILES["flnombre"]["tmp_name"];
                    $destino = "archivos/".$_FILES["flnombre"]["name"];
                    move_uploaded_file($archivo, $destino);
                    echo "<h2>Arichivo subido</h2><br><br>
                        <a href=\"index.php\">Regresar</a>";
                }
                else{
                    echo "<h2>Solo se permiten archivos planos</h2> <br><br>
                        <a href=\"index.php\">Regresar</a>";
                }
            ?>
        </div>
    </div>
</body>
</html>