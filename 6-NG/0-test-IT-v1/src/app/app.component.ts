import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'test-IT-v1';
  question = {
    title: 'what is NG?',
    isAnswered: true,
    options: [
      "non-ui framework",
      "ui framework",
      "compoment based ui framework",
      "mvc based ui framework",
    ]
  }
}
