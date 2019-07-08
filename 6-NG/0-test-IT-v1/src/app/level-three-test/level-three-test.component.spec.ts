import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LevelThreeTestComponent } from './level-three-test.component';

describe('LevelThreeTestComponent', () => {
  let component: LevelThreeTestComponent;
  let fixture: ComponentFixture<LevelThreeTestComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LevelThreeTestComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LevelThreeTestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
