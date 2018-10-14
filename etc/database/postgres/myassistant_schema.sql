create user myassistant_user with password 'myassistant_pwd';
create database myassistant_db;
grant all privileges on database myassistant_db to myassistant_user;
create schema myassistant_schema;
create table myassistant_schema.myassistant_frnds(
id serial not null,
name varchar(20) not null,
sex varchar(20),
tel int,
emailid varchar(20),
dob date,
dof date,
primary key(id)
);
