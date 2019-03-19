const button = document.querySelector('#button')
const id = document.querySelector('#id')
const name = document.querySelector('#name')
const description = document.querySelector('#description')

button.addEventListener('click', () => {
    fetch('http://localhost:8080/addtopic', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
            Accept: 'application/json'
        },
        body: JSON.stringify({
            id: "i'm an id baby",
            name: "i'm a name bitch",
            description: 'you better believe this is a description'
        })
    })
        .then(res => res.json())
        .then(json => {
            let i = 0
            json.forEach(x => i++)
            console.log(i - 1)
            id.innerHTML = json[i - 1].id
            name.innerHTML = json[i - 1].name
            description.innerHTML = json[i - 1].description
        })
})
