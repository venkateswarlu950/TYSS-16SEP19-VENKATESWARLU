import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BookRequestComponent } from './book-request.component';

describe('BookRequestComponent', () => {
  let component: BookRequestComponent;
  let fixture: ComponentFixture<BookRequestComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BookRequestComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BookRequestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
