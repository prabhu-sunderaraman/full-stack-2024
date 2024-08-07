-- All tables have "id" as the primary key; 
-- because the uniqueness is enforced in the DB level without being affected by the change in requirements and also saves memory
-- The primary key column is not based on the concept like aadhar number or account number though they are unique
-- Define unique constraints for columns like aadhar_number or account_number
-- use pluralized names for tables
-- use singular names for join tables
-- where you add a foreign key reference ie., aadhar_id in persons or person_id in aadhar tables? is a design decision


use training;

create table if not exists aadhar (
   id int primary key auto_increment not null,
   aadhar_number int,
   UNIQUE INDEX `aadhar_number_UNIQUE` (`aadhar_number` ASC) VISIBLE
);


create table if not exists accounts (
    id int primary key auto_increment not null,
    account_number int, 
    account_holder varchar(50),
    balance decimal(10,2),
    account_type varchar(20),
    UNIQUE INDEX `account_number_UNIQUE` (`account_number` ASC) VISIBLE
);

create table if not exists persons (
	id int primary key auto_increment not null,
	name varchar(20), 
	age int,
	aadhar_id int,
    foreign key(aadhar_id) references aadhar(id)
);

create table if not exists cars (
	id int primary key auto_increment not null,
	model varchar(100),
	car_year int,
	person_id int,
	foreign key(person_id) references persons(id)
);


create table if not exists person_account (
  person_id int,
  account_id int,
  primary key(person_id,account_id)
);