package FinalEx;

public class Employee {
      private int id;
      private String firsName;
      private String lastName;
      private int salary ;
      
      public Employee(int id , String firsName , String lastName , int salary ) {
    	  this.id=id;
    	  this.firsName=firsName;
    	  this.lastName=lastName;
    	  setSalary(salary);
      }
      public int getID() {
    	  return id;
      }
      public String getFirsName() {
    	  return firsName;
      }
      public String getLastName() {
    	  return lastName;
      }
      public String getName() {
    	  return firsName+lastName;
      }
      public void setSalary(int salary) {
    	  this.salary=salary;
      }
      public int getAnnualSalary() {
    	  return salary*12;
      }
      public int raiseSalary(int percent) {
    	  return   (int)(((salary*12)*(percent/100.0))+(salary*12))/12;
    	  
      }
      public int getSalary() {
    	  return salary;
      }
      public String toString() {
    	  return String.format("Employee[id = %d , name = %s%s, salary = %d]",getID(),getFirsName(),getLastName(),getSalary());
      }
      
      
    		
      
      
}
