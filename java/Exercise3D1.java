import java.util.Scanner ;
import java.lang.Math; 
class Exercise3D1 {
       public static void main (String[] args ) {
       double x1,x2,y1,y2 ; // for point
       double xm,ym,d ; // for middle point, distance
	   x1 = 3.5 ;
	   x2 = 14.0 ;
	   y1 = 1.0 ;
	   y2 = 6.5 ;
       // middle point
       xm = (x1+x2)/2.0 ;
       ym = (y1+y2)/2.0 ;
       // distance
       d = Math.sqrt(Math.pow(xm-x1,2)+(Math.pow(ym-y1,2))) ;
	   System.out.println( "First point :(" +x1 +" , " +y1 +")");
       System.out.println( "Second point :(" +x2 +" , " +y2 +")");
	   System.out.println( "Middle point :(" +xm +" , " +ym +")");  
       System.out.println( "Distance from 1st to 2nd point :"+d ) ;
	   //∞“π‘¥“ ‡‡ ß»√’ 64050065
}
 }