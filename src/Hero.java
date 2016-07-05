/**
 * Created by t.chaynikova on 7/5/2016.
 */
public class Hero  {

  private Weapon weapon;

  public  Hero(String n, int a) {
    name = n;
    strength = a;
  }


   String name;
   int strength;

  public void setWeapon(Weapon w)
  {
    weapon = w;
  }

  public Weapon getWeapon()
  {
    return weapon;
  }

  public void jump(int strength) {

      System.out.println("Jumps " + strength + " fast");

  }

}

