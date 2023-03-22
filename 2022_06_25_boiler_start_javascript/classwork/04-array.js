"use strict";

// array

let arr = [];
let arr2 = new Array(); // just for taking into account
let arr3 = [0, 1, 1, 2, 3, 5, 8, 13];
let arr4 = new Array(21, 34, 55);
let arr5 = [true, false, true, false, false, true, false];
let arr6 = [
    true,
    0,
    false,
    'GORODA',
    1,
    true,
    [
        1,
        2,
        3
    ]
];

let arr7 = ['дом', "улица", "фонарь", "аптека"];

let word = 'andrej';
let arrayWord = ['a', 'n', 'd', 'r', 'e', 'j'];
let trueArrayWord = [60, 65, 80, 45];

let germanCities = [
    'Berlin',
    'Dresden',
    'Cologne',
    'Frankfurt',
    'Munich',
    'Dusseldorf'
];

// console.log(germanCities[0]);
// console.log(germanCities[germanCities - 1]);
let arraySize = germanCities.length;

// всегда

// console.log(germanCities);

germanCities[3] = 'Liebenwalde';
// console.log(germanCities);

let bigNumber = [5, 10];
// console.log(Math.max(bigNumber[0]), bigNumber[1]);

//CRUD - create, read, update, delete

//create

germanCities[6] = 'BigCity'; //not a good method
console.log(germanCities);
germanCities[germanCities.length] = 'Brand new city';
console.log(germanCities);

// push

let belarusCities = [
    'Minsk',
    'Mogilev',
    'Mozyr'
]

belarusCities.push('Mosty');
console.log(belarusCities);

//unshift

belarusCities.unshift('Мархачевщина');
console.log(belarusCities);

//delete : pop, shift

belarusCities.pop();
console.log(belarusCities);
belarusCities.shift();
console.log(belarusCities);


console.log('Длина массива НА ДАННЫЙ МОМЕНТ', belarusCities.length);
let simpleArr = [];
console.log(simpleArr.length);
simpleArr.length = 10; //без профессиональной подготовки не повторять
console.log(simpleArr.length);
console.log(simpleArr);
console.log(simpleArr[0]);
let a;
console.log(a);

let arrayUser = [
    'anbrej',
    'podlubnyj',
    ['Serioja', 'Dima', 'Sveta']
];
// let user = {
//     firstname: 'Andrej',
//     lastname: 'Podlubnyj',
//     friends: ['Serioja', 'Dima', 'Sveta'],
//     email: ''
// };

let magicArray = new Array(10); // метод создания массива
console.log(magicArray);
console.log(magicArray[0]);
console.log(magicArray.length);