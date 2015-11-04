// Ben Nicholes 10/14/2015

public class AsiaModel3Factory implements BatteryFactory {
	
	public Cell buildCell() {
		return new LeadCell(); 
	}
	
	public Casing buildCasing() {
		return new BambooCasing(); 
	}
	
	public Controller buildController() {
		return new RaspberryPiController(); 
	}
	
	public Charger buildCharger() {
		return new PedalCharger(); 
	}
}