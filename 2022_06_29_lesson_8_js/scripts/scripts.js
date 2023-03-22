// ЗАДАЧА 1
// Дан массив с числами.
// let arr = [17, -26, 3, -24, 79, -5, 18];
// 1.Создайте новый массив, состоящий только из отрицательных чисел. Выведите результат в консоль.
// 2. Создайте новый массив, состоящий только из четных чисел. Выведите результат в консоль.
// 3. Напишите программу, высчитывающую количество отрицательных чисел в этом массиве. Выведите результат в консоль.

// let arr = [17, -26, 3, -24, 79, -5, 18];

// let negativeNum = arr.filter(el => el < 0);

// // console.log(negativeNum);
// let evenNum = arr.filter(el => el % 2 === 0);

// let negativeNumCount = negativeNum.length;

// console.log(evenNum);

// ЗАДАЧА 2
// Дан массив с числами. Оставьте в нем только положительные числа. Затем извлеките квадратный корень из этих чисел.
// let arr = [1, -6, 4, 0, 9, -5, 16];

// let arr_positive = arr.filter(el => el > 0).map(el => Math.sqrt(el));

// console.log(arr_positive);

// ЗАДАЧА 3
// //Дан массив из массивов. Вложенные массивы хранят в себе данные о пользователе (имя, фамилия и активность).
// //Напишите filter, который оставляет только активных пользователей (true).
// //Добавьте map, который в отфильтрованном списке преобразует вложенные массивы в строки.
// let arr = [
//   ['Максим', 'Грибов', true],
//   ['Антон', 'Куликов', true],
//   ['Светлана', 'Иванова', false],
//   ['Ольга', 'Петрова', true],
//   ['Сидр', 'Сидоров', false]
// ]

// let arr_filtered = arr.filter(el => el[2] === true);

// console.log(arr_filtered);

// let arr_mapped = arr.filter(el => typeof(el[0,1]) == 'string').map(el => `${el[0]} ${el[1]}`);
// console.log(arr_mapped);

// let arr_filtered2 = arr.filter(el => el.filter(e => typeof(e) == 'string'));

// console.log(arr_filtered2);


//.reduce() - служит для того, чтобы мы получили какое-то финальное значение, совершив итерацию по массиву. Колбэк принимает в себя два параметра accumulator (currentValue, previousValue) и 
//итерируемый элемент (nextValue);

// let arr = [1, 2, 3, 4, 5];

// let sum = arr.reduce((total, el) => total * el);

// // 0 + 1 = 1
// // 1 + 2 = 3
// // 3 + 3 = 6
// // 6 + 4 = 10
// // 10 + 5 = 15

// console.log(sum);

// let arr = [33, 54, 12, 1, 4]; // найти среднеарифметическое

// let sum = arr.reduce((total, el) => (total + el)) / arr.length;

// console.log(sum);
 
let arr = [34, 4, 1, 0, 9, 5];

// let sum = arr.reduce((total, el) => (total + arr[0,1,2]));

let sum = arr.reduce((total, el, i, arr) =>{
    if (i === 2) {
        arr.splice(1);
    }
return total += el;
});

console.log(sum);

