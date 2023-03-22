"use strict";

let a = 13.567;

console.log(a.toFixed(1));
console.log('checking a', a);

console.log(Math.abs(-567));
console.log(Math.sqrt(33));
console.log(Math.cbrt(27));
console.log(Math.cos());
console.log(Math.sin());
console.log(Math.tan);
console.log(Math.log);
console.log(Math.log2);
console.log(Math.log10);

 //Округление

 let myNumber = 23.67;
 let var1 = Math.ceil(myNumber);
 let var2 = Math.floor(myNumber);
 let var3 = Math.round(myNumber);

 console.log(var1);
 console.log(var2);
 console.log(var3);

 // min max

 console.log(Math.min(3, 5));
 console.log(Math.max(3, 5));

 function myMin(x, y) {
    if (x > y) {
        return y;
    } else {
        return x;
    }
 }

 console.log(myMin(35, 47));
