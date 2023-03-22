db.users.insertOne({
  id: 1,
  firstname: 'Olga',
  age: 37
})

db.users.insertMany([
  {
    id: 2,
    firstname: 'Anton',
    age: 18
  },
  {
    id: 3,
    firstname: 'Irina',
    age: 19
  },
  {
    id: 4,
    firstname: 'Petr',
    age: 43
  },
  {
    id: 5,
    firstname: 'Igor',
    age: 27
  }
])

// Создать коллекцию workers и заполнить документами со следующими свойствами: id, firstname, lastname, position, salary. Используйте следующие данные:

// 1 Петр Сергеев CEO 7000
// 2 Виктор Семенов Web-developer 5000
// 3 Никита Петров Assistant 3500
// 4 Инна Орлова Accountant 4500

db.createCollection('workers')

db.workers.insertMany([
  {
    id: 1,
    firstname: 'Петр',
    lastname: 'Сергеев',
    position: 'CEO',
    salary: 7000
  },
  {
    id: 2,
    firstname: 'Виктор',
    lastname: 'Семенов',
    position: 'developer',
    salary: 5000
  },
  {
    id: 3,
    firstname: 'Никита',
    lastname: 'Петров',
    position: 'Assistant',
    salary: 3500
  },
  {
    id: 4,
    firstname: 'Инна',
    lastname: 'Орлова',
    position: 'Accountant',
    salary: 4500
  }
])

// 1. Вывести все документы из коллекции workers

db.workers.find()

// 2. Вывести документы из коллекции workers, у которых firstname Петр

db.workers.find({ firstname: 'Петр' })

// 3. Вывести документы из коллекции workers, у которых salary 4500

db.workers.find({ salary: 4500 })


/*

Операторы сравнения:
$gte >=
$gt >
$lte <=
$lt <
$ne <>
$in ['', '']

*/

// 4. Вывести документы из коллекции workers, у которых salary больше или равно 4000

db.workers.find({ salary: { $gte: 4000 } })

// 5. Вывести документы из коллекции workers, у которых salary меньше 4500

db.workers.find({ salary: { $lt: 4500 } })

// 6. Вывести документы из коллекции workers, у которых position Accountant или Assistant

db.workers.find({ position: { $in: ['Accountant', 'Assistant'] } })


// ПРАКТИКА

// 1. Создать коллекцию users и заполнить документами (4 штуки) со следующими свойствами (id, firstname, age, gender). Используйте следующие данные:

// 1 Анатолий 28 m
// 2 Светлана 25 f
// 3 Никита 33 m
// 4 Ольга 22 f

db.createCollection('users')

db.users.insertMany([
  {
    id: 1,
    firstname: 'Анатолий',
    age: 28,
    gender: 'm'
  },
  {
    id: 2,
    firstname: 'Светлана',
    age: 25,
    gender: 'f'
  },
  {
    id: 3,
    firstname: 'Никита',
    age: 33,
    gender: 'm'
  },
  {
    id: 4,
    firstname: 'Ольга',
    age: 22,
    gender: 'f'
  }
])

// 2. Вывести данные о всех представительницах женского пола

db.users.find({ gender: 'f' })

// 3. Вывести всех пользователей, у которых имя входит в список (Анатолий, Дмитрий, Ольга, Семен)

db.users.find({ firstname: { $in: ['Анатолий', 'Дмитрий', 'Ольга', 'Семен'] } })

// 4. Вывести всех женщин старше 25 лет

db.users.find({
  $and: [
    { gender: 'f' },
    { age: { $gte: 25 } }
  ]
})

db.users.find({
  gender: 'f',
  age: { $gte: 25 }
})

// 5. Вывести всех, у кого возраст в диапазоне от 25 до 30 (включая концы)

db.users.find({
  age: { $gte: 25, $lte: 30 }
})

// 6. Вывести всех мужчин, у кого возраст в диапазоне от 25 до 30 (включая концы)

db.users.find({
  age: { $gte: 25, $lte: 30 },
  gender: 'm'
})

// 7. Вывести всех мужчин младше 30 лет

db.users.find({
  gender: 'm',
  age: { $lte: 30 }
})

// 8. Удалить первый документ, у которого firstname 'Анатолий'

db.users.deleteOne({ firstname: 'Анатолий' })

// 9. Удалить всех, кто младше 24

db.users.deleteMany({ age: { $lte: 24 } })

// 10. Удалить всех из коллекции

db.users.deleteMany({})



// ПРАКТИКА

//1. Создать коллекцию products

db.createCollection('products');

db.products.insertMany([
  {
    id: 1,
    title: "Велосипед",
    price: 45000,
    count: 12
  },
  {
    id: 2,
    title: "Самокат",
    price: 15000,
    count: 10
  },
  {
    id: 3,
    title: "Ролики",
    price: 20000,
    count: 20
  },
  {
    id: 4,
    title: "Лыжи",
    price: 22000,
    count: 15
  },
  {
    id: 5,
    title: "Скейт",
    price: 19000,
    count: 4
  },
  {
    id: 6,
    title: "Сноуборд",
    price: 33000,
    count: 17
  }
])

// 2. Найти товары, количество которых меньше 10

db.products.find({
  count: { $lte: 10 }
})

// 3. Найти товары с id 2, 4, 6

db.products.find({
  id: { $in: [2, 4, 6] }
})

// 4. Найти товары, количество которых от 10 до 20 (включительно) и цена больше 10000

db.products.find({
  count: { $gte: 10, $lte: 20 },
  price: { $gte: 10000 }
})

// 1. Найти все товары, количество которых больше или равно 10

db.products.find({
  count: { $gte: 10 }
})

// 2. Найти все товары, у которых цена больше (>) 20 тыс и количество больше (>=) 15

db.products.find({
  price: { $gt: 20000 },
  count: { $gte: 15 }
})

// 3. Найти товары, количество которых либо 10, либо 12, либо 15, и у которых цена в диапазоне от 10 до 30 тыс (включая концы)

db.products.find({
  count: { $in: [10, 12, 15] },
  price: { $gte: 10000, $lte: 30000 }
})

// DELETE()

//1. Удалить все объекты из коллекции

db.products.deleteMany({})

//2. Удалить объект с title 'Скейт'

db.products.deleteMany({
  title: 'Скейт'
})

//3. Удалить объекты, цена которых меньше или равна



db.products.insertMany([
  {
    id: 1,
    title: "Велосипед",
    price: 45000,
    count: 12
  },
  {
    id: 2,
    title: "Самокат",
    price: 15000,
    count: 10
  },
  {
    id: 3,
    title: "Ролики",
    price: 20000,
    count: 20
  },
  {
    id: 4,
    title: "Лыжи",
    price: 22000,
    count: 15
  },
  {
    id: 5,
    title: "Скейт",
    price: 19000,
    count: 4
  },
  {
    id: 6,
    title: "Сноуборд",
    price: 33000,
    count: 17
  }
])


//UPDATE()

//1. У объекта с title 'Велосипед' заменить title на 'Горный велосипед'

db.products.updateOne(
  { title: 'Велосипед' },
  { $set: { title: 'Горный велосипед' } }
)

//2. Всем объектам создать свойство discount со значением 0

db.products.updateMany(
  {},
  { $set: { discount: 0 } }
)

//3. Всем объектам увеличить значение свойства discount на 10

db.products.updateMany(
  {},
  { $inc: { discount: 10 } }
)

//4. Объектам, у которых цена больше или равно 20000, увеличить discount на 5

db.products.updateMany(
  { price: { $gte: 20000 } },
  { $inc: { discount: 5 } }
)

// 5. Всем объектам добавить свойство distributor, а в качестве значения указать пустой массив

db.products.updateMany(
  {},
  { $set: { distributor: [] } }
)

//6. Объектам с айди от 1  до 4 включительно добавить в массив distributor значение 'Германия'

db.products.updateMany(
  { id: { $gte: 1, $lte: 4 } },
  { $push: { distributor: 'Германия' } }
)

//7. Объектам, цена которых в диапазоне от 10 до 20 тыс включая, добавить в массив distributor значения 'Spain' и 'France'

db.products.updateMany(
  {price: {$gte: 10000, $lte: 20000}},
  {$push: {distributor: {$each: ['Spain', 'France']}}}
)

//8. Изменить название свойства discount на new_discount всем объектам

db.products.updateMany(
  {},
  { $rename: { 'discount': 'new_discount' } }
)

// ПРАКТИКА

// 1. Создать коллекцию profiles и наполнить ее следующими данными

[  
  {
		id: 1,
		firstname: "Ivan",
		lastname: 'Petrov',
		age: 28,
		gender: 'male',
		position: 'Product manager',
		salary: 5000,
		country: 'Germany',
		city: 'Berlin'
	},
  {
		id: 2,
		firstname: "Svetlana",
		lastname: 'Ivanova',
		age: 38,
		gender: 'female',
		position: 'Designer',
		salary: 2000,
		country: 'Germany',
		city: 'Bremen'
	},
  {
		id: 3,
		firstname: "Olga",
		lastname: 'Sidorova',
		age: 28,
		gender: 'female',
		position: 'PR manager',
		salary: 4500,
		country: 'Germany',
		city: 'Dresden'
	},

  {
		id: 4,
		firstname: "Ivan",
		lastname: 'Petrov',
		age: 56,
		gender: 'male',
		position: 'Product manager',
		salary: 5700,
		country: 'Germany',
		city: 'Berlin'
	},
  {
		id: 5,
		firstname: "Semen",
		lastname: 'Petrov',
		age: 28,
		gender: 'male',
		position: 'Product manager',
		salary: 4000,
		country: 'France',
		city: 'Paris'
	},
  {
		id: 6,
		firstname: "Olga",
		lastname: 'Petrova',
		age: 27,
		gender: 'female',
		position: 'Product manager',
		salary: 8000,
		country: 'Spain',
		city: 'Madrid'
	},
  {
		id: 7,
		firstname: "Ivan",
		lastname: 'Ushanov',
		age: 34,
		gender: 'male',
		position: 'Product manager',
		salary: 5100,
		country: 'Germany',
		city: 'Berlin'
	},
]




// 2. Пользователю с айди 3 изменить свойство city на пустой массив


db.profiles.updateOne(
  {id: 3},
  {$set:{city: [] }}
)

// 3. Пользователю с айди 3 добавить в массив city город 'Bremen'

db.profiles.updateOne(
  {id: 3},
  {$push: {city: 'Bremen'}}
)

// 4. Пользователям 'Olga' и 'Semen' изменить city на массив и добавить в него значения Madrid, Barcelona, Valencia


db.profiles.updateMany(
  {firstname: {$in:['Olga', 'Semen']}},
  {$set: {city: ['Madrid', 'Barcelona', 'Valencia']}}
)

// 5. Всем документам добавить свойство status со значением 'not defined'

db.profiles.updateMany(
  {},
  {$set: {status: 'not defined'}}
)
// 6. Всем людям старше 30 изменить значение свойства status на 'older than 30'

db.profiles.updateMany(
  {age: {$gte: 30}},
  {$set: {status: 'older than 30'}}
)
// 7. Всем людям младше 30 изменить значение свойства status на 'younger than 30'

db.profiles.updateMany(
  {age: {$lte: 30}},
  {$set: {status: 'younger than 30'}}
)

// 8. Вывести всех мужчин в возрасте от 30 до 40 лет включительно


db.profiles.find(
  {gender: 'male',
  age: {$gte: 30, $lte: 40}}
)

// 9. Всем женщинам старше 30 лет увеличить зарплату на 1000


db.profiles.updateMany(
  {gender: 'female',
  age: {$gte: 30}},
  {$inc:{salary: 1000}}
)

// 10. Документам с айди от 3 до 6 включительно увеличить зарплату на 300
db.profiles.updateMany(
  {id: {$gte:3, $lte:6}},
  {$inc:{salary: 300}}
)

// Пагинация и СОРТИРОВКА

//1. Вывести первые 5 документов из коллекции

db.profiles.find().limit(5)

//2. Вывести все документы кроме первого

db.profiles.find().skip(1)

// 3. Вывести документы с 3 по 5

db.profiles.find().skip(2).limit(3)

//4. Вывести все документы отсортированными в порядке возрастания зарплаты

db.profiles.find().sort({salary: 1})

db.profiles.find().sort({age: -1})


db.profiles.find().sort({salary: -1}).limit(1)
