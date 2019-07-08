
// import Account from '../model/Account';
const Account = require('../model/Account')

class SQLAccountRepository {

    constructor() {
        console.log("SQLAccountRepository instance cteated..");
    }

    loadAccount(num) {
        //...
        console.log("loading account " + num);
        return new Account(num, 1000.00)
    }
    updateAccount(account) {
        //..
        console.log("updating account " + account.num);
    }
}

// export default SQLAccountRepository;
module.exports = SQLAccountRepository