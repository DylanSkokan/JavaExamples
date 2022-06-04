package inheritance.vehicle;

public class DriverClass {
	public static void main(String[] args) {
		var rikshawName = new Rikshaw("medium", 3, 20, true);
		var busName = new Bus("big", 8, 2000, 4.25);
		
		System.out.println(rikshawName);
		System.out.println(busName);
	}
}
