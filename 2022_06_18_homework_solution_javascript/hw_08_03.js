"use strict";

function currencyConverterEuroToDollar(euro){
    //для доллара было бы так dollar / 1.11
    return euro * 1.1;
}


let euro500 = currencyConverterEuroToDollar(500);
console.log(euro500);