package AnimalSup;

public class Mammal extends Animal{

	public Mammal(String name) {
		super(name);
	}
	@Override
	public String toString() {
		return String.format("Mamaml : [%s]",super.toString());
	}


}
