package hw7;

public class Dog extends Pet {
	
	private static final long serialVersionUID = 1L;


	public Dog(String name) {
		super(name);
	}

	
	public void speak() {
		super.speak();
		System.out.println("This is Dog " + getName() + " speaking!");
	}
}
