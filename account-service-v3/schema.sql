
# MySQL
create database my_bank;
use my_bank;

create table my_bank.ACCOUNTS(
    num varchar(12),
    balance double
)
insert into my_bank.ACCOUNTS values("1",1000.00)
insert into my_bank.ACCOUNTS values("2",1000.00)