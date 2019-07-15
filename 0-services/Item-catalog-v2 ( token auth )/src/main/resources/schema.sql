
drop database items_db;
create database items_db;
use items_db;



create table item (
	id varchar(12) not null, 
	can_buy bit not null, 
	currency_code varchar(255), 
	description varchar(255), 
	img_path varchar(255), 
	name varchar(255), 
	price double precision not null, primary key (id))

create table review (id integer not null, 
	body varchar(255), 
	stars integer not null, 
	item_id varchar(12), 
	user_id bigint, 
	primary key (id))

create table role (id bigint not null, name varchar(255), primary key (id)) 
create table user (id bigint not null, password varchar(255), username varchar(255), primary key (id)) 

create table user_roles (users_id bigint not null, roles_id bigint not null, primary key (users_id, roles_id)) 
alter table review add constraint  foreign key (item_id) references item (id)
alter table review add constraint  foreign key (user_id) references user (id)
alter table user_roles add constraint  foreign key (roles_id) references role (id)
alter table user_roles add constraint  foreign key (users_id) references user (id)



