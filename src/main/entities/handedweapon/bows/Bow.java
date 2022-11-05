package src.main.entities.handedweapon.bows;

import src.main.entities.Weapon;

public interface Bow extends Weapon {
  @Override
  default String type() {
    return "Bow";
  }
}
