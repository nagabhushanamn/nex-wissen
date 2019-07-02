
import { Observable, Subject, ReplaySubject, range } from 'rxjs'
import { tap, map, reduce, filter, takeWhile } from 'rxjs/operators'

//----------------------------------
//producer-module
//----------------------------------

let list = {
    [Symbol.iterator]: function () {
        let v = 0;
        return {
            next: function () {
                //console.log("computing v on demand")
                v++;
                return { value: v <= 10 ? v : undefined, done: v <= 10 ? false : true }
            }
        }
    }
}

function getItem() {
    return 1
}

function getItems() {
    return list;
}

function getItemAsync() {
    //..
    return new Promise((resolve, reject) => {
        //
        setTimeout(() => {
            resolve('VEG-LUNCH')  // Push single-item
        }, 3000)
    });
}

function getItemsAsync() {
    let stream = Observable.create(observer => {
        let i = 0;
        // Push multiple-item
        let interval = setInterval(() => {
            i++
            console.log("push new item into stream");
            observer.next(`item-${i}`)
            //if (i === 3) observer.error('i hate 3')
            if (i === 10) {
                observer.complete()
                clearInterval(interval)
            }
        }, 1000)
    })
    return stream;
}


function getItemsAsyncV2() {
    // let stream = new Subject();
    let stream = new ReplaySubject(10);
    let i = 0;
    // Push multiple-item
    let interval = setInterval(() => {
        i++
        console.log("push new item into stream");
        stream.next(`item-${i}`)
        //if (i === 3) stream.error('i hate 3')
        if (i === 10) {
            stream.complete()
            clearInterval(interval)
        }
    }, 1000)

    return stream;
}

//----------------------------------
// consumer-module
//----------------------------------
function doSomething() {

    //let singleItem = getItem();  // Pull single-item
    //console.log(singleItem);

    // let items = getItems();  // pull multiple-items
    // for (let item of items) {
    //     console.log(item);
    // }

    // let promise = getItemAsync();
    // promise.then(
    //     result => console.log('thanks for pushing item : ' + result)
    // )


    // let stream = getItemsAsync();
    let stream = getItemsAsyncV2();
    let subscription = stream
        .pipe(map(item => item.toUpperCase()))
        .subscribe(
            result => console.log('thanks for pushing next item : ' + result),
            error => console.log("oops " + error),
            () => console.log("Thanks for multiple items")
        );

    setTimeout(() => {
        console.log("unsubscribe stream");
        subscription.unsubscribe();
    }, 3000)

    setTimeout(() => {
        console.log("resubscribe stream");
        stream
            .pipe(tap(v => console.log(v)))
            .subscribe(
                result => console.log('thanks for pushing next item : ' + result)
            )
    }, 5000)


}
// doSomething();
//----------------------------------




const stream = range(1, 10)



stream
    //.pipe(filter(n => n % 2 === 0))
    //.pipe(map(n=>n*n))
    //.pipe(takeWhile(n=>n<=16)) 
    .pipe(reduce((acc, next) => {
        console.log(acc);
        console.log(next);
        return acc + next;
    }, 45))
    .subscribe(n => console.log(n))