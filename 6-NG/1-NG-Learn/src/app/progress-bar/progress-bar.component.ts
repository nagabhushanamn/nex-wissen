import { Component, OnInit, NgZone } from '@angular/core';

@Component({
  selector: 'app-progress-bar',
  templateUrl: './progress-bar.component.html',
  styleUrls: ['./progress-bar.component.css']
})
export class ProgressBarComponent implements OnInit {

  progress1: number = 0; // data
  progress2: number = 0; // data

  constructor(private zone: NgZone) { }

  ngOnInit() {
  }


  processOutsideAngularZone() {
    this.progress2 = 0;
    this.zone.runOutsideAngular(() => {
      this.increaseProgress2(() => {
        this.zone.run(() => console.log('Outside Done!'))
      });
    });
  }
  increaseProgress2(doneCallback: () => void) {
    this.progress2 += 1;
    console.log(`Current progress: ${this.progress2}%`);
    if (this.progress2 % 10 === 0) {
      this.zone.run(() => { console.log('10%') })
    }
    if (this.progress2 < 100) {
      window.setTimeout(() => {
        this.increaseProgress2(doneCallback);
      }, 100);
    } else {
      doneCallback();
    }
  }



  processWithinAngularZone() {
    this.progress1 = 0;
    this.increaseProgress1(() => console.log('Done!'));
  }

  increaseProgress1(doneCallback: () => void) {
    this.progress1 += 1;
    console.log(`Current progress: ${this.progress1}%`);
    if (this.progress1 < 100) {
      window.setTimeout(() => {
        this.increaseProgress1(doneCallback);
      }, 100);
    } else {
      doneCallback();
    }
  }


}
