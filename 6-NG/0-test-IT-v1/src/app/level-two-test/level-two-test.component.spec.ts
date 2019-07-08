import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LevelTwoTestComponent } from './level-two-test.component';

describe('LevelTwoTestComponent', () => {
  let component: LevelTwoTestComponent;
  let fixture: ComponentFixture<LevelTwoTestComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LevelTwoTestComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LevelTwoTestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
