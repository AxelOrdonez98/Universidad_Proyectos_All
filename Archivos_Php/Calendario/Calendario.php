<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="estilo.css">
    <title>Calendario</title>
</head>
<body>
    <?php
    if (isset($_GET['ym'])) {
        $ym = $_GET['ym'];
    } else {
        $ym = date('Y-m');
    }
    $timestamp = strtotime($ym . '-01');
    if ($timestamp === false) {
        $ym = date('Y-m');
        $timestamp = strtotime($ym . '-01');
    }
    $hoy = date('Y-m-j', time());
    $conteo_dia = date('t', $timestamp);
    $str = date('w', mktime(0, 0, 0, date('m', $timestamp), 1, date('Y', $timestamp)));
    $semanas = array();
    $semana = '';
    $semana .= str_repeat('<td></td>', $str);
    $ultimo = '<td class="diaFuera">1</td><td class="diaFuera">2</td><td class="diaFuera">3</td><td class="diaFuera">4</td>';
    for ( $dia = 1; $dia <= $conteo_dia; $dia++, $str++) {
        $fecha = $ym . '-' . $dia;
        if ($hoy == $fecha) {
            $semana .= '<td>' . $dia;
        }
        else if($dia == 8 || $dia == 12 || $dia == 24 || $dia == 25 || $dia == 31) {
            $semana .= '<td class="diaFest">' . $dia;
            if ($dia == 31){
                $semana .= $ultimo;
            }
        } 
        else {
            $semana .= '<td>' . $dia;
        }
        $semana .= '</td>';
        if ($str % 7 == 6 || $dia == $conteo_dia) {
            if ($dia == $conteo_dia) {
                $semana .= str_repeat('<td></td>', 6 - ($str % 7));
            }
            $semanas[] = '<tr>' . $semana . '</tr>';
            $semana = '';
        }
    }
    ?>
        <table class="calen">
            <tr>
                <th colspan="7" class="mes">Diciembre</th>
            </tr>
            <tr>
                <th colspan="7" class="mes">2019</th>
            </tr>
            <tr>
                <th class="diaSem">Dom</th>
                <th class="diaSem">Lun</th>
                <th class="diaSem">Mar</th>
                <th class="diaSem">Mie</th>
                <th class="diaSem">Jue</th>
                <th class="diaSem">Vie</th>
                <th class="diaSem">Sab</th>
            </tr>
            <?php
                foreach ($semanas as $semana) {
                    echo $semana;
                }
            ?>
        </table>
</body>
</html>