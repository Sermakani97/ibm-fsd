import { Component, OnInit } from '@angular/core';
import { Router } from "@angular/router";

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  router: any;

  constructor() { }

  ngOnInit() {
  }

  profile(){
    console.log("Hello");
    this.router.navigateByUrl('/home/profile/');
  }
order()
{
console.log("order");
}
rewards()
{

}
notification()
{

}
logout()
{

}
}
