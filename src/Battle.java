import java.util.List;

/**
 * Created by t.chaynikova on 7/7/2016.
 */
public class Battle {

  public void battle(Hero battleHero1, Hero battleHero2) {

    if (battleHero1.getWeapon().getEfficiency() > battleHero2.getWeapon().getEfficiency()) {
      System.out.println(battleHero1.getName() + " has cute " + battleHero1.getWeapon().getName() + " but " + battleHero2.getName() + " is goddess anyway.");
    } else System.out.println(battleHero1.getName() + "is busy for battles today.");
  }

   public void battle(Group heroes, Group heroes2) {

    if (heroes.equals(heroes2)  ) {
      System.out.println("draw");

    } else if (heroes.getHeroes().size() > heroes2.getHeroes().size()){
      System.out.println("heroes win.");
    }
      else System.out.println("heroes2 win.");
  }
}
