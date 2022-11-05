package src.main.entities.handedweapon;

public abstract class SingleHandedWeapon extends HandedWeapon {

  public SingleHandedWeapon(String name, int attack) {
    super(name, attack, 1);
  }
}
