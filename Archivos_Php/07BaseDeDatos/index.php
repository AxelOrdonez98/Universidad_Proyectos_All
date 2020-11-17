<!DOCTYPE html>
<html lang = "es">
	<head>
		<meta charset = "UTF-8" />
		<title>Bases de datos</title>
		<style>
			form{
				margin: 0 auto;
				text-align: center;
				width:400px;
			}
		</style>
	</head>
	<body>
		<h3>Bases de datos con PHP</h3>
	
		<form name = "frm_insert" method = "get" 
					action = "insert.php" enctype ="text/plain">
			<h2>Insercion de datos en tabla sucursal.</h2>
			<br/>
			<label for="sucursal">Nombre sucursal: </label>
			<input type="text" id="sucursal" name="ed_sucursal" 
							placeholder="Nombre de sucursal"/> 
							<br/> <br/>
			<input type="submit" name="btn_entrar" value="Insertar"/> 
			<br/> <br/>
		</form>	

		<form name = "frm_select" method = "get" 
						action = "select.php" enctype ="text/plain">
			<h2>Seleccion de datos de tabla sucursal.</h2>
			<br/>
			<label for="sucursal"> 
			   Buscar sucursal (para regresar todas escriba *):</label>
			<input type = "text" id="sucursal" name="ed_sucursal" 
					placeholder="Nombre de sucursal"/> 
			<br/> <br/>
		<input type = "submit" name = "btn_entrar" value = "Buscar"/> 
			<br/>
		</form>	
	
		<form action="tablausuarios.php" method="get" 
						enctype="text/plain" name="frmUsuarios">
		<div>
		<h2>Buscar a los empleados de la sucursal seleccionada.</h2>
		  <label for="sucursal2">Sucursal:</label>
		    <?php include("combosucursal.php"); ?> 
			<br/> <br/>
			<input type = "submit" name = "btn_entrar" value = "Buscar"/> 
		<br/> <br/>
		</div>
		</form>

	</body>
</html>



<!--		<div>
		  <label for="sucursal">Sucursal sin form:</label>
		  <select id="sucursal" name="cmbSucursal" required>
		    <option value="">Selecciona una sucursal</option>
		  // Este include hace un query y pinta los option que faltan
		//    
		<?php include("combosucursal.php"); ?> 
		  </select>
		</div> -->


