"use strict";
// alert("hello");
//prompt();
// let question = "Сколько тебе лет?";
// prompt(question);
// console.log(question, prompt(question, 18));
// let output = prompt(question, 18);
// console.log("Oh, you are already:", output, "?");

let question = "What is the side of the cube?"
let userInput = prompt(question, 100);
findArea(userInput);

function findArea(cubeSide){
    return 6 * cubeSide * cubeSide;
}

let square = findArea(userInput);
console.log(square);