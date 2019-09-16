import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { MentorService } from '../Mentor.service';
import { Trainings } from '../Trainings';

@Component({
  selector: 'app-usercompleted-trainings',
  templateUrl: './usercompleted-trainings.component.html',
  styleUrls: ['./usercompleted-trainings.component.css']
})
export class UsercompletedTrainingsComponent implements OnInit {
  usercompletedTrainings: Observable<Trainings[]>;
  user_id:number;
  constructor(private mentorservice: MentorService) { }

  ngOnInit() {
    let user_id=localStorage.getItem("user_id");
    this.user_id = parseInt(user_id);
    console.log(user_id);
    this.usercompletedTrainings = this.mentorservice.getuserCompletedTrainings(this.user_id);
  }

}
