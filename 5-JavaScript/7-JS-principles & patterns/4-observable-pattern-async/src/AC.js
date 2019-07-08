

import doorStream from './door-stream';

const AC = {
    init() {
        doorStream.subscribe(
            event => {
                if (event.type === "open") console.log(`AC ON >> in door-num :${event.num}`);
                if (event.type === "close") console.log(`AC OFF >> in door-num :${event.num}`);
            }
        );
    }
};

export default AC;