<html>
<head>
    <meta charset='utf-8'>
    <title>Progresión aritmetica</title>
    <link rel="stylesheet" href="estilo/estilo.css">
</head>
<body>
    <table border="1" class="tabla">
    <tr>
        <th colspan="2">Progresión aritmetica</th>
    </tr>
    <tr>
        <th>Numero</th>
        <th>Numero Par</th>
    </tr> 
        <?php
            $n = 30;
            $aux;
            $cont = 1;
            for ($m = 1; $m <= $n; $m++){
                echo "<tr><td>".$cont."</td>";
                if ($m % 2 == 0){
                    $aux = $m/2;
                    echo "<td>".$aux."</td>";
                }
                else{
                    echo "<td>".$m."</td>";
                }
                echo "</tr>";
                $cont++;
            } 
        ?>
    </table>
</body>
</html>