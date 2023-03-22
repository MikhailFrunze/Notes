"use strict";

function printDivisors(numb) {
    let i = numb;
    let amount = 0;
    while (i >= 0) {
        if (numb % i === 0) {
            console.log(i);
            amount++;
        }
        n--;
    }
    limit--;
}

// console.log('Total Divisors: ' + amount);

// printDivisors(32);

function integerRemains(a, b) {
    let i = a;
    while (i <= b) {
        if (i % 7 === 1 || i % 7 === 2 || i % 7 === 5) {
            console.log(i);
        }
        i++;
    }
}

// integerRemains(35, 87);

function mySecondLine(limit) {
    let i = 1;
    let result = '';
    while (i < limit) {
        result += i + " ";
        i = i * 2;
    }
    return result;
}

console.log(mySecondLine(1000));