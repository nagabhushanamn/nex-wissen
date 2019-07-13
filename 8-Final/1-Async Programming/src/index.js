
import 'bootstrap/dist/css/bootstrap.css';

import { Subject } from 'rxjs'

console.log("-index.js-")


let stream = new Subject();


import Door from './Door';
import light from './Light'
import ac from './AC'


let door1 = new Door(4, stream);
light.init(stream)
ac.init(stream)


setTimeout(() => {
    door1.open()
    setTimeout(() => {
        door1.close()
    }, 2000);
}, 2000);