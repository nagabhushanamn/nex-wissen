


let menu = {
    getBirnaiSync(price?) {
        //....
        if (price === 120)
            return "biryani"
        else
            return "Nil"
    },
    getBirnaiAsync(price?) {
        let promise = new Promise((resolve, reject) => {
            setTimeout(() => {
                if (price === 120)
                    resolve("biryani")
            }, 1000)
        })
        return promise;
    }
}

export { menu }