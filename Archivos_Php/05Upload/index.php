<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Carga</title>
    <style>
        #CajaCargar{
            width: 500px;
            height: 100px;
            margin: auto;
            border: solid 1px black;
            border-radius: 20px;
            padding: 50px;
        }
    </style>
</head>
<body>
    <div id="wrapper">
        <header>
            <h1>Subir archivos</h1>
        </header>
        <div id="contenedor">
            <div id="CajaCargar">
                <form  name="sedfile" action="subir.php" method="POST" enctype="multipart/form-data">
                    <label for="txtArchivo">Archivo:</label>
                    <input type="file" name="flnombre">
                    <br><br>
                    <input type="submit" name="btnSubir" value="Subir Archivo">
                </form>
            </div>
        </div>
        <footer>
            <p>Pito</p>
        </footer>
    </div>
</body>
</html>