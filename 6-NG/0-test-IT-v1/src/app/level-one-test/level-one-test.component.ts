import { Component, OnInit } from '@angular/core';
import { QuestionService } from '../question.service';
import { nextContext } from '@angular/core/src/render3';

@Component({
  selector: 'app-level-one-test',
  templateUrl: './level-one-test.component.html',
  styleUrls: ['./level-one-test.component.css']
})
export class LevelOneTestComponent implements OnInit {

  questions = []
  currentQuestion = {}
  nextQ = 0

  constructor(private questionService: QuestionService) { }

  ngOnInit() {
    this.questions = this.questionService.getQuestions();
    this.currentQuestion = this.questions[this.nextQ];
  }
  next() {
    this.nextQ++
    if (this.nextQ !== this.questions.length)
      this.currentQuestion = this.questions[this.nextQ]
  }



}
