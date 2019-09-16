import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { OnprogressTrainingsComponent } from './onprogress-trainings.component';

describe('OnprogressTrainingsComponent', () => {
  let component: OnprogressTrainingsComponent;
  let fixture: ComponentFixture<OnprogressTrainingsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ OnprogressTrainingsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(OnprogressTrainingsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
