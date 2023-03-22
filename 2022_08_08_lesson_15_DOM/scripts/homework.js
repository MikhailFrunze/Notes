// const btn = document.querySelector('.btn');
// btn.addEventListener('click', () => {
//     console.log('hello btn');
// });

const form = document.querySelector('.form');
const rootElem = document.querySelector('#root');

form.addEventListener('submit', (event) => {
    event.preventDefault(); // запрещает поведение по умалчанию
    //    console.log(event.target);

    const full_name = event.target.full_name;
    console.log(event.target); // ссылка на елемент формы
    console.log(event.target.full_name); // ссылка на элемент с name="full_name" внутри элемента формы
    console.log(event.target.full_name.value); // значение (value), записанное в input

});

// event - объект события, передается в качестве аргумента
// target - элемент, с которым происходит событие

form.addEventListener('submit', (event) => {
    event.preventDefault;
    rootElem.innerText = '';
    let fullName = event.target.full_name.value;
    console.log(`Hello ${fullName}`);

    const inputText = document.createElement('p');
    inputText.innerText = fullName;
    rootElem.append(inputText);

    event.target.full_name.value = '';
});