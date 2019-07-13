
import {debounceTime} from 'rxjs/operators'


function init(stream) {
    stream
        .pipe(debounceTime(5000))
        .subscribe(e => {
            if (e.type === "open") on(e.doorNumber)
            if (e.type === "close") off(e.doorNumber)
        })
}

export function on(doorNumber) {
    console.log("AC ON for door : " + doorNumber);
}

export function off(doorNumber) {
    console.log("AC OFF for door : " + doorNumber);
}


export default {
    init,
    on,
    off
}