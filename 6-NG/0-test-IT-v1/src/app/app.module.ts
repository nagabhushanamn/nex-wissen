import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { NavComponent } from './nav/nav.component';
import { LevelOneTestComponent } from './level-one-test/level-one-test.component';
import { LevelTwoTestComponent } from './level-two-test/level-two-test.component';
import { LevelThreeTestComponent } from './level-three-test/level-three-test.component';
import { DashboardComponent } from './dashboard/dashboard.component';

const routes: Routes = [
  { path: '', component: DashboardComponent },
  { path: 'level-1', component: LevelOneTestComponent },
  { path: 'level-2', component: LevelTwoTestComponent },
  { path: 'level-3', component: LevelThreeTestComponent },
]

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    NavComponent,
    DashboardComponent,
    LevelOneTestComponent,
    LevelTwoTestComponent,
    LevelThreeTestComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
