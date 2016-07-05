import java.lang.ref.WeakReference;

/**
 * Created by t.chaynikova on 7/5/2016.
 */
public class Start {

  public static void main(String [ ] args){

    Hero firstHero = new Hero("Super Hero", 10);
    Weapon weapon1 = new Weapon ("Powerful", 5);
    System.out.println(firstHero.name);
    firstHero.jump(2);
    weapon1.shoot();
      
  }
}
