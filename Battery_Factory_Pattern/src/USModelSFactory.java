// Ben Nicholes 10/14/2015

public class USModelSFactory implements BatteryFactory {
	
	public Cell buildCell() {
		return new LithiumCell(); 
	}
	
	public Casing buildCasing() {
		return new AluminumCasing(); 
	}
	
	public Controller buildController() {
		return new ArduinoController(); 
	}
	
	public Charger buildCharger() {
		return new Volt110Charger(); 
	}
}
