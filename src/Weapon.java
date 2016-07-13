/**
 * Created by t.chaynikova on 7/5/2016.
 */
public class Weapon{

	private String name;
	private int efficiency;


  public Weapon(){

  }

	public Weapon(String name, int efficiency ){
		this.name = name;
		this.efficiency = efficiency;
	}


	// --- Getter & Setter for all fields ---
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getEfficiency(){
		return efficiency;
	}
	
	public void setEfficiency(int efficiency){this.efficiency = efficiency;	}



	// --- Actions ---

	public void shoot(Hero hero){
		if (efficiency >= 5 ) {

			System.out.println();
			System.out.println(hero.getName()+ " weapon.");
		} else {
			System.out.println(hero.getName() + ".");
		}
	}

	@Override
	public String toString() {
		return "Weapon{" +
						"name='" + name + '\'' +
						", efficiency=" + efficiency +
						'}';
	}
}
