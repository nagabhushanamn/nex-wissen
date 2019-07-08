

import 'bootstrap/dist/css/bootstrap.css'

import Door from './Door';
import light from './light'
import AC from './AC'

let door1 = new Door(301);
door1.addDoorListener(light)
door1.addDoorListener(AC)


setTimeout(() => {
    door1.open();
    setTimeout(() => {
       
        door1.close()

        door1.removeListener(AC)

        setTimeout(() => {
            door1.open();
            setTimeout(() => {
                door1.close()
            }, 2000);
        }, 2000)

    }, 2000);
}, 2000)

