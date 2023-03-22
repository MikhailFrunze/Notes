function myEveryday(weekday) {
    let plan = "";
    switch (weekday) {
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
            plan = `I wake up at 7am
Have breakfast
Brush my teeth
go to work
work 8 hours
come from work
smoke with the neighbour on the staircase
watch the news
go sleep`;

            break;
        case 6:
            plan = "drink";
            break;
        case 7:
            plan = "sleep the whole day";
            break;
    }
}

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