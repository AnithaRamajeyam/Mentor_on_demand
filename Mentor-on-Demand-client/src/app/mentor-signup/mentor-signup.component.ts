import { Component, OnInit } from '@angular/core';
import { Mentor } from '../Mentor';
import { Router } from '@angular/router';
import { MentorService } from '../Mentor.service';

@Component({
  selector: 'app-mentor-signup',
  templateUrl: './mentor-signup.component.html',
  styleUrls: ['./mentor-signup.component.css']
})
export class MentorSignupComponent implements OnInit {

  username: String;
  linkedin_url:String;
  password: String;
  email: String;
  year_of_experience:number;
  reg_code:String;
  reg_datetime:Date;
  active: boolean;
  mentor: Mentor[];
 

  constructor(private router: Router,private mentorService: MentorService) { }

  ngOnInit() {
  }
  
  onSubmit(){
    this.mentorService.registerMentor(new Mentor(this.email,this.password,this.username, this.linkedin_url,this.reg_datetime,this.reg_code,this.active,this.year_of_experience)).subscribe(
      async res => { 
        console.log("asda");
        this.mentor = await res;
        this.router.navigate(['mentor-login'])
       },
      error => console.log(error)
    );
  }


}
