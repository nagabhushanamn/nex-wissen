
/*

    => single responsibility
    => open for e xtension , closed for modification

*/

class Door {
    constructor(num) {
        this.num = num;
        this.listeners = [];
    }
    open() {
        console.log("door opened...");
        let event = { num: this.num, type: 'open' };
        this.listeners.forEach(listener => listener.on(event))
    }
    close() {
        console.log("door closed..");
        let event = { num: this.num, type: 'close' };
        this.listeners.forEach(listener => listener.off(event))
    }
    addDoorListener(listener) {
        this.listeners.push(listener)
    }
    removeListener(listener) {
        this.listeners = this.listeners.filter(l => l !== listener)
    }
}

export default Door;