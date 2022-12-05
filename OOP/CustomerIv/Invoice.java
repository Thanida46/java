package CustomerIv;

public class Invoice {
    private int id;
    private Customer customer;
    private double amount;
    
    public Invoice(int id , Customer customer , double amount) {
 	   this.id=id;
 	   setCustomer(customer);
 	   setAmount(amount);
    }
    
    public int getID() {
 	   return id;
    }
    public Customer getCustomer() {
 	   return customer;
    }
    public void setCustomer(Customer customer) {
 	   this.customer=customer;
    }
    public double getAmount() {
 	   return amount;
    }
    public void setAmount(double amount) {
 	   this.amount=amount;
    }
    public int getCustomerID() {
 	   return customer.getID();
    }
    public String getCustomerName() {
 	   return customer.getName();
    }
    public int getCustomerDiscount() {
 	   return customer.getDiscount();
    }
    public double getAmountAfterDiscount() {
 	   return amount = getAmount() - getCustomerID() + getCustomerDiscount();
    }
    public String toString() {
 	   return String.format("Invoice[id = %d , customer = name(%d)(%d) , amount = %.1f)]",getID(), getID(),customer.getDiscount(),getAmount()) ;
    }
}
