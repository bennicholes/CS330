// Ben Nicholes 10/14/2015

public class EUTeslaFactory extends TeslaFactory {
	
	protected Battery buildBattery(BatteryType type){
		Battery battery = null;
		BatteryFactory factory = null;
		
		if(type.equals(BatteryType.ModelS)){
			factory = new EUModelSFactory();
			battery = new ModelS(factory);
			battery.buildBattery();
			battery.setName("EU Model S");	
		}
		
		else if(type.equals(BatteryType.ModelX)){
			factory = new EUModelXFactory();
			battery = new ModelX(factory);
			battery.buildBattery();
			battery.setName("EU Model X");	
		}
		
		else if(type.equals(BatteryType.Model3)){
			factory = new EUModel3Factory();
			battery = new Model3(factory);
			battery.buildBattery();
			battery.setName("EU Model 3");	
		}
		
		return battery;
	}
}
