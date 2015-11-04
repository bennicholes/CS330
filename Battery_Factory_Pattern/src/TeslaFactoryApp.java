// Ben Nicholes 10/14/2015

public class TeslaFactoryApp {
	public static void main(String[] args) {
		
		// The following is a test for the factory pattern
		AsiaTeslaFactory asiaFactory = new AsiaTeslaFactory(); 
		EUTeslaFactory euFactory = new EUTeslaFactory();
		USTeslaFactory usFactory = new USTeslaFactory();
		
		// US
		Battery usaModelS = usFactory.orderBattery(BatteryType.ModelS);
		String usaModelSMake = usaModelS.toString();
		System.out.println(usaModelSMake);
		Battery usaModelX = usFactory.orderBattery(BatteryType.ModelX);
		String usaModelXMake = usaModelX.toString();
		System.out.println(usaModelXMake);
		Battery usaModel3 = usFactory.orderBattery(BatteryType.Model3);
		String usaModel3Make = usaModel3.toString();
		System.out.println(usaModel3Make);
		
		// Europe
		Battery euModelS = euFactory.orderBattery(BatteryType.ModelS);
		String euModelSMake = euModelS.toString();
		System.out.println(euModelSMake);
		Battery euModelX = euFactory.orderBattery(BatteryType.ModelX);
		String euModelXMake = euModelX.toString();
		System.out.println(euModelXMake);
		Battery euModel3 = euFactory.orderBattery(BatteryType.Model3);
		String euModel3Make = euModel3.toString();
		System.out.println(euModel3Make);
		
		// Asia
		Battery asiaModelS = asiaFactory.orderBattery(BatteryType.ModelS);
		String asiaModelSMake = asiaModelS.toString();
		System.out.println(asiaModelSMake);
		Battery asiaModelX = asiaFactory.orderBattery(BatteryType.ModelX);
		String asiaModelXMake = asiaModelX.toString();
		System.out.println(asiaModelXMake);
		Battery asiaModel3 = asiaFactory.orderBattery(BatteryType.Model3);
		String asiaModel3Make = asiaModel3.toString();
		System.out.println(asiaModel3Make);
	}

}
