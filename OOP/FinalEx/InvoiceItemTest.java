package FinalEx;
import java.util.Scanner;

public class InvoiceItemTest {
//	public static void main(String [] args) {
//		InvoiceItem M = new InvoiceItem("A101","Pen Red",888,0.08);
//		System.out.println(M);
//		InvoiceItem M2 = new InvoiceItem("A101","Pen Red",999,0.99);
//		System.out.println(M2);
//		
//		System.out.println("id is : " +M2.getID());
//		System.out.println("desc is : " +M2.getDesc());
//		System.out.println("qty is : " +M2.getQty());
//		System.out.println("unitprice is : " +M2.getUnitPrice());
//		System.out.println("The total is : " +M2.getTotle());
//				
//	}
	public static void main(String []args) {
		Scanner M1 = new Scanner(System.in);
		System.out.printf("input ID : ");
		String id = M1.nextLine();
		
		Scanner M2 = new Scanner(System.in);
		System.out.printf("input Desc : ");
		String desc = M2.nextLine();
		
		Scanner M3 = new Scanner(System.in);
		System.out.printf("input Qty : ");
		int qty = M3.nextInt();
		
		Scanner M4 = new Scanner(System.in);
		System.out.printf("input unitprice : ");
		double unitPrice = M4.nextDouble();
		
		InvoiceItem inv = new InvoiceItem(id,desc,qty,unitPrice);
		System.out.println(inv);
		
		System.out.println("id is : "+id);
		System.out.println("desc is : "+desc);
		System.out.println("qty is : "+qty);
		System.out.println("unitprice is : "+unitPrice);
		System.out.println("The total is : "+inv.getTotle());
		
		
		
		
		
	}
}