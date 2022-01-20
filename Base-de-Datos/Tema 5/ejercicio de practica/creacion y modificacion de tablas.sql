CREATE TABLE usuarios (
dni					VARCHAR(9),
nombre				TEXT			NOT NULL,
apellidos			TEXT			NOT NULL,
direccion			VARCHAR(200),
movil				VARCHAR(11)		NOT NULL,
email				TEXT			NOT NULL,
passw				VARCHAR(8)		,
saldo_disponible	INTEGER			DEFAULT 0,
CONSTRAINT pk_usuarios PRIMARY KEY (dni),
CONSTRAINT ck_passw CHECK (LENGTH (passw) >= 4)
);

CREATE TABLE estaciones (
cod_estacion		VARCHAR(130),
num_estacion			INTEGER			NOT NULL,
direccion			VARCHAR(200)	NOT NULL,
latitud				INTEGER			NOT NULL,
longitud			INTEGER			NOT NULL,
CONSTRAINT pk_estaciones PRIMARY KEY (cod_estacion),
CONSTRAINT ck_cod_estacion CHECK (cod_estacion LIKE 'E%')
);

CREATE TABLE bicicletas (
cod_bicicleta		INTEGER,
marca				TEXT			NOT NULL,
modelo				TEXT			NOT NULL,
fecha_alta			DATE			NOT NULL,
CONSTRAINT pk_bicicletas PRIMARY KEY (cod_bicicleta)
);

CREATE TABLE uso (
estacion_salida		VARCHAR(130),
fecha_salida		TIMESTAMP,
dni_usuario			VARCHAR(9),
cod_bicicleta		INTEGER,
estacion_llegada	VARCHAR(130),
fecha_llegada		TIMESTAMP		NOT NULL,
CONSTRAINT pk_estacion_salida PRIMARY KEY (estacion_salida, fecha_salida, dni_usuario, cod_bicicleta, estacion_llegada)
);



ALTER TABLE uso 
ADD CONSTRAINT fk_usuario_uso FOREIGN KEY (dni_usuario) REFERENCES usuarios;

ALTER TABLE uso
ADD CONSTRAINT fk_bicicletas_uso FOREIGN KEY (cod_bicicleta) REFERENCES bicicletas;

ALTER TABLE uso
ADD CONSTRAINT fk_estaciones_uso FOREIGN KEY (estacion_salida) REFERENCES estaciones;

ALTER TABLE uso
ADD CONSTRAINT fk_estaciones_uso2 FOREIGN KEY (estacion_llegada) REFERENCES estaciones;



INSERT INTO usuarios (dni, nombre, apellidos, direccion, movil, email, passw, saldo_disponible)
VALUES ('53353837X', 'Luis Miguel', 'Serón Delgado', 'Calle Olimpo', '654282995', 'luis.miguel.seron@gmail.com','123434','1300'),
('29472057F', 'Juan', 'Serón García', 'Calle Olimpo', '655257119', 'juan.seron@gmail.com','244244','25893'),
('52862191A', 'Tomás', 'Martín Ortega', 'Calle Geranio', '672052813', 'tom.martin@gmail.com','7240124','10');

INSERT INTO estaciones (cod_estacion, num_estacion, direccion, latitud, longitud)
VALUES ('E133', 1, 'Calle Skrr',102833,205612),
('E924', 2, 'Avenida Driblats',402263,731712),
('E323', 3, 'Colin streets',124247,146397),
('E003', 4, 'Plaza jagüey',631183,925713);

INSERT INTO bicicletas (cod_bicicleta, marca, modelo, fecha_alta)
VALUES (1, 'Specialized','123x3', MAKE_DATE(2021, 03, 03)),
(2, 'Scott','Winxp', MAKE_DATE(2022, 01, 05)),
(3, 'Trek','Meloinvent', MAKE_DATE(2021, 11, 20)),
(4, 'Giant','Yaestoyout', MAKE_DATE(2021, 10, 31)),
(5, 'Canyon','lanimbus3000', MAKE_DATE(2021, 7, 15)),
(6, 'Cannondale','lanimbus300', MAKE_DATE(2020, 04, 24)),
(7, 'Orbea','el ultimo modelo', MAKE_DATE(2021, 06, 19));

INSERT INTO uso (dni_usuario, estacion_salida, fecha_salida, cod_bicicleta, estacion_llegada, fecha_llegada)
VALUES ('53353837X','E133', MAKE_DATE(2022, 01, 15), 1, 'E924', MAKE_DATE(2022, 01, 18)),
('53353837X','E924', MAKE_DATE(2021, 12, 05), 3, 'E323', MAKE_DATE(2021, 12, 20)),
('52862191A', 'E003', MAKE_DATE(2021, 11, 10), 7, 'E133', MAKE_DATE(2021, 11, 15));

ALTER TABLE usuarios ADD COLUMN fecha_baja TIMESTAMP;
