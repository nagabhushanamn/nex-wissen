


// import NEFTTransferService from './service/NEFTTransferService'
const NEFTTransferService = require('./service/NEFTTransferService')

//-----------
// Init phase
//-----------

console.log("-------------------------------");
const txrService = new NEFTTransferService();
console.log("-------------------------------");  

//-----------
// Use
//-----------

console.log("-------------------------------");
txrService.transfer(100.00, "1", "2");
console.log();
txrService.transfer(100.00, "2", "1");
console.log("-------------------------------");


//-----------
// destroy
//-----------

console.log("-------------------------------");
//..
console.log("-------------------------------");