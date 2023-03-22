"use strict";

let cyrillic = "АБВГДЕ ЭЮЯЁ";
let latin = "ABC XYZ";

let symbol = "£§ÜÖÄȚȘĂÎÂ";

//codepoint
console.log(cyrillic.codePointAt(0));
console.log(latin.codePointAt(0));
console.log(cyrillic.codePointAt(cyrillic.length - 1));
console.log(latin.codePointAt(latin.length - 1));
console.log(symbol.codePointAt(0));
console.log(symbol.codePointAt(1));
console.log(symbol.codePointAt(2));
console.log(symbol.codePointAt(3));
console.log(symbol.codePointAt(4));
console.log(symbol.codePointAt(5));
console.log(symbol.codePointAt(6));
console.log(symbol.codePointAt(7));
console.log(symbol.codePointAt(8));
console.log(symbol.codePointAt(9));