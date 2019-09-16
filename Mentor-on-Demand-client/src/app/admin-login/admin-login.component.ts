import { Component, OnInit } from '@angular/core';
import { Admin } from '../Admin';
import { Router } from '@angular/router';
import { MentorService } from '../Mentor.service';
@Component({
  selector: 'app-admin-login',
  templateUrl: './admin-login.component.html',
  styleUrls: ['./admin-login.component.css']
})
export class AdminLoginComponent implements OnInit {

  email: String;
  password: String;
  invalidLogin: boolean = false;
  admin: Admin[];
  
  constructor(private router: Router, private mentorService: MentorService) { }

  ngOnInit() {
    //this.mentorService.getAdminCredentials().subscribe(response => this.admin = response, error => alert(`${error.message}\nWaiting for response from server`));
  }
checkLogin() {
  console.log(this.email);
 
   if (this.email === "admin@gmail.com" && this.password === "admin") {
      console.log("hhh");
      this.router.navigate(['admin-details']);
      this.invalidLogin = false;
 
      
  } else {
       this.invalidLogin = true;
    }
  //}

}

onSubmit() {
  // console.log(this.email);
  this.checkLogin();
  
}
}
