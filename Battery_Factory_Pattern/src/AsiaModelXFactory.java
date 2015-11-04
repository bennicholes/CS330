// Ben Nicholes 10/14/2015

public class AsiaModelXFactory implements BatteryFactory {
	
	public Cell buildCell() {
		return new DualCarbonCell(); 
	}
	
	public Casing buildCasing() {
		return new KevlarCasing(); 
	}
	
	public Controller buildController() {
		return new XiaomiV2Controller(); 
	}
	
	public Charger buildCharger() {
		return new Volt220Charger(); 
	}
}
