import java.lang.Math; 
import java.util.Scanner; 
class Exercise4C 
{
	public static void main(String[] args) 
	{
		int n;
		double sqr,X1,X2,powX1,powX2,f;
			Scanner kbd = new Scanner(System.in);
		    System.out.print("input n = ");
			n = kbd.nextInt();
			sqr = Math.sqrt(5) ;
			X1 = (1.0+sqr)/2.0 ;
			X2 = (1.0-sqr)/2.0 ;
            powX1 = Math.pow(X1,n);
			powX2 = Math.pow(X2,n);
			f = (1.0/sqr)*(powX1-powX2);
			System.out.println("Fibonacci " + n + "th :" +(int) f );
	}
}//∞“π‘¥“ ‡‡ ß»√’ 64050065
