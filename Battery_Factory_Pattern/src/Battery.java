// Ben Nicholes 10/14/2015

public abstract class Battery {

	Cell cell;
	Casing casing;
	Controller controller;
	Charger charger;
	String name; 
	
	abstract void buildBattery(); 
	
	void collectParts() {
		System.out.println("Collecting parts");
	}
	
	void testParts() {
		System.out.println("Testing parts");
	}
	
	void assembleParts() {
		System.out.println("Assembling parts");
	}
	
	void testBattery() {
		System.out.println("Testing battery");
	}
	
	void ship() {
		System.out.println("Shipping battery");
	}
	
	public void setName(String name) {
		this.name = name; 
	}
	
	public String getName() {
		return this.name; 
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer(); 
		result.append(name + " Components \n"); 
		result.append(cell + "\n" );
		result.append(casing + "\n");
		result.append(controller + "\n");
		result.append(charger + "\n");
		
		return result.toString(); 
	}
}