

import 'bootstrap/dist/css/bootstrap.css';

import { ReplaySubject } from 'rxjs'



//---------------------------------------------------
// trainer module
//---------------------------------------------------
let stream = new ReplaySubject();

let trainer = {
    getSingleSubject() {
        //...
        return "sub-1";
    },
    getMultipleSubjects() {
        //..
        let subjects = {
            [Symbol.iterator]: function () {
                let idx = 0;
                return {
                    next: function () {
                        idx++;
                        let value = idx <= 5 ? "sub-" + idx : undefined
                        let done = idx <= 5 ? false : true
                        return { value, done }
                    }
                }
            }
        }
        return subjects;
    },
    getSingleSubjectAsync() {
        let promise = new Promise((resolve, reject) => {
            setTimeout(() => {
                let sub = "sub-1";
                resolve(sub); // push 
            }, 5000)
        });
        return promise;
    },
    getMultipleSubjectsAsync() {
        let idx = 0;
        let interval = setInterval(() => {
            idx++;
            let value = "sub-" + idx
            stream.next(value)
            if (idx === 5) { clearInterval(interval); stream.complete() }
        }, 2000)
        return stream;
    }
}

//---------------------------------------------------
// emloyee module
//---------------------------------------------------
let employee = {
    doLearnAndWork: function () {

        //#1
        //let sub = trainer.getSingleSubject();  // pull / sync / blocking...
        // console.log('Learning ' + sub + " and Working...")

        //#2
        // let subs = trainer.getMultipleSubjects();
        // for (let sub of subs) {    // pull / sync / blocking
        //     console.log('Learning ' + sub)
        // }
        // console.log("and Working...");


        //#3
        // let promise = trainer.getSingleSubjectAsync(); // Async / Non-blocking
        // promise
        //     .then(subject => console.log("Learning " + subject + " and working.."))
        // console.log("cont.. with other work...")


        //#4
        let stream = trainer.getMultipleSubjectsAsync()
        stream
            .subscribe(
                subject => console.log("Emp => Learning " + subject + " and working.."),
                error => console.log('ooops ' + error),
                () => console.log("thanks for subjects..")
            )


    }
}
//---------------------------------------------------

employee.doLearnAndWork();


//---------------------------------------------------
// New Employee
//---------------------------------------------------
setTimeout(() => {

    trainer.getMultipleSubjectsAsync()
        .subscribe(
            subject => console.log("New Emp => Learning " + subject + " and working.."),
            error => console.log('ooops ' + error),
            () => console.log("thanks for subjects..")
        )
}, 5000)