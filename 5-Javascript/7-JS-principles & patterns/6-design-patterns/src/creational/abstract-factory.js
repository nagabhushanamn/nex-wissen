

class Idly { }
class Dosa { }

class Biryani { }
class Fish { }

class VegFactory {
    //
    static getFood(item) {
        if (item === "idly") return new Idly()
        if (item === "dosa") return new Dosa()
    }
}

class NonVegFactory {
    static getFood() {
        if (item === "biryani") return new Biryani()
    }
}



class AbstractFoodFactory {
    static getFoodfactory(type) {
        if (type === "veg") {
            return VegFactory
        }
        if (type === 'nveg') {
            return NonVegFactory;
        }
    }
}


export default AbstractFoodFactory;




