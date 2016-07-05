import java.lang.ref.WeakReference;

/**
 * Created by t.chaynikova on 7/5/2016.
 */
public class Start {

  public static void main(String [ ] args){

    Hero firstHero = new Hero("Super Sergio", 10);
    Weapon weapon1 = new Weapon ("unknown", 5);
    Weapon weapon2 = new Weapon ("tennis ball", 3);
    System.out.println(firstHero.name);
    firstHero.jump(2);
   // weapon1.setwName("test");
    weapon1.shoot();
    firstHero.setWeapon(weapon2);
    System.out.println(firstHero.name + " can kill you by " + firstHero.getWeapon().getwName());


  }
}
