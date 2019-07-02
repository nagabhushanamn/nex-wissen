
"use strict"

console.log("-scopes-");

/*

    ------------------------------------------------------------------
    scope / execution-context
    ------------------------------------------------------------------

    memory/stack-frame which contains arg & local variables
    to execure set of instructions

    phase-1: creation/push
    ----------------------
    
    imp-note:

    =>  variable declared with 'var' keyword any-where in that scope, 
        always get hoisted with default value ( undefined )

    phase-2: execution/pop
    ----------------------

    => instructions will execute in seq.


    -------------------------------------------------
    ==>every javascript has one global-scope default 
    -------------------------------------------------
    ==> every function invocation alos create new-scope,
        which is child of in-which scope that function has declared/created
    -------------------------------------------------

*/

// -------------------------------------------------
// Quiz-1
// -------------------------------------------------

console.log(v)
var v = 12;

// -------------------------------------------------

// -------------------------------------------------
//Quiz-2
// -------------------------------------------------

var v = 12;
function f1() {
    console.log(v)
    var v = 13;
}
f1(); // f1-scope <== global-scope

// -------------------------------------------------


// -------------------------------------------------
//Quiz-4
// -------------------------------------------------

var v = 12;
function f1() {
    function f2() {
        console.log(v)
    }
    f2();
    var v = 13;
}
f1();

// -------------------------------------------------

// -------------------------------------------------
// Quiz-5
// -------------------------------------------------

var v = 12;
var v = 13;


// -------------------------------------------------
// Quiz-6
// -------------------------------------------------

var v = 12;
if (true) {
    var v = 13; // No block-scope
}
console.log(v)


// -------------------------------------------------
// problems 'var' keyword :
// -------------------------------------------------

/*
 
    => always get hoist
    => can re-declare same variable whithin scope
    => No block-scope 
 
    Soln:
    
    => use 'let' & 'const' keywords ( from es6 )

*/

// -------------------------------------------------

console.log(v) // reference-error
let v = 12;

// -------------------------------------------------

let v = 12;
let v = 13;      // syntax-error

// -------------------------------------------------

var v = 12;
if (true) {
    let v = 13;  // block-scoped
}
console.log(v)

// -------------------------------------------------

const v = 12;
v = 13           // error

// -------------------------------------------------
// Quiz-7
// -------------------------------------------------

const trainer = {
    name: 'Nag'
}
trainer.name = "New Tnr"
trainer = null; // error

// -------------------------------------------------


// -------------------------------------------------

// summary :
/*
    ==> use 'let' keyword, for mutable reference variable
    ==> use 'const' keyword, for immutable reference variables

    ==> try to avoid 'var' keyword, for better code
*/

// -------------------------------------------------
// Quiz-8
// -------------------------------------------------

function func() {
    i = 100; // error in strict-mode, but non-strict-mode which id implicit global
}
func();

console.log(i);


// ----------------------------------------------------------------

