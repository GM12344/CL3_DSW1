create database daw1_ventasProductos;
use daw1_ventasProductos;

create table if not exists tb_producto (
    id_producto			int not null primary key auto_increment,
    nombre				varchar(45) not null,
    precio			   double  not null,
    cantidad		   int  not null
);