const people = [
    {
      first_name: 'Ivan',
      last_name: 'Ivanov',
      age: 20,
      city: 'Moscow',
      country: 'Russia'
    },
  
    {
      first_name: 'Petr',
      last_name: 'Petrov',
      age: 12,
      city: 'Berlin',
      country: 'Germany'
    },
  
    {
      first_name: 'irina',
      last_name: 'Alexandrova',
      age: 46,
      city: 'Paris',
      country: 'France'
    },
  
    {
      first_name: 'Denis',
      last_name: 'Sokolov',
      age: 30,
      city: 'Rome',
      country: 'Italy'
    }
  ];
  
// 1. Сформируйте массив строк - каждая строка включает в себя информацию по каждому человеку в следующем формате: "<Имя> <Фамилия> (<Город><Страна>)". Пример => ['Ivan Ivanov (Moscow, Russia)', ...]

const new_people = people.map(el => `${el.first_name} ${el.last_name} (${el.city}, ${el.country})`);

// console.log(new_people);

//2. Сформируйте массив из людей, чьи имена начинаются на 'I' (регистр буквы может быть и нижним)

const new_people_2 = people.filter(el => el.first_name[0].toLowerCase() === 'i');

// console.log(new_people_2);

//3. Получите из массива объект, где страной проживания человека является 'Germany'

const new_people_3 = people.find(el => el.country === "Germany");

// console.log(new_people_3);

const new_people_4 = people.filter(el => el.country === "Germany");

// console.log(new_people_4);

//Создайте функцию, которая принимает в качестве аргументов объект и ключ объекта, а возвращает значение объекта, доступное по этому ключу.

// Пример: ({ 'key': 'property' }, 'key') => 'property'
// Пример: ({ first_name: 'Nelli' }, 'first_name') => 'Nelli'

const new_people_5 = people.map((el, key) => {
key = el['first_name'];
return key;
});

// console.log(new_people_5);

function getValue(obj, key) {
    return obj[key];
}


// const getProperty = (obj, key) => {
//     return obj[key];
// }

// console.log(getValue(people[0], 'first_name'));

const getProperty = (arr, key) => {
    for (let i = 0; i < arr.length; i++) {
        console.log(arr[i][key]);
    }
}

getProperty(people, 'first_name'); 

const getProperty2 = (arr, key) => arr.map(el => (el[key]));



console.log(getProperty2(people, 'first_name'));