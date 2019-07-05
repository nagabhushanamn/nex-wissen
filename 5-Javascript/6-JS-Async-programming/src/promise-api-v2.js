



//-----------------------------------------------------
// Hote module
//-----------------------------------------------------

let hotel = {
    getFood: function () {
        let promise = new Promise((resolve, reject) => {
            setTimeout(() => {
                setTimeout(() => {
                    console.log("hotel resolving/rejecting promise..");
                    resolve("BIRYANI")
                    //reject("be a veg..")
                }, 2000);
            }, 3000);
        });
        return promise;
    }
}


//-----------------------------------------------------
// bar module
//-----------------------------------------------------

let bar = {
    getDrink: function () {
        let promise = new Promise((resolve, reject) => {
            setTimeout(() => {
                console.log("bar resolving/rejecting promise..");
                resolve("BEER")
                // reject("harm to health")
            }, 2000);
        });
        return promise;
    }
}

//-----------------------------------------------------
// Person module
//-----------------------------------------------------


let person = {
    doWork: function () {
        console.log("person working....");
        console.log("person feels hungry....");
        console.log("person requesting food....");
        let promise1 = hotel.getFood();
        let promise2 = bar.getDrink();
        console.log("person got promise, defer food actions to future");
        Promise.race([promise1, promise2])
            .then(
                result => {
                    console.log('person yummy with' + result);
                },
                error => console.log('error : ' + error))
        console.log("person cont.. with further work..");
        console.log("person finished work..");
    }
}
person.doWork();