/**
 * Created by t.chaynikova on 7/7/2016.
 */
public class Battle {

  public void battle(Hero battleHero1, Hero battleHero2) {

    if (battleHero1.getWeapon().getEfficiency() > battleHero2.getWeapon().getEfficiency()) {
      System.out.println(battleHero1.getName() + " has cute " + battleHero1.getWeapon().getName() + " but " + battleHero2.getName() + " is goddess anyway.");
    } else System.out.println(battleHero1.getName() + "is busy for battles today.");
  }

}
