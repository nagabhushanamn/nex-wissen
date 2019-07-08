

import 'bootstrap/dist/css/bootstrap.css'

// import {} from './rxjs-operators'

import Door from './Door';
import light from './light'
import AC from './AC'



let door1 = new Door(301);

light.init();
AC.init();


setTimeout(() => {
    door1.open();
    setTimeout(() => {
        door1.close()
        setTimeout(() => {
            door1.open();
            setTimeout(() => {
                door1.close()
            }, 2000);
        }, 2000)
    }, 2000);
}, 2000)

