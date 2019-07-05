import 'bootstrap/dist/css/bootstrap.css'

console.log("-index.js-");

import './jq-demo'

//--------------------------------------------
// using DOM API
//--------------------------------------------
/*
var box = document.querySelector('.alert-info')
var showBtn = document.querySelector('.btn-primary')
var hideBtn = document.querySelector('.btn-danger')
var nextBtn = document.querySelector('.btn-success')

hideBtn.addEventListener('click', e => {
    box.style.display = "none"
})
showBtn.addEventListener('click', e => {
    box.style.display = ""
})
nextBtn.addEventListener('click', e => {
    box.style.display = ""
    box.innerHTML = "have lunch"
})
*/
//--------------------------------------------


//--------------------------------------------
// using DOM API + Timer API
//--------------------------------------------
let images = []


let startBtn = document.getElementById('start-btn');
let stopBtn = document.getElementById('stop-btn');

let idx = 0;
function changeImage() {
    let nextImage = images[idx];
    document.querySelector('img').src = nextImage;
    idx++
    if (idx === images.length) idx = 0
}

stopBtn.disabled = true;
let interval;
startBtn.addEventListener('click', e => {
    stopBtn.disabled = false;
    startBtn.disabled = true;
    interval = setInterval(changeImage, 1000);
})
stopBtn.addEventListener('click', e => {
    stopBtn.disabled = true;
    startBtn.disabled = false;
    clearInterval(interval);
})


let timeEle = document.querySelector('.badge-danger');
setInterval(() => {
    timeEle.innerHTML = new Date().toLocaleTimeString('en-US', { timeZone: 'Asia/Kolkata' })
}, 1000);




//--------------------------------------------
// using DOM API + XHR API / Fetch API
//--------------------------------------------

function loadTodos(count) {
    let url = `https://jsonplaceholder.typicode.com/todos?_limit=${count}`;
    let promise = fetch(url)// non-blocking IO / Async IO
    document.getElementById('progress').innerHTML = "Loading Todos.."
    promise
        .then(response => response.json())
        .then(todos => {
            document.getElementById('progress').innerHTML = ""
            let todosEles = todos.map(todo => {
                return `
                    <li class="list-group-item ${todo.completed ? 'bg-info' : ''}">
                         <span class="badge badge-dark">${todo.id}</span>
                         ${todo.title}
                         <span class="text text-warning">${todo.completed}<span>
                    </li>
                `
            })
            document.getElementById('todo-list').innerHTML = todosEles.join(" ")
        })
        .catch(e => {
            document.getElementById('progress').innerHTML = "Failed to load todos, check internet connectivity"
        })
}

let todosBtn = document.getElementById('todos-btn');
let todosCount = document.getElementById('todos-count');
todosBtn.addEventListener('click', e => {
    loadTodos(5)
})
todosCount.addEventListener('change', e => {
    let count = e.target.value;
    if (count === 'all') loadTodos(200)
    else loadTodos(count)
})