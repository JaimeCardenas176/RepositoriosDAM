CREATE TABLE libro (
isbn				VARCHAR(13),
titulo				TEXT		NOT NULL,
dni_autor			VARCHAR(9)  NOT NULL,
cod_genero			SERIAL		NOT NULL,
cod_editorial		SERIAL		NOT NULL,
CONSTRAINT pk_libro PRIMARY KEY (isbn),
CONSTRAINT fk_libro_autor_dni FOREIGN KEY (dni_autor) REFERENCES autor,
CONSTRAINT fk_libro_genero_id_genero FOREIGN KEY (cod_genero) REFERENCES genero,
CONSTRAINT fk_libro_editorial_cod_editorial FOREIGN KEY (cod_editorial) REFERENCES editorial
);

CREATE TABLE autor (
dni					VARCHAR(9),
nombre				TEXT		NOT NULL,
nacionalidad		TEXT,
CONSTRAINT pk_autor PRIMARY KEY (dni)
);

CREATE TABLE editorial (
cod_editorial		SERIAL,
nombre				TEXT		NOT NULL,
direccion			TEXT,
poblacion			TEXT,
CONSTRAINT pk_editorial PRIMARY KEY (cod_editorial)
);

CREATE TABLE genero (
id_genero			SERIAL,
nombre				TEXT		NOT NULL,
descripcion			TEXT,
CONSTRAINT pk_genero PRIMARY KEY (id_genero)
);

CREATE TABLE edicion (
isbn				VARCHAR(13),
fecha_publicacion	DATE,
cantidad			INTEGER,
CONSTRAINT pk_edicion PRIMARY KEY (isbn, fecha_publicacion),
CONSTRAINT fk_edicion_libro FOREIGN KEY (isbn) REFERENCES libro,
CONSTRAINT cantidad_positiva CHECK (cantidad > 0)
);