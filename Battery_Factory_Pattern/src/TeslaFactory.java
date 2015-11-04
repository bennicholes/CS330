// Ben Nicholes 10/14/2015

public abstract class TeslaFactory {
	public Battery orderBattery(BatteryType type) {
		Battery battery = buildBattery(type);
		System.out.println("Building a " + battery.getName() + " battery");
		battery.collectParts();
		battery.testParts();
		battery.testBattery();
		battery.ship();
		return battery; 
	}
	
	abstract Battery buildBattery(BatteryType type);
}