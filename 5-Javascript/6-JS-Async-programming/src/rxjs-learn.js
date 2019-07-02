

import { Observable, Subject, ReplaySubject, BehaviorSubject, fromEvent } from 'rxjs';
import { pipe, filter, map, debounceTime, } from 'rxjs/operators';

/*
// step-1 : create Observable stream
//-----------------------------------------------------
const xtTrainingStream = new Subject();
//-----------------------------------------------------


// Trainer-module
//-----------------------------------------------------
let topics = ['javascript', 'react', 'redux', 'node.js', 'devops'];

let i = 0;
let interval = setInterval(() => {
    if (i < topics.length) {
        let topic = topics[i]
        if (topic !== "unknown") {
            xtTrainingStream.next(topic)  // propagate change
            console.log("TRAINER => propagated data change into stream");
        } else {
            xtTrainingStream.error('topic error')
        }
    } else {
        //
    }
    i++;
    if (i === topics.length) {
        xtTrainingStream.complete();
        clearInterval(interval)
    }
}, 1000);


//-----------------------------------------------------



// Noida-Participant-module
//-----------------------------------------------------

xtTrainingStream
    .pipe(map(topic => topic.toUpperCase()))
    .subscribe(
        topic => console.log("NOIDA => learning the topic " + topic),
        error => console.log("NOIDA => handling error : " + error),
        complete => console.log("NOIDA => thanks for session...")
    )

//-----------------------------------------------------




// Gurgaon-Participant-module
//-----------------------------------------------------

xtTrainingStream
    .pipe(filter(topic => topic !== "javascript"))
    .subscribe(
        topic => console.log("GURGAON => learning the topic " + topic),
        error => console.log("GURGAON => handling error : " + error),
        complete => console.log("GURGAON => thanks for session...")
    )

//-----------------------------------------------------

*/


///----------------------------------------------------
// Types of Stream
///----------------------------------------------------


// Uni-cast


let sub;
let i = 0;
let stream = Observable.create(subscriber => {

    console.log("int....");
    sub = subscriber;
    i = 1;
    subscriber.next(i)
    i = 2;
    subscriber.next(2)
    i = 3
    subscriber.next(i)

    setTimeout(() => {
        i = 4;
        subscriber.next(i)
    }, 2000)

    // subscriber.error("oops")
    // subscriber.complete();
    



});



//
console.log("before subscribe..");
stream.subscribe(
    next => console.log("Sub1 : Next - " + next)
);
console.log("after subscribe..");




console.log("before subscribe..");
let unsubscribe=stream.subscribe(
    next => console.log("Sub2 : Next - " + next)
);
console.log("after subscribe..")

unsubscribe();



// multi-cast stream

/*
let stream = new Subject()

let i = 0;
setInterval(() => {
    i++
    stream.next(i)
}, 1000);


console.log("before subscribe..");
stream.subscribe(
    next => console.log("Sub1 : Next - " + next)
);
console.log("after subscribe..")


setTimeout(() => {

    console.log("before subscribe..");
    stream.subscribe(
        next => console.log("Sub2 : Next - " + next)
    );
    console.log("after subscribe..")

}, 3000)

*/

/*

let emailField = document.getElementById('email')
let emailStream = fromEvent(emailField, "input")

emailStream
    .pipe(debounceTime(2000))
    .subscribe(e => {
        console.log(e.target.value);
    })

*/