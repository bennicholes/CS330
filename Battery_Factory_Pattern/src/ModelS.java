// Ben Nicholes 10/14/2015

public class ModelS extends Battery {
	BatteryFactory factory;
	
	public ModelS(BatteryFactory factory){
		this.factory = factory;
	}
	
	public void buildBattery(){
		cell = factory.buildCell();
		casing = factory.buildCasing();
		controller = factory.buildController();
		charger = factory.buildCharger();
	}
}