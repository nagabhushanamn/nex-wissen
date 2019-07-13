import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { BrowserModule, By } from '@angular/platform-browser';

import { CustomerFormComponent } from './customer-form.component';

import { FormsModule, ReactiveFormsModule } from '@angular/forms'

describe('CustomerFormComponent', () => {
  let component: CustomerFormComponent;
  let fixture: ComponentFixture<CustomerFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [CustomerFormComponent],
      imports: [
        ReactiveFormsModule
      ]
    })
      .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CustomerFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should not submitted by default', () => {
    fixture = TestBed.createComponent(CustomerFormComponent);
    const customerFormComponent = fixture.debugElement.componentInstance;
    expect(customerFormComponent.submitted).toBeFalsy()
  });

  it('should be true', () => {
    fixture = TestBed.createComponent(CustomerFormComponent);
    const customerFormComponent = fixture.debugElement.componentInstance;
    customerFormComponent.handleSubmit()
    expect(customerFormComponent.submitted).toBeTruthy()
  });


  it('should be after form submit', async(() => {
    // fixture.detectChanges();
    fixture = TestBed.createComponent(CustomerFormComponent);
    const customerFormComponent = fixture.debugElement.componentInstance;
    spyOn(customerFormComponent, "handleSubmit")
    let button = fixture.debugElement.nativeElement.querySelector('.btn');
    // button.click();
    const clickEvent = new MouseEvent('click');
    // button.dispatchEvent(clickEvent);
    let promise = fixture.whenStable()
    promise.then(() => {
      expect(customerFormComponent.handleSubmit).toHaveBeenCalledTimes(1)
    })
  }));


  it('shoud true after form fill...', () => {
    fixture = TestBed.createComponent(CustomerFormComponent);
    const customerFormComponent = fixture.debugElement.componentInstance;
    customerFormComponent.customerForm.controls['name'].setValue('Nag')
    customerFormComponent.customerForm.controls['email'].setValue('Nag@mail.com')
    customerFormComponent.customerForm.controls['text'].setValue('bla bla')
    let isValid = customerFormComponent.customerForm.valid
    expect(isValid).toBeTruthy()
  });

  it('shoud false after form fill invalid data', () => {
    fixture = TestBed.createComponent(CustomerFormComponent);
    const customerFormComponent = fixture.debugElement.componentInstance;
    customerFormComponent.customerForm.controls['name'].setValue('Nag')
    customerFormComponent.customerForm.controls['email'].setValue('Nag')
    customerFormComponent.customerForm.controls['text'].setValue('bla bla')
    let isValid = customerFormComponent.customerForm.valid
    expect(isValid).toBeFalsy()
  });

});
