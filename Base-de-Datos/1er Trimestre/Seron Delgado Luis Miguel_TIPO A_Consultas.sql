--1
SELECT desde, hasta, salida, llegada, aeropuerto.ciudad
FROM vuelo JOIN aeropuerto ON (hasta = id_aeropuerto)
	JOIN avion USING (id_avion)
WHERE avion.nombre ILIKE ('Airbus %')
AND aeropuerto.ciudad IN ('Sevilla')
AND EXTRACT (YEAR FROM salida ) = '2021'
AND EXTRACT (MONTH FROM salida) = '7';

--3
SELECT COUNT (nombre) AS "N personas que reservaron vuelo"
FROM reserva JOIN vuelo USING (id_vuelo)
	JOIN aeropuerto ON (hasta = id_aeropuerto)
	JOIN aeropuerto ON (desde = id_aeropuerto) 
WHERE aeropuerto.nombre ILIKE ('Barajas')
AND aeropuerto.nombre ILIKE ('Berlin %')
AND descuento > 0;

--4
SELECT cliente.nombre, cliente.apellido1, cliente.apellido2
FROM cliente JOIN reserva USING (id_cliente)
	JOIN vuelo USING (id_vuelo)
	JOIN aeropuerto ON (hasta = id_aeropuerto)
AND id_aeropuerto = 11
WHERE TO_CHAR (fecha_reserva 'ID') IN ('5','6','7');