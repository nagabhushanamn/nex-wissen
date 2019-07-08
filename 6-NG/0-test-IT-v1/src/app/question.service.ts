import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class QuestionService {

  constructor() { }

  getQuestions() {
    return [
      {
        num: 1,
        title: 'what is Angular?',
        options: [
          "ui framework",
          "based on MVC arch",
          "based on component arch",
          "none"
        ]
      },
      {
        num: 2,
        title: 'what is React?',
        options: [
          "ui framework",
          "based on MVC arch",
          "based on component arch",
          "none"
        ]
      },
      {
        num: 3,
        title: 'what is Node.js?',
        options: [
          "ui framework",
          "based on MVC arch",
          "based on component arch",
          "none"
        ]
      }

    ]
  }

}
