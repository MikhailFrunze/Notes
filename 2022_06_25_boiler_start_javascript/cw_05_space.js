"use strict";

function space(speed, medicalPermission) {
    const SUPERCONSTANT_G = 10;
    if (speed > SUPERCONSTANT_G && medicalPermission) {
        console.log("The rocket launches into outer space");
        console.log("We issue a press-release about the successful launch");
        console.log("The programmers are mentioned for state rewards");
    } else {
        console.log("Initial boost is not enough");
        console.log("Prepare the emergency services");
    }
}

// space(15, false);

function space2(speed) {
    const SUPERCONSTANT_G = 10;
    if (speed < SUPERCONSTANT_G) {
        console.log("Initial boost is not enough");
        console.log("Prepare the emergency services");
    } else {
        console.log("The rocket launches into outer space");
        console.log("We issue a press-release about the successful launch");
        console.log("The programmers are mentioned for state rewards");
    }
}

