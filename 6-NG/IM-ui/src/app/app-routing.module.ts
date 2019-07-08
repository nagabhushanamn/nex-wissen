import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { ItemListComponent } from './item-list/item-list.component';
import { ItemsResolverService } from './items-resolver.service';
import { FooResolverService } from './foo-resolver.service';
import { ItemFormComponent } from './item-form/item-form.component';
import { AuthAndRoleService } from './auth-and-role.service';
import { LoginComponent } from './login/login.component';
import { FormStatusCheckService } from './form-status-check.service';
import { EditGuardService } from './edit-guard.service';
import { ItemViewComponent } from './item-view/item-view.component';
import { ItemResolverService } from './item-resolver.service';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'login', component: LoginComponent },
  {
    path: 'new',
    component: ItemFormComponent,
    canActivate: [AuthAndRoleService],
    canDeactivate: [FormStatusCheckService]
  },
  {
    path: 'all',
    component: ItemListComponent,
    resolve: {
      items: ItemsResolverService,
      foo: FooResolverService
    },
    canActivateChild: [EditGuardService],
    children: [
      {
        path: 'edit/:itemId',
        component: ItemFormComponent,
      },
      {
        path: 'view/:itemId',
        component: ItemViewComponent,
        resolve: {
          item: ItemResolverService
        }
      },
    ]
    // data: {
    //   param1: "value-1",
    //   param2: "value-2"
    // }
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes, { enableTracing: false, })],
  exports: [RouterModule]
})
export class AppRoutingModule { }
