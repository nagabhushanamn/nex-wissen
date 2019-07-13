import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { DashboardComponent } from './dashboard/dashboard.component';
import { AdminComponent } from './admin/admin.component';
import { AdminPipe } from './admin.pipe';
import { AdminDirective } from './admin.directive';
import { AdminService } from './admin.service';

@NgModule({
  declarations: [
    DashboardComponent,
    AdminComponent,
    AdminPipe,
    AdminDirective],
  imports: [
    CommonModule
  ],
  // providers:[AdminService],
  exports: [
    DashboardComponent
  ]
})
export class AdministrationModule { }
