"use strict";

// function declaration
function helloWorld() {
    console.log('Hello World');
}

// helloWorld();

function myLovelyHelloWorld() {
    return 'Greeting Hello World!';
}

let userGreeting = myLovelyHelloWorld();

// console.log(userGreeting);

// function expression, 

let variable = function () {

    return 'Test'
}

let variable2 = function () {

    console.log('Test');
}


// console.log(variable);
console.log(variable());

// void методы/функции ---- возвратные / return

// function decalration, function expression
/*
1. Точка с запятой, инициализация переменной это выражение и оно должно завершаться точкой с запятой
2.  Анонимная функция
3. Это функция не доступна до её написания.
*/

let teacher = {
    firstname: 'Andrej',
    secondName: 'Podlubnyj',
    nickname: 'adnron13',
    email: 'andron13@gmail.com',
    age: 45,
    city: 'Berlin',
    hasDriverLicense: true,
    immunizationPass: true,
    friends: ['Sasha', 'Masha', 'Dasha', 'Glasha', 'Misha'],
    computer: {
        serialNumber: 3579514686254,
        OS: 'windows',
        age: 7,

    }
}

let week = [
    'Monday',
    'Tuesday',
    'Wednesday',
    'Thursday',
    'Friday',
    'Saturday',
    'Sunday'
]

console.log(week[0]); // i+1
// key -> value // kv


let newLibraryWeek = { // javascript object notation
    1: 'Monday',
    2: 'Tuesday',
    3: 'Wednesday',
    4: 'Thursday',
    5: 'Friday',
    6: 'Saturday',
    7: 'Sunday'
}

console.log(newLibraryWeek[1]);

const web20e = {
    teacher: 'Andrej',
    studentAmount: 7,
    room: 'Zoom'
}

const championship = {
    germany: 'Deutsche national manschaft',
    england: 'Great Britain'
}

// императивное программирование, ооп, функциональное программирование, // реактивнре программирование, аспектно-ориентированное программирование





