

function getBiryani() {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            resolve('biryani')
        }, 3000)
    })
}

function getBeer() {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            resolve('beer')
        }, 3000)
    })
}


// function eat() {
//     getBiryani()
//         .then(biryani => {
//             let item1 = biryani;
//             getBeer()
//                 .then(beer => {
//                     let item2 = beer;
//                     console.log("party with " + item1 + " & " + item2);
//                 })
//         })
// }

// eat();


function* eat() {
    console.log("start eating...");
    let item1 = yield getBiryani()
    console.log("eat func got biryani => " + item1);
    let item2 = yield getBeer();
    console.log("eat func got beer => " + item2);
    console.log("party with " + item1 + " & " + item2);
}


//-------------------------

let it = eat();
let line = it.next();
line.value.then(biryani => {
    it.next(biryani).value
        .then(beer => {
            var i = it.next(beer)
            console.log(i.done);
        })

})