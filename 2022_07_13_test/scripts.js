// ЗАДАЧА 1
// Реализуйте класс Car (Машина), который будет иметь следующие свойства:
// name (марка), model (модель), country (страна изготовитель), volume (объем двигателя)
// Создайте экземпляр этого класса
// Выведете в консоль все свойства созданного класса

class Car {
    constructor(name, model, country, volume) {
        this.name = name;
        this.model = model;
        this.country = country;
        this.volume = volume;
    }

    getInfo() {
        console.log(`Car: ${this.name}, Model: ${this.model}, Country: ${this.country}, Volume: ${this.volume}`);
    }
}

const car_1 = new Car("Toyota", "RAV4", "Japan", 2.4);

car_1.getInfo();

// Реализуйте класс Group (групп), который будет иметь следующие свойства: 
// name (название группы), major (специализация), number (количество студентов, по умолчанию 15)
// Реализуйте методы add_student() (добавляет одного студента) и delete_student() (удаляет одного студента)
// Создайте экземпляр этого класса
// Проверьте как работают методы


class Group {
    constructor(name, major, number) {
        this.name = name;
        this.major = major;
        if (number === undefined) {
            this.number = 15;
        } else {
            this.number = number;
        }
    }

    addStudent() {
        this.number += 1;
    }

    deleteStudent() {
        this.number -= 1;
    }
}

const group_22_27 = new Group('Group 22/27', 'Frontend', 4);
const group_28_29 = new Group('Group 22/27', 'Backend');

// console.log(group_22_27);
// console.log(group_28_29);

group_22_27.addStudent();

// console.log(group_22_27);

group_22_27.deleteStudent();
// console.log(group_22_27);

// Реализуйте класс Worker (Работник), который будет иметь следующие свойства: name (имя), surname (фамилия), 
//rate (ставка за день работы), days (количество отработанных дней). 
//Также класс должен иметь метод getSalary(), который будет выводить зарплату работника. 
//Зарплата - это произведение (умножение) ставки rate на количество отработанных дней days.
//С помощью класса создайте двух рабочих и найдите сумму их зарплат.


class Worker {
    constructor(name, surname, rate, days) {
        this.name = name;
        this.surname = surname;
        this.rate = rate;
        this.days = days;
    }

    getSalary() {
        return this.rate * this.days;
    }

    add_days(amount) {
        return this.days += amount;
    }

    delete_days(amount) {
        return this.days -= amount;
    }
}

let ivan = new Worker("Ivan", "Ivanov", 100, 20);
let worker_1 = new Worker("Ivan", "Ivanov", 100, 22);

// console.log(ivan.getSalary() + worker_1.getSalary());

// Реализйуте методы add_days (увеличивает количество дней на amount) и delete_days (уменьшает количество дней amount)

// console.log(ivan.add_days(5));
// console.log(worker_1.delete_days(7));

// console.log(ivan);
// Создайте функцию, которая будет создавать экземпляры класса Group и собирать их в один массив

// const all_groups = (name, surname, rate, days) => {
// let arr = {name, surname, rate, days};

// return arr;
// }

// console.log(all_groups("Piotr", "Ivanov", 100, 20));
// console.log(all_groups("Ivan", "Ivanov", 100, 22));

let all_groups_arr = [];

const all_groups = (group_name, group_major, group_amount,) => {
    all_groups_arr.push(new Group(group_name, group_major, group_amount));
}

all_groups('Group22/27', 'Frontend', 4);
all_groups('Group28/29', 'Backend');
all_groups('Group30/31', 'QA', 20);

// console.log(all_groups_arr);