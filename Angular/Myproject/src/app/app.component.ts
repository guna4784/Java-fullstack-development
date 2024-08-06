import { Component } from '@angular/core';
import { CalculaterService } from './calculater.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
//   name : string ;
//   age : number;
//   email : string;
//   textcolor : string;

//   constructor() {
//     this.name = "kabilan";
//     this.age = 21;
//     this.email = "rkabilan@gmail.com";
//     this.textcolor = "green";
//   }

//   getaddition(a : number,b : number)
//   {
//     let sum = a + b;
//     return sum;
//   }

//   changename(){
//     this.name = "Rajagopal"
//   }

//   changeage(){
//     this.age = 51
//   }

//   changemail(){
//     this.email = "kabilan@gmail.com"
//   }
    sum1 : number;
   constructor(private calc : CalculaterService){
    this.sum1 = calc.getAdd(10,20);

   }
}