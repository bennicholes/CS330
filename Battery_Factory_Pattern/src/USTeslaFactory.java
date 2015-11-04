// Ben Nicholes 10/14/201

public class USTeslaFactory extends TeslaFactory {
	
	protected Battery buildBattery(BatteryType type){
		Battery battery = null;
		BatteryFactory factory;
		
		if(type.equals(BatteryType.ModelS)){
			factory = new USModelSFactory();
			battery = new ModelS(factory);
			battery.buildBattery();
			battery.setName("US Model S");	
		}
		
		else if(type.equals(BatteryType.ModelX)){
			factory = new USModelXFactory();
			battery = new ModelX(factory);
			battery.buildBattery();
			battery.setName("US Model X");	
		}
		
		else if(type.equals(BatteryType.Model3)){
			factory = new USModel3Factory();
			battery = new Model3(factory);
			battery.buildBattery();
			battery.setName("US Model 3");	
		}
		
		return battery;
	}
}
