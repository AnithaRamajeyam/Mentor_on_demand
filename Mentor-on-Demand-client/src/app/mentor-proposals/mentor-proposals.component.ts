import { Component, OnInit, Input } from '@angular/core';
import { MentorService } from '../Mentor.service';
import { Trainings } from '../Trainings';
import { Observable} from 'rxjs';

@Component({
  selector: 'app-mentor-proposals',
  templateUrl: './mentor-proposals.component.html',
  styleUrls: ['./mentor-proposals.component.css']
})
export class MentorProposalsComponent implements OnInit {

  @Input() trainings: Trainings; 

  proposals : Observable<Trainings[]>;
  mentor_id: number;
  constructor(private mentorservice: MentorService) { }

  ngOnInit() {
    this.reloadData();
  }

  approveProposal(tid:number) {
    console.log(tid)
    this.mentorservice.approveProposal(tid,{status: "approve"})
      .subscribe(
        data => {
          console.log(data);
        },
        error => console.log(error));
  }

  rejectProposal(tid:number) {
    console.log(tid)
    this.mentorservice.rejectProposal(tid,{status:"reject"})
      .subscribe(
        data => {
          console.log(data)
        },
        error => console.log(error));
  }

  reloadData() {
    let mentor_id=localStorage.getItem("mentor_id");
    this.mentor_id = parseInt(mentor_id);
    console.log(mentor_id);
    this.proposals = this.mentorservice.getMentorProposals(this.mentor_id);
   }

}
