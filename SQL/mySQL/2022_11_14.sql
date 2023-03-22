select
	t1.first_name,
    t1.last_name,
    t2.avg_amount
from customers t1
inner join (
  select
      customer_id,
      avg(amount) as avg_amount
  from orders
  group by customer_id
) t2
on t1.customer_id = t2.customer_id;


select
	country,
	avg(age) as avg_age
from customers
group by country
having avg_age >= 25;


select
	t1.first_name,
    t1.last_name,
    t2.avg_amount
from customers t1
inner join (
	select
      customer_id,
      avg(amount) as avg_amount
    from orders
    group by customer_id
  	having avg_amount >= 400
) t2
on t1.customer_id = t2.customer_id;

-- group by customer_id
-- ) t2
-- on t1.customer_id = t2.customer_id
-- where avg_amount >= 400;

-- CASE

/*select
sum(age) as sum_age
from customers*/

-- найти сумму возрастов тех, кто старше 25
select
	sum(
		case 	
			when age < 25
					then 0
			else age
            end
            ) as sum_over_25
		from customers;
        
        -- Найти сумму (amount) всех заказов, у которых amount меньше или равен 400
select
	sum(
      	case
      		when amount > 400 then 0
      		else amount
      	end
      ) as amount_under_400
     from Orders;
     
     -- Найти среднее значение amount всех заказов, у которых amount больше 400
select
	avg(
      	case
      		when amount < 400 then null
      		else amount
      	end
      ) as avg_amount_over_400
     from Orders;
     
     /*
 **Создание таблиц**

1) создать таблицу Students

с полями:
- id целое число первичный ключ автоинкремент
- name строка 128 не null
- age целое число
*/

create table Students (
	id integer primary key auto_increment,
  	name varchar(128) not null,
  	age integer
);

/*2) создать таблицу Teachers

с полями:
- id целое число первичный ключ автоинкремент
- name строка 128 не null
- age целое число*/

create table Teachers (
	id integer primary key auto_increment,
  	name varchar(128) not null,
  	age integer
);

/*3) создать таблицу Competencies

с полями:
- id целое число первичный ключ автоинкремент
- title строка 128 не null*/

create table Competencies (
	id integer primary key auto_increment,
  	title varchar(128) not null
);

/*4) создать таблицу Teachers2Competencies

с полями:
- id целое число первичный ключ автоинкремент
- teacher_id целое число
- competencies_id целое число*/

create table Teachers2Competencies (
	id integer primary key auto_increment,
  	teacher_id integer,
    competencies_id integer
);

/*5) создать таблицу Courses

- id целое число первичный ключ автоинкремент
- teacher_id целое число
- title строка 128 не null
- headman_id целое число*/

create table Courses (
	id integer primary key auto_increment,
  	teacher_id integer,
    title varchar(128) not null,
    headman_id integer
);

/*6) создать таблицу Students2Courses

- id целое число первичный ключ автоинкремент
- student_id целое число
- course_id целое число
 */
 
 create table Students2Courses (
	id integer primary key auto_increment,
  	student_id integer,
    course_id integer
);

CREATE DATABASE University;

use University;

show tables;

/*
Добавить 6 записей в таблицу Students

Анатолий 29
Олег 25
Семен 27
Олеся 28
Ольга 31
Иван 22*/

insert into Students (name, age) values ('Анатолий', 29),
                                                                ('Олег', 25),
                                                                ('Семен', 27),
                                                                ('Олеся', 28),
                                                                ('Ольга', 31),
                                                                ('Иван', 22);
/*Добавить 6 записей в таблицу Teachers

Петр 39
Максим 35
Антон 37
Всеволод 38
Егор 41
Светлана 32*/

insert into Teachers (name, age) values ('Петр', 39),
                                                                ('Максим', 35),
                                                                ('Антон', 37),
                                                                ('Всеволод', 38),
                                                                ('Егор', 41),
                                                                ('Светлана', 32);

/*Добавить 4 записей в таблицу Competencies

Математика 
Информатика
Программирование
Графика*/

insert into Competencies (title) values ('Математика'),
                                                                ('Информатика'),
                                                                ('Программирование'),
                                                                ('Графика');


/*Добавьте 6 записей в таблицу Teachers2Competencies

1 1
2 1
2 3
3 2
4 1
5 3*/

insert into Teachers2Competencies (teacher_id, competencies_id) values (1, 1),
                                                                (2, 1),
                                                                (2, 3),
                                                                (3, 2),
                                                                (4, 1),
                                                                (5, 3);

/*Добавьте 5 записей в таблицу Courses

1 Алгебра логики 2
2 Математическая статистика 3
4 Высшая математика 5
5 Javascript 1
5 Базовый Python 1*/

insert into Courses ( teacher_id, title, headman_id) values (1, 'Алгебра логики', 2),
                                                                (2, 'Математическая статистика', 3),
                                                                (4, 'Высшая математика', 5),
                                                                (5, 'Javascript', 1),
                                                                (5, 'Базовый Python', 1);

/*Добавьте 5 записей в таблицу Students2Courses

1 1
2 1
3 2
3 3
4 5
*/


insert into Students2Courses (student_id, course_id) values (1, 1),
                                                                (2, 1),
                                                                (3, 2),
                                                                (3, 3),
                                                                (4, 5);
                                                                
drop table Teachers2Competencies;


-- 1) Вывести имена студентов и курсы, которые они проходят

select
t1.name,
t3.title
from students t1
inner join students2courses t2
on t1.id = t2.student_id
inner join courses t3
on t2.course_id = t3.id;

-- 2) Выведите имена всех преподавателей с их компетенциями

select
t1.name,
t3.title
from teachers t1
left join teachers2competencies t2
on t1.id = t2.teacher_id
left join competencies t3
on t2.competencies_id = t3.id;


select
t1.name,
t3.title
from teachers t1
left join teachers2competencies t2
on t1.id = t2.teacher_id
left join competencies t3
on t2.competencies_id = t3.id
where t3.title is null;

select
*
from teachers t1
left join teachers2competencies t2
on t1.id = t2.teacher_id
where t2.competencies_id is null;

-- 4) Найдите имена студентов, которые не проходят ни один курс


select
name
from students t1
left join students2courses t2
on t1.id = t2.student_id
where t2.student_id is null;

-- 5) Найдите курсы, которые не посещает ни один студент

select
t1.title
from courses t1
left join students2courses t2
on t1.id = t2.student_id
where t2.student_id is null;


