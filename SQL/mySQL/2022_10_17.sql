drop table example;

drop table if exists good; 
create table good (
id integer primary key auto_increment,
title varchar(128),
quantity integer check(quantity > 0),
price integer default 100,
in_stock char(1) check (in_stock in ('y', 'n'))
);

select * from good;

insert into good (title, quantity, in_stock) values ('Apple', 4, 'y'),
													('Orange', 5, 'n'),
                                                    ('Grape', 3, 'y'),
                                                    ('Banana', 2, 'n'),
                                                    ('Lemon', 7, 'y');
                                                    
                                                    
insert into good (title, quantity, price,  in_stock) values ('Lime', 8, 120, 'y');


-- Adding a field
alter table good
add country varchar(128);


-- Deleting a field

alter table good
drop column country;

-- Changing a field

alter table good
modify column country char(3);


-- Changing the field's name

alter table good
change country product_country varchar(128);


insert into good (title, quantity, in_stock) values ('Blackberry', 0, 'n');

-- deleting limit

alter table good
drop check good_chk_1;

-- changing a values
update good
set quantity = 0
where quantity >= 5;

update good
set quantity = null;

set sql_safe_updates = 0;

/*
1. Создать таблицу products
id первичный ключ автоинкремент
title строка 128
quantity от 0 до 10

2. Добавить несколько строк
3. Добавить поле price integer со значение по умолчанию 0
4. Изменить тип price на numeric(8, 2)
*/

create table products (
id integer primary key auto_increment,
title varchar(128),
quantity integer check (quantity between 0 and 10)
);

insert into products (title, quantity) values ('PC', 5),
											  ('TV', 7),
                                              ('Monitor', 10);
                                              
alter table products
add price integer default 0;

alter table products
modify column price numeric(8.2);

alter table products
modify column price integer;

alter table products
change price item_price integer;

alter table products
drop column item_price;

select * from products;

-- ПРЕДСТАВЛЕНИЯ
-- Представления позволяют нам сохранить глобально не сами данные, а запрос. При каждом обращение к представлению выполняется запрос и формируется набор данных из таблицы

create view v_s_products as
select 
*
from products
where title like 's%';

select * from products;

show tables;

/*
1) необходимо создать таблицу students с полями

name (не null)
lastname (не null)
avg_mark (от 0 до 5)
gender varchar(128) (или “M” или “F”)

2) добавить 5 записей студентов

Олег Петров 4.3 M
Семен Степанов 3.1 M 
Ольга Семенова 4.7 F 
Игорь Романов 3.1 M 
Ирина Иванова 2.2 F

3) добавить поле id integer primary key auto_increment
4) поменять тип у gender на char(1)
5) переименовать поле name на firstname
*/


create table students (
name varchar(128) not null,
lastname varchar(128) not null,
avg_mark integer check (avg_mark between 0 and 5),
gender varchar(128) check (gender in ('M', 'F'))
);

insert into students (name, lastname, avg_mark, gender) values ('Олег', 'Петров', 4.3, 'M'),
															   ('Семен', 'Степанов', 3.1, 'M'),
															   ('Ольга', 'Семенова', 4.7, 'F'),
                                                               ('Игорь', 'Романов', 3.1, 'M'), 
                                                               ('Ирина', 'Иванова', 2.2, 'F');
                                                               
alter table students
add id integer primary key auto_increment;

alter table students
modify column gender char(1);

alter table students
change name firstname varchar(128);

select
*
from students;

create view students_2 as 
select 
*
from students
where avg_mark > 4;

create view students_3 as 
select 
*
from students
where avg_mark not in (3, 4);

select
*
from students_3;

create view students_4 as 
select 
*
from students
where firstname like ('И%');

select
*
from students_4;

select 
*
from students
where avg_mark in (2.2, 3.1, 4.7);

rename table students_1 to students;

select
*
from students_1;


create view men as 
select 
firstname, lastname
from students
where gender like ('M');

select
*
from men;

create view women as 
select 
firstname, lastname
from students
where gender like ('F');

select
*
from women;

select distinct avg_mark
from students
;

update students
set avg_mark = avg_mark * 10;

alter table students
drop check students_chk_1;

select * from students;







                                                    