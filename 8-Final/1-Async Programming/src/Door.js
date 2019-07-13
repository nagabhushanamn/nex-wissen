
/*
class Door {
    constructor(number) {
        this.number = number;
        this.listeners = []
    }
    addDoorListener(listener) {
        this.listeners.push(listener)
    }
    open() {
        console.log("door opened...");
        this.listeners.forEach(listener => listener.on(this.number))
    }
    close() {
        console.log("door closed...");
        this.listeners.forEach(listener => listener.off(this.number))
    }
}

*/

class Door {
    constructor(number, stream) {
        this.number = number;
        this.stream = stream;
    }
    open() {
        console.log("door opened...");
        this.stream.next({ type: 'open', doorNumber: this.number })
    }
    close() {
        console.log("door closed...");
        this.stream.next({ type: 'close', doorNumber: this.number })
    }
}

export default Door;