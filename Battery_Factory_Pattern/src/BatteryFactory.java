// Ben Nicholes 10/14/2015

public interface BatteryFactory {
	
	public Cell buildCell();
	public Casing buildCasing();
	public Controller buildController();
	public Charger buildCharger(); 
}
