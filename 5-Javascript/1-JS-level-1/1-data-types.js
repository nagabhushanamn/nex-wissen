"use strict"


/*
    -------------------------------------
    data-types
    -------------------------------------
    1. simple / primitives ==> values
        a.  undefined
        b.  string
        c.  number
        d.  boolean
    2. complex / reference ==> objects
*/



//-----------------------------------------------------------------
// 1. simple / primitive types ==> values
//-----------------------------------------------------------------

//-----------------------------
// a. undefined
//-----------------------------

var v;


//-----------------------------
// b. string
//-----------------------------

var name = "Nag";
var myName = 'Nag';

var dynamicString1 = "the trainer " + name + ", teaching javascript"
var dynamicString2 = `the trainer ${name}, teaching javascript`
var dynamicString = `the of 1 & 2 is ${1 + 2}`
var template = `
    <div>
        <ul>
            <li>item-1</li>
        </ul>
    </div>

`


//-----------------------------
// c. number
//-----------------------------

var count = 12;
var cost = 12.12;


//-----------------------------
// d. boolean
//-----------------------------

var isFound = true;  // or false



/*
    // imp-note :
    falsy-values => false,0,"",null,undefined,NAN,
    
    ref : https://dorey.github.io/JavaScript-Equality-Table/
*/





//-----------------------------------------------------------------
// 2. complex / reference types ==> objects
//-----------------------------------------------------------------

/*

how to create object ?
syntax:

    var ref = new Constructor()

*/
//---------------------------------------
// class / constructor  ( till ES5 )
//---------------------------------------
/*
function Person(name, age) {
    this.name = name;
    this.age = age;
    // this.sayName = function () {
    //     console.log(`im ${this.name}`)
    // }
    // this.sayAge = function () {
    //     console.log(`im ${this.age} old`)
    // }
}
Person.prototype.sayName = function () {
    console.log(`im ${this.name}`)
}
Person.prototype.sayAge = function () {
    console.log(`im ${this.name}`)
}
*/

// - or -
//---------------------------------------
// class / constructor  ( from ES6 )
//---------------------------------------

class Person {
    constructor(name, age) {
        this.name = name;
        this.age = age;
    }
    sayName() {
        console.log(`im ${this.name}`)
    }
    sayAge() {
        console.log(`im ${this.name}`)
    }
}



var p1 = new Person("Nag", 35)
var p2 = new Person("Ria", 4)



//-----------------------------------------------------------------
//  dynamic properties
//-----------------------------------------------------------------

/*
    ==> .js-lang is dynamic language, so
    by default, 
    
    => objects are extensible 
        i.e we can add new properties as you need 
    => also can delete property if not required with 'delete' keyword
*/


// console.log(Object.isExtensible(p1))
Object.preventExtensions(p1)

// console.log(Object.isSealed(p1))
Object.seal(p1)

// console.log(Object.isFrozen(p1))
Object.freeze(p1);


// p1.techSkill = 'java,js'
// delete p1.age;
// p1.age = 35;



//-----------------------------------------------------------------
// literal-style object(s)
//-----------------------------------------------------------------

//-----------------------------
// a. Object
//-----------------------------


var httpReqConfig = new Object();
httpReqConfig.url = "http://localhost:8181/todos";
httpReqConfig.httpMethod = "GET";
httpReqConfig.onSucesss = function (response) {
    //..
}

// - or- 

var httpReqConfigNew = {
    url: 'http://localhost:8181/todos',
    httpMethod: 'GET',
    onSucesss: function (response) {
        //..
    }
};



//-----------------------------
//  Array/List
//-----------------------------


var menu = new Array();

// or

var menuNew = [];



//-----------------------------
//  RegExp
//-----------------------------

var adharPattern = new RegExp("\\d{4}-\\d{4}-\\d{4}");

// or

var adharPatternNew = /\d{4}-\d{4}-\d{4}/


//-----------------------------
//  Function
//-----------------------------


var add = new Function("n1", "n2", "var result=n1+n2;return result;")

// or

function addNew(n1, n2) {
    var result = n1 + n2;
    return result;
}


//-----------------------------------------------------------------
//  How to access obj's properties?
//-----------------------------------------------------------------

/*
    2 ways
    -> '.' , if property-name dont have space or '-' or digit
    else
    -> '[]' , for any property
*/


var person = {
    name: 'Nag',
    'home-address': 'chennai',
    1: 'one',
    100: 'hundred'
};

console.log(person.name)
console.log(person["home-address"])
console.log(person["1"])
console.log(person[100])
