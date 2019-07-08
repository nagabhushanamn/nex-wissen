


// (function (exports, require, module, __filename, __dirname) {

console.log('-index.js-')

const greetMod = require('sapient-greet') // ./node_modules  ==> ../node_modules/ ../../node_modules
greetMod.wish('en')
greetMod.wish('es')
//

let arr1 = [1, 2, 3];
let arr2 = [3, 4, 5];

//const lodash = require('lodash')
import lodash from 'lodash'
console.log(lodash.difference(arr1, arr2));

// require('./hotel/menu')
// or

// import primaryItem,{item1,item2} from './hotel/menu'
// console.log(primaryItem)
// console.log(item1)
// console.log(item2)


// import primaryItem,{item1 as veg,item2 as nveg} from './hotel/menu'
// console.log(primaryItem)
// console.log(veg)
// console.log(nveg)


import primaryItem, * as items from './hotel/menu'
console.log(primaryItem)
console.log(items.item1)
console.log(items.item2)

items.item1 = null; // error , cant mutate reference
items.item1.price = 50;


import List, { ListTheme } from './components/List';





// })()
