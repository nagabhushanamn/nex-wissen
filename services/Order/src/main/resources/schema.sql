drop database orders_db;
create database orders_db;
use orders_db;

create table hibernate_sequences (sequence_name varchar(255) not null,
                                  next_val bigint, primary key (sequence_name))

create table order (id integer not null, 
                    amount double precision not null, 
                    order_date datetime, 
                    primary key (id))