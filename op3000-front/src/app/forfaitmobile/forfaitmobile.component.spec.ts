import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ForfaitmobileComponent } from './forfaitmobile.component';

describe('ForfaitmobileComponent', () => {
  let component: ForfaitmobileComponent;
  let fixture: ComponentFixture<ForfaitmobileComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ForfaitmobileComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ForfaitmobileComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
