import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LevelOneTestComponent } from './level-one-test.component';

describe('LevelOneTestComponent', () => {
  let component: LevelOneTestComponent;
  let fixture: ComponentFixture<LevelOneTestComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LevelOneTestComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LevelOneTestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
