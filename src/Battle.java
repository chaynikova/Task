import java.util.List;

/**
 * Created by t.chaynikova on 7/7/2016.
 */
public class Battle {

 /* Group girls = new Group();
  Group guys = new Group();
*/

  public void battle(Hero battleHero1, Hero battleHero2) {

    if (battleHero1.getWeapon().getEfficiency() > battleHero2.getWeapon().getEfficiency()) {
      System.out.println(battleHero1.getName() + " has cute " + battleHero1.getWeapon().getName() + " but " + battleHero2.getName() + " is goddess anyway.");
    } else System.out.println(battleHero1.getName() + "is busy for battles today.");
  }

 /* public void battle(Hero[] maleHeroes, Hero[] femaleHeroes) {

    if (girls.femaleHeroes.length > guys.maleHeroes.length) {
      System.out.println("Девочки победили, потому что девочек больше)");
    } else System.out.println("Мальчики победили девочек, но это они зря.");
  }

  public void battle(Hero battleHero1, Hero[] femaleHeroes) {
    if (battleHero1.getStrength() > girls.femaleHeroes.length){
      System.out.println("Слишком сильный герой, победил толпу девчонок.");
    }
    else System.out.println("Ну, не смог.");
  }*/

   public void battle(List<Hero> heroes, List<Hero> heroes2) {

    if (heroes.size() >= heroes2.size()) {
      System.out.println("heroes win");
    } else System.out.println("heroes2 win.");
  }
}