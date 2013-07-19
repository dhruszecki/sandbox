create table t_alumno (al_id int not null auto_increment primary key, al_nombre varchar (32) not null
, al_apellido varchar (32) not null, al_tipo_documento varchar (32) not null, al_documento varchar (32) not null, al_edad int not null );

create table t_carrera (ca_id int not null auto_increment primary key, ca_nombre varchar (32) not null
, ca_carga_horaria int not null);

create table Person (id int not null auto_increment primary key, name varchar (32) not null, lastname varchar (32) not null);
