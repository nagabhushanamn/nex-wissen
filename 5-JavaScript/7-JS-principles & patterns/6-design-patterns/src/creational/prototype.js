

class Sheep {
    constructor(name, weight) {
        //......
        this.name = name;
        this.weight = weight;
    }
    clone() {
        return new Sheep(this.name, this.weight);
    }
}

export default Sheep;



class Template {
    constructor(header, body, footer) {
        ///
        this.header = header;
        this.body = body;
        this.footer = footer;
    }

    clone(config) {
        //return Object.assign({}, this, config, { clone: this.__proto__.clone })
        return new Template(this.header, this.body, this.footer)
    }

}


export { Template };