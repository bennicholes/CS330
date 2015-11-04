// Ben Nicholes 10/14/2015

public class AsiaTeslaFactory extends TeslaFactory {
	
	protected Battery buildBattery(BatteryType type){
		Battery battery = null;
		BatteryFactory factory;
		
		if(type.equals(BatteryType.ModelS)){
			factory = new AsiaModelSFactory();
			battery = new ModelS(factory);
			battery.buildBattery();
			battery.setName("Asia Model S");	
		}
		
		else if(type.equals(BatteryType.ModelX)){
			factory = new AsiaModelXFactory();
			battery = new ModelX(factory);
			battery.buildBattery();
			battery.setName("Asia Model X");	
		}
		
		else if(type.equals(BatteryType.Model3)){
			factory = new AsiaModel3Factory();
			battery = new Model3(factory);
			battery.buildBattery();
			battery.setName("Asia Model 3");	
		}
		
		return battery;
	}
}
