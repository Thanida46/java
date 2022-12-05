package FinalEx;

public class EmployeeTest {
       public static void main(String [] args) {
    	   Employee EM = new Employee(8," Peter"," Tan",999);
    	   System.out.println(EM);
    	   
    	   System.out.println("id is : " +EM.getID());
    	   System.out.println("firsName is : " +EM.getFirsName());
    	   System.out.println("lastName is : " +EM.getLastName());
   	       System.out.println("Name is : " +EM.getName());
   	       System.out.println("Salary is : " +EM.getSalary());
   	       System.out.println("AnnualSalary is : " +EM.getAnnualSalary());
   	       System.out.println(EM.raiseSalary(10));
   	       
   	       Employee EM2 = new Employee(8," Peter"," Tan",EM.raiseSalary(10));
 	       System.out.println(EM2);
   	       
   	       
   	       
       }
}
