DROP TABLE IF EXISTS `almacenes`;
DROP table IF EXISTS cajas;


CREATE TABLE `almacenes` (
  `id` int AUTO_INCREMENT,
  `lugar` varchar(250),
  `capacidad` int,
  PRIMARY KEY (`id`)
);

CREATE TABLE cajas (
  num_referencia varchar(5) PRIMARY KEY,
  contenido varchar(100),
  valor int,
  cod_almacen int,
  CONSTRAINT almacenes_fk FOREIGN KEY (cod_almacen) REFERENCES almacenes (id) ON DELETE CASCADE ON UPDATE CASCADE
);


insert into almacenes (lugar ,capacidad)values('Albacete',50);
insert into almacenes (lugar ,capacidad)values('Jerez',15);
insert into almacenes (lugar ,capacidad)values('Reus', 20);


insert into cajas (num_referencia, contenido, valor, cod_almacen) values ('41258','Tijeras',50,1);
insert into cajas (num_referencia, contenido, valor, cod_almacen) values ('88888','Mesas',30,2);
insert into cajas (num_referencia, contenido, valor, cod_almacen) values ('22222','Lamparas',99,3);
