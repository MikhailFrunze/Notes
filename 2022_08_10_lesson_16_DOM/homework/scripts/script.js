const formElem = document.querySelector('.form');

formElem.addEventListener('submit', (event) => {
    event.preventDefault();
    const cardContainer = document.querySelector('.cards-container');

    let card = document.createElement('div');
    let nameElem = document.createElement('p');
    let ageElem = document.createElement('p');
    let salaryElem = document.createElement('p');
    let emailElem = document.createElement('a');
    let photoElem = document.createElement('img');

    let name = event.target.name.value;
    let age = event.target.age.value;
    let rate = event.target.rate.value;
    let days = event.target.days.value;
    let email = event.target.email.value;
    let photo = event.target.photo.value;

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
    cardContainer.append(card);

    console.log(name, age, rate, days);
});