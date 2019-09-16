import { Component, OnInit } from '@angular/core';
import { User } from '../User';
import { Router } from '@angular/router';
import { MentorService } from '../Mentor.service';

@Component({
  selector: 'app-user-login',
  templateUrl: './user-login.component.html',
  styleUrls: ['./user-login.component.css']
})
export class UserLoginComponent implements OnInit {

  email: String;
  password: String;
  invalidLogin: boolean = false;
  user: User[];
  
  constructor(private router: Router, private mentorService: MentorService) { }

  ngOnInit() {
    this.mentorService.getUserCredentials().subscribe(response => this.user = response, error => alert(`${error.message}\nWaiting for response from server`));
 

  }
checkLogin() {
  //console.log(this.email);
  for (let i = 0; i < this.user.length; i++) {
    //console.log(this.email);
    if (this.user[i].email === this.email && this.user[i].password === this.password) {
      console.log("hhh");
      this.router.navigate(['user-details']);
      this.invalidLogin = false;
      localStorage.setItem("user_id", this.user[i].user_id.toString());
      
    } else {
      this.invalidLogin = true;
    }
  }

}

onSubmit() {
  console.log(this.email);
  this.checkLogin();
  
}


}
