
/*

    => single responsibility
    => open for e xtension , closed for modification

*/

import doorStream from './door-stream';


class Door {
    constructor(num) {
        this.num = num;
    }
    open() {
        console.log("door opened...");
        let event = { num: this.num, type: 'open' };
        doorStream.next(event) // push
    }
    close() {
        console.log("door closed..");
        let event = { num: this.num, type: 'close' };
        doorStream.next(event) // push
    }

} 

export default Door;