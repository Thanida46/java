import java.util.Scanner ;
import java.lang.Math; 
class Exercise3C {
       public static void main (String[] args ) {
       double x, y, z , f ;
       Scanner kbd = new Scanner(System.in) ;
       System.out.print("Enter x -value : "); 
	   x = kbd.nextDouble() ;
	   System.out.print("Enter y -value : ");
	   y = kbd.nextDouble() ;
	   System.out.print("Enter z -value : ");
       z = kbd.nextDouble() ;
       f = (3.0/4.0)*x*Math.exp(y)+(7.0/3.0)*Math.log(z)+Math.sqrt(x); 
       System.out.println( "Result is : " +f ) ;
	   //�ҹԴ� ��ʧ��� 64050065
}
 }
