import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AdminsinglepageComponent } from './adminsinglepage.component';

describe('AdminsinglepageComponent', () => {
  let component: AdminsinglepageComponent;
  let fixture: ComponentFixture<AdminsinglepageComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AdminsinglepageComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AdminsinglepageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
