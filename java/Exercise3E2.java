import java.util.Scanner; 
 class Exercise3E2 {
      
	  public static void main (String[] args ) {
      double r1, r2, area ;
      Scanner kbd = new Scanner(System.in);
      System.out.print("outer radius : ");
	  r1 = kbd.nextDouble();
      System.out.print("inner radius : ");
	  r2 = kbd.nextDouble();
      area = Math.PI*(Math.pow(r1,2)-Math.pow(r2,2)) ;
      System.out.println( " Area is : " +area) ;
	  //�ҹԴ �ʧ��� 64050065
}
 }