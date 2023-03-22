/**
 * 
 * @param weekday is positive integer
 */
function myFirstLoopWhile(weekday) {
    let output = "";
    while (weekday <= 5) {
        output = `I wake up at 7am
    Have breakfast
    Brush my teeth
    go to work
    work 8 hours
    come from work
    smoke with the neighbour on the staircase
    watch the news
    go sleep`;
        console.log("Wekday", weekday, output);
        // weekday = weekday + 1;
        // weekday += 1;
        weekday++;
    }
}

myFirstLoopWhile(5);

function myEverydayTwo(weekday) {
    let plan = "";
    if (weekday >= 1 && weekday <= 5) {
        plan = `I wake up at 7am
Have breakfast
Brush my teeth
go to work
work 8 hours
come from work
smoke with the neighbour on the staircase
watch the news
go sleep`;
    } else if (weekday === 6) {
        plan = "drink";
    } else {
        plan = "sleep the whole day";
    }
}