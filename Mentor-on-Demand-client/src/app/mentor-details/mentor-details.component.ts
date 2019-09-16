import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { MentorService } from '../Mentor.service';
import { Mentor } from '../Mentor';



@Component({
  selector: 'app-mentor-details',
  templateUrl: './mentor-details.component.html',
  styleUrls: ['./mentor-details.component.css']
})
export class MentorDetailsComponent implements OnInit {
 
  mentor_id:number;
  mentor:Mentor[];
 
  constructor(private router: Router, private mentorService: MentorService) { }

  ngOnInit() {
    let mentor_id=localStorage.getItem("mentor_id");
    this.mentor_id = parseInt(mentor_id);
   console.log(mentor_id);
   this.mentorService.getMentorById(this.mentor_id).subscribe(
    async res => {
      this.mentor = await res;
    }, error => console.log(error)
  )
  }
}