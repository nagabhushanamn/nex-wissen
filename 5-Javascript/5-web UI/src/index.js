
// (function(){

console.log("-index.js-");

// require('bootstrap/dist/css/bootstrap.css')
//or
import 'bootstrap/dist/css/bootstrap.css';


//----------------------------------------------------
// DOM API
//----------------------------------------------------
//step-1 :  query DOM elements & bind event-listener(s) , on event , react dynamic data/behav

let alertBox = document.querySelector('.alert');
let greetBtn = document.querySelector('.btn-success')
let showBtn = document.querySelector('.btn-primary')
let hideBtn = document.querySelector('.btn-danger')

greetBtn.addEventListener('click', e => {
    alertBox.innerHTML = "good morning"
})
showBtn.addEventListener('click', e => {
    alertBox.style.display = ''
})
hideBtn.addEventListener('click', e => {
    alertBox.style.display = 'none'
})

//----------------------------------------------------

// rest-api: https://jsonplaceholder.typicode.com/todos?_limit=5

//----------------------------------------------------
// XHR API / Fetch API
//----------------------------------------------------

let todosBtn = document.querySelector('.btn-dark')
todosBtn.addEventListener('click', e => {

    let todoListEle = document.getElementById('todo-list');
    let apiurl = 'https://jsonplaceholder.typicode.com/todos?_limit=5';
    let promise = fetch(apiurl)  // IO
    promise
        .then(response => response.json())
        .then(todos => {
            let arr = todos.map(todo => {
                let liTemplate = `
                <li class="list-group-item ${todo.completed ? 'bg-success' : ''}">
                    ${todo.id} - ${todo.title} - ${todo.completed}
                </li>
            `
                return liTemplate;
            })
            todoListEle.innerHTML = arr.join(' ');
        })


})


//----------------------------------------------------
// Timer API
//----------------------------------------------------

let timeSpan = document.getElementById('time-span');

setInterval(e => {
    timeSpan.innerHTML = new Date().toLocaleTimeString();
}, 1000);   // event



// })()