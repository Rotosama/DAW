DROP DATABASE IF EXISTS tienda;
CREATE DATABASE tienda CHARACTER SET utf8mb4;
USE tienda;

CREATE TABLE fabricante (
  id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(100) NOT NULL
);

CREATE TABLE producto (
  id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(100) NOT NULL,
  precio DOUBLE NOT NULL,
  id_fabricante INT UNSIGNED NOT NULL,
  FOREIGN KEY (id_fabricante) REFERENCES fabricante(id)
);

INSERT INTO fabricante VALUES(1, 'Asus');
INSERT INTO fabricante VALUES(2, 'Lenovo');
INSERT INTO fabricante VALUES(3, 'Hewlett-Packard');
INSERT INTO fabricante VALUES(4, 'Samsung');
INSERT INTO fabricante VALUES(5, 'Seagate');
INSERT INTO fabricante VALUES(6, 'Crucial');
INSERT INTO fabricante VALUES(7, 'Gigabyte');
INSERT INTO fabricante VALUES(8, 'Huawei');
INSERT INTO fabricante VALUES(9, 'Xiaomi');

INSERT INTO producto VALUES(1, 'Disco duro SATA3 1TB', 86.99, 5);
INSERT INTO producto VALUES(2, 'Memoria RAM DDR4 8GB', 120, 6);
INSERT INTO producto VALUES(3, 'Disco SSD 1 TB', 150.99, 4);
INSERT INTO producto VALUES(4, 'GeForce GTX 1050Ti', 185, 7);
INSERT INTO producto VALUES(5, 'GeForce GTX 1080 Xtreme', 755, 6);
INSERT INTO producto VALUES(6, 'Monitor 24 LED Full HD', 202, 1);
INSERT INTO producto VALUES(7, 'Monitor 27 LED Full HD', 245.99, 1);
INSERT INTO producto VALUES(8, 'Portátil Yoga 520', 559, 2);
INSERT INTO producto VALUES(9, 'Portátil Ideapd 320', 444, 2);
INSERT INTO producto VALUES(10, 'Impresora HP Deskjet 3720', 59.99, 3);
INSERT INTO producto VALUES(11, 'Impresora HP Laserjet Pro M26nw', 180, 3);

-- 1. Lista todas las columnas de la tabla producto.
SELECT 
    *
FROM
    producto;
    
-- 2. Lista los nombres y los precios de todos los productos de la tabla producto.
SELECT 
    nombre, precio
FROM
    producto;
    
-- 3. Lista el nombre de los productos, el precio en euros y el precio en dolares estadounidenses ($).
SELECT 
    nombre, 
    CONCAT(precio, ' €'), 
    CONCAT(ROUND(precio * 1.06, 2), ' $') -- 1 EUR = 1,06 $
FROM 
    producto;
    
/* 4. Modifica la consulta anterior para añadir los siguientes alias para las columnas: nombre de
producto, euros, dólares.*/
SELECT 
    nombre AS nombre_producto, 
    CONCAT(precio, ' €') AS euros, 
    CONCAT(ROUND(precio * 1.06, 2), ' $') AS dolares -- 1 EUR = 1,06 $
FROM 
    producto;
    
/*5. Lista los nombres y los precios de todos los productos de la tabla producto, convirtiendo los
nombres a mayúscula.*/
SELECT 
    UPPER(nombre), precio
FROM
    producto;
    
/*6. Lista los nombres y los precios de todos los productos de la tabla producto, añdiendo dos columnas
nuevas, una redondeando el valor del precio y otra truncado el valor del precio para mostrarlo sin
ninguna cifra decimal. Asigna alias a las columnas: nombre, precio, redondeado, truncado.*/
SELECT 
    nombre,
    ROUND(precio) AS redondeado,
    TRUNCATE(precio, 0) AS truncado
FROM
    producto;
    
/*7. Lista el identificador de los fabricantes que tienen productos en la tabla producto, eliminando los
identificadores que aparecen repetidos.*/
SELECT DISTINCT
    id_fabricante
FROM
    producto;

/*8. Lista los nombres de los productos ordenados en primer lugar por el nombre de forma ascendente
y en segundo lugar por el precio de forma descendente.*/
SELECT 
    nombre, precio
FROM
    producto
ORDER BY nombre ASC , precio DESC;

/*9. Devuelve una lista con 2 filas a partir de la cuarta fila de la tabla fabricante. La cuarta fila también se
debe incluir en la respuesta.*/
SELECT 
    *
FROM
    fabricante
LIMIT 2 OFFSET 3;

/*10. Lista el nombre y el precio del producto más barato. (Utilice solamente las cláusulas ORDER BY y
LIMIT)*/
SELECT 
    nombre, precio
FROM
    producto
ORDER BY precio ASC
LIMIT 1;

/*11. Lista el nombre de todos los productos del fabricante cuyo identificador de fabricante es igual a 2.*/
SELECT 
    nombre
FROM
    producto
WHERE
    id_fabricante = 2;
    
-- 12. Lista el nombre de los productos que tienen un precio menor o igual a 120€.
SELECT 
    nombre AS prod_menor_o_igual_120E
FROM
    producto
WHERE
    precio <= 120;
    
-- 13. Lista el nombre de los productos que no tienen un precio mayor o igual a 400€.
SELECT 
    nombre AS prod_mayor_o_igual_400E
FROM
    producto
WHERE
    precio < 400;
    
-- 14. Lista todos los productos que tengan un precio entre 60€ y 200€. Utilizando el operador BETWEEN.
SELECT 
    *
FROM
    producto
WHERE
    precio BETWEEN 60 AND 200;
    
-- 15. Lista todos los productos que tengan un precio entre 60€ y 200€ (sin utilizar el operador BETWEEN) y que el identificador de fabricante sea igual a 6.
SELECT 
    *
FROM
    producto
WHERE
    id_fabricante = 6 AND precio >= 60
        AND precio <= 200;
    
-- 16. Lista todos los productos donde el identificador de fabricante sea 1, 3 o 5. Utilizando el operador IN.
SELECT 
    *
FROM
    producto
WHERE
    id_fabricante IN (1, 3, 5);
    
/*17. Lista el nombre y el precio de los productos en céntimos (Habrá que multiplicar por 100 el valor del
precio). Cree un alias para la columna que contiene el precio que se llame céntimos.*/
SELECT 
    nombre, precio * 100 AS céntimos
FROM
    producto;

-- 18. Lista los nombres de los fabricantes cuyo nombre empiece por la letra S.
SELECT 
    nombre
FROM
    fabricante
WHERE
    nombre LIKE 'S%';
    
-- 19. Lista los nombres de los fabricantes cuyo nombre contenga el carácter w.
SELECT 
    nombre
FROM
    fabricante
WHERE
    nombre LIKE '%w%';

-- 20. Lista los nombres de los fabricantes cuyo nombre sea de 4 caracteres.
SELECT 
    nombre
FROM
    fabricante
WHERE
    nombre LIKE '____';
    
/*21. Devuelve una lista con el nombre de todos los productos que contienen la cadena Monitor en el
nombre y tienen un precio inferior a 215 €.*/
SELECT 
    nombre
FROM
    producto
WHERE
    nombre LIKE '%Monitor%' AND precio < 215;
    
/*22. Lista el nombre y el precio de todos los productos que tengan un precio mayor o igual a 180€.
Ordene el resultado en primer lugar por el precio (en orden descendente) y en segundo lugar por el
nombre (en orden ascendente).*/
SELECT 
    nombre, precio
FROM
    producto
WHERE
    precio >= 180
ORDER BY precio DESC , nombre ASC;

-- 23. Calcula el número total de productos que hay en la tabla productos.
SELECT 
    COUNT(*) AS numero_productos
FROM
    producto;
    
-- 24. Calcula el número total de fabricantes distintos que hay en la tabla productos.
SELECT 
    COUNT(DISTINCT(id_fabricante)) as num_fabricantes
FROM
    producto;
    
-- 25. Calcula la media del precio de todos los productos.
SELECT 
    AVG(precio) AS media_precio
FROM
    producto;
    
-- 26. Lista el nombre y el precio del producto más barato.
SELECT 
    nombre, precio
FROM
    producto
ORDER BY precio ASC
LIMIT 1;

-- 27. Calcula la media del precio de todos los productos del fabricante Asus (id=1).
SELECT 
    AVG(precio) AS precio_medio_Asus
FROM
    producto
WHERE
    id_fabricante = 1;
    
-- 28. Calcula el precio más barato de todos los productos del fabricante Asus (id=1).
SELECT 
    MIN(precio) AS barato_Asus
FROM
    producto
WHERE
    id_fabricante = 1;
    
/*29. Muestra el precio máximo, precio mínimo, precio medio y el número total de productos que tiene el
fabricante Crucial (id=6).*/
SELECT 
    MAX(precio) AS precio_maximo,
    MIN(precio) AS precio_minimo,
    AVG(precio) AS precio_medio,
    COUNT(*) AS numero_productos
FROM
    producto
WHERE
    id_fabricante = 6;
    
-- 30. Calcula el número de productos que tienen un precio mayor o igual a 180€.
SELECT 
    COUNT(*) AS precio_mayor_180E
FROM
    producto
WHERE
    precio >= 180;


