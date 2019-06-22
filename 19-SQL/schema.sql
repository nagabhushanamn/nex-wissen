

// mysql


create database PM;
use PM;

create table PM.PRODUCTS(
	id int primary key auto_increment,
	name varchar(256),
	price double,
	type varchar(256)
);