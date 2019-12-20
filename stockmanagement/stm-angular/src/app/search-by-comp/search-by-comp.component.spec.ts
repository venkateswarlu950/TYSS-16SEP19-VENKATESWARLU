import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SearchByCompComponent } from './search-by-comp.component';

describe('SearchByCompComponent', () => {
  let component: SearchByCompComponent;
  let fixture: ComponentFixture<SearchByCompComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SearchByCompComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SearchByCompComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
