


// import NEFTTransferService from './service/NEFTTransferService'
const NEFTTransferService = require('./service/NEFTTransferService')
const SQLAccountRepository = require('./repository/SQLAccountRepository')
const NoSQLAccountRepository = require('./repository/NoSQLAccountRepository')

// third-party / container / injector 

//-----------
// Init phase
//-----------

console.log("-------------------------------");
const sqlAccountRepository = new SQLAccountRepository();
const nosqlAccountRepository = new NoSQLAccountRepository();
const txrService = new NEFTTransferService(nosqlAccountRepository);
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