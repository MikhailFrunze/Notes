// let num = 5;
// let string = 'string';

// console.log(typeof (num));
// console.log(typeof (string));

// let str = 'Hello! My name is Mihail';
// let strLength = str.length;

// console.log(strLength);

// let str = 'Hello! My name is Mihail';
//  let strLength = str.length;
//  let str1 = str.toLowerCase();
//  let str2 = str.toUpperCase();

//  console.log(str);
//  console.log(str.toLowerCase());
//  console.log(str.toUpperCase());
// let str = '   Nelli      Efremyan  ';
//  let strTrimmed = str.trim();

//  console.log(str);
//  console.log(strTrimmed);

// let number = 6.7283746;
// console.log(number); //число
// console.log(+number.toFixed(2)); // метод.trim() возвращает строку '6.73'
// console.log(+number.toFixed(3));
// console.log(+number.toFixed(4));

// let str = '75';
// console.log(typeof str);
// console.log(typeof +str);

// let str = 'text';

// console.log(`Длина строки ${str} равна ${str.length}`);

// const text = "a MIND needs Books as a Sword needS a WHETSTONE, if it is to keep its edge.";

// console.log(text.toLowerCase());
// console.log(text);

/* 1. Создайте переменную user и присвойте ей значение: '   Ivan Ivanov    '. Обновите/переопределите переменную user, записав в неё то же самое значение, но без лишних пробелов по краям. 
Выведите то, что получилось, в консоль. */
let user = '   Ivan Ivanov    ';
user = user.trim();
console.log(user);

/* 2. Напишите программу, которая выводит в консоль рандомное/случайное число от 0 до 1 и округляет его до третьего знака после точки. Тип выводимых данных должен быть number. */

function printRandom() {
    let number = Math.random();
    console.log(number);
    console.log(number.toFixed(3));
    console.log(`The variable ${number} has the type of ${typeof number}`);
}

printRandom();


/* 3. Выведите на экран первую и последнюю буквы предложения, записанного в константу text (текст строки произвольный), в следующем формате: */
const text = "Lorem ipsum dolor sit amet";
console.log(`First: ${text[0]}
Last: ${text[text.length - 1]}`);

