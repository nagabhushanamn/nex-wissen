
// import SQLRepository from '../repository/SQLAccountRepository';
const SQLAccountRepository = require('../repository/SQLAccountRepository')

/*

 design & performance issues
 ---------------------------

 => tight-coupling b/w dependent & dependency
    -> can't extend with new features easily
 => too many duplicate dependency instances are created & discarded
    -> slow, memory & resource use heavy
 => Unit-Testing not possible
    -> dev & bug-fix slow


    why these issues ?

    => dependent itself creating its own dependency..

    Soln : dont'create , get from Factory..

    limitation on factory-lookup

    => location tight-coupling

    Best-Soln : Don't create / lookup on factory , get thru third-party  ( IOC => Inversion Of Control )

    

*/

class NEFTTransferService {

    constructor() {
        console.log("NEFTTransferService instance created..");
    }

    transfer(amount, fromAccNum, toAccNum) {
        console.log("Txr begin..");
        const sqlRepository = new SQLAccountRepository();
        // load account(s)
        const fromAccount = sqlRepository.loadAccount(fromAccNum);
        const toAccount = sqlRepository.loadAccount(toAccNum);
        // debit & credit
        fromAccount.balance -= amount;
        toAccount.balance += amount;
        // update accounts
        sqlRepository.updateAccount(fromAccount)
        sqlRepository.updateAccount(toAccount)
        console.log("Txr success..");
    }
}

// export default NEFTTransferService;
module.exports = NEFTTransferService