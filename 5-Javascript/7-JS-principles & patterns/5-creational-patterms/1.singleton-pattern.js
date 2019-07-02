



/*
    -------------------
    single-pattern:
    -------------------

    => having single-instance per class/module

    why/where we need ?

     => to have appln wide configuration
     => to share common-state for complete appln. ( e.g redux store )
     => cache puspose
     => service instances
     => resource objects
     
     e.g

        in redux library,
            
            - single immutable store 
     ...

*/



// how to implement in .js ?

//---------------------------------------------
// way-1:
//---------------------------------------------

const singleton1 = {
    //....
};

//---------------------------------------------


//---------------------------------------------
// way-2:  self-executable function
//---------------------------------------------


const singleton2s = (function () {
    //...
    let pri = 1;
    let priFunc = function () { }

    return {
        pub: 1,
        pubFunc: function () {
            //
        }
    }

})();




//---------------------------------------------
// way-3:  loading an object by modules
//---------------------------------------------

let o1 = require('./mod');

let o2 = require('./mod');

// console.log(o1 === o2); // true  




//---------------------------------------------
// way-4
//---------------------------------------------


class Boss {
    constructor() {
        if (Boss.intance) return Boss.intance
        else {
            Boss.intance = this;
            return this
        };
    }
    // static getInstance() {
    //     if (Boss.intance)
    //         return Boss.intance;
    //     else
    //         Boss.intance = new Boss();
    //     return Boss.intance;
    // }
}


const boss = new Boss();

const ref1 = new Boss()
const ref2 = new Boss();

console.log(ref1 === ref2);
console.log(ref1 === boss);

