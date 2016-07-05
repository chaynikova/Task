/**
 * Created by t.chaynikova on 7/5/2016.
 */
public class Weapon{

  public Weapon(String weaponName, int ef ){

    wName = weaponName;
    wEfficiency = ef;
  }

  String wName;
  int wEfficiency;

 public String getName() {
    return wName;
  }

  public void shoot(){

    if   (wEfficiency >=5 ) {
      System.out.println("He is using " + wName + " weapon.");
    }
    else
      System.out.println("He is using " + wName + ".");
  }
}
