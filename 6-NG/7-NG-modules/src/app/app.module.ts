import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {CalendarModule} from 'primeng/calendar';
import {TableModule} from 'primeng/table';
import { ScrollingModule } from '@angular/cdk/scrolling';
import { AdministrationModule } from './administration/administration.module'

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    AdministrationModule,
    BrowserAnimationsModule,
    CalendarModule,
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
