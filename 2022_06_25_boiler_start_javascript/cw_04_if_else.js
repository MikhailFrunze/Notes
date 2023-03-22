"use strict";
//Уловный оператор

function summer(permission = false) {
    if (permission) {
        console.log("Я поеду в летний лагерь");
    } else {
        console.log("Я останусь на все лето дома");
    }
}

summer();

// function technicPermission() {
//     return false;
// }
// Первый вариант синтаксиса

// let condition = false;

// if (condition) {
//     console.log("The programm does something");
// } else {
//     console.log("The programm stopped");
// }

// Второй вариант
function test(condition) {
    if (condition)
        console.log("The programm does something");
    else
        console.log("The programm stopped");
}

//Третий вариант написания

if (condition) { console.log("The programm does something"); }
else { console.log("The programm stopped"); }

//Четвертый
function f5() {
    if (condition) return true;
    else return false;
}

if (condition) {
    console.log("The programm does something");
    console.log("The programm does something");
    console.log("The programm does something");
    console.log("The programm does something");
} else {
    console.log("The programm stopped");
}
