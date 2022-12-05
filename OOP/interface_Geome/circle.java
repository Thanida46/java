package interface_Geome;


interface GeometricOpject {
    public double getArea() ;
    public double getPerimeter() ;
}
public class circle implements GeometricOpject {
	private double radius ;
	
	public circle(double radius) {
		 this.radius=radius;
	}
	public String toString () {	
   		 return String.format("Circle[redius = %.1f]",radius);
	}
	@Override
	public double getArea() {
		return Math.PI*radius;
	}
	@Override
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
}
