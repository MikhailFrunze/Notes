"use strict";

function findGreatWord(word) {
    let greatLetter = 'я';
    let i = 0;
    let length = word.length;
    do {
        let temp = word.charAt(i);
        temp = temp.toLowerCase();
        if (temp === greatLetter) {
            return true;
        }
        i++;
    } while (i < word.length)
    return false;
}

// console.log(findGreatWord('яблоко'));
// console.log(findGreatWord('тыблоко'));
// console.log(findGreatWord('Яблоко'));
// console.log(findGreatWord(''));

function digitPowTwo(num, pow) {
    let i = 0;
    let result = 0;
    do {
        result = result + num;
        i++;
    } while (i <= num)
    return result;
}

// console.log(digitPowTwo(5));
// console.log(digitPowTwo(10));
// console.log(digitPowTwo(4));

function squirrelPlay(temperature, isSummer) {
    // if (temperature > 60 && temperature < 90) {
    //     return true;
    // } else if (isSummer && temperature >= 90 && temperature < 100) {
    //     return true;
    // } else {
    //     return false;
    // }

    // return (temperature > 60 && temperature < 90)
    //     || (isSummer && temperature >= 90 && temperature < 100)
    return temperature > 60 && (temperature < 90 || (isSummer && temperature < 100));
}

// console.log(squirrelPlay(60, false));
// console.log(squirrelPlay(65, false));
// console.log(squirrelPlay(65, true));

function coughtSpeeding(speed, birthday) {
    let userSpeed = speed;
    if (birthday) {
        userSpeed = userSpeed - 5;
    }

    if (userSpeed >= 61 && userSpeed <= 80) {
        return 1;
    } else if (userSpeed >= 81) {
        return 2;
    } else {
        return 0;
    }
}

// console.log(coughtSpeeding(60, false));
// console.log(coughtSpeeding(65, false));
// console.log(coughtSpeeding(65, true));
// console.log(coughtSpeeding(85, true));
// console.log(coughtSpeeding(85, false));

/**
 * 
 * @param  out must be length 4 
 * @param  word 
 * @returns {string}
 */

function makeOutWord(out, word) {
    return out.substring(0,2) + word + out.substring(2);
}

// console.log(makeOutWord('<<>>', 'Yay'));
// console.log(makeOutWord('<<>>', 'WoHoo'));
// console.log(makeOutWord('[[]]', 'word'));
// console.log(makeOutWord('<<>>', 'WoHoo'));

function extraEnd(str) {
    return str.slice(-2) + str.slice(-2) + str.slice(-2);
}

// console.log(extraEnd('Hello'));
// console.log(extraEnd('ab'));
// console.log(extraEnd('Hi'));

function firstTwoOne(str) {
    if (str.length <= 2) {
        return str;
    } else {
        return str.substring(0, 2);
    }
}

function firstTwoTwo(str) {
    return str.substring(0, 2);
}

console.log(firstTwoOne('Hello'));
console.log(firstTwoOne('abcdefg'));
console.log(firstTwoOne('ab'));