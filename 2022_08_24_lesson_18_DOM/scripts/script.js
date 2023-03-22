// Вывести содержимое инпута в консоль

const show_text_btn = document.querySelector('.show_text_btn');
const show_text_input = document.querySelector('.show_text_input');

show_text_btn.addEventListener('click', () => console.log(show_text_input.value));

//Изменить цвет фона на черный 
const mode_btn = document.querySelector('.mode_btn');
const body_background = document.body;

mode_btn.addEventListener('click', () => {
    body_background.style.backgroundColor = 'black';
});


mode_btn.addEventListener('click', () => document.body.classList.toggle('black'));

// Изменить цвет фона на цвет из массива
const colors = ['blue', 'yellow', 'pink', 'green'];

const mode_btn_color = document.querySelector('.mode_btn_color');
let colorIndex = 0;



mode_btn_color.addEventListener('click', () => {
    mode_btn_color.style.backgroundColor = colors[colorIndex++ % colors.length];
});

// colorIndex++ % colors.length
// 0 % 4 = 0
// 1 % 4 = 1
// 2 % 4 = 2
// 3 % 4 = 3
// 4 % 4 = 0
// 5 % 4 = 1
// 6 % 4 = 2
// 7 % 4 = 3
// 8 % 4 = 0

//// Изменить содержимое инпута с ??? на !!!

const change_text_input = document.querySelector('.change_text_input');
const change_text_btn = document.querySelector('.change_text_btn');

change_text_btn.addEventListener('click', () => {
    change_text_input.value = '!!!';
});

// Изменить содержимое инпута на содержимое из массива
let words = ['!!!', '...', '&&&', '***'];
let wordIndex = 0;

const change_text_input2 = document.querySelector('.change_text_input2');
const change_text_btn2 = document.querySelector('.change_text_btn2');

change_text_btn2.addEventListener('click', () => {
    change_text_input2.value = words[wordIndex++ % words.length];
});

// Добавить описанный в форме элемент

const add_form = document.querySelector('#add_form');

let elements_result = document.querySelector('.elements_result');

add_form.addEventListener('submit', (event) => {
    event.preventDefault();
    const {type, content, colour} = event.target;
    let element = document.createElement(type.value);
    element.innerText = content.value;
    element.style.backgroundColor = colour.value;
    elements_result.append(element);
})
