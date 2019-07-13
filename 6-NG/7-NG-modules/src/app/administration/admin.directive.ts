import { Directive, ElementRef } from '@angular/core';

@Directive({
  selector: '[appAdmin]'
})
export class AdminDirective {

  constructor(private el: ElementRef) {
    this.el.nativeElement
      .addEventListener('mouseover', e => {
        this.el.nativeElement.style.backgroundColor = "#DEF"
      })
    this.el.nativeElement
      .addEventListener('mouseleave', e => {
        this.el.nativeElement.style.backgroundColor = "#FFF"
      })
  }



}
