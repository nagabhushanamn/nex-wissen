import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms'

import { AppComponent } from './app.component';
import { ActionBoxComponent } from './action-box/action-box.component';
import { ActionComponent } from './action/action.component';
import { SummaryComponent } from './summary/summary.component';
import { UserFormComponent } from './user-form/user-form.component';
import { ProgressBarComponent } from './progress-bar/progress-bar.component';
import { ItemListComponent } from './item-list/item-list.component';
import { ItemComponent } from './item/item.component';
import { CartBadgeComponent } from './cart-badge/cart-badge.component';
import { NavbarComponent } from './navbar/navbar.component';
import { VegComponent } from './veg/veg.component';
import { NonVegComponent } from './non-veg/non-veg.component';
import { BoxComponent } from './box/box.component';
import { TodoAppComponent } from './todo-app/todo-app.component';
import { TodoComponent } from './todo/todo.component';

@NgModule({
  declarations: [
    AppComponent,
    ActionBoxComponent,
    ActionComponent,
    SummaryComponent,
    UserFormComponent,
    ProgressBarComponent,
    ItemListComponent,
    ItemComponent,
    CartBadgeComponent,
    NavbarComponent,
    VegComponent,
    NonVegComponent,
    BoxComponent,
    TodoAppComponent,
    TodoComponent
  ],
  imports: [
    BrowserModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
