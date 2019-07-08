


/*


  request/method-call ---> obj-1  --> obj-2 --> obj-2.1  --> obj-3  

  e.g


  http-request    ---> log-filter-1  --> auth-filter --> any-filter --> validation-filter --> end-point 


*/




// ATM



let twoK = {
    next: null,
    nextOne(nextObject) {
        this.next = nextObject;
        return this.next;
    },
    get(amount) {
        if (amount % 2000 === 0) {
            return "2k-currency notes";
        }
        else {
            if (this.next)
                return "2k-currency notes and " + this.next.get(amount)
            else return "Sorry"
        }
    }
}


let fiveH = {
    next: null,
    nextOne(nextObject) {
        this.next = nextObject;
        return this.next;
    },
    get(amount) {
        if (amount % 500 === 0) {
            return "5H -currency notes";
        } else {
            if (this.next)
                return "5H -currency notes and " + this.next.get(amount);
        }
    }
}

let H = {
    next: null,
    nextOne(nextObject) {
        this.next = nextObject;
        return this.next;
    },
    get(amount) {
        if (amount % 100 === 0) {
            return  "Hundred-currency notes";
        }
    }
}


function withdraw(amount) {

        twoK
        .nextOne(fiveH)
        .nextOne(H)

    return twoK.get(amount)

}


export { withdraw }
