package interface_Geome;

public class Test {
       public static void main(String [] args) {
    	   circle CC = new circle(2.0);
    	   System.out.println(CC);                  
    	   
    	   Rectangle RT = new Rectangle(3.0,4.0);
    	   System.out.println(RT);
    	   
    	   System.out.println("Area : "+CC. getArea());
    	   System.out.println("Perimeter : "+CC. getPerimeter());
       } 
}
 