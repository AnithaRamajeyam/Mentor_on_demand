import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UsercompletedTrainingsComponent } from './usercompleted-trainings.component';

describe('UsercompletedTrainingsComponent', () => {
  let component: UsercompletedTrainingsComponent;
  let fixture: ComponentFixture<UsercompletedTrainingsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UsercompletedTrainingsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UsercompletedTrainingsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
