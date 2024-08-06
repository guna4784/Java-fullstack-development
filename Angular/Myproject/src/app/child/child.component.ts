import { Component } from '@angular/core';
import { CalculaterService } from '../calculater.service';


@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrl: './child.component.css'
})
export class ChildComponent {
  sum1 : number;
  sum2 : number;

  constructor(private calc : CalculaterService){
    this.sum1 = calc.getAdd(10,20);
    this.sum2 = calc.getSub(10,20);


   }
}
