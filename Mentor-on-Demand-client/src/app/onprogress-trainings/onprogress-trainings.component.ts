import { Component, OnInit } from '@angular/core';
import { MentorService } from '../Mentor.service';
import { Trainings } from '../Trainings';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-onprogress-trainings',
  templateUrl: './onprogress-trainings.component.html',
  styleUrls: ['./onprogress-trainings.component.css']
})
export class OnprogressTrainingsComponent implements OnInit {

  onProgressTrainings: Observable<Trainings[]>;
 mentor_id:number;
  constructor(private mentorservice: MentorService) { }
 

  ngOnInit() {
    
    let mentor_id=localStorage.getItem("mentor_id");
    this.mentor_id = parseInt(mentor_id);
    console.log(mentor_id);
    this.onProgressTrainings = this.mentorservice.getOnProgressTrainings(this.mentor_id);
  }

  

}
