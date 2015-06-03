package prog5;

import java.util.Scanner;

public class prog1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in, "UTF-8");
		String string = null;
		Device device = null;
		
		System.out.print("Choose a device: ");
		string = scan.nextLine();
		device = DeviceFactory.getDevice(string);
		device.getInfo();
		
		scan.close();
	}

}