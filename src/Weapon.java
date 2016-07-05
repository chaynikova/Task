/**
 * Created by t.chaynikova on 7/5/2016.
 */
public class Weapon{

  public Weapon(String weaponName, int ef ){

    wName = weaponName;
    wEfficiency = ef;
  }

  private String wName;
  private int wEfficiency;

public void setwName(String name)
{
  this.wName = name;
}
 public String getwName() {
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
