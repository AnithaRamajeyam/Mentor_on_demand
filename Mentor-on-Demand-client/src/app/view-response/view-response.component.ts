import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { MentorService } from '../Mentor.service';
import { Trainings } from '../Trainings';

@Component({
  selector: 'app-view-response',
  templateUrl: './view-response.component.html',
  styleUrls: ['./view-response.component.css']
})
export class ViewResponseComponent implements OnInit {
  Responses: Observable<Trainings[]>;
  user_id:number;
  constructor(private mentorservice: MentorService) { }

  ngOnInit() {
    let user_id=localStorage.getItem("user_id");
    this.user_id = parseInt(user_id);
    console.log(user_id);
    this.Responses = this.mentorservice.getApproveProposals(this.user_id);
  }

}
