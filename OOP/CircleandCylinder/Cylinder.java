package CircleandCylinder;

public class Cylinder extends Circle {
       private double height = 1.0 ;
       
       public Cylinder () {
    	   super();
      }
       public Cylinder (double redius) {
    	   super(redius);
       }
       public Cylinder (double redius , double height ) { 
    	   super(redius);
    	   this.height=height;
       }
       public Cylinder (double redius , double height , String color) { 
    	   super(redius , color);
    	   this.height=height;
       }
       public double getHeight() {
    	   return height;
       }
       public void setHeight(double height) {
    	   this.height = height;
       }
       public double getVolume() {
    	   return super.getArea()*height;
       }
}
