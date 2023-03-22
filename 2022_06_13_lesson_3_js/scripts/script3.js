// 1. Реализуйте функцию, которая принимает в качестве аргументов 2 числа и возвращает их сумму. Выведите результат в консоль. Запишите два варианта синтаксиса (function declaration и arrow 
//function).
// function getSum(num1, num2) {
//     return num1 + num2;
// }

// console.log(getSum(5,7));

// let getSum2 = (num1, num2) => 
//  num1 + num2;


// console.log(getSum2(5,7));
// console.log(getSum2(14,33));
// console.log(getSum2(50,88));

// function getAbs(num) {
//     return Math.abs(num);  
// }

// console.log(getAbs(-5));

// let getAbs2 = num => Math.abs(num);

// console.log(getAbs2(-7));

// function getUpperCase(text) {
//     return text.toUpperCase();
// }

// console.log(getUpperCase(`mihail`));

// let getUpperCase2 = text => text.toUpperCase();

// console.log(getUpperCase2(`mihail`));


// 5. Напишите функцию, которая примает две строки и возвращает наиболее длинную из них. Выведите результат в консоль.

// let getLongestString = (string1, string2) => {
//     if (string1.length > string2.length) {
//         return string1;
//     } else if (string2.length > string1.length) {
//         return string2;
//     } else {
//         return `The length of the strings is equal`;
//     }
// }

// console.log(getLongestString('string55', 'string21'));


// Напишите функцию, которая принимает три аргумента: имя, фамилию и возраст. Если возраст больше или равен 18, то функция возвращает строку в формате: 'Здравствуйте, <Имя> <Фамилия>'. 
//Если возраст меньше 18, то функция возвращает строку в формате: 'Привет, <Имя> <Фамилия>'. Выведите результат в консоль.

let getGreeting = (firstName, lastName, age) => {
    if (age >= 18) {
      return `Здравствуйте ${firstName} ${lastName}`;
    } else {
      return `Привет ${firstName} ${lastName}`;
    }
}

console.log(getGreeting('Mihail', 'Frunze', 28));