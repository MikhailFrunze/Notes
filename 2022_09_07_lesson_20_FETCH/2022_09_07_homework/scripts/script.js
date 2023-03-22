// const rootElem = document.querySelector('#root');

// const render = (json) => {
//     let id_num = 1;
//         const card = document.createElement('div');
//         const task = document.createElement('p');
//         const status = document.createElement('p');


//         const state = completed ? 'done' : 'not done';
//         const color = completed ? 'green' : 'gray';

//         task.innerText = `Task: ${json.title}`;
//         status.innerText = `Status: ${state}`;
//         card.style.backgroundColor = color;

//         card.classList.add('card');

//         card.append(task, status);
        
    

//     rootElem.append(card);
// }

// fetch(`https://jsonplaceholder.typicode.com/users/${id_num}`)
//     .then(res => res.json())
//     .then(json => render(json))

const rootElem = document.querySelector('#root');

const cardRender = (json) => {
    let id_num = 1;
        const card = document.createElement('div');
        const emailElem = document.createElement('a');
       


        const state = completed ? 'done' : 'not done';
        const color = completed ? 'green' : 'gray';

        task.innerText = `Task: ${json.title}`;
        status.innerText = `Status: ${state}`;
        card.style.backgroundColor = color;

        card.classList.add('card');

        card.append(task, status);
        
    

    rootElem.append(card);
}

fetch(`https://jsonplaceholder.typicode.com/users/${id_num}`)
    .then(res => res.json())
    .then(json => render(json))