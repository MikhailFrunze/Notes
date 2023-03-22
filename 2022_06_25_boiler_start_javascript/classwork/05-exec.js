"use strict";
//loop-01-01 pelman
function happyDumpling() {
    let i = 1;
    while (i <= 10) {
        if (i === 5) {
            console.log("Here is the happy dumpling");
            break;
        }
        console.log("Test print", i);
        i++;
    }
}

//happyDumpling();

// 02 by 3 without rest
function divideByThree() {
    let i = 1;
    let amount = 0, count, temp, result, output, variable;
    while (i <= 100) {
        if (i % 3 === 0) {
            console.log(i, " /3");
            amount++;
        }
        i++;
    }
}

// divideByThree();

function sum(a, b) {
    let result = 0;
    if (a === b) {
        result = a + b;
    } else {
        while (a <= b) {
            result += a;
            a++;
        }
    }
    return result;
}

// console.log(sum(2, 4));

function myLine(digit) {
    let i = 0;
    while (i <= digit) {
        if (i % 7 === 0) {
            console.log(i);
        }
        i++;
    }
}

function multiplicationTable(digit) {
    let i = 1;
    while (i <= 10) {
        // console.log(digit + "x" + i + "=" + digit * i);
        console.log(`${digit}x${i}=${digit * i}`);
        i++;
    }
}

// multiplicationTable(3);


function leapYear(year) {
    return (year % 400 === 0) || (year % 100 !== 0 && year % 4 === 0);
}

function countLeapYears(startYear, endYear) {
    let count = 0;
    let i = startYear;
    while (i <= endYear) {
        if (leapYear(i)) {
            count++;
        }
        i++;
    }
    return count;
}

function printLeapYears(startYear, endYear) {
    let i = startYear;
    while (i <= endYear) {
        if (leapYear(i)) {
            console.log(i);
        }
        i++;
    }
}


function semanticRussian(digit) {
    // 1. Узнать последнюю цифру и поработать с исключениями charat
    // 2. Через модуло.
    let strInput = "" + digit;
    let character = strInput.charAt(strInput.length - 1);
    let output = "";
    let twoStrDigits = strInput.slice(strInput.length - 2);
    console.log(twoStrDigits);
    if (twoStrDigits >= 11 && twoStrDigits <= 14) {
        output = "рублей";
    }
    else if (character == 1) {
        output = "рубль"
    } else if (character >= 2 && character <= 4) {
        output = "рубля";
    } else {
        output = "рублей"
    }
    return output;
}

printSumInRub(1, 21);

function printSumInRub(startMoney, endMoney) {
    let i = startMoney;
    while (i <= endMoney) {
        console.log(i, semanticRussian(i));
        i++;
    }
}