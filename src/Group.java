import java.util.ArrayList;
import java.util.List;

/**
 * Created by t.chaynikova on 7/8/2016.
 */
public class Group {


  private List<Hero> heroes = new ArrayList<Hero>();

  public List<Hero> getHeroes() {
    return heroes;
  }

  public void setHeroes(List<Hero> heroes) {
    this.heroes = heroes;
  }

  public void addHero(Hero hero)

  {
    heroes.add(hero);

  }

}
