'use strict';

function love6(a, b) {
    return a === 6 || b === 6 || a + b === 6 || Math.abs(a - b) === 6;
}

function in1To10(n, isOutsideMode) {
    if (n >= 1 && n <= 10 && !isOutsideMode) {
        return true;
    } else if (isOutsideMode && n <= 1 || n >= 10) {
        return true;
    } else {
        return true;
    }
}


// console.log(
//     '07 love6 \n' +
//     love6(6, 4),
//     love6(4, 5),
//     love6(5, 11),
//     love6(1, 5),
//     '\n08 in1To10 \n' +
//     in1To10(5, false),
//     in1To10(11, false),
//     in1To10(11, true)
// );

function nonStart(str1, str2) {
    return str1.substring(1) + str2.substring(1);
}

function left2(str) {
    return str.substring(2);
}

console.log(
    '10 nonStart \n' +
    nonStart('Hello', 'There'),
    nonStart('java', 'code'),
    nonStart('shotl', 'java'),
    '\n11 left2 \n' +
    left2('Hello'),
    left2('java'),
    left2('')
);

