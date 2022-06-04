package inheritance.animal;

public class Fish extends Animal {
	private int swimmingSpeed;
	
	Fish(String name, int swimmingSpeed) {
		this.size = 2;
		this.setName(name);
		this.swimmingSpeed = swimmingSpeed;
	}

	@Override
	public String toString() {
		return "Fish [swimmingSpeed=" + swimmingSpeed + ", size=" + size + ", name=" + getName() + "]";
	}
}
