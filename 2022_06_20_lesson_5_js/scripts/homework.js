// let showNums = () => {
//     for (let i = 100; i >= 0; i-=10) {
//         console.log(i);

//     }
// }

// showNums();

// let showNums = () => {
//     for (let i = 25; i <= 67; i+=3) {
//         console.log(i);

//     }
// }

// showNums();

// let multiplyNums = () => {
//     let result = 1;
//     for (let i = 3; i <= 6; i++) {
//         result*=i;

//     }
//     return result;
// }

// console.log(multiplyNums());

// let getSum = (n) => {
//     let result = 0;
//     for (let i = 1; i <= n; i++) {
//         result += i;
//     }
//     return result;
// }

// console.log(getSum(5));

// let showLetter = (string) => {
//     for (let i = 0; i < string.length; i++) {
//         console.log(string[i]);

//     }
// }

// showLetter("Mihail");

let getSum = () => {
    let result = 0;
    for (let i = 0; i <= 100; i++) {
        if (i % 3 === 0 || i % 5 === 0) {
            result+=i;
        }
    }
    return result;
}

console.log(getSum());