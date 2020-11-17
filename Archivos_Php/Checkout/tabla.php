<html>
    <head>
        <title>Empleados de la region</title>
    </head>
    <body>
        <?php
            include_once("coneccion.php");
            $conn = conectarbd();
            $sucursal = $_GET["cmbSucursal"];
            if($sucursal ==""){
                header("Locarion: index.php");
            }
            $qry = "SELECT * FROM `employees` ORDER BY `employees`.`EmployeeID` DESC, `employees`.`LastName` ASC, `employees`.`FirstName` ASC, `employees`.`Title` ASC, `employees`.`TitleOfCourtesy` ASC, `employees`.`Address` ASC, `employees`.`City` ASC";
            echo "<h3>Bases de datos con php</h3>\n<h2>Empleados de la region: ".$sucursal."</h2>";
            if($resultset = $conn->query($qry)){
                $cant_regs = $resultset->num_rows;
                echo $resultset->num_rows;
                if($cant_regs <= 0){
                    echo "<h2>No se encontraron empleados en la sucursal <nombreSucursal> . </h2>";
                } else{
                    echo "<table border='1'>";
                    echo "<thead>\n <tr><th>Id Empleado</th><th>Nombre</th><th>Apellido</th><th>Desmpeño</th><th>Puesto</th><th>Direccion</th><th>Region</th></tr></thead>";
                    echo "<tbody>\n";
                    while($linea = $resultset->fetch_assoc()){
                        echo "<tr><td>".$linea["EmployeeID"]."</td><td>".$linea["FirstName"]."</td><td>".$linea["LastName"]."</td><td>".$linea["Title"]."</td><td>".$linea["TitleOfCourtesy"]."</td><td>".$linea["Address"]."</td><td>".$linea["City"]."</td></tr>\n";
                    }
                    echo "</tbody>\n</table>";
                }
            }
        ?>
        <br><br>
        <a href="index.php">Regresar a la pagina inicial.</a>
    </body>
</html>