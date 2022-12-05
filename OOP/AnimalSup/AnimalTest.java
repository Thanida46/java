package AnimalSup;

public class AnimalTest {

	public static void main(String [] args) {
		Animal AN = new Animal("POND");	
		System.out.println(AN);
		
		Mammal MM = new Mammal("POND");	
		System.out.println(MM);
		
		Cat CT = new Cat("POND");	
		System.out.println(CT);
		CT.greets();
		
		Dog DG = new Dog("POND");	
		System.out.println(DG);
		DG.greets();
		DG.greets(DG);
		
	}

}
