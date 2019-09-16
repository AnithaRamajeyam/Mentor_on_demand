import { Component, OnInit } from '@angular/core';
import { User } from '../User';
import { MentorService } from '../Mentor.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-manageuser',
  templateUrl: './manageuser.component.html',
  styleUrls: ['./manageuser.component.css']
})
export class ManageuserComponent implements OnInit {

  users: Observable<User[]>;  
  constructor(private mentorservice: MentorService) { }

  ngOnInit() {
    console.log("inside")
    this.reloadData();
    
    
  }
  reloadData() {
    console.log("assd")
    this.users= this.mentorservice.getAllUser();
    
  }

}
