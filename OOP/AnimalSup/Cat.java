package AnimalSup;

public class Cat extends Mammal {

	private String name;

	public Cat(String name) {
		super(name);
//		this.name=name;
	}
	public void greets() {
		System.out.println("Meow");
	}
	public String toString() {
		return String.format("Cat : [%s]",super.toString());
	}

}
