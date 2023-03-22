let sunny = false;
let papaHome = true;

let myIceCream = sunny && papaHome;

console.log(myIceCream);

// a b c

// true true true

// false true false

// true false false

// false false false
// равно - знак присваивания, операция присвоения assign
let a, b, c, d, e;
a = ((7 + 8) * 5) > 7 + 8 * 5; //true
//console.log(a);
b = ((7 + 8) * 4) != 7 + 4 * 5; //true
//console.log(b);
c = 3 + 4 > 9 + 1 && 16 - 5 > 3 * 4;
//console.log(c);

d = 16 / 2 < 6 + 2 || 4 + 5 <= 4 * 5;
console.log(d);

c = (a || !b) && (!a || b); // a ^ b