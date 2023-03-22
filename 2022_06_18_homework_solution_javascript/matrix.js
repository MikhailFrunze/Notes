"use strict";
function matrix(pill) {
    switch (pill) {
        case "red":
            console.log("exit the matrix");
            break;
        case "blue":
            console.log("stay in the matrix");
            break;
        default:
            console.log("The colour of the pill is unrecognised");
    }
}

matrix("red");