CREATE TABLE empresas(
cif				varchar(9),
nombre				text,
direccion			text,
telefono			integer,
CONSTRAINT pk_empresas PRIMARY KEY (cif)
);

CREATE TABLE alumnos(
dni				varchar(9),
nombre				text,
direccion			text,
telefono			varchar(9),
edad				integer,
empresa				text,
CONSTRAINT pk_alumnos PRIMARY KEY (dni)
);

CREATE TABLE alumnos_asisten(
dni				varchar(9),
n_concreto			serial,
CONSTRAINT pk_alumnos_asisten PRIMARY KEY (dni, n_concreto)
);

CREATE TABLE cursos(
n_concreto			serial,
fecha_inicio			date,
fecha_fin			date,
dni_profesor			varchar(9),
tipo_curso			integer,
CONSTRAINT pk_cursos PRIMARY KEY (n_concreto)
)

CREATE TABLE profesores(
dni				varchar(9),
nombre				text,
apellido			text,
telefono			varchar(9),
direccion			text,
CONSTRAINT pk_profesores PRIMARY KEY (dni)
);

CREATE TABLE tipos_curso(
cod_curso			serial,
duracion			integer,
programa			text,
titulo				text,
CONSTRAINT pk_tipos_curso PRIMARY KEY (cod_curso)
);