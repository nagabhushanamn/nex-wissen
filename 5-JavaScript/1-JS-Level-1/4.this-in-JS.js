

"use strict"

console.log('-this-');  

/*

    function-binding
    -------------------

    ==> executing function by an object

    can bind function to an object in 2 ways

    1. static
    2. dyanmic


*/


//-----------------------------------
//   static function-binding  
//-----------------------------------

function sayNameForAll() {
    console.log('im ' + this.name);
}

let p1 = {
    name: 'Nag',
    sayName: sayNameForAll
}
let p2 = {
    name: 'Ria',
    sayName: sayNameForAll
}

sayNameForAll(); // Error

p1.sayName();
p2.sayName();

delete p1.sayName


//-----------------------------------
//   dynamic function-binding  
//-----------------------------------

function doTraining(sub, duration, location) {
    console.log(`The Tnr-${this.name}, teaching ${sub}-${duration} days in ${location}`);
}

let tnr1 = { name: 'Nag' }
Object.preventExtensions(tnr1);

tnr.doTraining = doTraining; // Error

//---------------------
// way-1 : call()
//---------------------
doTraining.call(tnr1, '.js', 10, 'universe')

//---------------------
//way-2 :  apply()
//---------------------
doTraining.apply(tnr2, ['.js', 3, 'delhi'])

//---------------------
//way-2 : bind()
//---------------------
let newF = doTraining.bind(tnr1, '.js');

newF(3, 'BLR');
newF(1, 'DELHI');


//-----------------------------------
// summary on function-binding
//-----------------------------------

function func() {
    console.log(this);
}
func();

let o1 = { name: 'One', func: func } // static
o1.func();
let o2 = { name: 'Two' }
func.call(o2);   // dynamic

// ---------------------------------------------------------
// Quiz -1
// ---------------------------------------------------------

let tnr = {
    name: 'Nag',
    doTeach: function () {
        console.log(this.name + " teaching .js");
        let self = this;
        let doLearn = function () {
            console.log(this.name + " learning .js from " + self.name);
        }
        console.log("teaching .js ends");
        return doLearn;
    }
}

let learnFunc = tnr.doTeach();
learnFunc(); // error
let emp = { name: 'EMP' }
learnFunc.call(emp)

let newTnr = { name: 'New-Tnr' }
learnFunc = tnr.doTeach.call(newTnr);
learnFunc.call(emp)


// ---------------------------------------------------------
// Quiz-2
// ---------------------------------------------------------


let pName = "Global";

let person = {
    pName: 'Nag',
    sayName: function () {
        let pName = "Local";
        console.log("im " + pName);
        console.log("im " + person.pName);
        console.log("im " + this.pName);
    }
}

person.sayName();
let oldPerson = person;
person = { pName: 'New-Person' }
oldPerson.sayName();


// ---------------------------------------------------------
// Ex.
// ---------------------------------------------------------

// 

function sessionStart() {
    console.log("session starts");

    function doTraining() {
        console.log(this.name + " teaching .js ")
        let self = this;
        let learn = function () {
            console.log(this.name + " learning js from " + self.name);
        }
        return learn;
    }

    function Trainer(name) {
        this.name = name;
    }

    function Employee(name) {
        this.name = name;
    }
    Employee.prototype.work = function () {
        console.log(this.name + " working after learn");
    }

    let tnr = new Trainer('Nag')
    let e1 = new Employee('E1')
    let e2 = new Employee('E2')

    let learnFunc = doTraining.call(tnr);
    learnFunc.call(e1);
    learnFunc.call(e2);
    e1.work();
    e2.work();

    console.log("session ends...");

}

sessionStart();


// ---------------------------------------------------------