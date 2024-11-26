DROP DATABASE IF EXISTS taller;
CREATE DATABASE taller CHARSET utf8mb4;
USE taller;

CREATE TABLE reparacion (
	ID INT PRIMARY KEY,
	matricula VARCHAR(7) UNIQUE,
	horas INT,
	fecha_entrada DATETIME NOT NULL default (curdate()),
	fecha_salida DATETIME,
	averia VARCHAR(255),
	reparado BOOLEAN,
	observaciones VARCHAR(255)
	);

CREATE TABLE componente (
    ID CHAR(9) PRIMARY KEY,
    descripcion VARCHAR(255),
    stock INT NOT NULL,
    precio FLOAT NOT NULL
);

CREATE TABLE incluye (
    ID_rep INT,
    ID_comp CHAR(9),
    uds INT UNSIGNED,
    PRIMARY KEY (ID_rep , ID_comp),
    FOREIGN KEY (ID_rep)
        REFERENCES reparacion (ID)
        ON UPDATE CASCADE,
    FOREIGN KEY (ID_comp)
        REFERENCES componente (ID)
        ON UPDATE CASCADE
);

alter table reparacion add constraint horaspositivo check(horas>=0);
alter table componente add constraint preciopositivo check(precio>=0);
alter table incluye add constraint udspositivo check(uds>=0);



