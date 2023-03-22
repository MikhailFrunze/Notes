"use strict";

//length
let str1 = "HELLO WORLD!";
let str2 = "";
let str3 = ' ';
console.log(str1.length, "length of first string");
console.log(str2.length, "length of second string");
console.log(str3.length, "length of third string");
console.log("-----charAt()-----");
let hausmaster = "Василийй";

let charIndex = hausmaster.charAt(3);
let charIndex2 = hausmaster.charAt(hausmaster.length - 1);
console.log(charIndex);
console.log(charIndex2);

//indexOf()
console.log("indexOf()");

let myChar = hausmaster.indexOf("силий");
console.log(myChar);
