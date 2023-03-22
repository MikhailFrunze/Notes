let getLength = string => `The length of the string is ${string.length}`;

console.log(getLength('hello'));

let getNum = (base, exp = 2) => Math.pow(base, exp);

let getMaxNumber = (a, b) => {
    if (a > b) {
        return a
    } else if (b > a) {
        return b;
    } else {
        return `The numbers are equal`;
    }
}

let getBiggerNum = (num1, num2) => {
    if (a === b) {
        return `The numbers are equal`;
    }
    return Math.max(num1, num2);
}

let sortNumbers = (a, b, c) => {
    if (a > b && a > c) {
        if (b > c) {
            console.log(a, b, c);
        } else {
            console.log(a, c, b);
        }
    } else if (b > a && b > c) {
        if (a > c) {
            console.log(b, a, c);
        } else {
            console.log(b, c, a);
        }
    }

    else {
        if (a > b) {
            console.log(c, a, b);
        } else {
            console.log(c, b, a);
        }
    }
}

sortNumbers(5, -80, 1);

let getMaxNumber2 = (a, b, c, d, e) => {
    if (a > b && a > c && a > d && a > e) {
        console.log(a);
    } else if (b > a && b > c && b > d && b > e) {
        console.log(b);
    } else if (c > b && c > a && c > d && c > e) {
        console.log(c);
    } else if (d > b && d > c && d > a && d > e) {
        console.log(d);
    } else {
        console.log(e);
    }
}

getMaxNumber2(1,2,3,4,5);
