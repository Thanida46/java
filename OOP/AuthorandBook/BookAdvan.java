package AuthorandBook;

public class BookAdvan {
       private String name;
       private AuthorAdvan[] authors;
       private double price = 0;
       private int qty = 0;
       
       public BookAdvan(String name , AuthorAdvan[] authors , double price ) {
    	   this.name=name;
    	   this.authors=authors;
    	   setPrice(price);
       }
       public BookAdvan(String name , AuthorAdvan[] authors , double price , int qty) {
    	   this.name=name;
    	   this.authors=authors;
    	   setPrice(price);
    	   setQty(qty);
       }
       public String getName() {
    	   return name;
       }
       public AuthorAdvan[] getAuthorsAdvan() {
    	   return authors;
       }
       public double getPrice() {
    	   return price;
       }
       public void setPrice(double price) {
    	   this.price=price;
       }
       public int getQty() {
    	   return qty;
       }
       public void setQty(int qty) {
    	   this.qty=qty;
       }
       
       @Override
       public String toString() {
    	   return String.format("Book[name = %s , authors = {%s},price = %f , qty = %d]"
    			                 ,getName(),authors.toString(),getPrice(),getQty());
       }
//       public String getAuthorsAdvanNames() {
//    	   return AuthorAdvan.getName();
//       }
       
         
}

