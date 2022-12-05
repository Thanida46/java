package interface_Geome;

public class Rectangle {
       public double width ;
       public double length ;
       
       public Rectangle(double width,double length) {
    	   this.width=width;
    	   this.length=length;
       }
       public String toString() {
    	   return String.format("Rectangle[width = %.1f , length = %.1f]",width,length);
       }
}
