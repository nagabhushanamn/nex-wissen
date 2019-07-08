create table item (id varchar(255) not null, 
                   can_buy bit not null, 
                   currency_code varchar(255), 
                   description varchar(255), 
                   img_path varchar(255), 
                   name varchar(255), 
                   price double precision not null, 
                   primary key (id)
)