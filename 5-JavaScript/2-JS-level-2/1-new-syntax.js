

//------------------------------------
// obj literal enhancements
//------------------------------------

let name = "Nag"
let age = 35;

//---------------
// ES5
//---------------

let person1 = {
    name: name,
    age: age,
    3: 'three',
    address: 'chennai',
    sayName: function () { },
    'say Age'() {
        //..
    }
};
//---------------
// from ES6
//---------------
let addressType = 'home'; // home | office | vacation
let person2 = {
    name,
    age,
    [1 + 3]: 'three',
    [addressType + "-address"]: 'chennai',
    sayName() { }
}


//------------------------------------
// de-structiring 
//------------------------------------

//#1

function renderReview(review) {
    // let stars = review.stars;
    // let author = review.author;
    // let body = review.body;
    //or
    let { stars, author, body } = review
    return `
        <div>
            <span>${stars}</span> &mdash <span>${author}</span>
            <hr/>
            <p>${body}</p>
        </div>
    `
}
let review = { stars: 5, author: 'who@email.com', body: 'bla bla' }
renderReview(review);


let person = {
    name: 'Nag',
    age: 35
}

// let { name: myName, age: myAge } = person;
// let { name: name, age: age } = person;
//or
// let { name, age } = person;

let name, age;
({ name, age } = person);

//#2

let arr = [1, 2, 3, 4, 5, 6, [7, 8]]
let [n1, n2, n3, n4 = 40, , n6, [n7, n8]] = arr;


//------------------------------------
// spread operator
//------------------------------------


//#1

function func(a, b, c) {
    console.log(a)
    console.log(b)
    console.log(c)
}

let nums = [10, 20, 30]

// func(nums[0], nums[1], nums[2])
// func(...nums)


let max = Math.max(...nums);
console.log(max);


//#2

let arr1 = [1, 2, 3]
let arr2 = [7, 8, 9]
let arr3 = [...arr1, 4, 5, 6, ...arr2]


// #3

let o1 = { x: 1, y: 2 }
let o2 = { y: 3 }

let o3 = { ...o2, ...o1 }



//------------------------------------
// symbol & Iterable
//------------------------------------

/*

    symbol:
    -------

    unique & immutable value ( we cant't see ) ,
    used as obj's identifier property

*/


let menu = [
    "item-1",
    "item-2"
];
let newMenu = [...menu, 'item-2']
let [m1, m2] = newMenu
for (let m of newMenu) {
    console.log(m)
}



//------------------------------------
// custom Iterable
//------------------------------------

let idGenerator = {
    [Symbol.iterator]: function () {
        let id = 0;
        return {
            next: function () {
                id++;
                return { value: id <= 10 ? id : undefined, done: id <= 10 ? false : true }
            }
        }
    }
}

let ids = [...idGenerator]
let [id1, id2, id3] = idGenerator
for (let id of idGenerator) {
    console.log(id)
}


//------------------------------------
// Generator function
//------------------------------------

//#1
function func() {
    var i = 0;
    while (i < 5) {
        console.log(i);
        i++;
    }
}

func();

// #2
function* gen() {
    console.log('started...')
    yield 1;
    console.log('foo')
    yield 2
    console.log("bar");
    yield 3
    console.log('baz')
}

// #3
function* gen() {
    console.log('started...')
    let x = yield "give x value"
    console.log(x);
    let y = yield "give me y value"
    console.log(y);
    let z = yield "give me z value"
    console.log(z);
    return x + y + z
}


//------------------------------------



//------------------------------------
// Collection(s)
//------------------------------------


let set = new Set();
set.add("idly")
set.add("vada")
set.add("poori")
set.add("idly")

let literalMap = {
    key1: 'value-1',
    key2: 'value-2'
};


let ow1 = { name: 'Nag' }
let ow2 = { name: 'Ria' }

let car1 = { model: 'fort...' }
let car2 = { model: 'toy' }

let map = new Map();
map.set(ow1, car1)
map.set(ow2, car2);










