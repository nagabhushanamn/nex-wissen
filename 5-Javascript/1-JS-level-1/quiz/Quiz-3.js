

let txns = [
    { id: 3213, amount: 1000.00, type: 'DEBIT' },
    { id: 4342, amount: 2000.00, type: 'CREDIT' },
    { id: 5646, amount: 3000.00, type: 'DEBIT' },
    { id: 6344, amount: 4000.00, type: 'CREDIT' },
    { id: 6344, amount: 4000.00, type: 'CREDIT' },
    { id: 6566, amount: 5000.00, type: 'DEBIT' }
]

// //-----------------------------------------------

let txnLib = {
    filter: function (inp, predicate) {
        for (let i = 0; i < txns.length; i++) {
            let txn = txns[i];
            if (predicate(txn))
                out.push(txn)
        }
        return out;
    }
}


// //-----------------------------------------------
// v1
// //-----------------------------------------------

let txnService = {
    getTxns: function (amount) {
        let out = [];
        //------------------------------------------------
        // way-1: Imperative style  ==> what + How 
        //------------------------------------------------
        // for (let i = 0; i < txns.length; i++) {
        //     let txn = txns[i];
        //     if (txn.amount === amount)
        //         out.push(txn)
        // }
        // return out;
        //------------------------------------------------
        //way-2 : declarative style with function  ==> what
        //txnLib.filter(txns, txn => txn.amount === amount);
        //or 
        return txns.filter(txn => txn.amount === amount)
        //------------------------------------------------

    },
    getTxnsV2: function (minAmount, maxAmount) {
        txnLib.filter(txns, txn => txn.amoun >= minAmount && txn.amount <= maxAmount);
    }
}
//------------------------------------------------

let result = txnService.getTxns(4000)
console.log(result)

//------------------------------------------------




// //-----------------------------------------------
// Quiz
// //-----------------------------------------------


let arr1 = [1, 2, 3]
let arr2 = [3, 4, 5]

// find elements in arr1 which are not in arr2?






