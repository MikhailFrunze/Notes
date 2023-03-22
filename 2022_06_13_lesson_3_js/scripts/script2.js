//functions

//Function declaration

function funcName(arguments) {
    // function body
}

//Funtional expression

let message = function showMessage(firstName) {
    return `Hello ${firstName}`;
}

// console.log(showMessage('Mihail'));
console.log(message('Mihail'));

// get, calc, show, etc.

// Arrow functions

let getMessage = (age = 10) => {
    // expression
    return `You are ${age} years old`;
}
console.log(getMessage(18));
let showMessage = (firstName, lastName = 'Petrov') => `Hello ${firstName} ${lastName}`;

console.log(showMessage('Oleg'));


