import { PriceDiscountPipe } from './price-discount.pipe';

describe('PriceDiscountPipe', () => {
  it('create an instance', () => {
    const pipe = new PriceDiscountPipe();
    expect(pipe).toBeTruthy();
  });
});
