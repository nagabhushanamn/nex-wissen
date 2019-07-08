
class Person {
    constructor() {
        if (typeof Person.instance === 'object') {
            return Person.instance;
        }
        Person.instance = this;
        return this;
    }
    static getInstance() {
        return new Person();
    }
}

export default Person;
