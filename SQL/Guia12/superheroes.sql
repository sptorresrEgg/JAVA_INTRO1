USE superheroes;

insert into  creador (nombre) values ('Marvel');
insert into  creador (nombre) values ('DC Comics');

select *FROM CREADOR;

select *FROM personajes;


insert into personajes (nombre_real,personaje,inteligencia,fuerza,velocidad,poder,aparicion,ocupacion,id_creador)
VALUES ('Bruce Banner', 'Hulk', 160,'600 mil',75,98,1962,'Fisico Nuclear',1);

insert into personajes (nombre_real,personaje,inteligencia,fuerza,velocidad,poder,aparicion,ocupacion,id_creador)
VALUES ('Tony Stark', 'Iron Man', 170,'200 mil',70,123,1963,'Inventor Industrial',1);

insert into personajes (nombre_real,personaje,inteligencia,fuerza,velocidad,poder,aparicion,ocupacion,id_creador)
VALUES ('Thor Odinson', 'Thor', 145,'Infinita',1000,235,1962,'Rey de Asgard',1);

insert into personajes (nombre_real,personaje,inteligencia,fuerza,velocidad,poder,aparicion,ocupacion,id_creador)
VALUES ('Wanda Maximoff', 'Bruja Escarlata', 170,'100 mil',90,345,1964,'Bruja',1);

insert into personajes (nombre_real,personaje,inteligencia,fuerza,velocidad,poder,aparicion,ocupacion,id_creador)
VALUES ('Carol Danvers', 'Capitana Marvel', 157,'250 mil',85,128,1968,'Oficial de Inteligencia',1);

insert into personajes (nombre_real,personaje,inteligencia,fuerza,velocidad,poder,aparicion,ocupacion,id_creador)
VALUES ('Thanos', 'Thanos', 170,'Infinita',40,306,1973,'Adorador de la muerte',1);

insert into personajes (nombre_real,personaje,inteligencia,fuerza,velocidad,poder,aparicion,ocupacion,id_creador)
VALUES ('Peter Parker', 'Spiderman', 165,'25 mil',80,74,1962,'Fotografo',1);

insert into personajes (nombre_real,personaje,inteligencia,fuerza,velocidad,poder,aparicion,ocupacion,id_creador)
VALUES ('Steve Rogers', 'Capitan America', 145,'600',45,60,1941,'Oficial Federal',1);

insert into personajes (nombre_real,personaje,inteligencia,fuerza,velocidad,poder,aparicion,ocupacion,id_creador)
VALUES ('Bobby Drake', 'Ice Man', 140,'2 mil',64,122,1963,'Contador',1);

insert into personajes (nombre_real,personaje,inteligencia,fuerza,velocidad,poder,aparicion,ocupacion,id_creador)
VALUES ('Barry Allen', 'Flash', 160,'10 mil',120,168,1956,'Cientifico Forense',2);

insert into personajes (nombre_real,personaje,inteligencia,fuerza,velocidad,poder,aparicion,ocupacion,id_creador)
VALUES ('Bruce Wayne', 'Batman', 170,'500',32,47,1939,'Hombre de negocios',2);

insert into personajes (nombre_real,personaje,inteligencia,fuerza,velocidad,poder,aparicion,ocupacion,id_creador)
VALUES ('Clar Kent', 'Superman', 165,'Infinita',120,182,1948,'Reportero',2);

insert into personajes (nombre_real,personaje,inteligencia,fuerza,velocidad,poder,aparicion,ocupacion,id_creador)
VALUES ('Diana Prince', 'Mujer Maravilla', 160,'Inifinita',95,127,1949,'Princesa Guerrera',2);

update personajes set aparicion = 1938 where id_personaje=1938;
select *from personajes where personaje like  '%Flash%';
delete from personajes where personaje like  '%Flash%';

select *FROM personajes;

select nombre_real from personajes;

select nombre_real from personajes where nombre_real like 'B%';

select *from personajes order by inteligencia desc;