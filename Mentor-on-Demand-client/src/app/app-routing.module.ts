import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { MentorLoginComponent } from './mentor-login/mentor-login.component';
import { UserLoginComponent } from './user-login/user-login.component';
import { IndexComponent } from './index/index.component';
import { UserDetailsComponent } from './user-details/user-details.component';
import { MentorDetailsComponent } from './mentor-details/mentor-details.component';
import { AdminDetailsComponent } from './admin-details/admin-details.component';
import { CompletedTrainingsComponent } from './completed-trainings/completed-trainings.component';
import { OnprogressTrainingsComponent } from './onprogress-trainings/onprogress-trainings.component';
import { MentorProposalsComponent } from './mentor-proposals/mentor-proposals.component';
import { SearchMentorComponent } from './search-mentor/search-mentor.component';
import { UserSignupComponent } from './user-signup/user-signup.component';
import { MentorSignupComponent } from './mentor-signup/mentor-signup.component';
import { ViewResponseComponent } from './view-response/view-response.component';
import { UsercompletedTrainingsComponent } from './usercompleted-trainings/usercompleted-trainings.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { ManageuserComponent } from './manageuser/manageuser.component';
import { ManagementorComponent } from './managementor/managementor.component';

const routes: Routes = [
   { path: '',redirectTo :'index',pathMatch:'full'},
   { path: 'index', component: IndexComponent },
   { path: 'mentor-login',  component: MentorLoginComponent },
   { path: 'user-details',  component: UserDetailsComponent },
   { path: 'admin-details',  component: AdminDetailsComponent },
    {path:'user-login',component:UserLoginComponent},
   { path: 'mentor-proposals',  component: MentorProposalsComponent},
   {path: 'completed-trainings',  component: CompletedTrainingsComponent }, 
   { path: 'onprogress-trainings',  component: OnprogressTrainingsComponent},
   { path: 'search-mentor',  component: SearchMentorComponent},
   { path: 'user-signup',  component: UserSignupComponent},
   { path: 'mentor-signup',  component: MentorSignupComponent},
   { path: 'mentor-details',  component: MentorDetailsComponent},  
   { path: 'view-response', component: ViewResponseComponent},
   {path: 'usercompleted-trainings', component: UsercompletedTrainingsComponent},
   { path: 'admin-login', component: AdminLoginComponent},
   {path: 'admin-details',component:AdminDetailsComponent},
   {path: 'manageuser',component:ManageuserComponent },
   {path:'managementor',component:ManagementorComponent},
   
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],

  exports: [RouterModule]
})

export class AppRoutingModule { }

