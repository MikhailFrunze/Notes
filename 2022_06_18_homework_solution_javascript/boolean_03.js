"use strict";

/*
Родители Васи Сидорова купили умный сейф и запрограммировали его на выдачу денег по отпечатку пальцев одного из родителей
smartDepositBox(true, false) -> true
smartDepositBox(false, true) -> true
smartDepositBox(false, false) -> false
*/

function doorbell(bell1, bell2) {
    return (bell1 && !bell2) || (bell2 && !bell1);
}

console.log(doorbell(true, true)); // false
console.log(doorbell(false, true)); // true
console.log(doorbell(true, false)); // true
console.log(doorbell(false, false)); // false