import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

   input_field = "";
   array:any = [];

  logtotable(){

      this.array.push(this.input_field);
     
  }
}
