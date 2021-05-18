import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { EmployeeComponent } from './employee/employee.component';
import { AddEmployeeComponent } from './add-employee/add-employee.component';
import { LoginComponent } from './login/login.component';
import { LogoutComponent } from './logout/logout.component';
import { AuthGaurdService } from './service/auth-gaurd.service';
import { UpdateEmployeeComponent } from './update-employee/update-employee.component';
import { RegisteruserComponent } from './registeruser/registeruser.component';
import {DiseaseComponent} from './disease/disease.component';
import { DiagnosisComponent } from './diagnosis/diagnosis.component';

const routes: Routes = [
  { path: '', component: EmployeeComponent,canActivate:[AuthGaurdService] },
  { path: 'add', component: AddEmployeeComponent,canActivate:[AuthGaurdService]},
  { path: 'login', component: LoginComponent },
  { path: 'logout', component: LogoutComponent,canActivate:[AuthGaurdService] },
  { path: 'update', component:UpdateEmployeeComponent,canActivate:[AuthGaurdService]},
  { path: 'genuser', component:RegisteruserComponent},
  {path: 'disease', component:DiseaseComponent},
  {path:'diagnosis',component:DiagnosisComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
