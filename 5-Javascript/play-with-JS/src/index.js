
// (function (exports, require, module, __filename, __dirname) {

// import primaryItem, { softDrink1,softDrink2 } from './hotel/menu'
// import primaryItem, { softDrink1 as drink1, softDrink2 as drink2 } from './hotel/menu'

// import * as items from './hotel/menu'
// or
let items = require('./hotel/menu');
let greetMod = require('nex-greet')
var _ = require('lodash');
import config from './config'

// require('bootstrap/dist/css/bootstrap.css')
// or
import 'bootstrap/dist/css/bootstrap.css'
import './css/my-theme.css';


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