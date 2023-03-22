const formElem = document.querySelector('.form');

let workersArr = [];

const cardsRender = () => {
    const cardsContainer = document.querySelector('.cards-container');

    workersArr.forEach(({name, age, rate, days, email, photo}) => {
        let card = document.createElement('div');
        let nameElem = document.createElement('p');
        let ageElem = document.createElement('p');
        let salaryElem = document.createElement('p');
        let emailElem = document.createElement('a');
        let photoElem = document.createElement('img');

        nameElem.innerText = `Name: ${name}`;
        ageElem.innerText = `Age: ${age}`;
        salaryElem.innerText = `Salary: ${rate * days}`;
        emailElem.setAttribute('href', `mailto:${email}`);
        emailElem.innerText = email;
        photoElem.setAttribute('src', photo);
        photoElem.setAttribute('alt', 'image');

        card.classList.add('card');
        photoElem.classList.add('photo')
        card.append(nameElem, ageElem, salaryElem, emailElem, photoElem);
        cardsContainer.append(card);
    });
}


formElem.addEventListener('submit', (event) => {
    event.preventDefault();

    const { name, age, rate, days, email, photo } =
        event.target;

    workersArr.push({
        name: name.value,
        age: age.value,
        rate: rate.value,
        days: days.value,
        email: email.value,
        photo: photo.value
    });

    name.value = '';
    age.value = '';
    rate.value = '';
    days.value = '';
    email.value = '';
    photo.value = '';

    cardsRender();
    console.log(workersArr);
});