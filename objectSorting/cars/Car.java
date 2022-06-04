package objectSorting.cars;

public class Car implements Comparable<Car>{
	private String color;
	private int weight;
	
	public Car(String color, int weight) {
		this.color = color;
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "Car [color=" + color + ", weight=" + weight + "]";
	}
	
	@Override
	public int compareTo(Car car) {
		return this.getWeight() - car.getWeight();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
}