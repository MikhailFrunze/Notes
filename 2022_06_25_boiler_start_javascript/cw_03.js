"use strict";
function giveMeHotWater(water) {
    return `${water} миллилитров подогреваем до 90%`;
}

function hotDrinkWater(water, cocoa, coffee, sugar, milk) {
    return (giveMeHotWater(water) + giveMeCoffee(cocoa) + giveMeMilk(coffee) + giveMeCocoa(sugar) + giveMeSugar(milk));
}

function makeHotWater() {
    return "";
}

function giveMeCoffee() {
    return "";
}

function giveMeMilk() {
    return "";
}

function giveMeCocoa() {
    return "";
}

function giveMeSugar() {
    return "";
}

let hotWater = makeHotDrink(100, 0, 0, 0, 0);
let latte = makeHotDrink(70, 0, 30, 30, 0);
let cocoa = makeHotDrink(0, 20, 0, 100, 10);

console.log(makeHotDrink());