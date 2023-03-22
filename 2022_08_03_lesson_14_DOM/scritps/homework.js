const data = [
    {
        id: 1,
        title: 'bicycle',
        price: 100,
    },

    {
        id: 2,
        title: 'bicycle',
        price: 500,
    },

    {
        id: 3,
        title: 'snowboard',
        price: 200,
    }
];

const rootElement = document.querySelector('.root');

data.forEach(({id, title, price}) => {
    const card = document.createElement('div');
    const idElem = document.createElement('p');
    const titleElem = document.createElement('p');
    const priceElem = document.createElement('p');
// const {id, title, price} = product;
    idElem.innerText = `ID: ${id}`;
    titleElem.innerText = `Title: ${title}`;
    priceElem.innerText = `Price: ${price}`;

    card.append(idElem, titleElem, priceElem);
    rootElement.append(card);
    card.classList.add('card');
});

