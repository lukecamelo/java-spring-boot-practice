const button = document.querySelector('#button')

button.addEventListener('click', () => {
    fetch('http://localhost:8080/addtopic', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
            Accept: 'application/json'
        },
        body: JSON.stringify({
            id: 'id',
            name: 'name',
            description: 'description'
        })
    })
        .then(res => res.json())
        .then(json => console.log(json))
})
