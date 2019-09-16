import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ManagementorComponent } from './managementor.component';

describe('ManagementorComponent', () => {
  let component: ManagementorComponent;
  let fixture: ComponentFixture<ManagementorComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ManagementorComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ManagementorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
