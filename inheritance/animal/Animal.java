package inheritance.animal;
public class Animal {
	
	//"protected" means only classes who inherit this one can access them
	protected int size;
	
	//alternatively, you could use "private" and use getters and setters
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
