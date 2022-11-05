package src.main.entities.handedweapon.axes;

import src.main.entities.Weapon;

public interface Axe extends Weapon {  
  @Override
  default String type() {
    return "Axe";
  }
}
