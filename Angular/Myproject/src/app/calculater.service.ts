import { Injectable } from '@angular/core';

@Injectable()
export class CalculaterService {
  
  getAdd(a : number, b:number){
    return a + b;
  }
  getSub(a : number, b:number){
    return a - b;
  }
  getMulti(a : number, b:number){
    return a * b;
  }
}
