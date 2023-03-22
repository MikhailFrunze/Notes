"use strict";

//тернарный оператор, элвис оператор

function getMeMax(a, b) {
    if (a < b) {
        return b;
    } else {
        return a;
    }
}

function getMeMaxNewHipsterWay(a, b) {
return (a < b) ? b : a;
}