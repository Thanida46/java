package AuthorandBook;

public class AuthorAdvan {
	private String name;
    private String email;
    private char gender;
    
    public AuthorAdvan(String name , String email , char gender) {
 	   this.name=name;
 	   this.gender=gender;
 	   setEmail(email);
    }
    public  String getName() {
 	   return name;
    }
    public String getEmail() {
 	   return email;
    }
    public void setEmail(String email) {
 	   this.email=email;
    }
    public char getGender() {
    	return gender;
    }
    public String toString() {
 	   return String.format("AuthorAdvan[name = %s , email = %s , gender = %c ]",getName(),getEmail(),getGender());
    }
}

