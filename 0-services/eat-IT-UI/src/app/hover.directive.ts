import { Directive, ElementRef, Renderer } from '@angular/core';

@Directive({
  selector: '[appHover]'
})
export class HoverDirective {

  constructor(private el: ElementRef,
    private renderer: Renderer) {

    // renderer.setElementStyle(el.nativeElement, 'backgroundColor', 'gray');
    el.nativeElement.addEventListener('mouseenter', (e: any) => {
      this.el.nativeElement.style.cursor = "pointer"
    })
  }

}
