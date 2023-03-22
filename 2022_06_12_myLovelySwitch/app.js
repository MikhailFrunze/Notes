"use strict";

function myVerySadStory(mathGrade) {
    // let mathGrade = 2;
    let prize = "";

    switch (mathGrade) {
        case 5:
            prize = "За пятерку в четверти по математике папа обещал мне велосипед";
            break;
        case 4:
            prize = "За четверку я получу GoPro";
            break;
        case 1:
            prize = "Ой, лучше не спрашивайте";
            break;
        case 2:
            prize = "За двойку меня отругают";
            break;
        case 3:
            prize = "За тройку не будут ругать";
            break;
        default:
            prize = "Такой оценки не существует";
    }

    return prize;
}

console.log(myVerySadStory(5));