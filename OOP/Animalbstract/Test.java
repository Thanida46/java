package Animalbstract;

public class Test {
	public static void main(String []args) { 
        Cat CT = new Cat("");
        CT.greets();
        
        Dog DG = new Dog("");
        DG.greets();
        
        Dog DG2 = new Dog("");
        DG2.greets(DG2);
        
        BigDog BDG = new BigDog("");
        BDG.greets();
        
        BigDog BDG1 = new BigDog("");
        BDG1.greets(DG2);
        
        BigDog BDG2 = new BigDog("");
        BDG2.greets(BDG2);
        
	}
}
