"use strict";

// /* Given a number n, return the absolute difference between n and 21,
// except return double the absolute difference if n is over 21.

function diff21(n) {
    if (n > 21) {
        return 2 * (n - 21);
    } else {
        return 21 - n;
    }
}

console.log(diff21(19));
console.log(diff21(10));
console.log(diff21(21));
console.log(diff21(40));

function paris(group1, group2) {
    return (group1 + group2) <= 25;
}

console.log(paris(11, 15));
console.log(paris(11, 5));

function sleepIn(weekday, vacation) {
    return !weekday || vacation;
}

console.log(sleepIn(false, false));
console.log(sleepIn(true, false));
console.log(sleepIn(false, true));

function leapYearChecker(year) {
    return year % 4 === 0;
}

let a = 10;
let b = "Andrej";

/*
== - знак присваивания
== магическое равенство 0 == "0"
=== никакой магии нет. это обычное равенство.
!=
!==
*/