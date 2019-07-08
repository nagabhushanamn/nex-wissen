
/*


    factory-pattern
    -----------------

    ==> isolates complex dependency creation logic from dependent

*/


//------------------------------------


class BMW {
    constructor(model, price, maxSpeed) {
        this.model = model;
        this.price = price;
        this.maxSpeed = maxSpeed;
    }
}

class BMWFactory {
    static create(type) {
        if (type === 'X5')
            return new BMW(type, 108000, 300);
        if (type === 'X6')
            return new BMW(type, 111000, 320);
    }
}


export default BMWFactory;
