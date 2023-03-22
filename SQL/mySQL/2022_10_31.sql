show tables;

select
*
from employees;

select
    t2.department_name
from departments t2 
left join employees t1
on t1.department_id = t2.department_id
where t1.department_id is null;

-- ДЗ:
-- 1. Выведите названия департаментов, в которых менеджеры зарабатывают больше 10000
-- 2. Вывести имя и фамилию сотрудника и имя и фамилию его менеджера *
-- 3. Вывести job_id тех сотрудников, которые зарабатывают больше своего менеджера *

use hr;

select
*
from employees;

select
    t1.first_name, 
    t1.last_name,
    t1.job_id,
    t1.salary,
    t2.first_name,
    t2.last_name,
    t2.job_id,
    t2.salary
from employees t1 
left join employees t2
on t1.department_id = t2.department_id
where t1.manager_id = t2.employee_id and t1.salary > t2.salary; 

