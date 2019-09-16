import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { MentorService } from '../Mentor.service';
import { User } from '../User';
import { UserService } from '../user.service';

@Component({
  selector: 'app-user-signup',
  templateUrl: './user-signup.component.html',
  styleUrls: ['./user-signup.component.css']
})
export class UserSignupComponent implements OnInit {

  first_name: String;
  last_name: String;
  password: String;
  email: String;
  contact_no: String;
  reg_code:String;
  reg_date:Date;
  active: boolean;
  user: User[];
 

  constructor(private router: Router,private mentorService: MentorService) { }

  ngOnInit() {
  }
  onSubmit(){
    this.mentorService.registerUser(new User(this.email,this.password,this.first_name, this.last_name, this.contact_no, this.active,this.reg_code,this.reg_date)).subscribe(
      async res => { 
        console.log("asda");
        this.user = await res;
        this.router.navigate(['user-login'])
       },
      error => console.log(error)
    );
  }

}
