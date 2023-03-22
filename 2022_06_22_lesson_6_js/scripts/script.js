const lst = [5, 1, -14, 3, -50, 88, -101];
const lst_1 = [1, "скейт", "ролики", "лыжи", "сноуборд"];

// function handler() {
//     console.log('Hello!');
// }

// // handler();

// const a = handler;

// a();

// console.log(a);

// function handler(val_1, val_2, func) {
//     return func(val_1, val_2);
// }

// handler(12, 15, (a, b) => a + b);
// console.log(result);

// lst.forEach((elem, index, arr) => {
// const result = elem ** 2;
// console.log(result);
// console.log(index);
// console.log(arr);
// });

// function forEach(arr, callback) {
//     for (let i = 0; i < arr.length; i++) {
//         callback(arr[i], i, arr);
//     }
// }

// forEach(lst, (elem, index, arr) => {
//     const result = elem ** 2;
//     console.log(result);
//     console.log(index);
//     console.log(arr);
//     });


// пользуясь методом foEach выведите в консоль только четные числа

// lst.forEach((elem) => {
//     if (elem % 2 === 0) {
//         console.log(elem);
//     }
// });

// пользуясь методом foEach выведите в консоль числа, которые в квадрате 
// дают число больше 1000

// lst.forEach((elem) => {
//     if (elem ** 2 > 1000) {
//         console.log(elem);
//     }
// });

//пользуясь методом foEach выведите в консоль числа, 
//значение которых равно их индексу

// lst.forEach((elem, index) => {
//     if (elem === index) {
//         console.log(elem);
//     }
// });

// const result = lst.map(elem => {
//     return elem ** 2;
// })

// console.log(result);
// console.log(lst);

// используя метод map сформируйте новый массив, в котором все отрицательные числа
// будут преобразованы в положительные


// const result = lst.map(elem => {
//     return Math.abs(elem);
// })



// const result_1 = lst.map(Math.abs);

// const result_2 = lst.map(elem => {
//     if (elem < 0) {
//         elem *= -1;
//     }
//     return elem;
// });

// const result_3 = lst.map(elem => (elem < 0) ? -elem : elem);

// console.log(result);
// console.log(result_1);
// console.log(result_2);
// console.log(result_3);

// используя метод map сформируйте новый массив, который будет состоять из 
// длин слов из массива lst_1

// const result_4 = lst_1.map(elem => elem.length);

// console.log(result_4);

// используя метод map сформируйте новый массив, который будет состоять из 
// чисел. Если элемент массива lst число, то мы его и оставляем, а если строка
// то мы возвращаем длинну строки


// const result_5 = lst_1.map(elem => {
//     if (typeof elem === +elem) {
//         return elem;
//     } else {
//         return elem.length;
//     }
// });

// const result_6 = lst_1.map(elem => {
//     if (typeof elem === "number") {
//         return elem;
//     } else {
//         return elem.length;
//     }
// });


// const result_7 = lst_1.map(elem => (typeof (elem) === "number") ? elem : elem.length);
// console.log(result_7);

// const result_8 = lst_1.map(elem => elem.length ?? elem); //Оператор нулевого слияния

// (a !== null && a !== undefined) ? a : b;
// console.log(result_8);

// const result_9 = lst.filter(elem => elem > 0);
// console.log(result_9);


// используя метод filter сформируйте новый массив, который состоит только из слов, 
// длинной больше 5 символов

// const result_10 = lst_1.filter(elem => elem.length > 5);
// console.log(result_10);
// написать функцию, которая в качестве аргументов получает число 
// и массив
// функция должна вернуть новый массив из которого исключены числа, которые не деляться
// без остатка на указанное число

// let getArr = (num, arr) => {
// for (let i = 0; i < arr.length; i++) {
//     if (arr[i] % num === 0) {
//         console.log(arr[i]);
//     };

// }
// }

// getArr(5, lst);
// const handler = (value, list) => list.filter(elem => elem % value === 0);

// console.log(handler(5, lst)); 

// написать функцию, которая в качестве аргументов получает число и массив 
// и возвращает массив, в котором не встречается это число

// const handler = (value, list) => list.filter(elem => elem != value);

// console.log(handler(5, lst));

// const min = lst.reduce((a, b) => (a < b) ? a : b);

// console.log(min);

const minPositive = lst.reduce((a, b) => {
    if (a <= 0) {
        if (b<0) {
            return null;
        } else {
            return b;
        }
    } else {
        if (b < 0) {
            return a;
        } else {
            return (a < b) ? a : b;
        }
    }
});

console.log(minPositive);




