// let array = [1, 2, 3, 4, 5];
// let array1 = [5, 5, 5, 7];
// //array.push(5); // adds an element to the end
// // extracts the element from the end
// //array.shift() // extracts the element from the beginning
// let num = array1.pop();
// array.unshift(num) // adds an alement to the beginning
// console.log(array);

// .forEach - runs the indicated function for each element of the array, oncce


// for (let i = 0; i < array.length; i++) {
//     if (array[i] >= 50) {
//         console.log(array[i]);
//     }

// };

// array.forEach(function(element){
//     if(element >= 50){
//         console.log(element);
//     }
// });

// array.forEach((el) =>{
//     if(el >= 50){
//         console.log(el);
//     }
// });

// function getElem(element){
//     if(element >= 50){
//         console.log(element);
//     }
// };

// let getElem = element => {
//     if(element >= 50){
//         console.log(element);
//     }
// };


// Каждый елемент массива умножается на два
// let array = [1, 90, 55, 3, -10, 78, 75];

// for (let i = 0; i < array.length; i++) {
//     console.log(array[i] * 2);

// }

// array.forEach(function(el){
//     console.log(el * 2);
// });

// array.forEach(el => console.log(el * 2));

//Сформировать массив из чисел заканчивающиеся на пять, Вывести в консоль результат 
let array = [1, 90, 55, 3, -10, 78, 75];
let new_arr = [];
// for (let i = 0; i < array.length; i++) {
//     if(array[i] %10 === 5){
//     new_arr.push(array[i]);
//     }
// }

// console.log(new_arr);

// array.forEach(el => {
//     if (el % 10 === 5) {
//         new_arr.push(el);
//     }
// })

// console.log(new_arr);

// for (let i = 0; i < array.length; i++) {
//         new_arr.push(Math.abs(array[i] % 10));
// }
//console.log(new_arr);

array.forEach(el => new_arr.push(Math.abs(el % 10)));
console.log(new_arr);

// Cформировать массив из последних цифр чисел. вывести результат в консоль => [1, 0, 5, 3, 0, 8, 5]

// // цикл for
// let new_array = [];
// for (let i = 0; i < array.length; i++){
//   new_array.push(Math.abs(array[i] % 10))
// }
// console.log(new_array)

// // метод .forEach()

// let new_array2 = [];
// array.forEach(el => new_array2.push(Math.abs(el %10)));
// console.log(new_array2)





