drop database items_db;
create database items_db;
use items_db;

create table item (
                   id varchar(255) not null, 
                   can_buy bit not null, 
                   currency_code varchar(255), 
                   description varchar(255), 
                   img_path varchar(255), 
                   name varchar(255), 
                   price double precision not null, 
                   primary key (id)
);
create table review (
                    id integer not null auto_increment, 
					author varchar(255), 
					body varchar(255), 
					stars integer not null, 
					item_id varchar(12), primary key (id)
					);
create table hibernate_sequences (sequence_name varchar(255) not null, next_val bigint, primary key (sequence_name));					
alter table review add constraint foreign key (item_id) references item (id);					

