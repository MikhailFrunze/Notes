const rootElem = document.querySelector('.root');

const card = document.createElement('div');
const artElem = document.createElement('p');
const titleElem = document.createElement('p');
const priceElem = document.createElement('p');
const imgElem = document.createElement('img');
const emailElem = document.createElement('a');

artElem.innerText = 'Art: 12345';
titleElem.innerText = 'Title: iPhone Pro 13';
priceElem.innerText = 'Price: 1300 $';
emailElem.innerText = 'iphone13@gmail.com';

card.classList.add('card');
imgElem.classList.add('iphoneImg');