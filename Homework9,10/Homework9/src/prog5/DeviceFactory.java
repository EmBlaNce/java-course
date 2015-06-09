package prog5;

public class DeviceFactory {

	private static DeviceFactory instance = new DeviceFactory();
	
	private DeviceFactory() {}
	
	public static DeviceFactory getInstance() {
		return instance;
	}
	
	public static Device getDevice(String device) {
		
		if (device.equalsIgnoreCase("Phone")) {
			return new Phone();
		}
		else if (device.equalsIgnoreCase("Tablet")) {
			return new Tablet();
		}
		else if (device.equalsIgnoreCase("Laptop")) {
			return new Laptop();
		}
		else {
			return null;
		}
	}
}