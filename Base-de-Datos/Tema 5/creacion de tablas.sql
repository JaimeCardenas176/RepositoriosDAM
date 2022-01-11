CREATE TABLE Libro (
ISBN				char(13),
Titulo				text,
Dni_autor			char(8),
Cod_genero			serial,
Cod_editorial		serial
);

CREATE TABLE Autor (
DNI					char(8),
Nombre				text,
Nacionalidad		text
);

CREATE TABLE Editorial (
Cod_editorial		serial,
Nombre				text,
Direccion			text,
Poblacion			text
);

CREATE TABLE Genero (
Id_genero			serial,
Nombre				text,
Descripcion			text
);

CREATE TABLE Edicion (
ISBN				serial,
Fecha_publicacion	date,
Cantidad			integer
);