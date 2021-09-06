import java.util.Scanner; 
class Exercise3F {

   public static void main(String[] args){
        double price1,price2,TotalAmt,Vat,NetAmt,amount1,amount2 ;
		int quantity1,quantity2 ;
        Scanner kbd = new Scanner(System.in);
		System.out.print("Enter quantity1 :");
		quantity1 = kbd.nextInt();
		System.out.print("Enter price1 :");
		price1 = kbd.nextDouble();
		System.out.print("Enter quantity2 :");
		quantity2 = kbd.nextInt();
		System.out.print("Enter price2 :");
		price2 = kbd.nextDouble();
		amount1 = quantity1*price1;
        amount2 = quantity2*price2;
        TotalAmt = amount1+amount2;
		Vat = (7.0/100.0)*TotalAmt;
		NetAmt = TotalAmt+Vat;
		System.out.println("NetAmt = " +NetAmt);
		//∞“π‘¥“ ‡‡ ß»√’ 64050065
	}
}

