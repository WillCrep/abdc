INSERT INTO users(enabled, password, username) VALUES (1,"$2a$10$dCcW48j5cXl63GEjqf5L8exG9l1LVyW6cGk0ZKZGdLTB3YQIHxcvG","Administrador")
INSERT INTO users(enabled, password, username) VALUES (1,"$2a$10$.f5.wHckWeqle77MoKfHWeNfTo51SxJlFcN7qKRhjeYGmwcwEyfUy","Mecanico1")
INSERT INTO users(enabled, password, username) VALUES (1,"$2a$10$GiPOpGc941pqYIW0KvYNNOEaHB7l1sq.t2B8SZDP0dHTfefEzRmba","Mecanico2")

INSERT INTO authorities (authority, user_id) VALUES ("ADMIN", 1)
INSERT INTO authorities (authority, user_id) VALUES ("USER", 2)
INSERT INTO authorities (authority, user_id) VALUES ("USER", 3)

INSERT INTO personal (nombre, apellidos) VALUES ("Anthony","Perez Cevilla")
INSERT INTO personal (nombre, apellidos) VALUES ("Fiorela","Tohalino Contreras")
INSERT INTO personal (nombre, apellidos) VALUES ("Sandra","Coaquira Ramírez")
INSERT INTO personal (nombre, apellidos) VALUES ("Óscar","Delgado Bazán")
INSERT INTO personal (nombre, apellidos) VALUES ("Jorge","Lobatón Cubas")

INSERT INTO cliente (nombre, apellidos) VALUES ("David","Suarez Armas")
INSERT INTO cliente (nombre, apellidos) VALUES ("Yasmin","Santillán Banderas")
INSERT INTO cliente (nombre, apellidos) VALUES ("Felipe","Iglesias Fernández")
INSERT INTO cliente (nombre, apellidos) VALUES ("Guillermo","Lopez Gomez")
INSERT INTO cliente (nombre, apellidos) VALUES ("Viviana","Silva Corales")

INSERT INTO servicio(nombre, monto) VALUES ("Mantenimiento",1000)
INSERT INTO servicio(nombre, monto) VALUES ("Reparación",2000)
INSERT INTO servicio(nombre, monto) VALUES ("Planchado",3000)
INSERT INTO servicio(nombre, monto) VALUES ("Pintado",2590.48)

INSERT INTO servicio_mecanico (serv_fecha,cli_id, per_id) VALUES ('2019-11-30',1,2);
INSERT INTO servicio_mecanico (serv_fecha,cli_id, per_id) VALUES ('2019-11-29',2,1);

INSERT INTO detalle_servicio(contenido, marca, modelo, placa, srv_id, serv_id) VALUES('No tiene rayones','Suzuki','New Vitara','TBS-159',1,1);
INSERT INTO detalle_servicio(contenido, marca, modelo, placa, srv_id, serv_id) VALUES('No tiene rayones','Kia','New ViCerato','QWE-123',2,1);
INSERT INTO detalle_servicio(contenido, marca, modelo, placa, srv_id, serv_id) VALUES('Frenos fallando','Toyota','PRIUS','HIJ-345',1,2);


INSERT INTO servicios_solicitados(fecha, cli_id, srv_id) VALUES ( "2019-11-30",1,1);
INSERT INTO servicios_solicitados(fecha, cli_id, srv_id) VALUES ( "2019-11-30",1,2);
INSERT INTO servicios_solicitados(fecha, cli_id, srv_id) VALUES ( "2019-11-29",2,2);
