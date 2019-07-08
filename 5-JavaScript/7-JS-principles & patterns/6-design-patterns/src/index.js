

console.log('-index.js-')


//-----------------------------------------------------

// import Person from './creational/singleton'


// let p1 = Person.getInstance()
// let p2 = Person.getInstance();

// console.log(p1 === p2);

//-----------------------------------------------------


// import BMWFactory from './creational/factory'

// let car = BMWFactory.create('X6')
// console.log(car);  


//-----------------------------------------------------

// import RequestBuilder from './creational/builder'

// let requestBuilder = new RequestBuilder();

// let request1 =
//     requestBuilder
//         .create()
//         .forUrl("http://")
//         .useMethod("GET")
//         .build()
// console.log(request1);


// let request2 =
//     requestBuilder
//         .create()
//         .forUrl("http://")
//         .useMethod("POST")
//         .payload({ data: { product: {} } })
//         .build()
// console.log(request2);

// console.log(request1==request2);  




// import $ from 'jquery'

// $('#box')
//     .text("good morning")
//     .hide(5000)


//-----------------------------------------------------

// import Sheep, { Template } from './creational/prototype'

// let sheep = new Sheep('baba', 15);
// let clonedSheep = sheep.clone();

// console.log(sheep === clonedSheep);
// console.log(sheep);
// console.log(clonedSheep);



// let defaultTemplate = new Template('h1', 'div', 'div');
// console.log(defaultTemplate);

// let record1Template = defaultTemplate.clone({ footer: 'footer' });
// console.log(record1Template);

// let record11Template = record1Template.clone({ header: 'header' })
// console.log(record11Template);

//-----------------------------------------------------

// import AbstractFoodFactory from './creational/abstract-factory';


// let food=AbstractFoodFactory.getFoodfactory('veg').getFood('dosa')
// console.log(food);  


//-----------------------------------------------------



import { withdraw } from './behavioral/chain-of-resp'


let notes = withdraw(4600)
console.log(notes);  