import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms'

import { AppComponent } from './app.component';
import { ActionBoxComponent } from './action-box/action-box.component';
import { ActionComponent } from './action/action.component';
import { SummaryComponent } from './summary/summary.component';
import { UserFormComponent } from './user-form/user-form.component';

@NgModule({
  declarations: [
    AppComponent,
    ActionBoxComponent,
    ActionComponent,
    SummaryComponent,
    UserFormComponent
  ],
  imports: [
    BrowserModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
