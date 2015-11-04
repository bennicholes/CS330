// Ben Nicholes 10/14/2015

public class EUModel3Factory implements BatteryFactory {
	
	public Cell buildCell() {
		return new LeadCell(); 
	}
	
	public Casing buildCasing() {
		return new CardboardCasing(); 
	}
	
	public Controller buildController() {
		return new RaspberryPiController(); 
	}
	
	public Charger buildCharger() {
		return new WindmillCharger(); 
	}
}
