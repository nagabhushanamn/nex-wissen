


import { menu } from './menu';

describe('menu test suite ', () => {

    it("shoud return biryani on valid price", () => {
        let actual = menu.getBirnaiSync(120);
        expect(actual).toEqual("biryani")
    })
    it("shoud not return biryani on invalid price", () => {
        let actual = menu.getBirnaiSync();
        expect(actual).toEqual("Nil")
    })
    it("shoud return biryani on valid price async", (done) => {
        let promise = menu.getBirnaiAsync(120);
        promise
            .then(
                result => {
                    expect(result).toEqual("biryani");
                    done()
                }
            )
    })

})