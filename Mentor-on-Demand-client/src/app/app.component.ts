import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent {
  
  title = 'Mentor';
  public data:any=[];
  constructor (private router:Router){
    this.saveInLocal("aaa","bbbb");
  }
  saveInLocal(key, val): void {
    window.localStorage.setItem("aa","bbbbbbbbbbbbb");
  }

  getFromLocal(key): void {
    console.log("zzzzzzzzz: "+window.localStorage.getItem("aa"));
   }
}
