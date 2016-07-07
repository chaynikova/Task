/**
 * Created by t.chaynikova on 7/5/2016.
 */
public class Hero  {

	private String name;
	private int strength;
	private Weapon weapon;

  public Hero()
  {

  }
  
	public Hero(String name, int strength) {
		this.name = name;
		this.strength = strength;
	}

	public Hero(String name, int strength, Weapon weapon) {
		this.name = name;
		this.strength = strength;
		this.weapon = weapon;
	}
	
	// --- Getter & Setter for all fields ---
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getStrength(){
		return strength;
	}
	
	public void setStrength(int strength){
		this.strength = strength;
	}
	
	public Weapon getWeapon(){
		return weapon;
	}
	
	public void setWeapon(Weapon weapon){
		this.weapon = weapon;
	}

	// --- Actions ---
	
		public void jump() {
      System.out.println("Jumps " + strength + " fast");
  }

  public void shoot(){

    weapon.shoot();
  }
}

