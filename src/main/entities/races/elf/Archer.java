package src.main.entities.races.elf;

import src.main.entities.Weapon;
import src.main.entities.handedweapon.bows.ShortBow;

public class Archer extends Elf {

  public Archer(String name) {
    super(name);
  }

  @Override
  protected Weapon createInitialWeapon() {
    return new ShortBow();
  }
}
