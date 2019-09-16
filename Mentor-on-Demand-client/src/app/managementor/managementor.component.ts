import { Component, OnInit } from '@angular/core';
import { Mentor } from '../Mentor';
import { MentorService } from '../Mentor.service';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-managementor',
  templateUrl: './managementor.component.html',
  styleUrls: ['./managementor.component.css']
})
export class ManagementorComponent implements OnInit {

  mentors:Observable<Mentor[]>
  constructor(private mentorservice: MentorService) { }

  ngOnInit() {
    console.log("wee")
    this.mentors= this.mentorservice.getAllMentor();
  }

}
