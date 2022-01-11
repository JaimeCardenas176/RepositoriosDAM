--1.
SELECT empleado.nombre, empleado.apellido1, empleado.apellido2, producto.nombre, 
FROM empleado JOIN venta USING (id_empleado)
	JOIN lineaventa ON (id = id_venta)
	JOIN producto ON (id_producto = id)

--2.
SELECT empleado.*
FROM empleado JOIN venta USING (id_empleado)
	JOIN cliente c ON (id_cliente = c.id)
WHERE EXTRACT (YEAR FROM empleado.fecha_alta) < 2016
AND EXTRACT (YEAR FROM c.fecha_nacimiento) + 70 <= 2021;

--3.
SELECT AVG(precio_total), c.fecha_nacimiento
FROM cliente c JOIN venta ON (c.id = id_cliente )
GROUP BY c.fecha_nacimiento;