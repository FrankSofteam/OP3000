import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BouquettvComponent } from './bouquettv.component';

describe('BouquettvComponent', () => {
  let component: BouquettvComponent;
  let fixture: ComponentFixture<BouquettvComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BouquettvComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BouquettvComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
