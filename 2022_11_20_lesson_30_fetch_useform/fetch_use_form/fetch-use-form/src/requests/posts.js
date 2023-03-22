export const getPosts = () => {
    fetch('https://dummyjson.com/posts')
        .then(resp => resp.json())
        .then(json => console.log(JSON.posts))
}

export const addPost = (body, callback) => {
    fetch('https://dummyjson.com/posts/add', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },

        body: JSON.stringify(body)
    })
        .then(resp => resp.json())
        .then(json => callback(JSON))
}