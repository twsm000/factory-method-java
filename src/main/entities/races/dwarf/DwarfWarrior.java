package src.main.entities.races.dwarf;

import src.main.entities.Weapon;
import src.main.entities.handedweapon.axes.ShortAxe;

public class DwarfWarrior extends Dwarf {

  public DwarfWarrior(String name) {
    super(name);
  }

  @Override
  protected Weapon createInitialWeapon() {    
    return new ShortAxe(25);
  }
}
