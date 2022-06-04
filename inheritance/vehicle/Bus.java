package inheritance.vehicle;

public class Bus extends Automobile {
	protected double fare;

	public Bus(String size, int wheels, int mpg, double fare) {
		//from vehicle
		this.size = size;
		this.wheels = wheels;
		
		//from automobile
		this.mpg = mpg;
		
		//from bus
		this.fare = fare;
	}

	@Override
	public String toString() {
		return "Bus [fare=" + fare + ", mpg=" + mpg + ", size=" + size + ", wheels=" + wheels + "]";
	}
}
