<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="estilos/estilos.css">
    <title>Subir archivo</title>
</head>
<body>
<div id="wrapper">
        <div id="contenedor">
            <div id="caja">
            <h1>Subir archivos al servidor</h1>
                <form name="sendfile" action="subido.php" method="post"
                    enctype="multipart/form-data">
                    <label name="txtArchivo">Archivo:</label>
                    <input class="archivo" type="file" name="flnombre"/>
                    <br /><br />
                    <input class="boton" type="submit" name="btnSubir" value="Subir archivo"/>
                </form>
            </div>
        </div>
    </div>
</body>
</html>