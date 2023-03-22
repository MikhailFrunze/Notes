use Group_22_27;
show tables;

drop table example;

drop table if exists goods;
create table goods (
	id integer primary key auto_increment,
    title varchar(128),
    quantity integer,
    price integer default 100,
    in_stock char(1) check (in_stock in ('y', 'n')),
    country varchar(128)
);

select * from goods;

insert into goods (title, quantity, in_stock) values ('Apple', 4, 'y'),
													('Orange', 5, 'n'),
                                                    ('Grape', 3, 'y'),
                                                    ('Banana', 2, 'n'),
                                                    ('Lemon', 7, 'y');
insert into goods (title, quantity, price, in_stock) values ('Lime', 8, 120, 'y');
insert into goods (title, quantity, in_stock) values ('Blackberry', 0, 'n');


-- ИЗМЕНЕНИЕ ПОЛЯ
-- Добавление нового поля
alter table goods
add country varchar(128);

-- Удаление поля
alter table goods
drop column country;

-- Изменение поля (тип данных)
alter table goods
modify column country char(3);

-- Изменить имя поля
alter table goods
change country product_country varchar(128);

-- Удалить ограничение
alter table goods
drop check goods_chk_1;

-- Изменить значение
update goods
set quantity = 0
where quantity >= 5;

update goods
set quantity = null;

set sql_safe_updates = 0;




-- ПРАКТИЧЕСКОЕ ЗАДАНИЕ
/*
1. Создать таблицу products
id первичный ключ автоинкремент
title строка 128
quantity от 0 до 10
*/

create table products (
	id integer primary key auto_increment,
    title varchar(128),
    quantity integer check (quantity between 0 and 10)
);

-- 2. Добавить несколько строк

insert into products (title, quantity) values ('Bike', 4), ('Skate', 7), ('Skies', 3), ('Scooter', 9);

-- 3. Добавить поле price integer со значение по умолчанию 0

alter table products 
add price integer default 0;

select * from products;
truncate products;

-- 4. Изменить тип price на numeric(8, 2)

alter table products
modify column price numeric(8, 2);

-- 5. Иззмените тип price обратно на integer

alter table products
modify column price integer;

-- 6. Переименуйте поле на item_price

alter table products
change price item_price integer;

-- 7. Удалите поле item_price

alter table products
drop column item_price;


-- ПРЕДСТАВЛЕНИЯ
-- Представления позволяют нам сохранить глобально не сами данные, а запрос. При каждом обращение к представлению выполняется запрос и формируется набор данных из таблицы 
create view v_s_products as
select 
	*
from products
where title like 's%';

select * from products;

select * from v_s_products
where quantity = 9;

drop view v_s_products;

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
    avg_mark numeric(2, 1) check (avg_mark between 0 and 5),
    gender char(1) check (gender in('M', 'F'))
);

insert into students (name, lastname, avg_mark, gender) values ('Олег', 'Петров', 4.3, 'M'),
																('Семен', 'Степанов', 3.1, 'M'),
                                                                ('Ольга', 'Семенова', 4.7, 'F'),
                                                                ('Игорь', 'Романов', 3.1, 'M'),
                                                                ('Ирина', 'Иванова', 2.2, 'M');
                                                                
select * from students;

alter table students
add id integer primary key auto_increment;

alter table students
change name firstname varchar(128);

/*
6) выборки

- найти учеников, у которых оценка больше 4
- найти учеников, у которых оценка не входит в диапазон от 3 до 4
- найти учеников, у которых имя начинается на И
- найти учеников, у которых оценка 2.2 или 3.1 или 4.7
*/

select
	*
from students
where avg_mark > 4;

select
	*
from students
where avg_mark not between 3 and 4;

select
	*
from students
where firstname like 'и%';

select
	*
from students
where avg_mark in (2.2, 3.1, 4.7);

rename table students_1 to students;

/*
7) Создать представление, которое содержит всех мужчин (без поля gender)
8) Создать представление, которое содержит всех женщин (без поля gender)
9) Найти набор уникальных оценок
*/

create view v_students_m as
select
	id,
    firstname,
    lastname,
    avg_mark
from students
where gender = 'M';

create view v_students_f as
select
	id,
    firstname,
    lastname,
    avg_mark
from students
where gender = 'F';

select * from v_students_m;
select * from v_students_f;

select distinct
	avg_mark
from students;

-- Увеличить всем учащимся оценку в 10 раз

alter table students
modify column avg_mark numeric(3, 1);

alter table students
drop check students_chk_1;

update students
set avg_mark = avg_mark * 10;


-- ДЗ:
-- 11) Поменяйте у Олега Петрова фамилию на Сидоров


-- 12) Для всех учеников, у которых оценка не больше 31 увеличить ее на 10

select
	*
from students;

set sql_safe_updates = 0;

update students
set lastname = 'Сидоров'
where
lastname like 'Петров';

update students
set avg_mark = avg_mark * 10
where avg_mark < 31;
