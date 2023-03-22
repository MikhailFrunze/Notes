// 10 кабинетов и коридор; 5*4; 100m в длинну 3 метра в ширину; высота 3м;

// 0. Литр краски на 5 метров
// 1. Стоимость литра краски - 7
// 2. Найти количество литров краски
// 3. Площадь стен в коридоре
// 4. Площадь коридор
// 5. Площадь кабинета

let heightFloor = 3;

function officeArea(sidea, sideb) {
    let area = (sidea + sideb + sideb) * heightFloor;
    return area;
}

function hallway(length, width) {
    return (length + width) * 2 * heightFloor;
}

let allArea = hallway(100, 3) + 10 * officeArea(5, 4);
console.log(allArea);

function findColorLiter(area) {
    return area / 5;
}

function findColorCost(literColor) {
    return literColor * 7;
}

let money = findColorCost(
    findColorLiter(allArea)
);

console.log(`The cost of painting the school is ${money} $`);