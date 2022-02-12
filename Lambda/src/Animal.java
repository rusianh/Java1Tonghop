/**
 * 
 */

/**
 * @note [Lambda]
 * @author CrisVu (vietanhvu.it@gmail.com)
 * @since Jul 31, 2021 (9:07:20 PM)
 * @version 1.0
 */
public class Animal {
	//1. Attribute 
	private String species;
	private boolean canHop;
	private boolean canSwim;
	//2. Get, set methods
	public boolean canHop() {
		return canHop;
	}
	
	public boolean canSwim() {
		return canSwim;
	}
	
	public String toString() {
		return species;
	}
	
	public void setSpecies(String string) {
		this.species = string;
	}
	
	//3. Constructor
	public Animal(String speciesName, boolean hopper, boolean swimmer) {
		this.species = speciesName;
		this.canHop = hopper;
		this.canSwim = swimmer;
	}
	//4. Input, output methods
	//5. Business methods
	
}
