package inheritance.vehicle;

public class Rikshaw extends PulledVehicle {
	private boolean roof;

	public Rikshaw(String size, int wheels, int weight, boolean roof) {
		//from vehicle
		this.size = size;
		this.wheels = wheels;
		
		//from pulled vehicle
		this.weight = weight;
		
		//from rikshaw
		this.roof = roof;
	}

	@Override
	public String toString() {
		return "Rikshaw [roof=" + roof + ", weight=" + weight + ", wheels=" + wheels + ", size=" + size + "]";
	}
}
