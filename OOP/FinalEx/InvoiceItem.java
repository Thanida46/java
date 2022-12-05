package FinalEx;

public class InvoiceItem {
	private String id ;
	private String desc ;
	private int qty ;
	private double unitPrice;
	
	public InvoiceItem(String id , String desc , int qty , double unitPrice ) {
		this.id=id;
		this.desc=desc;
		setQty(qty);
		setUnitPrice(unitPrice);
	}
	public String getID() {
		return id ;
	}
	public String getDesc() {
		return desc ;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty=qty;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice=unitPrice;
	}
	public double getTotle() {
		return unitPrice*qty;
	}
	public String toString() {
		return String.format(("InvoiceItem[id = %s ,desc = %s ,qty = %d ,unitPrice = %.2f]"),getID(),getDesc(),getQty(),getUnitPrice());
	}
}
