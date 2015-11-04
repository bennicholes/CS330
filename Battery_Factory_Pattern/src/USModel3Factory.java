// Ben Nicholes 10/14/2015

public class USModel3Factory implements BatteryFactory {
	
	public Cell buildCell() {
		return new LeadCell(); 
	}
	
	public Casing buildCasing() {
		return new ParticleBoardCasing(); 
	}
	
	public Controller buildController() {
		return new RaspberryPiController(); 
	}
	
	public Charger buildCharger() {
		return new HandCrankCharger(); 
	}
}
