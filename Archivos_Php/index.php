<?php 
  $servername = "localhost";
  $username = "root";
  $password = "";
  $dbname = "unedl  ";
  
  $conn = new mysqli($servername, $username, $password, $dbname);
  if ($conn->connect_error) {
      die("Connection failed: " . $conn->connect_error);
  }
  
  $sql = "SELECT Nombre, Valor FROM Bolsa_de_valores_madrid";
  $result = $conn->query($sql);
  
  $data[0] = array("Nombre", "Valor");

  if ($result->num_rows > 0) {
      while($row = $result->fetch_assoc()) {
        array_push($data, array($row["Nombre"], intval($row["Valor"])));
      }
  } else {
      echo "0 results";
  }
  json_encode($data);
  $conn->close();
?>

<!DOCTYPE html>
<html lang="en">

<html>
<head>
  <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
  <script type="text/javascript">
    google.charts.load('current', {'packages':['gantt']});
    google.charts.setOnLoadCallback(drawChart);
    var datos= json_encode($data)
    function daysToMilliseconds(days) {
      return days * 24 * 60 * 60 * 1000;
    }

    function drawChart() {

      var data = new google.visualization.DataTable($datos);
      
      data.addRows([
        ['Research', 'Find sources',
         new Date(2015, 0, 1), new Date(2015, 0, 5), null,  100,  null],
        ['Write', 'Write paper',
         null, new Date(2015, 0, 9), daysToMilliseconds(3), 25, 'Research,Outline'],
        ['Cite', 'Create bibliography',
         null, new Date(2015, 0, 7), daysToMilliseconds(1), 20, 'Research'],
        ['Complete', 'Hand in paper',
         null, new Date(2015, 0, 10), daysToMilliseconds(1), 0, 'Cite,Write'],
        ['Outline', 'Outline paper',
         null, new Date(2015, 0, 6), daysToMilliseconds(1), 100, 'Research']
      ]);

      var options = {
        height: 275
      };

      var chart = new google.visualization.Gantt(document.getElementById('chart_div'));

      chart.draw(data, options);
    }
  </script>
</head>
<body>
  <div id="chart_div"></div>
</body>
</html>


</html>