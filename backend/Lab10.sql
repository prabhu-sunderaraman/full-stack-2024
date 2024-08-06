-- Table names are pluralized; 
-- column names follow snake_case;
-- sql queries are not case sensitve

-- create database training;
use training;
create table if not exists accounts (
	account_id int primary key not null,
    account_holder varchar(50),
    balance decimal(10,2),
    account_type varchar(20)
);

insert into accounts(account_id, account_holder, balance, account_type) values 
(1, 'John Doe', 1500.00, 'checking'),
(2, 'Jane Smith', 2200.50, 'savings'),
(3, 'Michael Johnson', 500.25, 'checking'),
(4, 'Emily Brown', 3500.75, 'savings'),
(5, 'David Lee', 1200.00, 'checking');

-- RETRIEVAL
insert into accounts (account_id, account_holder, balance, account_type) values (123455, 'Jowy', 30000.5, 'Savings'); Drop table accounts; -- ')

select * from accounts;
select account_holder as owner, balance from accounts;
select * from accounts where balance > 1000;
select * from accounts where account_type="checking";
select * from accounts order by balance DESC;
select * from accounts order by balance DESC limit 3;

-- UPDATE

update accounts set balance = balance + 100 where account_id = 1;
update accounts set account_type='savings' where account_id = 1;

-- DELETE

delete from accounts where account_id = 10;

