class Animal {
    constructor(type, color, age, character){
        this.type = type;
        this.color = color;
        this.age = age;
        this.character = character;
    }
}

let animal_1 = new Animal('tiger', 'orange', 10, 'wild');
let animal_2 = new Animal('dog', 'black', 5, 'pet');
let animal_3 = new Animal('cat', 'white', 8, 'pet');

// let animal_1 = {
//     type: 'tiger',
//     color: 'orange',
//     age: 10,
//     character: 'wild'
// }

console.log(animal_1.age);
console.log(animal_2.color);
console.log(animal_3.type);