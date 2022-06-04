package inheritance.animal;
public class DriverClass {
	public static void main(String[] args) {
		var pup = new Dog("wolf", 5);
		var fish = new Fish("cod", 2);
		
		System.out.println(pup);
		System.out.println(fish);
	}
}
