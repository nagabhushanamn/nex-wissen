


class Request {
    constructor() {
        this.url = '';
        this.method = 'GET';
        this.payload = {};
    }
}


class RequestBuilder {

    constructor() {
        //this.request = new Request();
    }

    create() {
        this.request = new Request();
        return this;
    }

    // Algorithm
    forUrl(url) {
        this.request.url = url;
        return this;
    }
    useMethod(method) {
        this.request.method = method;
        return this;
    }

    payload(payload) {
        this.request.payload = payload;
        return this;
    }
    
    build() {
        return this.request;
    }

}

export default RequestBuilder;