package src.main.entities.races.human;

import src.main.entities.Weapon;
import src.main.entities.handedweapon.swords.ShortSword;

public class Ranger extends Human {

  public Ranger(String name) {
    super(name);
  }

  @Override
  protected Weapon createInitialWeapon() {
    return new ShortSword();
  }  
}
