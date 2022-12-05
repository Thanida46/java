package FinalEx;

public class Account {
	  private String id ;
	  private String name;
	  private int balance = 0;
	  
	  public Account(String id , String name , int balance) {
		  this.id = id;
		  this.name = name;
		  this.balance = balance;
	  }
	  public String getID() {
		  return id ;
	  }
	  public String getName() {
		  return name;
	  }
	  public int getBalance() {
		  return balance;
	  }
	  public int credit(int amount) {
		  return balance = amount+getBalance();
	  }
	  public int debit(int amount) {
		  if(amount<=balance) {
			  balance = getBalance()-amount;
		  }
		  else {
			  System.out.println("amount exceeded balance");		  }
		  return balance ;
		  
	  }
	  public int transfer(Account another ,int amount) {
		  if(amount<=balance) {
			  balance = getBalance()-amount;
			  another.credit(amount);
		  }
		  else {
			  System.out.println("amount exceeded balance");		  }
		  return balance ;
	  }
	  public String toString () {
		  return String.format("Account[id =System.out.println(AC); %s , name = %s , balance = %d ]",getID() , getName() , getBalance());
	  }
	 
}
