create schema "TEST";

create table "TEST"."PRODUCT" (
	id INTEGER IDENTITY NOT NULL PRIMARY KEY,
    description VARCHAR(255), 
    price INTEGER
);

create table "TEST"."CUSTOMER" (
	id INTEGER IDENTITY NOT NULL PRIMARY KEY,
	nombre VARCHAR(255)
);

create table "TEST"."ORDER" (
	id INTEGER IDENTITY NOT NULL PRIMARY KEY,
	id_prod_order INTEGER
);

create table "TEST"."PRODUCT_BY_ORDER" (
	id INTEGER IDENTITY NOT NULL PRIMARY KEY,
	id_order INTEGER NOT NULL,
	id_customer INTEGER NOT NULL,
	id_product INTEGER NOT NULL,
	cantidad INTEGER NOT NULL
);