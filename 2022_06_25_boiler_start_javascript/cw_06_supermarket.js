"use strict";

function proveAgeForAlcoholSale(customerAge) {
    //Ungar-notation 8.3
    //andrej18.doc

    if (customerAge < 16) {
        return "alcohol sale forbidden";
    } else if (customerAge >= 18){
        return "vodka allowed";
    } else {
        return "beer and cigarettes allowed";
    }
}