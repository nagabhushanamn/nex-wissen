import { Component, OnInit, ViewChild, ElementRef, ViewChildren, QueryList, ContentChild } from '@angular/core';
import { Todo } from '../todo.model';
import { TodoComponent } from '../todo/todo.component';

@Component({
  selector: 'app-todo-app',
  templateUrl: './todo-app.component.html',
  styleUrls: ['./todo-app.component.css']
})
export class TodoAppComponent implements OnInit {

  todo: Todo = new Todo('item-1')

  constructor() { }

  //@ViewChild(TodoComponent) todoViewChild: TodoComponent
  @ContentChild(TodoComponent) todoContentChild: TodoComponent;

  @ViewChildren(TodoComponent) todoViewChildren: QueryList<TodoComponent>;
  @ViewChild("header") headerEl: ElementRef;



  ngOnInit() {
    console.log('TodoApp :: ngOnInit()')
    /*
    setTimeout(() => {
      this.todo = new Todo('item-one') // immutable
      //this.todo.completed = true // mutable
      setTimeout(() => {
        this.todo = null;
      }, 3000)
    }, 3000)
    */
  }

  ngAfterViewInit() {
    console.log('TodoApp :: ngAfterViewInit() ')
    console.dir(this.todoViewChildren)
    console.dir(this.headerEl)
    if (this.todoViewChildren.length === 1)
      this.headerEl.nativeElement.textContent = "Todo"

  }

  ngAfterContentInit() {
    console.log('TodoApp :: ngAfterContentInit() ')
    console.log(this.todoContentChild)
  }
}
