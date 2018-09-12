import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { OffreboxComponent } from './offrebox.component';

describe('OffreboxComponent', () => {
  let component: OffreboxComponent;
  let fixture: ComponentFixture<OffreboxComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ OffreboxComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(OffreboxComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
