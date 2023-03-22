"use strict";

console.log(helloName("bob"));

function helloName(stringName) {
    return "Hello " + stringName + "!";
}

function makeAbba(a, b) {
    return a + b + b + a;
}

console.log(makeAbba('Yo', 'Alice'));

function makeTags(tag, word) {
    let startTag = "<" + tag + ">";
    let endTag = "</" + tag + ">";
    return startTag + word + endTag;
}

console.log(makeTags('i', 'Yay'));