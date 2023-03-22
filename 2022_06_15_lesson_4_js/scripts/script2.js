// let showNumbers = () => {
//     for (let i = 0; i <= 10; i += 1) {
//         console.log(i);
//     }
// }

// let showReverseNumbers = () => {
//     for (let i = 10; i >= 0; i--) {
//         console.log(i);
//     }
// }


let showNumbersStepTwo = () => {
    for (let i = 0; i <= 10; i += 2) {
        console.log(i);
    }
}

showNumbersStepTwo();
// let showNumbersFromFiveToTenInArr = () => {
//     let arr = [];
//     for (let i = 5; i <= 10; i += 1) {

//         arr.push(i);
//     }
//     return arr;
// }


// // выражение 1 - начальное значения счетчика
// // выражение 2 - условие повторения цикла
// // выражение 3 - изменение счетчик



// let getNumbers = (n, m) => {
//     if (n > m) {
//       for (let i = n; i >= m; i--) {
//         console.log(i)
//       }
//     } else if (m > n) {
//       for (let i = m; i >= n; i--) {
//         console.log(i)
//       }
//     } else {
//       console.log(`Number ${n} and number ${m} are equal`)
//     }
//   }
  
  
  

// let getNumbers = (n, m) => {
//     for (let i = m; i <= n; i++) {
//         if (i % 2 == 0) {
//             console.log(i);
//         }
//     }
// }

// getNumbers(50, 5);

// let getSum = () => {
//     let result = 1;
//     for (let i = 1; i <= 4; i++) {
//         result *= i;
//     }
//     return result;
// }

// console.log(getSum());


let getSums = (n,m) => {
    let evenResult = 0;
    let oddResult = 0;
    for (let i = n; i <= m; i++) {
        if(i % 2 === 0){
            evenResult+=i;
        } else{
            oddResult+=i;
        }
    }

    return `${evenResult}, ${oddResult}`;
}

console.log(getSums(1,10));