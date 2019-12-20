import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SerachByCatgComponent } from './serach-by-catg.component';

describe('SerachByCatgComponent', () => {
  let component: SerachByCatgComponent;
  let fixture: ComponentFixture<SerachByCatgComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SerachByCatgComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SerachByCatgComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
