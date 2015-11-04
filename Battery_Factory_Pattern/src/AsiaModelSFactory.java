// Ben Nicholes 10/14/2015

public class AsiaModelSFactory implements BatteryFactory {
	
	public Cell buildCell() {
		return new LithiumCell(); 
	}
	
	public Casing buildCasing() {
		return new AluminumCasing(); 
	}
	
	public Controller buildController() {
		return new XiaomiController(); 
	}
	
	public Charger buildCharger() {
		return new Volt220Charger(); 
	}
}
