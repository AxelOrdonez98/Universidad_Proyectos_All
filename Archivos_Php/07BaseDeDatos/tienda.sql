SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

CREATE DATABASE IF NOT EXISTS tienda DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE tienda;

CREATE TABLE IF NOT EXISTS sucursal (
  idSucursal bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  nombre varchar(100) NOT NULL,
  UNIQUE KEY idSucursal (idSucursal)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

INSERT INTO sucursal VALUES(NULL, 'Av. La Paz');
INSERT INTO sucursal VALUES(NULL, 'Av. Hidalgo');
INSERT INTO sucursal VALUES(NULL, 'Av. Revolución');
INSERT INTO sucursal VALUES(NULL, 'Puerta de Hierro');

CREATE TABLE IF NOT EXISTS usuarios (
  idUsuario bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  nombre varchar(50) NOT NULL,
  idSucursal int(11) NOT NULL,
  UNIQUE KEY idUsuario (idUsuario)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

insert into usuarios values(NULL, 'Mariel Linares', 1);
insert into usuarios values(NULL, 'Raul Pérez', 2);
insert into usuarios values(NULL, 'Roman Polansky', 4);
insert into usuarios values(NULL, 'Julio Regalado', 3);


/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
