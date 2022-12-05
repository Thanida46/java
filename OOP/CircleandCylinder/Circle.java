package CircleandCylinder;

public class Circle {
       private double radius = 1.0;
       private String color = "red";
       
       public Circle() {
       }
       public Circle(double radius  ) {
    	   setRadius(radius);
       }
       public Circle(double radius , String color) {
    	   this.color = color;
    	   setRadius(radius);
       }
       public double getRadius() {
    	   return radius;
       }
       public void setRadius(double radius) {
    	   this.radius=radius;
       }
       public String getColor() {
    	   return color;
       }
       public void setColor() {
    	   this.color = color;
       }
       public double getArea() {
    	   return Math.PI*(radius*radius);
       }
       public String toString () {
    	   return String.format("Circle[redius = %f , color = %s]", getRadius() , getColor());
       }
}
