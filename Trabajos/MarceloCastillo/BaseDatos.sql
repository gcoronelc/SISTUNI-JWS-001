DROP DATABASE IF EXISTS usuarios;

CREATE DATABASE usuarios;


-- =============================================
-- Seleccionar la Base de Datos
-- =============================================

USE usuarios;



-- =============================================
-- Creación de los Objetos de la Base de Datos
-- =============================================

CREATE TABLE Usuario (
	id       			INT NOT NULL AUTO_INCREMENT,
	usuario  			VARCHAR(20) NOT NULL,
	clave    			VARCHAR(20) NOT NULL,
	nombre_completo     VARCHAR(50) NOT NULL,
	correo				VARCHAR(50) NOT NULL,
	estado	 			CHAR(1) NOT NULL,
	PRIMARY KEY (id)
) ENGINE = INNODB ;

USE MYSQL;
GRANT ALL PRIVILEGES ON *.* TO 'usuario'@'%' IDENTIFIED BY 'clave' WITH GRANT OPTION;
FLUSH PRIVILEGES;
USE usuarios;

USE MYSQL;
GRANT ALL PRIVILEGES ON *.* TO 'usuario'@'localhost' IDENTIFIED BY 'clave' WITH GRANT OPTION;
FLUSH PRIVILEGES;
USE usuarios;

-- =============================================
-- Inserción de Registros
-- =============================================
insert into usuario (usuario, clave, nombre_completo, correo, estado) values ( 'jmiranda', '123456', 'Jose Luis Miranda', 'jmiranda@correo.com', '1' );
insert into usuario (usuario, clave, nombre_completo, correo, estado) values ('rcardenas', '123456', 'Rudi Cardenas', 'rcardenas@correo.com', '1' );
insert into usuario (usuario, clave, nombre_completo, correo, estado) values ('mzevallos', '123456', 'Miguel Zevallos', 'mzevallos@correo.com', '1' );
insert into usuario (usuario, clave, nombre_completo, correo, estado) values ('kalvarado', '123456', 'Katia Alvarado', 'kalvarado@correo.com', '1' );
insert into usuario (usuario, clave, nombre_completo, correo, estado) values ('cmansilla', '123456', 'Claudia Mansilla', 'cmansilla@correo.com', '1' );

