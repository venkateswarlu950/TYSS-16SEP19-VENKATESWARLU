import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewmanagerrequestComponent } from './viewmanagerrequest.component';

describe('ViewmanagerrequestComponent', () => {
  let component: ViewmanagerrequestComponent;
  let fixture: ComponentFixture<ViewmanagerrequestComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ViewmanagerrequestComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewmanagerrequestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
