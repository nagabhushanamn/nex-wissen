

function init(stream) {
    stream
        .subscribe(e => {
            if (e.type === "open") on(e.doorNumber)
            if (e.type === "close") off(e.doorNumber)
        })
}

export function on(doorNumber) {
    console.log("Light ON for door : " + doorNumber);
}

export function off(doorNumber) {
    console.log("Light OFF for door : " + doorNumber);
}


export default {
    init,
    on,
    off
}