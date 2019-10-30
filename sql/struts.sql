set names utf8;
set foreign_key_checks=0;
drop database if exists logindb_nagai;
create database logindb_nagai;
use logindb_nagai;
drop table if exists user;
create table user(
id int,
user_name varchar(255),
password varchar(255)
);

insert into user values
(1,"taro","123"),
(2,"jiro","456"),
(3,"hanako","789");