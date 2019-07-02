
console.log('-promise-api-')


//---------------------------------------------------
// hotel module
//---------------------------------------------------

let hotel = {
    getFood() {
        let promise = new Promise((resolve, reject) => {
            //
            setTimeout(() => {
                let food = "biryani"
                console.log("hotel resolving promise");
                resolve(food)
            }, 3000)
        });
        return promise;
    }
}


//---------------------------------------------------
// hotel module
//---------------------------------------------------

let bar = {
    getDrink() {
        let promise = new Promise((resolve, reject) => {
            //
            setTimeout(() => {
                let drink = "BEER"
                console.log("bar resolving promise");
                resolve(drink)
                //console.log("bar rejecting promise");
                //reject('No BEER')
            }, 1000)
        });
        return promise;
    }
}

//---------------------------------------------------
// person-module
//---------------------------------------------------
let person = {
    doWork() {
        console.log('person working....')
        console.log('person feels hungry..requesting food  & beer')
        let promise1 = hotel.getFood();
        let promise2 = bar.getDrink();
        console.log("person got promise , defer food & bar actions to future");

        let newPromise = Promise.all([promise1, promise2])
            .then(
                result => {
                    console.log("yummy with half" + result)
                    return "HALF => BIRYANI + BEER"
                },
                error => console.log("oops with " + error)
            )

        newPromise.then(result => {
            console.log("yummy with " + result);
        })

        console.log('cont with other work...')
    }
};

person.doWork();







//---------------------------------------------------

// service-module ==> service-logic

// UI-module ==> ui logic

//---------------------------------------------------
let todoService = {
    todos: [],
    getTodos() {

        let promise = new Promise((resolve, reject) => {
            setTimeout(() => {
                let url = 'https://jsonplaceholder.typicode.com/todos?_limit=5';
                let xhr = new XMLHttpRequest();
                xhr.open('GET', url)
                xhr.send(null)
                xhr.onreadystatechange = function () {
                    if (xhr.readyState === 4) {
                        resolve(JSON.parse(xhr.responseText))
                    }
                }
            }, 3000)
        });
        return promise;
    }
}
//---------------------------------------------------

let btn = document.getElementById('todos-btn');

btn.addEventListener('click', e => {
    todoUI.renderingTodos();
    document.getElementById('progress-message').innerHTML = "Loading todos.."
});

let todoUI = {
    renderingTodos() {
        console.log("UI requesting todos on todos-service...");
        let promise = todoService.getTodos();
        console.log('got promise for todos, defer todos-rendering actions to future..');
        promise.then(todos => {
            console.log(todos);
            document.getElementById('progress-message').innerHTML = ""
        })
        // console.log("UI- pls wait , we r loading todos, if loaded we ll render to you..");
    }
}
//---------------------------------------------------

todoUI.renderingTodos();

//---------------------------------------------------





