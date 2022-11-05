package src.main.app;

import src.main.entities.Player;
import src.main.entities.races.dwarf.DwarfWarrior;
import src.main.entities.races.elf.Archer;
import src.main.entities.races.human.Ranger;

public class Application {
  public static void main(String[] args) {
    Player player = new Ranger("Aragorn"); 
    player.attackEnemy("Orc");

    player = new Archer("Legolas");
    player.attackEnemy("Oliphant");

    player = new DwarfWarrior("Gimli");
    player.attackEnemy("Troll");
  }
}