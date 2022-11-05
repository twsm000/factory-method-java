package src.main.entities.handedweapon.swords;

import src.main.entities.Weapon;

public interface Sword extends Weapon {
  @Override
  default String type() {
    return "Sword";
  }
}
