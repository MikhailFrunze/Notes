function myFirstReadFunction() {
    let mySpan = document.getElementById("read-1");
    // console.log(mySpan);
    let input = mySpan.innerText;
    // console.log(input);
    // let output = document.getElementById("demo");
    console.log(input, "input");
    writeData(input);
}

function writeData(input) {
    let output = document.getElementById("demo");
    output.innerText = input;
}

// function secondFunction(){
//     console.log("test");
// }



// myFirstReadFunction();