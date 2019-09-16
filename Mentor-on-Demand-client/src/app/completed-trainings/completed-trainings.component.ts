import { Component, OnInit } from '@angular/core';
import { MentorService } from '../Mentor.service';
import { Trainings } from '../Trainings';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-completed-trainings',
  templateUrl: './completed-trainings.component.html',
  styleUrls: ['./completed-trainings.component.css']
})
export class CompletedTrainingsComponent implements OnInit {
  completedTrainings: Observable<Trainings[]>;
  mentor_id:number;
  constructor(private mentorservice: MentorService) { }

  ngOnInit() {
    let mentor_id=localStorage.getItem("mentor_id");
    this.mentor_id = parseInt(mentor_id);
    console.log(mentor_id);
    this.completedTrainings = this.mentorservice.getCompletedTrainings(this.mentor_id);
  }
  
  
}
// let mentor_id=localStorage.getItem("mentor_id");
//     this.mentor_id = parseInt(mentor_id);
//    console.log(mentor_id);
//    this.mentorService.getMentorById(this.mentor_id).subscribe(
//     async res => {
//       this.mentor = await res;
//     }, error => console.log(error)
//   )
//   }
