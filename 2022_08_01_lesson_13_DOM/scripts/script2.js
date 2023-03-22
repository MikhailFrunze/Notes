const rootElem = document.body;

const card = document.createElement('div');
const idElem = document.createElement('p');
const firstNameElem = document.createElement('p');
const lastNameElem = document.createElement('p');
const emailElem = document.createElement('a');
const imgElem = document.createElement('img');

idElem.innerText = 'ID: 1';
firstNameElem.innerText = 'First name: Michael';
lastNameElem.innerText = 'Last name: Lawson';
emailElem.innerText = 'michael.lawson@reqres.in';

rootElem.append(card);

card.classList.add('card');
imgElem.classList.add('photo');

emailElem.setAttribute('href', 'mailto:michael.lawson@reqres.in');
imgElem.setAttribute('src', 'https://reqres.in/img/faces/7-image.jpg');
imgElem.setAttribute('alt', 'Woman profile pricture');
card.append(idElem, firstNameElem, lastNameElem, emailElem, imgElem);

