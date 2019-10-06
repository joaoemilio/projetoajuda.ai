import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NewReplyDialogComponent } from './new-reply-dialog.component';

describe('NewReplyDialogComponent', () => {
  let component: NewReplyDialogComponent;
  let fixture: ComponentFixture<NewReplyDialogComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NewReplyDialogComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NewReplyDialogComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
