import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by t.chaynikova on 7/5/2016.
 */
public class Start {

  public static void main(String[] args) {

    // --- 1 ---
    Hero firstHero = new Hero();
    firstHero.setName("Super Sergio");
    firstHero.setStrength(10);

    Weapon firstWeapon = new Weapon();
    firstWeapon.setName("axe");
    firstWeapon.setEfficiency(1);

  //  firstWeapon.setHero(firstHero);
    firstHero.setWeapon(firstWeapon);
    firstHero.jump();
    firstHero.shoot(); // todo


    // --- 2 ---
    Hero secondHero = new Hero("Super Sergio 2", 20);
    Weapon secondWeapon = new Weapon("blaster", 150);
    secondHero.setWeapon(secondWeapon);
    // --- 3 ---
    Hero thirdHero = new Hero("Super Sergio 3", 50, new Weapon("lazer", 100));

    // --- battle heroes---
    Battle battle = new Battle();
    Hero[] girls = new Hero[4];
    Hero[] guys = new Hero[10];

    Hero battleHero1 = new Hero("Super Sergio", 100, new Weapon("lazer", 100));
    Hero battleHero2 = new Hero("Super Tanya", 50, new Weapon("axe", 50));

    battle.battle(battleHero1, battleHero2);

    //-----battle groups-----

    Group group = new Group();
    Group group2 = new Group();

    group.addHero(firstHero);
    group.addHero(secondHero);
    group2.addHero(battleHero1);

    battle.battle(group,group2);
  }
}
