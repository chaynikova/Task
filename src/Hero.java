/**
 * Created by t.chaynikova on 7/5/2016.
 */
public class Hero {

  public  Hero(String n, int a) {
    name = n;
    strength = a;
  }

   String name;
   int strength;

  public void jump(int strength) {


      System.out.println("Jump " + strength + " times");

  }
    public static void main(String [ ] args){

      Hero firstHero = new Hero("Super Hero", 10);
      System.out.println(firstHero.name);
      firstHero.jump(2);

    }

  }
