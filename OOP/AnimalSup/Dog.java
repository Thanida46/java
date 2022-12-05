package AnimalSup;

public class Dog extends Mammal {

	public Dog(String name) {
		super(name);;
	}
	public void greets() {
		System.out.print("Woof");
	}
	public void greets(Dog another) {
		System.out.print("Woooof");
	}
	public String toString() {
		return String.format("Dog : [%s]",super.toString());
	}
}
