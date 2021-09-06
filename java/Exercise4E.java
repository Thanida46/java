import java.lang.Math; 
import java.util.Scanner; 
class Exercise4E {
	public static void main(String[] args) {
       double a,powa1,powa2,y ;
	   double b,powb1,powb2,z ;
           Scanner kbd = new Scanner(System.in);
		   System.out.print("input a = ");
	       a = kbd.nextDouble();
		   powa1 = 3.0*Math.pow(a,2.0);
		   powa2 = Math.pow(a,3.0);
		   y = Math.log10(powa1) + ((2.0/3.0)*powa2) + Math.sin(2.0*a);
		   System.out.println("value of function : "+y);
		   System.out.print("input b = ");
	       b = kbd.nextDouble();
		   powb1 = 3.0*Math.pow(b,2.0);
		   powb2 = Math.pow(b,3.0);
		   z = Math.log10(powb1) + ((2.0/3.0)*powb2) + Math.sin(2.0*b);
		   System.out.println("value of function : "+z);
		   System.out.println("Max function :"+ Math.max (y,z) );
	}
}//∞“π‘¥“ ‡‡ ß»√’ 64050065