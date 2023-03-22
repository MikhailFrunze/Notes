export const getProducts = (callback) => {

    fetch(`https://dummyjson.com/products`)
        .then(res => res.json())
        .then(json => callback(json.products))
}

// Написать функцию, которая при вызове будет отправлять fetch-запрос по адресу https://dummyjson.com/products и выводить в консоль массив с объектами products

export const addProduct = (body, callback) => {
    fetch('https://dummyjson.com/products/add', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(body)
    })
        .then(resp => resp.json())
        .then(json => callback(json));
}
