"use strict";

function makeTea() {
    console.log("I make tea!");
}

makeTea();

function makeHotWater() {
    console.log("Hot water on the way");
}

makeHotWater();

function makeEspresso() {
    console.log("Your Espresso, sir!");
}

makeEspresso();

function makeAmericano() {
    console.log("Your drink, American!");
}

makeAmericano();

function makeCocoa() {
    console.log("I make cocoa");
}

function valueNotFound() {
    console.log("");
}

function coffeVendingMachine(number) {
    switch (number) {
        case 1:
            makeTea();
            break;
        case 2:
            makeHotWater();
            break;
        case 3:
            makeEspresso();
            break;
        case 4:
            makeAmericano();
            break;
        case 5:
            makeCocoa();
            break;
        default:
            break;
    }
}

function fibonacci(amount) {
    let n1 = 0;
    let n2 = 1;
    let n3;
    console.log(n1);
    console.log(n2);
    for (let i = 3; i <= amount; i++) {
        n3 = n2 + n1;
        console.log(n3);
        n1 = n2;
        n2 += n1;
        
    }
}

fibonacci(10);