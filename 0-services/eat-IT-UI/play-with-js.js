



let prevCart = {
    "1": { qty: 1 },
    "2": { qty: 3 }
}

let id=2
let line = { qty: 4 } 

let newCart = { ...prevCart,[id]:line }