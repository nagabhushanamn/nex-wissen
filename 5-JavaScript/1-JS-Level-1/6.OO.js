"use strict"

console.log('-OOP-');

// -------------------------------------------
// class
// -------------------------------------------

function Person(name, age) {
    this.name = name;
    this.age = age;
}
Person.prototype.sayName = function () {
    console.log('im ' + this.name)
}
Person.prototype.sayAge = function () {
    console.log('im ' + this.age + " old ")
}


// -------------------------------------------
// class ( from es6 )
// -------------------------------------------

class Person {
    constructor(name, age) {
        this.name = name;
        this.age = age;
        console.log('Person::constructor()')
    }
    sayName() {
        console.log('im ' + this.name)
    }
    sayAge() {
        console.log('im ' + this.age + " old ")
    }
}

// -------------------------------------------

class Employee extends Person {
    constructor(name, age, salary) {
        super(name, age)
        this.salary = salary;
        console.log('Employee::constructor()')
    }
    saySalary() {
        console.log('i wont');
    }
    askForBonus() {
        return this.salary * 0.02;
    }
}

// -------------------------------------------

class Boss extends Employee {
    askForBonus() {
        return this.salary * 0.2 + super.askForBonus();
    }
}

let boss = new Boss('Nag', 35, 1000)

// -------------------------------------------

class Abc {
    static staMethod() {
        console.log('static..')
    }
    ins() {
        console.log('instance..')
    }
}
Abc.staVar1 = 1
Abc.staVar2 = 2

Abc.staMethod();

let abc = new Abc();


//------------------------------------------
// accessor properties
//------------------------------------------

let person = {

    // data-properties
    _name: 'Nag',
    _age: 35,

    // accessor properties

    // set name(name) {
    //     if (name)
    //         this._name = name
    // },

    get name() {
        return this._name
    }
}



person.name = "Nag N"
console.log(person.name)


// -------------------------------------------