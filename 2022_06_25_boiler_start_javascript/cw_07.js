// function someFunctionOne(primaryVariable, secondaryVariable, someVariable) {
//     if (primaryVariable) {
//         console.log("first way");
//     } else if (secondaryVariable) {
//         console.log("second way");
//     } else if (someVariable) {
//         console.log("Do it!");
//     } else {
//         console.log("app done");
//     }
// }

// function someFunctionTwo(primaryVariable, secondaryVariable, someVariable) {
//     if (primaryVariable) {
//         console.log("first way");
//     } else if (secondaryVariable) {
//         console.log("second way");
//     } else if (someVariable) {
//         console.log("Do it!");
//     } else {
//         console.log("app done");
//     }
// }

// someFunctionOne(true, true, true);

function helpPoliceman(speed) {
    //speed = proveSpeed(speed);
    let result = "";
    if (speed < 50) {
        result = "No violations";
    } else if (speed <= 65) {
        result = "Verbal warning and a lesson of 5 minutes";
    } else if (speed <= 100) {
        result = "Fine of 40 euros";
    } else if (speed <= 130) {
        result = "Fine of 500 euros";
    } else {
        result = "Driver's license revoked for a length of 3 years, vehicle confiscation, fine of 1000 euros";
    }
    return result;
}

console.log(helpPoliceman(5));
console.log(helpPoliceman(7));
console.log(helpPoliceman(14));
console.log(helpPoliceman(33));
console.log(helpPoliceman(50));

