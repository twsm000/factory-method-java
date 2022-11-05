package src.main.entities;

public abstract class Player {
  private final String name;
  private Weapon weapon;
  
  public Player(String name) {
    this.name = name;
    this.weapon = createInitialWeapon();
  }  

  protected abstract Weapon createInitialWeapon();
  
  public String getName() {
    return this.name;
  }

  public Weapon getWeapon() {
    return this.weapon;
  }

  public void setWeapon(Weapon weapon) {
    this.weapon = weapon;
  }

  public void attackEnemy(String enemyName) {
    var weapon = getWeapon();
    System.out.printf("%s used his %s[%s] to attack the %s\n", 
      getName(), weapon.name(), weapon.type(), enemyName);
    System.out.printf("%d of damaged has been inflicted\n", weapon.attack());
  }
}
