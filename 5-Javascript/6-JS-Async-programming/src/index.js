// console.log('-index.js-')
import 'bootstrap/dist/css/bootstrap.css';

// import {} from './promise-api'

// import {} from './rxjs-learn-v2'

import {} from './generator-func'

// #1

// function foo(){}
// function bar(){foo()}
// function baz(){bar()}
// baz();


// #2
// function foo(){ throw new Error('oops')}
// function bar(){foo()}
// function baz(){bar()}
// baz();

// #3
// function foo(){
//     foo();
// }
// foo();


//#4

// function longRunning(){
//     var i=0;
//     while(i<10){
//         console.log("long.....");  
//         i++;
//     }
// }

// function shortRunning(){
//     console.log('short...');  
// }

// longRunning();
// shortRunning();


//------------------------------------------------------

// on event, how browser executing function ?

//------------------------------------------------------


/*

    <button class="veg">veg</button>
    <button class="non-veg">non-veg</button>

*/

/*
console.log("init....");

//using DOM API
//---------------
$.on('.veg', 'click', function vegHandler(e) {
    console.log("handling event on .veg elements");
});
$.on('.non-veg', 'click', function nonVegHandler(e) {
    console.log("handling event on .non-veg elements");
});

console.log("cont..with other work..");
function longRunning() {
    var i = 0;
    while (i < 100) {
        console.log("long.....");
        i++;
    }
}
longRunning();

*/

//---------------------------------------
// Non Blocking IO
//---------------------------------------

/*

// in browser, IO  means ==> http-request/response , read/write with storage API, ... interacting with browser APIs


// .js event-loop never blocked while IO happening thru browser APIs


console.log('init.....')
// n/w call ==> IO
setTimeout(function timeout() {
    console.log("consume IO result...");
}, 4000);
console.log(("cont..with other work.."));

*/


// //
// localStorage.setItem("SESSIONID","1234567800") // IO

// let id=localStorage.getItem('SESSIONID' ) // IO
// console.log(id);  



//---------------------------------------
// Quiz
//---------------------------------------

/*

function teach() {
    let tnrName = "Nag"; // this data will get move to Heap memory
    try {
        console.log(tnrName + "-teaching .js ");
        //throw new Error('js-error')
        setTimeout(function () {
            console.log(tnrName + '-teaching react');
            //throw new Error('react-error')
            console.log('teaching react ends');
        }, 5000);
        console.log("teaching .js ends..");
    } catch (e) {
        console.log("i caught - " + e.message);
    }
}

teach();

*/
