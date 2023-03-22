db.users.insertMany(
    [
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

    ]
)

// print documents from collectiob workers, where first name is Петр

db.workers.find({firstname: 'Петр'})

//3. Вывести документы из коллекции workers, у которых salary 4500

db.workers.find({salary: 4500})




/*
Операторы сравнения:
$gte >=
$gt >
$lte <=
$lt < 
$ne <>
$in ['', '']*/

//4. Вывести документы из коллекции workers, у которых salary >= 4500

db.workers.find({salary: {$gte: 4000}})


//5. Вывести документы из коллекции workers, у которых salary < 4500

db.workers.find({salary: {$lt: 4000}})

//6. Вывести документы из коллекции workers, у которых position Accountant или  Assistant

db.workers.find({ position: {$in: ['Accountant', 'Assistant']}})

//4. Вывести всех женщин старше 25 лет

db.users.find({
    $and: [
        {gender: 'f'},
        {age: {$gte: 25}}
    ]
})

db.users.find({
    gender: 'f',
    age: {$gte: 25}
})

//5 Вывести всех, у кого возраст в диапазоне от 25 до 30 (включая концы)

db.users.find({
    age: {$gte: 25, $lte: 30}
})

// 6 Вывести всех мужчин, у кого возраст в диапазоне от 25 до 30 (включая концы)

db.users.find({
    age: {$gte: 25, $lte: 30},
    gender: 'm'
})

//7 Вывести всех мужчин младше 30 лет

db.users.find({
    gender: 'm',
    age: {$gt: 30}
})

//8 Удалить первый документ у которого firstname 'Анатолий'

db.users.deleteOne({firstname: 'Анатолий'})


//9 Удалить всех кто младше 24

db.users.deleteMany({age: {$lt: 24}})


//10 Удалить всех из коллекции
db.users.deleteMany({})



