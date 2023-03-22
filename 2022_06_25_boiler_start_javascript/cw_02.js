"use strict";
function makeHotDrink(water = 100, cocoa = 100, coffee, milk, sugar) {
    return (`Подогреваем ${water} миллилитров воды,
    кроме того ${cocoa} миллиграм какао,
    добавляем ${coffee} миллиграмм свежесмолотого кофе, 
    для этого напитка использовано ${milk} миллилитров молока,
    и ${sugar} миллиграм сахара`)
};

console.log(makeHotDrink(100, 0, 0, 0, 0));

let hotWater = makeHotDrink(100, 0, 0, 0, 0);
let latte = makeHotDrink(70, 0, 30, 30, 0);
let cocoa = makeHotDrink(0, 20, 0, 100, 10);

// console.log(cocoa);

console.log(makeHotDrink());