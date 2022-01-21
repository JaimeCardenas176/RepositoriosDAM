CREATE TABLE trabajos (
id_trabajo			SMALLINT,
nombre				VARCHAR(100)		NOT NULL,
CONSTRAINT pk_trabajos PRIMARY KEY (id_trabajo)
);

CREATE TABLE empleados (
id_empleado			SERIAL,
dni				VARCHAR(10)		NOT NULL,
nombre				VARCHAR(100)		NOT NULL,
apellidos			VARCHAR(150)		NOT NULL,
id_trabajo			SMALLINT		NOT NULL,
fecha_contratacion		DATE			NOT NULL,
fecha_nacimiento		DATE			NOT NULL,
CONSTRAINT pk_empleados PRIMARY KEY (id_empleado)

);

CREATE TABLE habitaciones (
id_habitacion			SMALLINT,
tipo				VARCHAR(100)		NOT NULL,
precio				INTEGER			NOT NULL,
CONSTRAINT pk_habitaciones PRIMARY KEY (id_habitacion)
);


ALTER TABLE empleados
ADD CONSTRAINT fk_empleados FOREIGN KEY (id_trabajo) REFERENCES trabajos;