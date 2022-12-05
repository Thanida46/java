package AuthorandBook;

public class TestAdvan {	
    public static void main(String[] args ) {
	   AuthorAdvan[] authors = new AuthorAdvan[2];
       authors[0] = new AuthorAdvan("Tan Ah Teck","AhTeck@somewhere.com",'m');
       authors[1] = new AuthorAdvan("Paul Tan","Paul@nowhere.com",'m');

       BookAdvan javaDummy = new BookAdvan("Java for Dummy",authors,19.99,99);
       System.out.println(javaDummy);
}
}
