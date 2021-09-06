import java.util.Scanner ;
import java.lang.Math; 
class Exercise3D2 {
       public static void main (String[] args ) {
       double x1,x2,y1,y2 ; // for point
       double xm,ym,d ; // for middle point, distance
	   Scanner kbd = new Scanner(System.in);
	   System.out.print( "Enter x1 : " ) ; x1 = kbd.nextDouble();
	   System.out.print( "Enter x1 : " ) ; x2 = kbd.nextDouble();
       System.out.print( "Enter y1 : " ) ; y1 = kbd.nextDouble();
	   System.out.print( "Enter y1 : " ) ; y2 = kbd.nextDouble();
       xm = (x1+x2)/2.0 ;
       ym = (y1+y2)/2.0 ;
       d = Math.sqrt(Math.pow(xm-x1,2)+(Math.pow(ym-y1,2))) ;
	   System.out.println( "First point :(" +x1 +" , " +y1 +")");
       System.out.println( "Second point :(" +x2 +" , " +y2 +")");
	   System.out.println( "Middle point :(" +xm +" , " +ym +")");  
       System.out.println( "Distance from 1st to 2nd point :"+d ) ;
	   
}
 }