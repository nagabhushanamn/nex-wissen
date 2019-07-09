import { Component, OnInit, Input, ChangeDetectionStrategy } from '@angular/core';
import { Todo } from '../todo.model';

@Component({
  selector: 'app-todo',
  templateUrl: './todo.component.html',
  styleUrls: ['./todo.component.css'],
  changeDetection: ChangeDetectionStrategy.OnPush
})
export class TodoComponent {

  @Input("value") todo;

  /*
  constructor() {
    console.log('TodoComponent :: constructor ' + this.todo)
  }
  ngOnChanges(changes) {
    console.log('TodoComponent :: ngOnChanges ' + this.todo)
    console.dir(changes)
  }
  ngOnInit() {
    console.log('TodoComponent :: ngOnInit ' + this.todo)
  }
  ngDoCheck() {
    console.log('TodoComponent :: ngDoCheck ')
  }
  ngOnDestroy() {
    console.log('TodoComponent :: ngOnDestroy ')
  }
  */

}
