"use strict";

//number -> 10, 3.14
//Java int - 10
//Java float

function fourSeasons(monthNumber){
let season = "";
switch (monthNumber) {
    case 12:
    case 1:
    case 2:
        season = "winter";
        break;
    case 3:
    case 4:
    case 5:
        season = "spring";
        break;
    case 6:
    case 7:
    case 8:
        season = "summer";
        break;
    case 9:
    case 10:
    case 11:
        season = "autumn";
        break;

    default:
        season = "season undefined";
        break;
}
season = "Your chosen season for vacation: " + season;
return season;

}

console.log(fourSeasons(10));