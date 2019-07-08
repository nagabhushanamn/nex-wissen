

import doorStream from './door-stream';

const light = {
    init() {
        doorStream.subscribe(
            event => {
                if (event.type === "open") console.log(`LIGHT ON >> in door-num :${event.num}`);
                if (event.type === "close") console.log(`LIGHT OFF >> in door-num :${event.num}`);
            }
        );
    }
};

export default light; 