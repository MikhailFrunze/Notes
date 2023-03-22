"use strict";

function currencyNamesOfExchange(currencyName) {
    // курс к доллару

    let resultRate = 0;

    switch (currencyName) {
        case "EUR":
            resultRate = 1.1;
            break;
        case "RUR":
            resultRate = 0.014;
            break;
        case "GBP":
            resultRate = 1.39;
            break;
        case "USD":
            resultRate = 1.0;
            break;
        default:
            resultRate = 0.0;
            break;
    }
    return resultRate;
}

function onePairCurrency(firstCurrency, secondCurrency) {
    return currencyNamesOfExchange(firstCurrency) / currencyNamesOfExchange(secondCurrency);
}

function currencyConverterFunction(firstCurr, secondCurr, money) {
return onePairCurrency(firstCurr, secondCurr) * money;
}

console.log(currencyConverterFunction("EUR", "RUR", 1000));