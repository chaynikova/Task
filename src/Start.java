import java.lang.ref.WeakReference;

/**
 * Created by t.chaynikova on 7/5/2016.
 */
public class Start {

  public static void main(String [ ] args){

  // --- 1 ---
   Hero firstHero = new Hero();
   firstHero.setName("Super Sergio");
   firstHero.setStrength(10);
   
   Weapon firstWeapon = new Weapon();
   firstWeapon.setName("axe");
   firstWeapon.setEfficiency(1);
   
   firstHero.setWeapon(firstWeapon);
   
   firstHero.jump();
   //firstHero.shoot(); // todo
   firstWeapon.shoot();
   
   // --- 2 ---
	Hero secondHero = new Hero("Super Sergio 2", 20);
	Weapon secondWeapon = new Weapon("blaster", 150);
	secondHero.secondWeapon(secondWeapon);
   
   // --- 3 ---
	Hero thirdHero = new Hero("Super Sergio 3", 50, new Weapon("lazer", 100));
  
  
  // Tatyana
  
    Hero firstHero = new Hero("Super Sergio", 10);
    Weapon weapon1 = new Weapon ("unknown", 5);
    Weapon weapon2 = new Weapon ("tennis ball", 3);
    System.out.println(firstHero.name); // ?????????
    firstHero.jump(2);
   // weapon1.setwName("test");
    weapon1.shoot();
    firstHero.setWeapon(weapon2); 
    System.out.println(firstHero.name + " can kill you by " + firstHero.getWeapon().getwName());


  }
}
