import { Component, OnInit } from '@angular/core';
import { Mentor } from '../Mentor';
import { Router } from '@angular/router';
import { MentorService } from '../Mentor.service';

@Component({
  selector: 'app-mentor-login',
  templateUrl: './mentor-login.component.html',
  styleUrls: ['./mentor-login.component.css']
})
export class MentorLoginComponent implements OnInit {

  email: String;
  password: String;
  invalidLogin: boolean = false;
  mentor: Mentor[];
  
  constructor(private router: Router, private mentorService: MentorService) { }

  ngOnInit() {
    this.mentorService.getMentorCredentials().subscribe(response => this.mentor = response, error => alert(`${error.message}\nWaiting for response from server`));
 

  }
checkLogin() {
  
  for (let i = 0; i < this.mentor.length; i++) {
    
    if (this.mentor[i].email === this.email && this.mentor[i].password === this.password) {
      console.log("hhh");
      this.router.navigate(['mentor-details']);
      this.invalidLogin = false;
      localStorage.setItem("mentor_id", this.mentor[i].mentor_id.toString());
      
    } else {
      this.invalidLogin = true;
    }
  }

}

// checkLogin() {
//     //console.log(this.email);
//     for (let i = 0; i < this.login.length; i++) {
//       //console.log(this.email);
//       if (this.login[i].email === this.email && this.login[i].password === this.password) {
//         console.log("hhh");
//           if(this.login[i].role==="admin")
//           {
//         this.router.navigate(['admin-details']);
//           }
//           if(this.login[i].role === "mentor")
//           {
//             this.router.navigate(['mentor-details']);
//             localStorage.setItem("mentor_id", this.login[i].email.toString());
            
//           }
//           if(this.login[i].role === "user")
//           {
//             this.router.navigate(['user-details']);
//           }
//           this.invalidLogin = false;
//          localStorage.setItem("mentor_id", this.login[i].email.toString());
//         this.dataService.setEmail(this.email);
         
//       } else {
//         this.invalidLogin = true;
//       }
//     }
  
//   } 

onSubmit() {
  console.log(this.email);
  this.checkLogin();
  
}


}
