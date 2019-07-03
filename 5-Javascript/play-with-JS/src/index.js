
// (function (exports, require, module, __filename, __dirname) {

// import primaryItem, { softDrink1,softDrink2 } from './hotel/menu'
// import primaryItem, { softDrink1 as drink1, softDrink2 as drink2 } from './hotel/menu'

// import * as items from './hotel/menu'
// or
let items=require('./hotel/menu');
let greetMod = require('nex-greet')
var _ = require('lodash');
// var config=require('./config')

import config from './config'

console.log('-index.js-')

greetMod.greet('en')

let arr1 = [1, 2, 3, 4]
let arr2 = [3, 4]
let diff = _.difference(arr1, arr2);
console.log(diff);

console.log(items.default);
console.log(items.softDrink1);  

console.log(config)

// });