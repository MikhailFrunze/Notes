"use strict";
// scope var, let, const
let i = 0;

while (i < 6) {
    i++;
}
console.log("i", i);
while (i < 10) {
    i++;
    let c = 50;
}

{
    let b = 100;
    console.log("b", b);
}
console.log(i);

// console.log(c);
