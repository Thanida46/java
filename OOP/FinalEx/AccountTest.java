package FinalEx;

public class AccountTest {
       public static void main(String []args ) {
    	   Account AC = new Account(" A101"," Tan Ah Teck",88);
    	   Account AC2 = new Account(" A102","Kumar",0);
    	   
    	   System.out.println(AC);
    	   
    	   System.out.println("ID:"+AC.getID());
    	   System.out.println("Nane:"+AC.getName());
    	   System.out.println("Balance:"+AC.getBalance());
    	   
    	   AC.credit(100);
    	   System.out.println(AC);
    	   AC.debit(50);
    	   System.out.println(AC);
    	   AC.debit(500);
    	   System.out.println(AC);
    	    
    	   AC.transfer(AC2,100);
    	   System.out.println(AC);
    	   System.out.println(AC2);
    	   
       }
}
