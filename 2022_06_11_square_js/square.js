

// let a1 = 0;
// let b1 = 0;
// let c1 = a1 * b1;
// console.log(c1);
// // 1
// // function findSquare(){
// //     let a = 10;
// //     let b = 20;
// //     let c = a * b;
// //     console.log(c);
// // }

// console.log(findSquare(10, 20));

// function findSquare(side1, side2) {
//     let finalSquare = side1 * side2;
//     //console.log(c);
//     //API
//     return finalSquare;
// }

function findCubeArea(side) {
    let cubeArea = 6 * (side ** 2);
    return cubeArea;
}

console.log("Площадь куба:",findCubeArea(10));