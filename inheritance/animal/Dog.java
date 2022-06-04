package inheritance.animal;

public class Dog extends Animal{
	private int runningSpeed;
	
	Dog(String name, int runningSpeed) {
		
		//direct access to protected data member
		this.size = 3;
		
		//using setter for private data member
		this.setName(name);
		
		this.runningSpeed = runningSpeed;
	}

	@Override
	public String toString() {
		return "Dog [runningSpeed=" + runningSpeed + ", size=" + size + ", name=" + getName() + "]";
	}
}