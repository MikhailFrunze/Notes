const rootElem = document.querySelector('#root');
const form = document.querySelector('.form');

form.addEventListener('submit', (event) => {
    event.preventDefault();
    rootElem.innerText = '';
    let nameElem = event.target.full_name.value;
    let ageElem = event.target.age.value;
    const paragraph = document.createElement('p');

    paragraph.innerText = `Hello ${nameElem}. Your age is ${ageElem}`;

    event.target.full_name.value = '';
    event.target.age.value = '';

    rootElem.append(paragraph);

});