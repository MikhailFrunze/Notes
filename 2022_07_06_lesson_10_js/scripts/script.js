// let a = 5; //number;
// let b = 'hello'; // string;
// let c = true; //boolean

// let user = {
//     firstName: 'Mihail',
//     lastName: 'Frunze',
//     age: 28, 
//     active: true
// }

// // console.log(user);
// // // console.log(user.firstName);
// // // console.log(user['age']);

// // console.log(user['firstName']);

// // let d = 'age';
// // console.log(user[d]);
// // console.log(user.lastName);

// console.log(user.firstName, user.lastName);


const users = [
    {
        first_name: 'Ivan',
        last_name: 'Ivanov',
        age: 20,
        salary: 500
    },

    {
        first_name: 'Olga',
        last_name: 'Petrova',
        age: 12,
        salary: 250
    },

    {
        first_name: 'Irina',
        last_name: 'Alexandrova',
        age: 46,
        salary: 1500
    },

    {
        first_name: 'Denis',
        last_name: 'Sokolov',
        age: 30,
        salary: 760
    }
];

// 1. Проверьте, что этот объект не пустой - в нем есть хотя бы один объект с ключом age.

// console.log(users[0].age);
// console.log(users[0].hasOwnProperty('age'));
// console.log('age' in users[0]);

//2. Пройдитесь по массиву с объектами циклом forEach и выведите каждый элемент в консоль

// users.forEach(element => {
//     console.log(element);
// });

//3. Получите из всех объектов значения last_name и сформируйте из этих имен массив.

// let lastNames = users.map(element => element.last_name);

// console.log(lastNames);

//4. Сформируйте массив, состоящий только из имен и фамилий пользователей. Выведите результат в консоль.

// let names = users.map(el => `${el.first_name} ${el.last_name}`);

// console.log(names);

// 5. Получите из этого массива объект, где first_name == "Olga", и сохраните это в какой-нибудь переменной.

// let user_olga = users.find(el => el.first_name === 'Olga');
// console.log(user_olga);

// let user_salary_1500 = users.find(el => el.salary === 1500);
// console.log(user_olga);

// 6. Сформируйте новый массив без объекта, где first_name == "Irina"


let newArr = users.filter((el) => el.first_name !== "Irina");


// 6. Добавьте в конец нового массива объект со значениями:
// {
//   first_name: 'Anton',
//   last_name: 'Gribov',
//   age: 36,
//   salary: 1760
// }

newArr.push({
    first_name: 'Anton',
    last_name: 'Gribov',
    age: 36,
    salary: 1760
  });

  console.log(newArr);

  // 9. Сформируйте массив из совершеннолетних пользователей. И выведите в консоль результат в формате: <Имя> <Фамилия> (<возраст>): <зарплата>.
// ['Ivan Ivanov (20): 500', 'Irina Alexandrova (46): 1500', 'Denis Sokolov (30): 760']

let adults = users.filter(el => el.age >= 18).map(el => `${el.first_name} ${el.last_name} (${el.age}): ${el.salary}`);
// console.log(`${adults[0].first_name} ${adults[0].last_name} (${adults[0].age}): ${adults[0].salary}`);

console.log(adults);