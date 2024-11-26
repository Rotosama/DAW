DROP DATABASE IF EXISTS Q5;
CREATE DATABASE Q5 CHARSET UTF8MB4;
USE Q5;

CREATE TABLE categoria (
    cod_cat VARCHAR(15) PRIMARY KEY,
    descripcion VARCHAR(50)
);

CREATE TABLE articulo (
    cod_a VARCHAR(10) PRIMARY KEY,
    descrip VARCHAR(50),
    precio FLOAT,
    stock INT,
    stock_min INT,
    cod_cat VARCHAR(15) NOT NULL,
    FOREIGN KEY (cod_cat)
        REFERENCES categoria (cod_cat)
        ON UPDATE CASCADE
);

CREATE TABLE provincia (
    cod_pro INT PRIMARY KEY,
    nom VARCHAR(50)
);

CREATE TABLE pueblo (
    cod_pob INT PRIMARY KEY,
    nom VARCHAR(50),
    cod_pro INT NOT NULL,
    FOREIGN KEY (cod_pro)
        REFERENCES provincia (cod_pro)
        ON UPDATE CASCADE
);

CREATE TABLE cliente (
    cod_cli INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(100),
    direccion VARCHAR(100),
    cp INT NOT NULL,
    FOREIGN KEY (cp)
        REFERENCES pueblo (cod_pob)
        ON UPDATE CASCADE
);

CREATE TABLE vendedor (
    cod_ven INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(100),
    direccion VARCHAR(100),
    cp INT NOT NULL,
    jefe INT UNSIGNED,
    FOREIGN KEY (cp)
        REFERENCES pueblo (cod_pob)
        ON UPDATE CASCADE,
    FOREIGN KEY (jefe)
        REFERENCES vendedor (cod_ven)
        ON UPDATE CASCADE ON DELETE SET NULL
);

CREATE TABLE factura (
    num_f INT PRIMARY KEY,
    fecha DATE,
    cod_cli INT UNSIGNED NOT NULL,
    cod_ven INT UNSIGNED,
    iva INT,
    dte INT,
    FOREIGN KEY (cod_ven)
        REFERENCES vendedor (cod_ven)
        ON DELETE SET NULL ON UPDATE CASCADE,
    FOREIGN KEY (cod_cli)
        REFERENCES cliente (cod_cli)
        ON UPDATE CASCADE
);

CREATE TABLE linia_fac (
    num_f INT,
    num_l INT,
    cod_a VARCHAR(10) NOT NULL,
    cant INT,
    precio FLOAT,
    dto INT,
    FOREIGN KEY (num_f)
        REFERENCES factura (num_f)
        ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY (cod_a)
        REFERENCES articulo (cod_a)
        ON DELETE CASCADE ON UPDATE CASCADE,
    PRIMARY KEY (num_f , num_l)
);