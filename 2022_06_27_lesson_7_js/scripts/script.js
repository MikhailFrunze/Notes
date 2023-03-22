// // let arr = [137, 5, 84, 299, 777, 500, 1, 8, 17];
// //1. Добавьте в начало массива число 67, используя метод .unshift(). Затем добавьте в конец массива число 56. Далее решайте задачи с обновленным массивом.
// // arr.unshift(67);
// // arr.push(56);

// // console.log(arr);
// //2. Сформируйте массив из чисел меньше 100. Предложите два варианта решения (цикл for и метод .forEach). Выведите в консоль результат.
// // let arr_result = [];


// // console.log(arr_result);

// // arr.forEach((el) => {
// //     if (el<100) {
// //         arr_result.push(el);
// //     }
// // })

// // console.log(arr_result);

// // let arr_result = arr.filter(el => el < 100);

// // let arr_result_1 = arr.filter(el => {
// //     return el < 100
// // });

// // let arr_result_2 = arr.map(el => {
// //     if (el < 100) {
// //         arr_result_2.push(el);
// //     }
// // })

// // console.log(arr_result);

// //3. Сформируйте массив, состоящий только из чисел, кончающихся на 7. Предложите два варианта решения (цикл for и метод .foreach).
// // let new_arr = [];
// // for (let i = 0; i < arr.length; i++) {
// //     if (arr[i] % 10 === 7) {
// //         new_arr.push(arr[i]);
// //     }
// // }

// // arr.forEach(el => {
// //     if (el % 10 === 7) {
// //         new_arr.push(el)
// //     }
// // });

// let new_arr = arr.filter(el => el % 10 === 7 || el % 10 === 5 || el % 10 === 0);

// console.log(new_arr);

//4. Сформируйте массив, в котором числа больше 100 заменены на строку '>100', а числа меньше ста - на '<100'

// let arr = [67, 137, 5, 84, 299, 777, 500, 1, 8, 17, 56];

// let new_arr_6 = [];

// arr.map(el => {
//     if (el >= 100) {
//         new_arr_6.push('>100');
//     } else {
//         new_arr_6.push('<100');
//     }
// });

// const result = arr.map(elem => (elem <= 100) ? "<100" : ">100");

// console.log(result);

// arr.forEach(el => console.log(el));


// function forEach(arr, callback) {
//     for (let i = 0; i < arr.length; i++) {
//         callback(arr[i], i, arr);
//     }
// }

// Дан массив из строк. Сформировать массив только из слов длиннее 10 символов. Вывести результат в консоль.

// let arr = ['hello', 'bye', 'good morning', 'good evening', 'good night'];

// let new_arr = arr.filter(el => el.length >= 10);

// console.log(new_arr);

//Дан массив из разных типов данных. 
//Необходимо сформировать новый массив, состоящий только из чисел (если значение не число, то подставить 'не число')

let arr = [8, 'hello', true, false, 'bye', 122, undefined, 15];

let new_arr = arr.map(el => (typeof(el) === "number") ? el : "не число");

console.log(new_arr);

