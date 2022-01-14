CREATE TABLE alumno (
        dni                varchar(9),
        nombre        varchar(100),
        CONSTRAINT pk_alumno PRIMARY KEY (dni)
);

CREATE TABLE asignatura (
        cod_asig        serial,
        nombre                varchar(100),
        CONSTRAINT pk_asignatura PRIMARY KEY (cod_asig)
);

CREATE TABLE matricula (
        dni                        varchar(9),
        cod_asig        integer,
        anio                integer,
        CONSTRAINT pk_matricula PRIMARY KEY (dni, cod_asig, anio),
		ALTER TABLE fk_matricula_alumno ADD FOREIGN KEY (dni) REFERENCES alumno,
		ALTER TABLE fk_matricula_asignatura ADD FOREIGN KEY (cod_asig) REFERENCES asignatura
);

CREATE TABLE notas (
        dni                        varchar(9),
        cod_asig        integer,
        anio                integer,
        evaluacion        varchar(2),
        nota                smallint,
        CONSTRAINT pk_notas PRIMARY KEY (dni, cod_asig, anio, evaluacion),
	    ALTER TABLE fk_notas_matricula ADD FOREIGN KEY (dni, cod_asig, anio) REFERENCES matricula (dni, cod_asig, anio)
);