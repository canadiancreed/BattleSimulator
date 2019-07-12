import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CombatantFormComponent } from './combatant-form.component';

describe('CombatantFormComponent', () => {
  let component: CombatantFormComponent;
  let fixture: ComponentFixture<CombatantFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CombatantFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CombatantFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
