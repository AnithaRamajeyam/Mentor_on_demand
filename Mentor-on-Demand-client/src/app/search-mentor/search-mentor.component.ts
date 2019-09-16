import { Component, OnInit } from '@angular/core';
import { MentorService } from '../Mentor.service';
import { Mentor } from '../Mentor';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-search-mentor',
  templateUrl: './search-mentor.component.html',
  styleUrls: ['./search-mentor.component.css']
})
export class SearchMentorComponent implements OnInit {

  skill_name:String;
  mentors:Mentor[];
  constructor(private dataService: MentorService) { }

  ngOnInit() {
    this.skill_name=null;
  }

  private searchSkill()
  {
    this.dataService.getMentorBySkill(this.skill_name)
    .subscribe(mentors => this.mentors = mentors);
    console.log(this.mentors);
    
  }
  

  propose(mentor)
  {
    console.log("inside")
    console.log(mentor)
    this.dataService.getProposals(mentor).subscribe(
      data=>
      {
        console.log(data);
      }
    )
  }

  onSubmit() {
    this.searchSkill();
  }

}
